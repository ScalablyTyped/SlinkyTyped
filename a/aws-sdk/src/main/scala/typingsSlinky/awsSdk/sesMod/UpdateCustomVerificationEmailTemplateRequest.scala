package typingsSlinky.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateCustomVerificationEmailTemplateRequest extends js.Object {
  /**
    * The URL that the recipient of the verification email is sent to if his or her address is not successfully verified.
    */
  var FailureRedirectionURL: js.UndefOr[typingsSlinky.awsSdk.sesMod.FailureRedirectionURL] = js.native
  /**
    * The email address that the custom verification email is sent from.
    */
  var FromEmailAddress: js.UndefOr[FromAddress] = js.native
  /**
    * The URL that the recipient of the verification email is sent to if his or her address is successfully verified.
    */
  var SuccessRedirectionURL: js.UndefOr[typingsSlinky.awsSdk.sesMod.SuccessRedirectionURL] = js.native
  /**
    * The content of the custom verification email. The total size of the email must be less than 10 MB. The message body may contain HTML, with some limitations. For more information, see Custom Verification Email Frequently Asked Questions in the Amazon SES Developer Guide.
    */
  var TemplateContent: js.UndefOr[typingsSlinky.awsSdk.sesMod.TemplateContent] = js.native
  /**
    * The name of the custom verification email template that you want to update.
    */
  var TemplateName: typingsSlinky.awsSdk.sesMod.TemplateName = js.native
  /**
    * The subject line of the custom verification email.
    */
  var TemplateSubject: js.UndefOr[Subject] = js.native
}

object UpdateCustomVerificationEmailTemplateRequest {
  @scala.inline
  def apply(TemplateName: TemplateName): UpdateCustomVerificationEmailTemplateRequest = {
    val __obj = js.Dynamic.literal(TemplateName = TemplateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCustomVerificationEmailTemplateRequest]
  }
  @scala.inline
  implicit class UpdateCustomVerificationEmailTemplateRequestOps[Self <: UpdateCustomVerificationEmailTemplateRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTemplateName(value: TemplateName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TemplateName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFailureRedirectionURL(value: FailureRedirectionURL): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailureRedirectionURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailureRedirectionURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailureRedirectionURL")(js.undefined)
        ret
    }
    @scala.inline
    def withFromEmailAddress(value: FromAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FromEmailAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFromEmailAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FromEmailAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccessRedirectionURL(value: SuccessRedirectionURL): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SuccessRedirectionURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuccessRedirectionURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SuccessRedirectionURL")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplateContent(value: TemplateContent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TemplateContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplateContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TemplateContent")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplateSubject(value: Subject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TemplateSubject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplateSubject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TemplateSubject")(js.undefined)
        ret
    }
  }
  
}

