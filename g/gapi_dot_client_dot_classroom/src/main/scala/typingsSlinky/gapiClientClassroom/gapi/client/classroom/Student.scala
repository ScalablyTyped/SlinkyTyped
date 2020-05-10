package typingsSlinky.gapiClientClassroom.gapi.client.classroom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Student extends js.Object {
  /**
    * Identifier of the course.
    *
    * Read-only.
    */
  var courseId: js.UndefOr[String] = js.native
  /**
    * Global user information for the student.
    *
    * Read-only.
    */
  var profile: js.UndefOr[UserProfile] = js.native
  /**
    * Information about a Drive Folder for this student's work in this course.
    * Only visible to the student and domain administrators.
    *
    * Read-only.
    */
  var studentWorkFolder: js.UndefOr[DriveFolder] = js.native
  /**
    * Identifier of the user.
    *
    * When specified as a parameter of a request, this identifier can be one of
    * the following:
    *
    * &#42; the numeric identifier for the user
    * &#42; the email address of the user
    * &#42; the string literal `"me"`, indicating the requesting user
    */
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

