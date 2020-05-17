package typingsSlinky.braintree.mod

import typingsSlinky.braintree.anon.CountryCodeAlpha2
import typingsSlinky.braintree.anon.VerificationAcmount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaymentMethodUpdateRequest extends js.Object {
  var billingAddress: js.UndefOr[CountryCodeAlpha2] = js.native
  var billingAddressId: js.UndefOr[String] = js.native
  var cardholderName: js.UndefOr[String] = js.native
  var cvv: js.UndefOr[String] = js.native
  var deviceData: js.UndefOr[String] = js.native
  var expirationDate: js.UndefOr[String] = js.native
  var expirationMonth: js.UndefOr[String] = js.native
  var expirationYear: js.UndefOr[String] = js.native
  var number: js.UndefOr[String] = js.native
  var options: js.UndefOr[VerificationAcmount] = js.native
  var paymentMethodNonce: js.UndefOr[String] = js.native
}

object PaymentMethodUpdateRequest {
  @scala.inline
  def apply(): PaymentMethodUpdateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaymentMethodUpdateRequest]
  }
  @scala.inline
  implicit class PaymentMethodUpdateRequestOps[Self <: PaymentMethodUpdateRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBillingAddress(value: CountryCodeAlpha2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billingAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBillingAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billingAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withBillingAddressId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billingAddressId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBillingAddressId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billingAddressId")(js.undefined)
        ret
    }
    @scala.inline
    def withCardholderName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardholderName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCardholderName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardholderName")(js.undefined)
        ret
    }
    @scala.inline
    def withCvv(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cvv")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCvv: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cvv")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceData")(js.undefined)
        ret
    }
    @scala.inline
    def withExpirationDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expirationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpirationDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expirationDate")(js.undefined)
        ret
    }
    @scala.inline
    def withExpirationMonth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expirationMonth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpirationMonth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expirationMonth")(js.undefined)
        ret
    }
    @scala.inline
    def withExpirationYear(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expirationYear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpirationYear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expirationYear")(js.undefined)
        ret
    }
    @scala.inline
    def withNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: VerificationAcmount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
    @scala.inline
    def withPaymentMethodNonce(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paymentMethodNonce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaymentMethodNonce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paymentMethodNonce")(js.undefined)
        ret
    }
  }
  
}

