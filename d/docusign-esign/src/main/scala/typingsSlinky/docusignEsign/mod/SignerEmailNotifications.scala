package typingsSlinky.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignerEmailNotifications extends StObject {
  
  /**
    * When set to **true**, the user receives agent notification emails.
    */
  var agentNotification: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, the user receives notifications of carbon copy deliveries.
    */
  var carbonCopyNotification: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, the user receives notifications of certified deliveries.
    */
  var certifiedDeliveryNotification: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, the user receives only comments that mention their own user name.
    */
  var commentsOnlyPrivateAndMention: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, the user receives all comments.
    */
  var commentsReceiveAll: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, the user receives notification that document markup has been activated.
    */
  var documentMarkupActivation: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, the user receives notification that the envelope has been activated.
    */
  var envelopeActivation: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, the user receives an email notification when the envelope has been completed.
    */
  var envelopeComplete: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, the user receives notification that the envelope has been corrected.
    */
  var envelopeCorrected: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, the user receives notification that the envelope has been declined.
    */
  var envelopeDeclined: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, the user receives notification that the envelope has been voided.
    */
  var envelopeVoided: js.UndefOr[String] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var faxReceived: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, the user receives an email notification if offline signing failed.
    */
  var offlineSigningFailed: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, the user receives an email notification when a document purge occurs.
    */
  var purgeDocuments: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, the user receives notification that the envelope has been reassigned.
    */
  var reassignedSigner: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, the user receives notification that he or she is a member of the signing group.
    */
  var whenSigningGroupMember: js.UndefOr[String] = js.native
}
object SignerEmailNotifications {
  
  @scala.inline
  def apply(): SignerEmailNotifications = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SignerEmailNotifications]
  }
  
  @scala.inline
  implicit class SignerEmailNotificationsMutableBuilder[Self <: SignerEmailNotifications] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAgentNotification(value: String): Self = StObject.set(x, "agentNotification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgentNotificationUndefined: Self = StObject.set(x, "agentNotification", js.undefined)
    
    @scala.inline
    def setCarbonCopyNotification(value: String): Self = StObject.set(x, "carbonCopyNotification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCarbonCopyNotificationUndefined: Self = StObject.set(x, "carbonCopyNotification", js.undefined)
    
    @scala.inline
    def setCertifiedDeliveryNotification(value: String): Self = StObject.set(x, "certifiedDeliveryNotification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertifiedDeliveryNotificationUndefined: Self = StObject.set(x, "certifiedDeliveryNotification", js.undefined)
    
    @scala.inline
    def setCommentsOnlyPrivateAndMention(value: String): Self = StObject.set(x, "commentsOnlyPrivateAndMention", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsOnlyPrivateAndMentionUndefined: Self = StObject.set(x, "commentsOnlyPrivateAndMention", js.undefined)
    
    @scala.inline
    def setCommentsReceiveAll(value: String): Self = StObject.set(x, "commentsReceiveAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsReceiveAllUndefined: Self = StObject.set(x, "commentsReceiveAll", js.undefined)
    
    @scala.inline
    def setDocumentMarkupActivation(value: String): Self = StObject.set(x, "documentMarkupActivation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentMarkupActivationUndefined: Self = StObject.set(x, "documentMarkupActivation", js.undefined)
    
    @scala.inline
    def setEnvelopeActivation(value: String): Self = StObject.set(x, "envelopeActivation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvelopeActivationUndefined: Self = StObject.set(x, "envelopeActivation", js.undefined)
    
    @scala.inline
    def setEnvelopeComplete(value: String): Self = StObject.set(x, "envelopeComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvelopeCompleteUndefined: Self = StObject.set(x, "envelopeComplete", js.undefined)
    
    @scala.inline
    def setEnvelopeCorrected(value: String): Self = StObject.set(x, "envelopeCorrected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvelopeCorrectedUndefined: Self = StObject.set(x, "envelopeCorrected", js.undefined)
    
    @scala.inline
    def setEnvelopeDeclined(value: String): Self = StObject.set(x, "envelopeDeclined", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvelopeDeclinedUndefined: Self = StObject.set(x, "envelopeDeclined", js.undefined)
    
    @scala.inline
    def setEnvelopeVoided(value: String): Self = StObject.set(x, "envelopeVoided", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvelopeVoidedUndefined: Self = StObject.set(x, "envelopeVoided", js.undefined)
    
    @scala.inline
    def setFaxReceived(value: String): Self = StObject.set(x, "faxReceived", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFaxReceivedUndefined: Self = StObject.set(x, "faxReceived", js.undefined)
    
    @scala.inline
    def setOfflineSigningFailed(value: String): Self = StObject.set(x, "offlineSigningFailed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfflineSigningFailedUndefined: Self = StObject.set(x, "offlineSigningFailed", js.undefined)
    
    @scala.inline
    def setPurgeDocuments(value: String): Self = StObject.set(x, "purgeDocuments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPurgeDocumentsUndefined: Self = StObject.set(x, "purgeDocuments", js.undefined)
    
    @scala.inline
    def setReassignedSigner(value: String): Self = StObject.set(x, "reassignedSigner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReassignedSignerUndefined: Self = StObject.set(x, "reassignedSigner", js.undefined)
    
    @scala.inline
    def setWhenSigningGroupMember(value: String): Self = StObject.set(x, "whenSigningGroupMember", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhenSigningGroupMemberUndefined: Self = StObject.set(x, "whenSigningGroupMember", js.undefined)
  }
}
