package dao;

import entity.Student;

public interface IStudentDao {
    public void addStudent(Student student);
    void deleteStudentByNo(int no);
}
