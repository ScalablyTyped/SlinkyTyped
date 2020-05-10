package typingsSlinky.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomerUpdateRequest extends js.Object {
  var company: js.UndefOr[String] = js.native
  var creditCard: js.UndefOr[CreditCardUpdateRequest] = js.native
  var customFields: js.UndefOr[js.Any] = js.native
  var defaultPaymentMethodToken: js.UndefOr[String] = js.native
  var deviceData: js.UndefOr[String] = js.native
  var email: js.UndefOr[String] = js.native
  var fax: js.UndefOr[String] = js.native
  var firstName: js.UndefOr[String] = js.native
  var lastName: js.UndefOr[String] = js.native
  var paymentMethodNonce: js.UndefOr[String] = js.native
  var phone: js.UndefOr[String] = js.native
  var riskData: js.UndefOr[CustomerRiskData] = js.native
  var website: js.UndefOr[String] = js.native
}

object CustomerUpdateRequest {
  @scala.inline
  def apply(): CustomerUpdateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomerUpdateRequest]
  }
  @scala.inline
  implicit class CustomerUpdateRequestOps[Self <: CustomerUpdateRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompany(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("company")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompany: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("company")(js.undefined)
        ret
    }
    @scala.inline
    def withCreditCard(value: CreditCardUpdateRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creditCard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreditCard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creditCard")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomFields(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customFields")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultPaymentMethodToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultPaymentMethodToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultPaymentMethodToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultPaymentMethodToken")(js.undefined)
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
    def withEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(js.undefined)
        ret
    }
    @scala.inline
    def withFax(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fax")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstName")(js.undefined)
        ret
    }
    @scala.inline
    def withLastName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastName")(js.undefined)
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
    @scala.inline
    def withPhone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phone")(js.undefined)
        ret
    }
    @scala.inline
    def withRiskData(value: CustomerRiskData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("riskData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRiskData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("riskData")(js.undefined)
        ret
    }
    @scala.inline
    def withWebsite(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("website")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebsite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("website")(js.undefined)
        ret
    }
  }
  
}

