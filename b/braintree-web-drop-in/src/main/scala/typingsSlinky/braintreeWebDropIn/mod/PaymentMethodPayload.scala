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
import org.scalablytyped.runtime.StObject
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
trait PaymentMethodPayload extends StObject
object PaymentMethodPayload {
  
  @scala.inline
  def applePayPaymentMethodPayload(
    binData: binData,
    description: String,
    details: CardHolderName,
    nonce: String,
    `type`: ApplePayCard
  ): typingsSlinky.braintreeWebDropIn.mod.applePayPaymentMethodPayload = {
    val __obj = js.Dynamic.literal(binData = binData.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.braintreeWebDropIn.mod.applePayPaymentMethodPayload]
  }
  
  @scala.inline
  def cardPaymentMethodPayload(binData: binData, details: Bin, nonce: String, `type`: CreditCard): typingsSlinky.braintreeWebDropIn.mod.cardPaymentMethodPayload = {
    val __obj = js.Dynamic.literal(binData = binData.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.braintreeWebDropIn.mod.cardPaymentMethodPayload]
  }
  
  @scala.inline
  def googlePayPaymentMethodPayload(binData: binData, details: CardType, nonce: String, `type`: AndroidPayCard): typingsSlinky.braintreeWebDropIn.mod.googlePayPaymentMethodPayload = {
    val __obj = js.Dynamic.literal(binData = binData.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.braintreeWebDropIn.mod.googlePayPaymentMethodPayload]
  }
  
  @scala.inline
  def paypalPaymentMethodPayload(details: BillingAddress, nonce: String, `type`: PayPalAccount): typingsSlinky.braintreeWebDropIn.mod.paypalPaymentMethodPayload = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.braintreeWebDropIn.mod.paypalPaymentMethodPayload]
  }
  
  @scala.inline
  def venmoPaymentMethodPayload(details: Username, nonce: String, `type`: VenmoAccount): typingsSlinky.braintreeWebDropIn.mod.venmoPaymentMethodPayload = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.braintreeWebDropIn.mod.venmoPaymentMethodPayload]
  }
}
