package typingsSlinky.braintree.anon

import typingsSlinky.braintree.mod.DurbinRegulated
import typingsSlinky.braintree.mod.HealthCare
import typingsSlinky.braintree.mod.Payroll
import typingsSlinky.braintree.mod.Prepaid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Commercial extends js.Object {
  var bin: String = js.native
  var commercial: typingsSlinky.braintree.mod.Commercial = js.native
  var countryOfIssuance: String = js.native
  var debit: typingsSlinky.braintree.mod.Debit = js.native
  var durbinRegulated: DurbinRegulated = js.native
  var expirationMonth: String = js.native
  var expirationYear: String = js.native
  var googleTransactionId: String = js.native
  var healthcare: HealthCare = js.native
  var imageUrl: String = js.native
  var payroll: Payroll = js.native
  var prepaid: Prepaid = js.native
  var productId: String = js.native
  var sourceCardLast4: String = js.native
  var sourceCardType: String = js.native
  var sourceDescription: String = js.native
  var token: String = js.native
  var virtualCardLast4: String = js.native
  var virtualCardType: String = js.native
}

object Commercial {
  @scala.inline
  def apply(
    bin: String,
    commercial: typingsSlinky.braintree.mod.Commercial,
    countryOfIssuance: String,
    debit: typingsSlinky.braintree.mod.Debit,
    durbinRegulated: DurbinRegulated,
    expirationMonth: String,
    expirationYear: String,
    googleTransactionId: String,
    healthcare: HealthCare,
    imageUrl: String,
    payroll: Payroll,
    prepaid: Prepaid,
    productId: String,
    sourceCardLast4: String,
    sourceCardType: String,
    sourceDescription: String,
    token: String,
    virtualCardLast4: String,
    virtualCardType: String
  ): Commercial = {
    val __obj = js.Dynamic.literal(bin = bin.asInstanceOf[js.Any], commercial = commercial.asInstanceOf[js.Any], countryOfIssuance = countryOfIssuance.asInstanceOf[js.Any], debit = debit.asInstanceOf[js.Any], durbinRegulated = durbinRegulated.asInstanceOf[js.Any], expirationMonth = expirationMonth.asInstanceOf[js.Any], expirationYear = expirationYear.asInstanceOf[js.Any], googleTransactionId = googleTransactionId.asInstanceOf[js.Any], healthcare = healthcare.asInstanceOf[js.Any], imageUrl = imageUrl.asInstanceOf[js.Any], payroll = payroll.asInstanceOf[js.Any], prepaid = prepaid.asInstanceOf[js.Any], productId = productId.asInstanceOf[js.Any], sourceCardLast4 = sourceCardLast4.asInstanceOf[js.Any], sourceCardType = sourceCardType.asInstanceOf[js.Any], sourceDescription = sourceDescription.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], virtualCardLast4 = virtualCardLast4.asInstanceOf[js.Any], virtualCardType = virtualCardType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Commercial]
  }
  @scala.inline
  implicit class CommercialOps[Self <: Commercial] (val x: Self) extends AnyVal {
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
    def withGoogleTransactionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googleTransactionId")(value.asInstanceOf[js.Any])
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
    def withSourceCardType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceCardType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVirtualCardLast4(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualCardLast4")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVirtualCardType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualCardType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

