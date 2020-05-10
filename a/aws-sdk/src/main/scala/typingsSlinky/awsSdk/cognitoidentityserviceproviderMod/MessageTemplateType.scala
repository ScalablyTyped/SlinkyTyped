package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageTemplateType extends js.Object {
  /**
    * The message template for email messages.
    */
  var EmailMessage: js.UndefOr[EmailVerificationMessageType] = js.native
  /**
    * The subject line for email messages.
    */
  var EmailSubject: js.UndefOr[EmailVerificationSubjectType] = js.native
  /**
    * The message template for SMS messages.
    */
  var SMSMessage: js.UndefOr[SmsVerificationMessageType] = js.native
}

object MessageTemplateType {
  @scala.inline
  def apply(): MessageTemplateType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageTemplateType]
  }
  @scala.inline
  implicit class MessageTemplateTypeOps[Self <: MessageTemplateType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmailMessage(value: EmailVerificationMessageType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EmailMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmailMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EmailMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withEmailSubject(value: EmailVerificationSubjectType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EmailSubject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmailSubject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EmailSubject")(js.undefined)
        ret
    }
    @scala.inline
    def withSMSMessage(value: SmsVerificationMessageType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SMSMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSMSMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SMSMessage")(js.undefined)
        ret
    }
  }
  
}

