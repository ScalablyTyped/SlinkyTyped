package typingsSlinky.googlepay.google.payments.api

import typingsSlinky.googlepay.googlepayBooleans.`false`
import typingsSlinky.googlepay.googlepayBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Optional shipping address parameters for the returned shipping address.
  */
@js.native
trait ShippingAddressParameters extends js.Object {
  /**
    * Allowed country codes for the shipping address.
    *
    * This list should be an array of ISO 3166-1 alpha-2 country codes
    * (e.g., `["US", "CA", "JP"]`).
    *
    * If omitted, a shipping address from any supported country may be
    * returned.
    */
  var allowedCountryCodes: js.Array[String] = js.native
  /**
    * Whether a phone number is additionally required from the buyer for
    * the shipping address (the phone number will only be returned if an
    * address is required, otherwise this field has no effect).
    *
    * If omitted, defaults to `false`.
    *
    * @default false
    */
  var phoneNumberRequired: js.UndefOr[`false` | `true`] = js.native
}

object ShippingAddressParameters {
  @scala.inline
  def apply(allowedCountryCodes: js.Array[String]): ShippingAddressParameters = {
    val __obj = js.Dynamic.literal(allowedCountryCodes = allowedCountryCodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShippingAddressParameters]
  }
  @scala.inline
  implicit class ShippingAddressParametersOps[Self <: ShippingAddressParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowedCountryCodes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedCountryCodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhoneNumberRequired(value: `false` | `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phoneNumberRequired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhoneNumberRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phoneNumberRequired")(js.undefined)
        ret
    }
  }
  
}

