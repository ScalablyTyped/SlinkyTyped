package typingsSlinky.braintreeWeb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @property {string} nonce The payment method nonce.
  * @property {string} type The payment method type, always `PayPalAccount`.
  * @property {object} details Additional PayPal account details.
  * @property {string} details.email User's email address.
  * @property {string} details.payerId User's payer ID, the unique identifier for each PayPal account.
  * @property {string} details.firstName User's given name.
  * @property {string} details.lastName User's surname.
  * @property {?string} details.countryCode User's 2 character country code.
  * @property {?string} details.phone User's phone number (e.g. 555-867-5309).
  * @property {?object} details.shippingAddress User's shipping address details, only available if shipping address is enabled.
  * @property {string} details.shippingAddress.recipientName Recipient of postage.
  * @property {string} details.shippingAddress.line1 Street number and name.
  * @property {string} details.shippingAddress.line2 Extended address.
  * @property {string} details.shippingAddress.city City or locality.
  * @property {string} details.shippingAddress.state State or region.
  * @property {string} details.shippingAddress.postalCode Postal code.
  * @property {string} details.shippingAddress.countryCode 2 character country code (e.g. US).
  * @property {?object} details.billingAddress User's billing address details.
  * Not available to all merchants; [contact PayPal](https://developers.braintreepayments.com/support/guides/paypal/setup-guide#contacting-paypal-support) for details on eligibility and enabling this feature.
  * To enable this feature, [contact PayPal](https://developers.braintreepayments.com/support/guides/paypal/setup-guide#contacting-paypal-support).
  * Alternatively, see `shippingAddress` above as an available client opt
  * To enable this feature, [contact PayPal](https://developers.braintreepayments.com/support/guides/paypal/setup-guide#contacting-paypal-support).
  * @property {string} details.billingAddress.line1 Street number and name.
  * @property {string} details.billingAddress.line2 Extended address.
  * @property {string} details.billingAddress.city City or locality.
  * @property {string} details.billingAddress.state State or region.
  * @property {string} details.billingAddress.postalCode Postal code.
  * @property {string} details.billingAddress.countryCode 2 character country code (e.g. US).
  */
@js.native
trait PayPalShippingAddress extends js.Object {
  var city: String = js.native
  var countryCode: String = js.native
  var line1: String = js.native
  var line2: String = js.native
  var postalCode: String = js.native
  var recipientName: String = js.native
  var state: String = js.native
}

object PayPalShippingAddress {
  @scala.inline
  def apply(
    city: String,
    countryCode: String,
    line1: String,
    line2: String,
    postalCode: String,
    recipientName: String,
    state: String
  ): PayPalShippingAddress = {
    val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], countryCode = countryCode.asInstanceOf[js.Any], line1 = line1.asInstanceOf[js.Any], line2 = line2.asInstanceOf[js.Any], postalCode = postalCode.asInstanceOf[js.Any], recipientName = recipientName.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[PayPalShippingAddress]
  }
  @scala.inline
  implicit class PayPalShippingAddressOps[Self <: PayPalShippingAddress] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("city")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCountryCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countryCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLine1(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLine2(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPostalCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postalCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecipientName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipientName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

