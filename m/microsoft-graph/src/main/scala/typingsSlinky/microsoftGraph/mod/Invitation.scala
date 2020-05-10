package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Invitation extends Entity {
  // The URL user can use to redeem his invitation. Read-Only
  var inviteRedeemUrl: js.UndefOr[String] = js.native
  // The URL user should be redirected to once the invitation is redeemed. Required.
  var inviteRedirectUrl: js.UndefOr[String] = js.native
  // The user created as part of the invitation creation. Read-Only
  var invitedUser: js.UndefOr[User] = js.native
  // The display name of the user being invited.
  var invitedUserDisplayName: js.UndefOr[String] = js.native
  // The email address of the user being invited. Required.
  var invitedUserEmailAddress: js.UndefOr[String] = js.native
  /**
    * Additional configuration for the message being sent to the invited user, including customizing message text, language
    * and cc recipient list.
    */
  var invitedUserMessageInfo: js.UndefOr[InvitedUserMessageInfo] = js.native
  /**
    * The userType of the user being invited. By default, this is Guest. You can invite as Member if you are a company
    * administrator.
    */
  var invitedUserType: js.UndefOr[String] = js.native
  // Indicates whether an email should be sent to the user being invited or not. The default is false.
  var sendInvitationMessage: js.UndefOr[Boolean] = js.native
  // The status of the invitation. Possible values: PendingAcceptance, Completed, InProgress, and Error
  var status: js.UndefOr[String] = js.native
}

object Invitation {
  @scala.inline
  def apply(): Invitation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Invitation]
  }
  @scala.inline
  implicit class InvitationOps[Self <: Invitation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInviteRedeemUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inviteRedeemUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInviteRedeemUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inviteRedeemUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withInviteRedirectUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inviteRedirectUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInviteRedirectUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inviteRedirectUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withInvitedUser(value: User): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invitedUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvitedUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invitedUser")(js.undefined)
        ret
    }
    @scala.inline
    def withInvitedUserDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invitedUserDisplayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvitedUserDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invitedUserDisplayName")(js.undefined)
        ret
    }
    @scala.inline
    def withInvitedUserEmailAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invitedUserEmailAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvitedUserEmailAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invitedUserEmailAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withInvitedUserMessageInfo(value: InvitedUserMessageInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invitedUserMessageInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvitedUserMessageInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invitedUserMessageInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withInvitedUserType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invitedUserType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvitedUserType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invitedUserType")(js.undefined)
        ret
    }
    @scala.inline
    def withSendInvitationMessage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendInvitationMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSendInvitationMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendInvitationMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
  }
  
}

