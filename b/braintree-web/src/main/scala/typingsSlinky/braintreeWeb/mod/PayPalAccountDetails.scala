package typingsSlinky.braintreeWeb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PayPalAccountDetails extends js.Object {
  var billingAddress: PayPalBillingAddress = js.native
  var countryCode: String = js.native
  var email: String = js.native
  var firstName: String = js.native
  var lastName: String = js.native
  var payerId: String = js.native
  var phone: String = js.native
  var shippingAddress: PayPalShippingAddress = js.native
}

object PayPalAccountDetails {
  @scala.inline
  def apply(
    billingAddress: PayPalBillingAddress,
    countryCode: String,
    email: String,
    firstName: String,
    lastName: String,
    payerId: String,
    phone: String,
    shippingAddress: PayPalShippingAddress
  ): PayPalAccountDetails = {
    val __obj = js.Dynamic.literal(billingAddress = billingAddress.asInstanceOf[js.Any], countryCode = countryCode.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], firstName = firstName.asInstanceOf[js.Any], lastName = lastName.asInstanceOf[js.Any], payerId = payerId.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], shippingAddress = shippingAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[PayPalAccountDetails]
  }
  @scala.inline
  implicit class PayPalAccountDetailsOps[Self <: PayPalAccountDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBillingAddress(value: PayPalBillingAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billingAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCountryCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countryCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirstName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPayerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShippingAddress(value: PayPalShippingAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shippingAddress")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

