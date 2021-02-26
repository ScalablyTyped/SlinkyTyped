package typingsSlinky.paypalPayoutsSdk.mod

import typingsSlinky.paypalPayoutsSdk.anon.Phone
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PayoutItem extends StObject {
  
  var alternate_notification_method: js.UndefOr[Phone] = js.native
  
  var amount: typingsSlinky.paypalPayoutsSdk.anon.Currency = js.native
  
  var note: js.UndefOr[String] = js.native
  
  var notification_language: js.UndefOr[String] = js.native
  
  var receiver: String = js.native
  
  var recipient_type: js.UndefOr[RecipientType] = js.native
  
  var recipient_wallet: js.UndefOr[RecipientWallet] = js.native
  
  var sender_item_id: js.UndefOr[String] = js.native
}
object PayoutItem {
  
  @scala.inline
  def apply(amount: typingsSlinky.paypalPayoutsSdk.anon.Currency, receiver: String): PayoutItem = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], receiver = receiver.asInstanceOf[js.Any])
    __obj.asInstanceOf[PayoutItem]
  }
  
  @scala.inline
  implicit class PayoutItemMutableBuilder[Self <: PayoutItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlternate_notification_method(value: Phone): Self = StObject.set(x, "alternate_notification_method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlternate_notification_methodUndefined: Self = StObject.set(x, "alternate_notification_method", js.undefined)
    
    @scala.inline
    def setAmount(value: typingsSlinky.paypalPayoutsSdk.anon.Currency): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNote(value: String): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    @scala.inline
    def setNotification_language(value: String): Self = StObject.set(x, "notification_language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotification_languageUndefined: Self = StObject.set(x, "notification_language", js.undefined)
    
    @scala.inline
    def setReceiver(value: String): Self = StObject.set(x, "receiver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipient_type(value: RecipientType): Self = StObject.set(x, "recipient_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipient_typeUndefined: Self = StObject.set(x, "recipient_type", js.undefined)
    
    @scala.inline
    def setRecipient_wallet(value: RecipientWallet): Self = StObject.set(x, "recipient_wallet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipient_walletUndefined: Self = StObject.set(x, "recipient_wallet", js.undefined)
    
    @scala.inline
    def setSender_item_id(value: String): Self = StObject.set(x, "sender_item_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSender_item_idUndefined: Self = StObject.set(x, "sender_item_id", js.undefined)
  }
}
