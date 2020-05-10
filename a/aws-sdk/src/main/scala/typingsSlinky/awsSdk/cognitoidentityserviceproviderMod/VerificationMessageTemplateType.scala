package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VerificationMessageTemplateType extends js.Object {
  /**
    * The default email option.
    */
  var DefaultEmailOption: js.UndefOr[DefaultEmailOptionType] = js.native
  /**
    * The email message template.
    */
  var EmailMessage: js.UndefOr[EmailVerificationMessageType] = js.native
  /**
    * The email message template for sending a confirmation link to the user.
    */
  var EmailMessageByLink: js.UndefOr[EmailVerificationMessageByLinkType] = js.native
  /**
    * The subject line for the email message template.
    */
  var EmailSubject: js.UndefOr[EmailVerificationSubjectType] = js.native
  /**
    * The subject line for the email message template for sending a confirmation link to the user.
    */
  var EmailSubjectByLink: js.UndefOr[EmailVerificationSubjectByLinkType] = js.native
  /**
    * The SMS message template.
    */
  var SmsMessage: js.UndefOr[SmsVerificationMessageType] = js.native
}

object VerificationMessageTemplateType {
  @scala.inline
  def apply(): VerificationMessageTemplateType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VerificationMessageTemplateType]
  }
  @scala.inline
  implicit class VerificationMessageTemplateTypeOps[Self <: VerificationMessageTemplateType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultEmailOption(value: DefaultEmailOptionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultEmailOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultEmailOption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultEmailOption")(js.undefined)
        ret
    }
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
    def withEmailMessageByLink(value: EmailVerificationMessageByLinkType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EmailMessageByLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmailMessageByLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EmailMessageByLink")(js.undefined)
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
    def withEmailSubjectByLink(value: EmailVerificationSubjectByLinkType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EmailSubjectByLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmailSubjectByLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EmailSubjectByLink")(js.undefined)
        ret
    }
    @scala.inline
    def withSmsMessage(value: SmsVerificationMessageType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SmsMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmsMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SmsMessage")(js.undefined)
        ret
    }
  }
  
}

