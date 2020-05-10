package typingsSlinky.googleAppsScript.GoogleAppsScript.Classroom.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GuardianInvitation extends js.Object {
  var creationTime: js.UndefOr[String] = js.native
  var invitationId: js.UndefOr[String] = js.native
  var invitedEmailAddress: js.UndefOr[String] = js.native
  var state: js.UndefOr[String] = js.native
  var studentId: js.UndefOr[String] = js.native
}

object GuardianInvitation {
  @scala.inline
  def apply(): GuardianInvitation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GuardianInvitation]
  }
  @scala.inline
  implicit class GuardianInvitationOps[Self <: GuardianInvitation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreationTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationTime")(js.undefined)
        ret
    }
    @scala.inline
    def withInvitationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invitationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvitationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invitationId")(js.undefined)
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
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
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

