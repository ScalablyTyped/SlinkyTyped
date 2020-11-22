package typingsSlinky.braintreeWebDropIn.mod

import typingsSlinky.braintreeWebDropIn.anon.BillingAddress
import typingsSlinky.braintreeWebDropIn.anon.Bin
import typingsSlinky.braintreeWebDropIn.anon.CardHolderName
import typingsSlinky.braintreeWebDropIn.anon.CardType
import typingsSlinky.braintreeWebDropIn.anon.Username
import typingsSlinky.braintreeWebDropIn.braintreeWebDropInStrings.AndroidPayCard
import typingsSlinky.braintreeWebDropIn.braintreeWebDropInStrings.ApplePayCard
import typingsSlinky.braintreeWebDropIn.braintreeWebDropInStrings.CreditCard
import typingsSlinky.braintreeWebDropIn.braintreeWebDropInStrings.PayPalAccount
import typingsSlinky.braintreeWebDropIn.braintreeWebDropInStrings.VenmoAccount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.braintreeWebDropIn.mod.applePayPaymentMethodPayload
  - typingsSlinky.braintreeWebDropIn.mod.cardPaymentMethodPayload
  - typingsSlinky.braintreeWebDropIn.mod.googlePayPaymentMethodPayload
  - typingsSlinky.braintreeWebDropIn.mod.paypalPaymentMethodPayload
  - typingsSlinky.braintreeWebDropIn.mod.venmoPaymentMethodPayload
*/
trait PaymentMethodPayload extends js.Object
object PaymentMethodPayload {
  
  @scala.inline
  def applePayPaymentMethodPayload(
    binData: binData,
    description: String,
    details: CardHolderName,
    nonce: String,
    `type`: ApplePayCard
  ): PaymentMethodPayload = {
    val __obj = js.Dynamic.literal(binData = binData.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentMethodPayload]
  }
  
  @scala.inline
  def cardPaymentMethodPayload(binData: binData, details: Bin, nonce: String, `type`: CreditCard): PaymentMethodPayload = {
    val __obj = js.Dynamic.literal(binData = binData.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentMethodPayload]
  }
  
  @scala.inline
  def googlePayPaymentMethodPayload(binData: binData, details: CardType, nonce: String, `type`: AndroidPayCard): PaymentMethodPayload = {
    val __obj = js.Dynamic.literal(binData = binData.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentMethodPayload]
  }
  
  @scala.inline
  def paypalPaymentMethodPayload(details: BillingAddress, nonce: String, `type`: PayPalAccount): PaymentMethodPayload = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentMethodPayload]
  }
  
  @scala.inline
  def venmoPaymentMethodPayload(details: Username, nonce: String, `type`: VenmoAccount): PaymentMethodPayload = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentMethodPayload]
  }
}
