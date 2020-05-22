package typingsSlinky.braintreeWebDropIn.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.braintreeWebDropIn.braintreeWebDropInStrings.AndroidPayCard
import typingsSlinky.braintreeWebDropIn.braintreeWebDropInStrings.ApplePayCard
import typingsSlinky.braintreeWebDropIn.braintreeWebDropInStrings.CreditCard
import typingsSlinky.braintreeWebDropIn.braintreeWebDropInStrings.PayPalAccount
import typingsSlinky.braintreeWebDropIn.braintreeWebDropInStrings.VenmoAccount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaymentMethodPayload
  extends /* key */ StringDictionary[js.Any] {
  var details: js.Object
  var deviceData: String | Null
  var nonce: String
  var `type`: CreditCard | PayPalAccount | VenmoAccount | AndroidPayCard | ApplePayCard
}

object PaymentMethodPayload {
  @scala.inline
  def apply(
    details: js.Object,
    nonce: String,
    `type`: CreditCard | PayPalAccount | VenmoAccount | AndroidPayCard | ApplePayCard,
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    deviceData: String = null
  ): PaymentMethodPayload = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any], deviceData = deviceData.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[PaymentMethodPayload]
  }
}

