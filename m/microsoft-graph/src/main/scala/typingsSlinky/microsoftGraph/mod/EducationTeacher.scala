package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EducationTeacher extends js.Object {
  // ID of the teacher in the source system.
  var externalId: js.UndefOr[String] = js.native
  // Teacher number.
  var teacherNumber: js.UndefOr[String] = js.native
}

object EducationTeacher {
  @scala.inline
  def apply(): EducationTeacher = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EducationTeacher]
  }
  @scala.inline
  implicit class EducationTeacherOps[Self <: EducationTeacher] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withTeacherNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teacherNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTeacherNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teacherNumber")(js.undefined)
        ret
    }
  }
  
}

