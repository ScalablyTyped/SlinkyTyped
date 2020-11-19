package typingsSlinky.googlepay.google.payments.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Enum string for the callback intents.
  *
  * Options:
  *
  * - `SHIPPING_ADDRESS`:
  *   Callback occurs when shipping address is changed.
  *
  * - `SHIPPING_OPTION`:
  *   Callback occurs when shipping option is changed.
  *
  *   If this callback intent is set, then
  *   [[PaymentDataRequest.shippingOptionRequired|`PaymentDataRequest.shippingOptionRequired`]]
  *   must be set to true.
  *
  *   [[PaymentDataRequest.shippingOptionParameters|`PaymentDataRequest.shippingOptionParameters`]]
  *   can optionally be set, if omitted, we will render a placeholder
  *   shipping option named "Shipping option pending" with id
  *   "shipping_option_unselected".
  *
  *   If developers receive a
  *   [[IntermediatePaymentData.shippingOptionData|`IntermediatePaymentData.shippingOptionData`]]
  *   with id "shipping_option_unselected", it means they need to populate
  *   valid
  *   [[PaymentDataRequest.shippingOptionParameters|`PaymentDataRequest.shippingOptionParameters`]]
  *   in the
  *   [[PaymentDataRequestUpdate.newShippingOptionParameters|`PaymentDataRequestUpdate.newShippingOptionParameters`]].
  *
  * - `PAYMENT_AUTHORIZATION`:
  *   Callback occurs when user authorized payment and
  *   [[PaymentData|`PaymentData`]] will be returned.
  *
  * - `PAYMENT_METHOD`:
  *   Callback occurs when payment method is changed.
  *
  *   Developer will receive callback data in
  *   [[IntermediatePaymentData.paymentMethodData|`IntermediatePaymentData.paymentMethodData`]]
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.googlepay.googlepayStrings.SHIPPING_ADDRESS
  - typingsSlinky.googlepay.googlepayStrings.SHIPPING_OPTION
  - typingsSlinky.googlepay.googlepayStrings.PAYMENT_AUTHORIZATION
  - typingsSlinky.googlepay.googlepayStrings.PAYMENT_METHOD
*/
trait CallbackIntent extends js.Object
object CallbackIntent {
  
  @scala.inline
  def PAYMENT_AUTHORIZATION: typingsSlinky.googlepay.googlepayStrings.PAYMENT_AUTHORIZATION = "PAYMENT_AUTHORIZATION".asInstanceOf[typingsSlinky.googlepay.googlepayStrings.PAYMENT_AUTHORIZATION]
  
  @scala.inline
  def PAYMENT_METHOD: typingsSlinky.googlepay.googlepayStrings.PAYMENT_METHOD = "PAYMENT_METHOD".asInstanceOf[typingsSlinky.googlepay.googlepayStrings.PAYMENT_METHOD]
  
  @scala.inline
  def SHIPPING_ADDRESS: typingsSlinky.googlepay.googlepayStrings.SHIPPING_ADDRESS = "SHIPPING_ADDRESS".asInstanceOf[typingsSlinky.googlepay.googlepayStrings.SHIPPING_ADDRESS]
  
  @scala.inline
  def SHIPPING_OPTION: typingsSlinky.googlepay.googlepayStrings.SHIPPING_OPTION = "SHIPPING_OPTION".asInstanceOf[typingsSlinky.googlepay.googlepayStrings.SHIPPING_OPTION]
}
