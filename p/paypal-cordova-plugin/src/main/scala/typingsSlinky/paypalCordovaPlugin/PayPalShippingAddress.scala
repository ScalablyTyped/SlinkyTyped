package typingsSlinky.paypalCordovaPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PayPalShippingAddress extends js.Object {
  /**
    * City name. 50 characters max.
    */
  var city: String = js.native
  /**
    * 2-letter country code. 2 characters max.
    */
  var countryCode: String = js.native
  /**
    * Line 1 of the address (e.g., Number, street, etc). 100 characters max.
    */
  var line1: String = js.native
  /**
    * Line 2 of the address (e.g., Suite, apt #, etc). 100 characters max. Optional.
    */
  var line2: String = js.native
  /**
    * ZIP code or equivalent is usually required for countries that have them. 20 characters max. Required in certain countries.
    */
  var postalCode: String = js.native
  /**
    * Name of the recipient at this address. 50 characters max.
    */
  var recipientName: String = js.native
  /**
    * 2-letter code for US states, and the equivalent for other countries. 100 characters max. Required in certain countries.
    */
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

