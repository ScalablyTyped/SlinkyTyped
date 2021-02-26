package typingsSlinky.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotificationDefaultSettings extends StObject {
  
  /**
    *
    * An array of email notifications that sets the email the user receives when they are a sender. When the specific email notification is set to true,
    * the user will receive those types of email notifications from DocuSign.
    *
    * The user inherits the default account sender email notification settings when the user is created. The email notifications are:
    *
    * * envelopeComplete
    * * changedSigner
    * * senderEnvelopeDeclined
    * * withdrawnConsent
    * * recipientViewed
    * * deliveryFailed
    *
    */
  var senderEmailNotifications: js.UndefOr[
    /* Contains the settings for the email notifications that senders receive about the envelopes that they send. */ SenderEmailNotifications
  ] = js.native
  
  /**
    * An array of email notifications that specifies the email the user receives when they are a sender. When the specific email notification is set to true, the user receives
    * those types of email notifications from DocuSign. The user inherits the default account sender email notification settings when the user is created.
    */
  var signerEmailNotifications: js.UndefOr[
    /* An array of email notifications that specifies the email the user receives when they are a sender. When the specific email notification is
    set to true, the user receives those types of email notifications from DocuSign. The user inherits the default account sender email notification settings when the user is created.
    */ SignerEmailNotifications
  ] = js.native
}
object NotificationDefaultSettings {
  
  @scala.inline
  def apply(): NotificationDefaultSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotificationDefaultSettings]
  }
  
  @scala.inline
  implicit class NotificationDefaultSettingsMutableBuilder[Self <: NotificationDefaultSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSenderEmailNotifications(
      value: /* Contains the settings for the email notifications that senders receive about the envelopes that they send. */ SenderEmailNotifications
    ): Self = StObject.set(x, "senderEmailNotifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSenderEmailNotificationsUndefined: Self = StObject.set(x, "senderEmailNotifications", js.undefined)
    
    @scala.inline
    def setSignerEmailNotifications(
      value: /* An array of email notifications that specifies the email the user receives when they are a sender. When the specific email notification is
      set to true, the user receives those types of email notifications from DocuSign. The user inherits the default account sender email notification settings when the user is created.
      */ SignerEmailNotifications
    ): Self = StObject.set(x, "signerEmailNotifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignerEmailNotificationsUndefined: Self = StObject.set(x, "signerEmailNotifications", js.undefined)
  }
}
