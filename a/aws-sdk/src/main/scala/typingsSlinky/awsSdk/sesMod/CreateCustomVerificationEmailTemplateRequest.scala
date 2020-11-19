package typingsSlinky.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateCustomVerificationEmailTemplateRequest extends js.Object {
  
  /**
    * The URL that the recipient of the verification email is sent to if his or her address is not successfully verified.
    */
  var FailureRedirectionURL: typingsSlinky.awsSdk.sesMod.FailureRedirectionURL = js.native
  
  /**
    * The email address that the custom verification email is sent from.
    */
  var FromEmailAddress: FromAddress = js.native
  
  /**
    * The URL that the recipient of the verification email is sent to if his or her address is successfully verified.
    */
  var SuccessRedirectionURL: typingsSlinky.awsSdk.sesMod.SuccessRedirectionURL = js.native
  
  /**
    * The content of the custom verification email. The total size of the email must be less than 10 MB. The message body may contain HTML, with some limitations. For more information, see Custom Verification Email Frequently Asked Questions in the Amazon SES Developer Guide.
    */
  var TemplateContent: typingsSlinky.awsSdk.sesMod.TemplateContent = js.native
  
  /**
    * The name of the custom verification email template.
    */
  var TemplateName: typingsSlinky.awsSdk.sesMod.TemplateName = js.native
  
  /**
    * The subject line of the custom verification email.
    */
  var TemplateSubject: Subject = js.native
}
object CreateCustomVerificationEmailTemplateRequest {
  
  @scala.inline
  def apply(
    FailureRedirectionURL: FailureRedirectionURL,
    FromEmailAddress: FromAddress,
    SuccessRedirectionURL: SuccessRedirectionURL,
    TemplateContent: TemplateContent,
    TemplateName: TemplateName,
    TemplateSubject: Subject
  ): CreateCustomVerificationEmailTemplateRequest = {
    val __obj = js.Dynamic.literal(FailureRedirectionURL = FailureRedirectionURL.asInstanceOf[js.Any], FromEmailAddress = FromEmailAddress.asInstanceOf[js.Any], SuccessRedirectionURL = SuccessRedirectionURL.asInstanceOf[js.Any], TemplateContent = TemplateContent.asInstanceOf[js.Any], TemplateName = TemplateName.asInstanceOf[js.Any], TemplateSubject = TemplateSubject.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCustomVerificationEmailTemplateRequest]
  }
  
  @scala.inline
  implicit class CreateCustomVerificationEmailTemplateRequestOps[Self <: CreateCustomVerificationEmailTemplateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFailureRedirectionURL(value: FailureRedirectionURL): Self = this.set("FailureRedirectionURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromEmailAddress(value: FromAddress): Self = this.set("FromEmailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccessRedirectionURL(value: SuccessRedirectionURL): Self = this.set("SuccessRedirectionURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateContent(value: TemplateContent): Self = this.set("TemplateContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateName(value: TemplateName): Self = this.set("TemplateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateSubject(value: Subject): Self = this.set("TemplateSubject", value.asInstanceOf[js.Any])
  }
}
