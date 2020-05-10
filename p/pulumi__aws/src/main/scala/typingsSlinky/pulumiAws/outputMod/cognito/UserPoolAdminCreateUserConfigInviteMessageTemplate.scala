package typingsSlinky.pulumiAws.outputMod.cognito

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserPoolAdminCreateUserConfigInviteMessageTemplate extends js.Object {
  /**
    * The email message template. Must contain the `{####}` placeholder. Conflicts with `emailVerificationMessage` argument.
    */
  var emailMessage: js.UndefOr[String] = js.native
  /**
    * The subject line for the email message template. Conflicts with `emailVerificationSubject` argument.
    */
  var emailSubject: js.UndefOr[String] = js.native
  /**
    * The SMS message template. Must contain the `{####}` placeholder. Conflicts with `smsVerificationMessage` argument.
    */
  var smsMessage: js.UndefOr[String] = js.native
}

object UserPoolAdminCreateUserConfigInviteMessageTemplate {
  @scala.inline
  def apply(): UserPoolAdminCreateUserConfigInviteMessageTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserPoolAdminCreateUserConfigInviteMessageTemplate]
  }
  @scala.inline
  implicit class UserPoolAdminCreateUserConfigInviteMessageTemplateOps[Self <: UserPoolAdminCreateUserConfigInviteMessageTemplate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmailMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmailMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withEmailSubject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailSubject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmailSubject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailSubject")(js.undefined)
        ret
    }
    @scala.inline
    def withSmsMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smsMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmsMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smsMessage")(js.undefined)
        ret
    }
  }
  
}

