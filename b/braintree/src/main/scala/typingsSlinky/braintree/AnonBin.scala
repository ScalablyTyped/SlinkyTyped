package typingsSlinky.braintree

import typingsSlinky.braintree.mod.Commercial
import typingsSlinky.braintree.mod.CustomerLocation
import typingsSlinky.braintree.mod.DurbinRegulated
import typingsSlinky.braintree.mod.HealthCare
import typingsSlinky.braintree.mod.Payroll
import typingsSlinky.braintree.mod.Prepaid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBin extends js.Object {
  var bin: String = js.native
  var cardType: String = js.native
  var cardholderName: js.UndefOr[String] = js.native
  var commercial: Commercial = js.native
  var countryOfIssuance: String = js.native
  var customerLocation: CustomerLocation = js.native
  var debit: String = js.native
  var durbinRegulated: DurbinRegulated = js.native
  var expirationDate: js.UndefOr[String] = js.native
  var expirationMonth: js.UndefOr[String] = js.native
  var expirationYear: js.UndefOr[String] = js.native
  var healthcare: HealthCare = js.native
  var issuingBank: String = js.native
  var last4: String = js.native
  var payroll: Payroll = js.native
  var prepaid: Prepaid = js.native
  var productId: String = js.native
  var token: String = js.native
  var uniqueNumberIdentifier: String = js.native
}

object AnonBin {
  @scala.inline
  def apply(
    bin: String,
    cardType: String,
    commercial: Commercial,
    countryOfIssuance: String,
    customerLocation: CustomerLocation,
    debit: String,
    durbinRegulated: DurbinRegulated,
    healthcare: HealthCare,
    issuingBank: String,
    last4: String,
    payroll: Payroll,
    prepaid: Prepaid,
    productId: String,
    token: String,
    uniqueNumberIdentifier: String
  ): AnonBin = {
    val __obj = js.Dynamic.literal(bin = bin.asInstanceOf[js.Any], cardType = cardType.asInstanceOf[js.Any], commercial = commercial.asInstanceOf[js.Any], countryOfIssuance = countryOfIssuance.asInstanceOf[js.Any], customerLocation = customerLocation.asInstanceOf[js.Any], debit = debit.asInstanceOf[js.Any], durbinRegulated = durbinRegulated.asInstanceOf[js.Any], healthcare = healthcare.asInstanceOf[js.Any], issuingBank = issuingBank.asInstanceOf[js.Any], last4 = last4.asInstanceOf[js.Any], payroll = payroll.asInstanceOf[js.Any], prepaid = prepaid.asInstanceOf[js.Any], productId = productId.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], uniqueNumberIdentifier = uniqueNumberIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBin]
  }
  @scala.inline
  implicit class AnonBinOps[Self <: AnonBin] (val x: Self) extends AnyVal {
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
    def withCommercial(value: Commercial): Self = {
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
    def withCustomerLocation(value: CustomerLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customerLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDebit(value: String): Self = {
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
    def withHealthcare(value: HealthCare): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("healthcare")(value.asInstanceOf[js.Any])
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
    def withToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUniqueNumberIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniqueNumberIdentifier")(value.asInstanceOf[js.Any])
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
  }
  
}

