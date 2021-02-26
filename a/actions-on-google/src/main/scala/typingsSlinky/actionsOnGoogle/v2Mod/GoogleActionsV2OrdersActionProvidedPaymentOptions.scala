package typingsSlinky.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsV2OrdersActionProvidedPaymentOptions extends StObject {
  
  /**
    * Name of the instrument displayed on the receipt.
    * Required for action-provided payment info.
    * For `PAYMENT_CARD`, this could be \"VISA-1234\".
    * For `BANK`, this could be \"Chase Checking-1234\".
    * For `LOYALTY_PROGRAM`, this could be \"Starbuck's points\".
    * For `ON_FULFILLMENT`, this could be something like \"pay on delivery\".
    */
  var displayName: js.UndefOr[String] = js.native
  
  /**
    * Type of payment.
    * Required.
    */
  var paymentType: js.UndefOr[GoogleActionsV2OrdersActionProvidedPaymentOptionsPaymentType] = js.native
}
object GoogleActionsV2OrdersActionProvidedPaymentOptions {
  
  @scala.inline
  def apply(): GoogleActionsV2OrdersActionProvidedPaymentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2OrdersActionProvidedPaymentOptions]
  }
  
  @scala.inline
  implicit class GoogleActionsV2OrdersActionProvidedPaymentOptionsMutableBuilder[Self <: GoogleActionsV2OrdersActionProvidedPaymentOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setPaymentType(value: GoogleActionsV2OrdersActionProvidedPaymentOptionsPaymentType): Self = StObject.set(x, "paymentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaymentTypeUndefined: Self = StObject.set(x, "paymentType", js.undefined)
  }
}
