package typingsSlinky.braintree.mod

import typingsSlinky.braintree.anon.Company
import typingsSlinky.braintree.anon.MakeDefault
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaymentMethodCreateRequest extends js.Object {
  var billingAddress: js.UndefOr[Company] = js.native
  var billingAddressId: js.UndefOr[String] = js.native
  var cardholderName: js.UndefOr[String] = js.native
  var customerId: String = js.native
  var cvv: js.UndefOr[String] = js.native
  var deviceData: js.UndefOr[String] = js.native
  var expirationDate: js.UndefOr[String] = js.native
  var expirationMonth: js.UndefOr[String] = js.native
  var expirationYear: js.UndefOr[String] = js.native
  var number: js.UndefOr[String] = js.native
  var options: js.UndefOr[MakeDefault] = js.native
  var paymentMethodNonce: String = js.native
}

object PaymentMethodCreateRequest {
  @scala.inline
  def apply(customerId: String, paymentMethodNonce: String): PaymentMethodCreateRequest = {
    val __obj = js.Dynamic.literal(customerId = customerId.asInstanceOf[js.Any], paymentMethodNonce = paymentMethodNonce.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentMethodCreateRequest]
  }
  @scala.inline
  implicit class PaymentMethodCreateRequestOps[Self <: PaymentMethodCreateRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaymentMethodNonce(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paymentMethodNonce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBillingAddress(value: Company): Self = {
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
    def withOptions(value: MakeDefault): Self = {
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
  }
  
}

