package typingsSlinky.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SendBulkTemplatedEmailRequest extends StObject {
  
  /**
    * The name of the configuration set to use when you send an email using SendBulkTemplatedEmail.
    */
  var ConfigurationSetName: js.UndefOr[typingsSlinky.awsSdk.sesMod.ConfigurationSetName] = js.native
  
  /**
    * A list of tags, in the form of name/value pairs, to apply to an email that you send to a destination using SendBulkTemplatedEmail.
    */
  var DefaultTags: js.UndefOr[MessageTagList] = js.native
  
  /**
    * A list of replacement values to apply to the template when replacement data is not specified in a Destination object. These values act as a default or fallback option when no other data is available. The template data is a JSON object, typically consisting of key-value pairs in which the keys correspond to replacement tags in the email template.
    */
  var DefaultTemplateData: js.UndefOr[TemplateData] = js.native
  
  /**
    * One or more Destination objects. All of the recipients in a Destination will receive the same version of the email. You can specify up to 50 Destination objects within a Destinations array.
    */
  var Destinations: BulkEmailDestinationList = js.native
  
  /**
    * The reply-to email address(es) for the message. If the recipient replies to the message, each reply-to address will receive the reply.
    */
  var ReplyToAddresses: js.UndefOr[AddressList] = js.native
  
  /**
    * The email address that bounces and complaints will be forwarded to when feedback forwarding is enabled. If the message cannot be delivered to the recipient, then an error message will be returned from the recipient's ISP; this message will then be forwarded to the email address specified by the ReturnPath parameter. The ReturnPath parameter is never overwritten. This email address must be either individually verified with Amazon SES, or from a domain that has been verified with Amazon SES. 
    */
  var ReturnPath: js.UndefOr[Address] = js.native
  
  /**
    * This parameter is used only for sending authorization. It is the ARN of the identity that is associated with the sending authorization policy that permits you to use the email address specified in the ReturnPath parameter. For example, if the owner of example.com (which has ARN arn:aws:ses:us-east-1:123456789012:identity/example.com) attaches a policy to it that authorizes you to use feedback@example.com, then you would specify the ReturnPathArn to be arn:aws:ses:us-east-1:123456789012:identity/example.com, and the ReturnPath to be feedback@example.com. For more information about sending authorization, see the Amazon SES Developer Guide.
    */
  var ReturnPathArn: js.UndefOr[AmazonResourceName] = js.native
  
  /**
    * The email address that is sending the email. This email address must be either individually verified with Amazon SES, or from a domain that has been verified with Amazon SES. For information about verifying identities, see the Amazon SES Developer Guide. If you are sending on behalf of another user and have been permitted to do so by a sending authorization policy, then you must also specify the SourceArn parameter. For more information about sending authorization, see the Amazon SES Developer Guide.  Amazon SES does not support the SMTPUTF8 extension, as described in RFC6531. For this reason, the local part of a source email address (the part of the email address that precedes the @ sign) may only contain 7-bit ASCII characters. If the domain part of an address (the part after the @ sign) contains non-ASCII characters, they must be encoded using Punycode, as described in RFC3492. The sender name (also known as the friendly name) may contain non-ASCII characters. These characters must be encoded using MIME encoded-word syntax, as described in RFC 2047. MIME encoded-word syntax uses the following form: =?charset?encoding?encoded-text?=. 
    */
  var Source: Address = js.native
  
  /**
    * This parameter is used only for sending authorization. It is the ARN of the identity that is associated with the sending authorization policy that permits you to send for the email address specified in the Source parameter. For example, if the owner of example.com (which has ARN arn:aws:ses:us-east-1:123456789012:identity/example.com) attaches a policy to it that authorizes you to send from user@example.com, then you would specify the SourceArn to be arn:aws:ses:us-east-1:123456789012:identity/example.com, and the Source to be user@example.com. For more information about sending authorization, see the Amazon SES Developer Guide.
    */
  var SourceArn: js.UndefOr[AmazonResourceName] = js.native
  
  /**
    * The template to use when sending this email.
    */
  var Template: TemplateName = js.native
  
  /**
    * The ARN of the template to use when sending this email.
    */
  var TemplateArn: js.UndefOr[AmazonResourceName] = js.native
}
object SendBulkTemplatedEmailRequest {
  
  @scala.inline
  def apply(Destinations: BulkEmailDestinationList, Source: Address, Template: TemplateName): SendBulkTemplatedEmailRequest = {
    val __obj = js.Dynamic.literal(Destinations = Destinations.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any], Template = Template.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendBulkTemplatedEmailRequest]
  }
  
  @scala.inline
  implicit class SendBulkTemplatedEmailRequestMutableBuilder[Self <: SendBulkTemplatedEmailRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigurationSetName(value: ConfigurationSetName): Self = StObject.set(x, "ConfigurationSetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationSetNameUndefined: Self = StObject.set(x, "ConfigurationSetName", js.undefined)
    
    @scala.inline
    def setDefaultTags(value: MessageTagList): Self = StObject.set(x, "DefaultTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultTagsUndefined: Self = StObject.set(x, "DefaultTags", js.undefined)
    
    @scala.inline
    def setDefaultTagsVarargs(value: MessageTag*): Self = StObject.set(x, "DefaultTags", js.Array(value :_*))
    
    @scala.inline
    def setDefaultTemplateData(value: TemplateData): Self = StObject.set(x, "DefaultTemplateData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultTemplateDataUndefined: Self = StObject.set(x, "DefaultTemplateData", js.undefined)
    
    @scala.inline
    def setDestinations(value: BulkEmailDestinationList): Self = StObject.set(x, "Destinations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationsVarargs(value: BulkEmailDestination*): Self = StObject.set(x, "Destinations", js.Array(value :_*))
    
    @scala.inline
    def setReplyToAddresses(value: AddressList): Self = StObject.set(x, "ReplyToAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplyToAddressesUndefined: Self = StObject.set(x, "ReplyToAddresses", js.undefined)
    
    @scala.inline
    def setReplyToAddressesVarargs(value: Address*): Self = StObject.set(x, "ReplyToAddresses", js.Array(value :_*))
    
    @scala.inline
    def setReturnPath(value: Address): Self = StObject.set(x, "ReturnPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnPathArn(value: AmazonResourceName): Self = StObject.set(x, "ReturnPathArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnPathArnUndefined: Self = StObject.set(x, "ReturnPathArn", js.undefined)
    
    @scala.inline
    def setReturnPathUndefined: Self = StObject.set(x, "ReturnPath", js.undefined)
    
    @scala.inline
    def setSource(value: Address): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceArn(value: AmazonResourceName): Self = StObject.set(x, "SourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceArnUndefined: Self = StObject.set(x, "SourceArn", js.undefined)
    
    @scala.inline
    def setTemplate(value: TemplateName): Self = StObject.set(x, "Template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateArn(value: AmazonResourceName): Self = StObject.set(x, "TemplateArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateArnUndefined: Self = StObject.set(x, "TemplateArn", js.undefined)
  }
}
