package typingsSlinky.maximMazurokGapiClientDfareporting.anon

import typingsSlinky.maximMazurokGapiClientDfareporting.gapi.client.dfareporting.Recipient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmailOwner extends StObject {
  
  /** Whether the report should be emailed to the report owner. */
  var emailOwner: js.UndefOr[Boolean] = js.native
  
  /** The type of delivery for the owner to receive, if enabled. */
  var emailOwnerDeliveryType: js.UndefOr[String] = js.native
  
  /** The message to be sent with each email. */
  var message: js.UndefOr[String] = js.native
  
  /** The list of recipients to which to email the report. */
  var recipients: js.UndefOr[js.Array[Recipient]] = js.native
}
object EmailOwner {
  
  @scala.inline
  def apply(): EmailOwner = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmailOwner]
  }
  
  @scala.inline
  implicit class EmailOwnerMutableBuilder[Self <: EmailOwner] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmailOwner(value: Boolean): Self = StObject.set(x, "emailOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailOwnerDeliveryType(value: String): Self = StObject.set(x, "emailOwnerDeliveryType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailOwnerDeliveryTypeUndefined: Self = StObject.set(x, "emailOwnerDeliveryType", js.undefined)
    
    @scala.inline
    def setEmailOwnerUndefined: Self = StObject.set(x, "emailOwner", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setRecipients(value: js.Array[Recipient]): Self = StObject.set(x, "recipients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientsUndefined: Self = StObject.set(x, "recipients", js.undefined)
    
    @scala.inline
    def setRecipientsVarargs(value: Recipient*): Self = StObject.set(x, "recipients", js.Array(value :_*))
  }
}
