package typingsSlinky.googleAppsScript.GoogleAppsScript.Classroom.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Student extends js.Object {
  var courseId: js.UndefOr[String] = js.native
  var profile: js.UndefOr[UserProfile] = js.native
  var studentWorkFolder: js.UndefOr[DriveFolder] = js.native
  var userId: js.UndefOr[String] = js.native
}

object Student {
  @scala.inline
  def apply(): Student = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Student]
  }
  @scala.inline
  implicit class StudentOps[Self <: Student] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCourseId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("courseId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCourseId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("courseId")(js.undefined)
        ret
    }
    @scala.inline
    def withProfile(value: UserProfile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile")(js.undefined)
        ret
    }
    @scala.inline
    def withStudentWorkFolder(value: DriveFolder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("studentWorkFolder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStudentWorkFolder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("studentWorkFolder")(js.undefined)
        ret
    }
    @scala.inline
    def withUserId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userId")(js.undefined)
        ret
    }
  }
  
}

