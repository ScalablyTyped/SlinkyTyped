package typingsSlinky.braintree.anon

import typingsSlinky.braintree.mod.DurbinRegulated
import typingsSlinky.braintree.mod.HealthCare
import typingsSlinky.braintree.mod.Payroll
import typingsSlinky.braintree.mod.Prepaid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomerLocation extends js.Object {
  var bin: String = js.native
  var cardType: String = js.native
  var cardholderName: String = js.native
  var commercial: typingsSlinky.braintree.mod.Commercial = js.native
  var countryOfIssuance: String = js.native
  var customerLocation: typingsSlinky.braintree.mod.CustomerLocation = js.native
  var debit: typingsSlinky.braintree.mod.Debit = js.native
  var durbinRegulated: DurbinRegulated = js.native
  var expirationDate: String = js.native
  var expirationMonth: String = js.native
  var expirationYear: String = js.native
  var healthcare: HealthCare = js.native
  var imageUrl: String = js.native
  var issuingBank: String = js.native
  var last4: String = js.native
  var maskedNumber: String = js.native
  var payroll: Payroll = js.native
  var prepaid: Prepaid = js.native
  var productId: String = js.native
  var sourceCardLast4: String = js.native
  var token: String = js.native
}

object CustomerLocation {
  @scala.inline
  def apply(
    bin: String,
    cardType: String,
    cardholderName: String,
    commercial: typingsSlinky.braintree.mod.Commercial,
    countryOfIssuance: String,
    customerLocation: typingsSlinky.braintree.mod.CustomerLocation,
    debit: typingsSlinky.braintree.mod.Debit,
    durbinRegulated: DurbinRegulated,
    expirationDate: String,
    expirationMonth: String,
    expirationYear: String,
    healthcare: HealthCare,
    imageUrl: String,
    issuingBank: String,
    last4: String,
    maskedNumber: String,
    payroll: Payroll,
    prepaid: Prepaid,
    productId: String,
    sourceCardLast4: String,
    token: String
  ): CustomerLocation = {
    val __obj = js.Dynamic.literal(bin = bin.asInstanceOf[js.Any], cardType = cardType.asInstanceOf[js.Any], cardholderName = cardholderName.asInstanceOf[js.Any], commercial = commercial.asInstanceOf[js.Any], countryOfIssuance = countryOfIssuance.asInstanceOf[js.Any], customerLocation = customerLocation.asInstanceOf[js.Any], debit = debit.asInstanceOf[js.Any], durbinRegulated = durbinRegulated.asInstanceOf[js.Any], expirationDate = expirationDate.asInstanceOf[js.Any], expirationMonth = expirationMonth.asInstanceOf[js.Any], expirationYear = expirationYear.asInstanceOf[js.Any], healthcare = healthcare.asInstanceOf[js.Any], imageUrl = imageUrl.asInstanceOf[js.Any], issuingBank = issuingBank.asInstanceOf[js.Any], last4 = last4.asInstanceOf[js.Any], maskedNumber = maskedNumber.asInstanceOf[js.Any], payroll = payroll.asInstanceOf[js.Any], prepaid = prepaid.asInstanceOf[js.Any], productId = productId.asInstanceOf[js.Any], sourceCardLast4 = sourceCardLast4.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomerLocation]
  }
  @scala.inline
  implicit class CustomerLocationOps[Self <: CustomerLocation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCardType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCardholderName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardholderName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommercial(value: typingsSlinky.braintree.mod.Commercial): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commercial")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCountryOfIssuance(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countryOfIssuance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomerLocation(value: typingsSlinky.braintree.mod.CustomerLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customerLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDebit(value: typingsSlinky.braintree.mod.Debit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDurbinRegulated(value: DurbinRegulated): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durbinRegulated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpirationDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expirationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpirationMonth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expirationMonth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpirationYear(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expirationYear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHealthcare(value: HealthCare): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("healthcare")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImageUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIssuingBank(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issuingBank")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLast4(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last4")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaskedNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskedNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPayroll(value: Payroll): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrepaid(value: Prepaid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prepaid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProductId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceCardLast4(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceCardLast4")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

