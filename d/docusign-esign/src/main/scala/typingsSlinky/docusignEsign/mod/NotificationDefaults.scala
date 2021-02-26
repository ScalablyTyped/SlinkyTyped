package typingsSlinky.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotificationDefaults extends StObject {
  
  /**
    * The default notification settings for envelopes sent by using the console.
    */
  var apiEmailNotifications: js.UndefOr[
    /* Contains details about the default notification settings for the envelope notifications that senders and signers receive. */ NotificationDefaultSettings
  ] = js.native
  
  /**
    * The default notification settings for envelopes sent by using the API.
    */
  var emailNotifications: js.UndefOr[
    /* Contains details about the default notification settings for the envelope notifications that senders and signers receive. */ NotificationDefaultSettings
  ] = js.native
}
object NotificationDefaults {
  
  @scala.inline
  def apply(): NotificationDefaults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotificationDefaults]
  }
  
  @scala.inline
  implicit class NotificationDefaultsMutableBuilder[Self <: NotificationDefaults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiEmailNotifications(
      value: /* Contains details about the default notification settings for the envelope notifications that senders and signers receive. */ NotificationDefaultSettings
    ): Self = StObject.set(x, "apiEmailNotifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiEmailNotificationsUndefined: Self = StObject.set(x, "apiEmailNotifications", js.undefined)
    
    @scala.inline
    def setEmailNotifications(
      value: /* Contains details about the default notification settings for the envelope notifications that senders and signers receive. */ NotificationDefaultSettings
    ): Self = StObject.set(x, "emailNotifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailNotificationsUndefined: Self = StObject.set(x, "emailNotifications", js.undefined)
  }
}
