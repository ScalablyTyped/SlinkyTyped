package typingsSlinky.awsSdk.pinpointemailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SendEmailRequest extends StObject {
  
  /**
    * The name of the configuration set that you want to use when sending the email.
    */
  var ConfigurationSetName: js.UndefOr[typingsSlinky.awsSdk.pinpointemailMod.ConfigurationSetName] = js.native
  
  /**
    * An object that contains the body of the message. You can send either a Simple message or a Raw message.
    */
  var Content: EmailContent = js.native
  
  /**
    * An object that contains the recipients of the email message.
    */
  var Destination: typingsSlinky.awsSdk.pinpointemailMod.Destination = js.native
  
  /**
    * A list of tags, in the form of name/value pairs, to apply to an email that you send using the SendEmail operation. Tags correspond to characteristics of the email that you define, so that you can publish email sending events. 
    */
  var EmailTags: js.UndefOr[MessageTagList] = js.native
  
  /**
    * The address that Amazon Pinpoint should send bounce and complaint notifications to.
    */
  var FeedbackForwardingEmailAddress: js.UndefOr[EmailAddress] = js.native
  
  /**
    * The email address that you want to use as the "From" address for the email. The address that you specify has to be verified. 
    */
  var FromEmailAddress: js.UndefOr[EmailAddress] = js.native
  
  /**
    * The "Reply-to" email addresses for the message. When the recipient replies to the message, each Reply-to address receives the reply.
    */
  var ReplyToAddresses: js.UndefOr[EmailAddressList] = js.native
}
object SendEmailRequest {
  
  @scala.inline
  def apply(Content: EmailContent, Destination: Destination): SendEmailRequest = {
    val __obj = js.Dynamic.literal(Content = Content.asInstanceOf[js.Any], Destination = Destination.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendEmailRequest]
  }
  
  @scala.inline
  implicit class SendEmailRequestMutableBuilder[Self <: SendEmailRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigurationSetName(value: ConfigurationSetName): Self = StObject.set(x, "ConfigurationSetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationSetNameUndefined: Self = StObject.set(x, "ConfigurationSetName", js.undefined)
    
    @scala.inline
    def setContent(value: EmailContent): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestination(value: Destination): Self = StObject.set(x, "Destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailTags(value: MessageTagList): Self = StObject.set(x, "EmailTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailTagsUndefined: Self = StObject.set(x, "EmailTags", js.undefined)
    
    @scala.inline
    def setEmailTagsVarargs(value: MessageTag*): Self = StObject.set(x, "EmailTags", js.Array(value :_*))
    
    @scala.inline
    def setFeedbackForwardingEmailAddress(value: EmailAddress): Self = StObject.set(x, "FeedbackForwardingEmailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeedbackForwardingEmailAddressUndefined: Self = StObject.set(x, "FeedbackForwardingEmailAddress", js.undefined)
    
    @scala.inline
    def setFromEmailAddress(value: EmailAddress): Self = StObject.set(x, "FromEmailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromEmailAddressUndefined: Self = StObject.set(x, "FromEmailAddress", js.undefined)
    
    @scala.inline
    def setReplyToAddresses(value: EmailAddressList): Self = StObject.set(x, "ReplyToAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplyToAddressesUndefined: Self = StObject.set(x, "ReplyToAddresses", js.undefined)
    
    @scala.inline
    def setReplyToAddressesVarargs(value: EmailAddress*): Self = StObject.set(x, "ReplyToAddresses", js.Array(value :_*))
  }
}
