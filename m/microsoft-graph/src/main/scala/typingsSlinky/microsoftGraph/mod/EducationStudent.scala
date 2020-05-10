package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EducationStudent extends js.Object {
  // Birth date of the student.
  var birthDate: js.UndefOr[String] = js.native
  // ID of the student in the source system.
  var externalId: js.UndefOr[String] = js.native
  // The possible values are: female, male, other, unknownFutureValue.
  var gender: js.UndefOr[EducationGender] = js.native
  // Current grade level of the student.
  var grade: js.UndefOr[String] = js.native
  // Year the student is graduating from the school.
  var graduationYear: js.UndefOr[String] = js.native
  // Student Number.
  var studentNumber: js.UndefOr[String] = js.native
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
    def withBirthDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("birthDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBirthDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("birthDate")(js.undefined)
        ret
    }
    @scala.inline
    def withExternalId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExternalId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalId")(js.undefined)
        ret
    }
    @scala.inline
    def withGender(value: EducationGender): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gender")(js.undefined)
        ret
    }
    @scala.inline
    def withGrade(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grade")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrade: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grade")(js.undefined)
        ret
    }
    @scala.inline
    def withGraduationYear(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graduationYear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGraduationYear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graduationYear")(js.undefined)
        ret
    }
    @scala.inline
    def withStudentNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("studentNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStudentNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("studentNumber")(js.undefined)
        ret
    }
  }
  
}

