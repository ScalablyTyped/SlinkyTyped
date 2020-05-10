package typingsSlinky.googleAppsScript.GoogleAppsScript.Classroom.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Guardian extends js.Object {
  var guardianId: js.UndefOr[String] = js.native
  var guardianProfile: js.UndefOr[UserProfile] = js.native
  var invitedEmailAddress: js.UndefOr[String] = js.native
  var studentId: js.UndefOr[String] = js.native
}

object Guardian {
  @scala.inline
  def apply(): Guardian = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Guardian]
  }
  @scala.inline
  implicit class GuardianOps[Self <: Guardian] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGuardianId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guardianId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGuardianId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guardianId")(js.undefined)
        ret
    }
    @scala.inline
    def withGuardianProfile(value: UserProfile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guardianProfile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGuardianProfile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guardianProfile")(js.undefined)
        ret
    }
    @scala.inline
    def withInvitedEmailAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invitedEmailAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvitedEmailAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invitedEmailAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withStudentId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("studentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStudentId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("studentId")(js.undefined)
        ret
    }
  }
  
}

