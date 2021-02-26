package typingsSlinky.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TemplateNotificationRequest extends StObject {
  
  /**
    * A complex element that specifies the expiration settings for the envelope.
    */
  var expirations: js.UndefOr[
    /* A complex element that specifies the expiration settings for the envelope. */ Expirations
  ] = js.native
  
  /**
    * The user's encrypted password hash.
    */
  var password: js.UndefOr[String] = js.native
  
  /**
    * A complex element that specifies reminder settings for the envelope
    */
  var reminders: js.UndefOr[
    /* A complex element that specifies reminder settings for the envelope. */ Reminders
  ] = js.native
  
  /**
    * When set to **true**, the account default notification settings are used for the envelope, overriding the reminders and expirations settings.
    * When set to **false**, the reminders and expirations settings specified in this request are used.
    */
  var useAccountDefaults: js.UndefOr[String] = js.native
}
object TemplateNotificationRequest {
  
  @scala.inline
  def apply(): TemplateNotificationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemplateNotificationRequest]
  }
  
  @scala.inline
  implicit class TemplateNotificationRequestMutableBuilder[Self <: TemplateNotificationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpirations(
      value: /* A complex element that specifies the expiration settings for the envelope. */ Expirations
    ): Self = StObject.set(x, "expirations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationsUndefined: Self = StObject.set(x, "expirations", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    @scala.inline
    def setReminders(value: /* A complex element that specifies reminder settings for the envelope. */ Reminders): Self = StObject.set(x, "reminders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemindersUndefined: Self = StObject.set(x, "reminders", js.undefined)
    
    @scala.inline
    def setUseAccountDefaults(value: String): Self = StObject.set(x, "useAccountDefaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseAccountDefaultsUndefined: Self = StObject.set(x, "useAccountDefaults", js.undefined)
  }
}
