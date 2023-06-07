package org.talend;

import calljobineclipsedemo.j_calljobineclipsedemo_0_1.J_CallJobInEclipseDemo;

public class TalendExample {
public static void callingTalend(int nb_line,String name) {
try {
		J_CallJobInEclipseDemo callJobInEclipseDemo = new J_CallJobInEclipseDemo();
		String [] context = new String [] {"--context_param nb_line="+nb_line, "--context_param name="+name};
		callJobInEclipseDemo.runJob(context);
		System.out.println("done");
		} catch (Exception e) {
e.printStackTrace();
		}
}
	public static void main(String[] args) {
		TalendExample.callingTalend(3, "new test ");
	}

}
