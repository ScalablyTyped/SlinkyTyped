package typingsSlinky.pulumiAws.inputMod.cognito

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserPoolEmailConfiguration extends js.Object {
  /**
    * Instruct Cognito to either use its built-in functional or Amazon SES to send out emails.
    */
  var emailSendingAccount: js.UndefOr[Input[String]] = js.native
  /**
    * The REPLY-TO email address.
    */
  var replyToEmailAddress: js.UndefOr[Input[String]] = js.native
  /**
    * The ARN of the email source.
    */
  var sourceArn: js.UndefOr[Input[String]] = js.native
}

object UserPoolEmailConfiguration {
  @scala.inline
  def apply(): UserPoolEmailConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserPoolEmailConfiguration]
  }
  @scala.inline
  implicit class UserPoolEmailConfigurationOps[Self <: UserPoolEmailConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmailSendingAccount(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailSendingAccount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmailSendingAccount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailSendingAccount")(js.undefined)
        ret
    }
    @scala.inline
    def withReplyToEmailAddress(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replyToEmailAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplyToEmailAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replyToEmailAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceArn")(js.undefined)
        ret
    }
  }
  
}

