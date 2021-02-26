package typingsSlinky.braintree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubMerchantAccountDeclinedNotification
  extends BaseWebhookNotification
     with WebhookNotification {
  
  @JSName("kind")
  var kind_SubMerchantAccountDeclinedNotification: SubMerchantAccountDeclinedNotificationKind = js.native
  
  var merchantAccount: MerchantAccount = js.native
}
object SubMerchantAccountDeclinedNotification {
  
  @scala.inline
  def apply(
    kind: SubMerchantAccountDeclinedNotificationKind,
    merchantAccount: MerchantAccount,
    timestamp: js.Date
  ): SubMerchantAccountDeclinedNotification = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], merchantAccount = merchantAccount.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubMerchantAccountDeclinedNotification]
  }
  
  @scala.inline
  implicit class SubMerchantAccountDeclinedNotificationMutableBuilder[Self <: SubMerchantAccountDeclinedNotification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: SubMerchantAccountDeclinedNotificationKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMerchantAccount(value: MerchantAccount): Self = StObject.set(x, "merchantAccount", value.asInstanceOf[js.Any])
  }
}
