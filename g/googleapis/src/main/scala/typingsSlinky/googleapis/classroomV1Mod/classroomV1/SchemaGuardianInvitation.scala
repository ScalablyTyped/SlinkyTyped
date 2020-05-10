package typingsSlinky.googleapis.classroomV1Mod.classroomV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An invitation to become the guardian of a specified user, sent to a
  * specified email address.
  */
@js.native
trait SchemaGuardianInvitation extends js.Object {
  /**
    * The time that this invitation was created.  Read-only.
    */
  var creationTime: js.UndefOr[String] = js.native
  /**
    * Unique identifier for this invitation.  Read-only.
    */
  var invitationId: js.UndefOr[String] = js.native
  /**
    * Email address that the invitation was sent to. This field is only visible
    * to domain administrators.
    */
  var invitedEmailAddress: js.UndefOr[String] = js.native
  /**
    * The state that this invitation is in.
    */
  var state: js.UndefOr[String] = js.native
  /**
    * ID of the student (in standard format)
    */
  var studentId: js.UndefOr[String] = js.native
}

object SchemaGuardianInvitation {
  @scala.inline
  def apply(): SchemaGuardianInvitation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGuardianInvitation]
  }
  @scala.inline
  implicit class SchemaGuardianInvitationOps[Self <: SchemaGuardianInvitation] (val x: Self) extends AnyVal {
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

