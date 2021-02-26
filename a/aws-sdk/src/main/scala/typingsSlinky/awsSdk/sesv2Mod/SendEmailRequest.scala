package typingsSlinky.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SendEmailRequest extends StObject {
  
  /**
    * The name of the configuration set that you want to use when sending the email.
    */
  var ConfigurationSetName: js.UndefOr[typingsSlinky.awsSdk.sesv2Mod.ConfigurationSetName] = js.native
  
  /**
    * An object that contains the body of the message. You can send either a Simple message Raw message or a template Message.
    */
  var Content: EmailContent = js.native
  
  /**
    * An object that contains the recipients of the email message.
    */
  var Destination: js.UndefOr[typingsSlinky.awsSdk.sesv2Mod.Destination] = js.native
  
  /**
    * A list of tags, in the form of name/value pairs, to apply to an email that you send using the SendEmail operation. Tags correspond to characteristics of the email that you define, so that you can publish email sending events. 
    */
  var EmailTags: js.UndefOr[MessageTagList] = js.native
  
  /**
    * The address that you want bounce and complaint notifications to be sent to.
    */
  var FeedbackForwardingEmailAddress: js.UndefOr[EmailAddress] = js.native
  
  /**
    * This parameter is used only for sending authorization. It is the ARN of the identity that is associated with the sending authorization policy that permits you to use the email address specified in the FeedbackForwardingEmailAddress parameter. For example, if the owner of example.com (which has ARN arn:aws:ses:us-east-1:123456789012:identity/example.com) attaches a policy to it that authorizes you to use feedback@example.com, then you would specify the FeedbackForwardingEmailAddressIdentityArn to be arn:aws:ses:us-east-1:123456789012:identity/example.com, and the FeedbackForwardingEmailAddress to be feedback@example.com. For more information about sending authorization, see the Amazon SES Developer Guide.
    */
  var FeedbackForwardingEmailAddressIdentityArn: js.UndefOr[AmazonResourceName] = js.native
  
  /**
    * The email address that you want to use as the "From" address for the email. The address that you specify has to be verified. 
    */
  var FromEmailAddress: js.UndefOr[EmailAddress] = js.native
  
  /**
    * This parameter is used only for sending authorization. It is the ARN of the identity that is associated with the sending authorization policy that permits you to use the email address specified in the FromEmailAddress parameter. For example, if the owner of example.com (which has ARN arn:aws:ses:us-east-1:123456789012:identity/example.com) attaches a policy to it that authorizes you to use sender@example.com, then you would specify the FromEmailAddressIdentityArn to be arn:aws:ses:us-east-1:123456789012:identity/example.com, and the FromEmailAddress to be sender@example.com. For more information about sending authorization, see the Amazon SES Developer Guide. For Raw emails, the FromEmailAddressIdentityArn value overrides the X-SES-SOURCE-ARN and X-SES-FROM-ARN headers specified in raw email message content.
    */
  var FromEmailAddressIdentityArn: js.UndefOr[AmazonResourceName] = js.native
  
  /**
    * An object used to specify a list or topic to which an email belongs, which will be used when a contact chooses to unsubscribe.
    */
  var ListManagementOptions: js.UndefOr[typingsSlinky.awsSdk.sesv2Mod.ListManagementOptions] = js.native
  
  /**
    * The "Reply-to" email addresses for the message. When the recipient replies to the message, each Reply-to address receives the reply.
    */
  var ReplyToAddresses: js.UndefOr[EmailAddressList] = js.native
}
object SendEmailRequest {
  
  @scala.inline
  def apply(Content: EmailContent): SendEmailRequest = {
    val __obj = js.Dynamic.literal(Content = Content.asInstanceOf[js.Any])
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
    def setDestinationUndefined: Self = StObject.set(x, "Destination", js.undefined)
    
    @scala.inline
    def setEmailTags(value: MessageTagList): Self = StObject.set(x, "EmailTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailTagsUndefined: Self = StObject.set(x, "EmailTags", js.undefined)
    
    @scala.inline
    def setEmailTagsVarargs(value: MessageTag*): Self = StObject.set(x, "EmailTags", js.Array(value :_*))
    
    @scala.inline
    def setFeedbackForwardingEmailAddress(value: EmailAddress): Self = StObject.set(x, "FeedbackForwardingEmailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeedbackForwardingEmailAddressIdentityArn(value: AmazonResourceName): Self = StObject.set(x, "FeedbackForwardingEmailAddressIdentityArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeedbackForwardingEmailAddressIdentityArnUndefined: Self = StObject.set(x, "FeedbackForwardingEmailAddressIdentityArn", js.undefined)
    
    @scala.inline
    def setFeedbackForwardingEmailAddressUndefined: Self = StObject.set(x, "FeedbackForwardingEmailAddress", js.undefined)
    
    @scala.inline
    def setFromEmailAddress(value: EmailAddress): Self = StObject.set(x, "FromEmailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromEmailAddressIdentityArn(value: AmazonResourceName): Self = StObject.set(x, "FromEmailAddressIdentityArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromEmailAddressIdentityArnUndefined: Self = StObject.set(x, "FromEmailAddressIdentityArn", js.undefined)
    
    @scala.inline
    def setFromEmailAddressUndefined: Self = StObject.set(x, "FromEmailAddress", js.undefined)
    
    @scala.inline
    def setListManagementOptions(value: ListManagementOptions): Self = StObject.set(x, "ListManagementOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListManagementOptionsUndefined: Self = StObject.set(x, "ListManagementOptions", js.undefined)
    
    @scala.inline
    def setReplyToAddresses(value: EmailAddressList): Self = StObject.set(x, "ReplyToAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplyToAddressesUndefined: Self = StObject.set(x, "ReplyToAddresses", js.undefined)
    
    @scala.inline
    def setReplyToAddressesVarargs(value: EmailAddress*): Self = StObject.set(x, "ReplyToAddresses", js.Array(value :_*))
  }
}
