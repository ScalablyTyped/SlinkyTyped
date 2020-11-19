package typingsSlinky.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomVerificationEmailTemplateMetadata extends js.Object {
  
  /**
    * The URL that the recipient of the verification email is sent to if his or her address is not successfully verified.
    */
  var FailureRedirectionURL: js.UndefOr[typingsSlinky.awsSdk.sesv2Mod.FailureRedirectionURL] = js.native
  
  /**
    * The email address that the custom verification email is sent from.
    */
  var FromEmailAddress: js.UndefOr[EmailAddress] = js.native
  
  /**
    * The URL that the recipient of the verification email is sent to if his or her address is successfully verified.
    */
  var SuccessRedirectionURL: js.UndefOr[typingsSlinky.awsSdk.sesv2Mod.SuccessRedirectionURL] = js.native
  
  /**
    * The name of the custom verification email template.
    */
  var TemplateName: js.UndefOr[EmailTemplateName] = js.native
  
  /**
    * The subject line of the custom verification email.
    */
  var TemplateSubject: js.UndefOr[EmailTemplateSubject] = js.native
}
object CustomVerificationEmailTemplateMetadata {
  
  @scala.inline
  def apply(): CustomVerificationEmailTemplateMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomVerificationEmailTemplateMetadata]
  }
  
  @scala.inline
  implicit class CustomVerificationEmailTemplateMetadataOps[Self <: CustomVerificationEmailTemplateMetadata] (val x: Self) extends AnyVal {
    
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
    def deleteFailureRedirectionURL: Self = this.set("FailureRedirectionURL", js.undefined)
    
    @scala.inline
    def setFromEmailAddress(value: EmailAddress): Self = this.set("FromEmailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFromEmailAddress: Self = this.set("FromEmailAddress", js.undefined)
    
    @scala.inline
    def setSuccessRedirectionURL(value: SuccessRedirectionURL): Self = this.set("SuccessRedirectionURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuccessRedirectionURL: Self = this.set("SuccessRedirectionURL", js.undefined)
    
    @scala.inline
    def setTemplateName(value: EmailTemplateName): Self = this.set("TemplateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateName: Self = this.set("TemplateName", js.undefined)
    
    @scala.inline
    def setTemplateSubject(value: EmailTemplateSubject): Self = this.set("TemplateSubject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateSubject: Self = this.set("TemplateSubject", js.undefined)
  }
}
