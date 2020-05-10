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

@js.native
trait PaymentMethodPayload
  extends /* key */ StringDictionary[js.Any] {
  var details: js.Object = js.native
  var deviceData: String | Null = js.native
  var nonce: String = js.native
  var `type`: CreditCard | PayPalAccount | VenmoAccount | AndroidPayCard | ApplePayCard = js.native
}

object PaymentMethodPayload {
  @scala.inline
  def apply(
    details: js.Object,
    nonce: String,
    `type`: CreditCard | PayPalAccount | VenmoAccount | AndroidPayCard | ApplePayCard
  ): PaymentMethodPayload = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentMethodPayload]
  }
  @scala.inline
  implicit class PaymentMethodPayloadOps[Self <: PaymentMethodPayload] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDetails(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("details")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNonce(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: CreditCard | PayPalAccount | VenmoAccount | AndroidPayCard | ApplePayCard): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeviceData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeviceDataNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceData")(null)
        ret
    }
  }
  
}

