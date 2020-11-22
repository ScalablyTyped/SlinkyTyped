package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EducationStudent extends js.Object {
  
  // Birth date of the student.
  var birthDate: js.UndefOr[NullableOption[String]] = js.native
  
  // ID of the student in the source system.
  var externalId: js.UndefOr[NullableOption[String]] = js.native
  
  // The possible values are: female, male, other, unknownFutureValue.
  var gender: js.UndefOr[NullableOption[EducationGender]] = js.native
  
  // Current grade level of the student.
  var grade: js.UndefOr[NullableOption[String]] = js.native
  
  // Year the student is graduating from the school.
  var graduationYear: js.UndefOr[NullableOption[String]] = js.native
  
  // Student Number.
  var studentNumber: js.UndefOr[NullableOption[String]] = js.native
}
object EducationStudent {
  
  @scala.inline
  def apply(): EducationStudent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EducationStudent]
  }
  
  @scala.inline
  implicit class EducationStudentOps[Self <: EducationStudent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBirthDate(value: NullableOption[String]): Self = this.set("birthDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBirthDate: Self = this.set("birthDate", js.undefined)
    
    @scala.inline
    def setBirthDateNull: Self = this.set("birthDate", null)
    
    @scala.inline
    def setExternalId(value: NullableOption[String]): Self = this.set("externalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternalId: Self = this.set("externalId", js.undefined)
    
    @scala.inline
    def setExternalIdNull: Self = this.set("externalId", null)
    
    @scala.inline
    def setGender(value: NullableOption[EducationGender]): Self = this.set("gender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGender: Self = this.set("gender", js.undefined)
    
    @scala.inline
    def setGenderNull: Self = this.set("gender", null)
    
    @scala.inline
    def setGrade(value: NullableOption[String]): Self = this.set("grade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrade: Self = this.set("grade", js.undefined)
    
    @scala.inline
    def setGradeNull: Self = this.set("grade", null)
    
    @scala.inline
    def setGraduationYear(value: NullableOption[String]): Self = this.set("graduationYear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGraduationYear: Self = this.set("graduationYear", js.undefined)
    
    @scala.inline
    def setGraduationYearNull: Self = this.set("graduationYear", null)
    
    @scala.inline
    def setStudentNumber(value: NullableOption[String]): Self = this.set("studentNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStudentNumber: Self = this.set("studentNumber", js.undefined)
    
    @scala.inline
    def setStudentNumberNull: Self = this.set("studentNumber", null)
  }
}
