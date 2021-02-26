package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VerificationMessageTemplateType extends StObject {
  
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
  implicit class VerificationMessageTemplateTypeMutableBuilder[Self <: VerificationMessageTemplateType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultEmailOption(value: DefaultEmailOptionType): Self = StObject.set(x, "DefaultEmailOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultEmailOptionUndefined: Self = StObject.set(x, "DefaultEmailOption", js.undefined)
    
    @scala.inline
    def setEmailMessage(value: EmailVerificationMessageType): Self = StObject.set(x, "EmailMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailMessageByLink(value: EmailVerificationMessageByLinkType): Self = StObject.set(x, "EmailMessageByLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailMessageByLinkUndefined: Self = StObject.set(x, "EmailMessageByLink", js.undefined)
    
    @scala.inline
    def setEmailMessageUndefined: Self = StObject.set(x, "EmailMessage", js.undefined)
    
    @scala.inline
    def setEmailSubject(value: EmailVerificationSubjectType): Self = StObject.set(x, "EmailSubject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailSubjectByLink(value: EmailVerificationSubjectByLinkType): Self = StObject.set(x, "EmailSubjectByLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailSubjectByLinkUndefined: Self = StObject.set(x, "EmailSubjectByLink", js.undefined)
    
    @scala.inline
    def setEmailSubjectUndefined: Self = StObject.set(x, "EmailSubject", js.undefined)
    
    @scala.inline
    def setSmsMessage(value: SmsVerificationMessageType): Self = StObject.set(x, "SmsMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmsMessageUndefined: Self = StObject.set(x, "SmsMessage", js.undefined)
  }
}
