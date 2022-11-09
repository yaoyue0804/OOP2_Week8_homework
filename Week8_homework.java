import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.util.ArrayList;
import java.io.*;
import javax.swing.event.* ;

class HwJFrame extends JFrame implements ListSelectionListener{
    private JList<String> jl1=new JList<>();
    private String[] vbs = {"籤A","籤B","籤C","籤D","籤E"};
    private JTextArea jta1=new JTextArea();
    HwJFrame(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("VBS小日記");
        setBounds(350, 150, 500, 500);
        setLayout(null);
        
        JPanel jp1 =new JPanel();
        jp1.setBounds(50, 50, 300, 120);
        jp1.setBackground(Color.LIGHT_GRAY);
        jp1.setBorder(BorderFactory.createRaisedSoftBevelBorder());

        JLabel lab1=new JLabel("運勢抽抽樂");
        jp1.add(lab1);

        jl1=new JList<>(vbs); 
        jl1.addListSelectionListener(this);      
        jp1.add(jl1);
        add(jp1);

        jta1.setText("今天的運勢是...");
        jta1.setBounds(50, 180, 300, 100);
        jta1.setLineWrap(true);
        add(jta1);

        setVisible(true);

    }

    @Override
    public void valueChanged(ListSelectionEvent e){
        ArrayList<String> Selected=new ArrayList<>(); 
        Selected.addAll(jl1.getSelectedValuesList());
        String text="";
        for(String n : Selected){
            switch(n){
                case "籤A":
                    text+="凶: 今天出門要小心喔\n";
                    break;
                case "籤B":
                    text+="大凶: 今天別出門了吧\n";
                    break;
                case "籤C":
                    text+="小吉: 小小的幸運等著你發現\n";
                    break;
                case "籤D":
                    text+="凶: 今天出門要小心喔\n";
                    break;
                case "籤E":
                    text+="大吉: 今天宜抽卡快去抽爆\n";
                    break;
            }
        }
        
        
        jta1.setText(text);
    }
            
}

public class Week8_homework {
    public static void main(String[] args)throws Exception{
        HwJFrame hj1=new HwJFrame();
    }
}
