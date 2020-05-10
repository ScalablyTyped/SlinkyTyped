package typingsSlinky.pulumiAws.memberMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MemberArgs extends js.Object {
  /**
    * AWS account ID for member account.
    */
  val accountId: Input[String] = js.native
  /**
    * The detector ID of the GuardDuty account where you want to create member accounts.
    */
  val detectorId: Input[String] = js.native
  /**
    * Boolean whether an email notification is sent to the accounts. Defaults to `false`.
    */
  val disableEmailNotification: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Email address for member account.
    */
  val email: Input[String] = js.native
  /**
    * Message for invitation.
    */
  val invitationMessage: js.UndefOr[Input[String]] = js.native
  /**
    * Boolean whether to invite the account to GuardDuty as a member. Defaults to `false`. To detect if an invitation needs to be (re-)sent, the this provider state value is `true` based on a `relationshipStatus` of `Disabled`, `Enabled`, `Invited`, or `EmailVerificationInProgress`.
    */
  val invite: js.UndefOr[Input[Boolean]] = js.native
}

object MemberArgs {
  @scala.inline
  def apply(accountId: Input[String], detectorId: Input[String], email: Input[String]): MemberArgs = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], detectorId = detectorId.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemberArgs]
  }
  @scala.inline
  implicit class MemberArgsOps[Self <: MemberArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDetectorId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectorId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmail(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisableEmailNotification(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableEmailNotification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableEmailNotification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableEmailNotification")(js.undefined)
        ret
    }
    @scala.inline
    def withInvitationMessage(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invitationMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvitationMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invitationMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withInvite(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invite")(js.undefined)
        ret
    }
  }
  
}

