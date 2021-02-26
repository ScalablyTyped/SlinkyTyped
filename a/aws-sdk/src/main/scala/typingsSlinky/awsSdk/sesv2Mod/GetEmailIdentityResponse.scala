package typingsSlinky.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetEmailIdentityResponse extends StObject {
  
  /**
    * An object that contains information about the DKIM attributes for the identity.
    */
  var DkimAttributes: js.UndefOr[typingsSlinky.awsSdk.sesv2Mod.DkimAttributes] = js.native
  
  /**
    * The feedback forwarding configuration for the identity. If the value is true, you receive email notifications when bounce or complaint events occur. These notifications are sent to the address that you specified in the Return-Path header of the original email. You're required to have a method of tracking bounces and complaints. If you haven't set up another mechanism for receiving bounce or complaint notifications (for example, by setting up an event destination), you receive an email notification when these events occur (even if this setting is disabled).
    */
  var FeedbackForwardingStatus: js.UndefOr[Enabled] = js.native
  
  /**
    * The email identity type.
    */
  var IdentityType: js.UndefOr[typingsSlinky.awsSdk.sesv2Mod.IdentityType] = js.native
  
  /**
    * An object that contains information about the Mail-From attributes for the email identity.
    */
  var MailFromAttributes: js.UndefOr[typingsSlinky.awsSdk.sesv2Mod.MailFromAttributes] = js.native
  
  /**
    * A map of policy names to policies.
    */
  var Policies: js.UndefOr[PolicyMap] = js.native
  
  /**
    * An array of objects that define the tags (keys and values) that are associated with the email identity.
    */
  var Tags: js.UndefOr[TagList] = js.native
  
  /**
    * Specifies whether or not the identity is verified. You can only send email from verified email addresses or domains. For more information about verifying identities, see the Amazon Pinpoint User Guide.
    */
  var VerifiedForSendingStatus: js.UndefOr[Enabled] = js.native
}
object GetEmailIdentityResponse {
  
  @scala.inline
  def apply(): GetEmailIdentityResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetEmailIdentityResponse]
  }
  
  @scala.inline
  implicit class GetEmailIdentityResponseMutableBuilder[Self <: GetEmailIdentityResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDkimAttributes(value: DkimAttributes): Self = StObject.set(x, "DkimAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDkimAttributesUndefined: Self = StObject.set(x, "DkimAttributes", js.undefined)
    
    @scala.inline
    def setFeedbackForwardingStatus(value: Enabled): Self = StObject.set(x, "FeedbackForwardingStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeedbackForwardingStatusUndefined: Self = StObject.set(x, "FeedbackForwardingStatus", js.undefined)
    
    @scala.inline
    def setIdentityType(value: IdentityType): Self = StObject.set(x, "IdentityType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityTypeUndefined: Self = StObject.set(x, "IdentityType", js.undefined)
    
    @scala.inline
    def setMailFromAttributes(value: MailFromAttributes): Self = StObject.set(x, "MailFromAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMailFromAttributesUndefined: Self = StObject.set(x, "MailFromAttributes", js.undefined)
    
    @scala.inline
    def setPolicies(value: PolicyMap): Self = StObject.set(x, "Policies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoliciesUndefined: Self = StObject.set(x, "Policies", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    @scala.inline
    def setVerifiedForSendingStatus(value: Enabled): Self = StObject.set(x, "VerifiedForSendingStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerifiedForSendingStatusUndefined: Self = StObject.set(x, "VerifiedForSendingStatus", js.undefined)
  }
}
