package typingsSlinky.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BinData extends js.Object {
  var commercial: js.UndefOr[Commercial] = js.native
  var countryOfIssuance: js.UndefOr[String] = js.native
  var debit: js.UndefOr[Debit] = js.native
  var durbinRegulated: js.UndefOr[DurbinRegulated] = js.native
  var healthcare: js.UndefOr[HealthCare] = js.native
  var issuingBank: js.UndefOr[String] = js.native
  var payroll: js.UndefOr[Payroll] = js.native
  var prepaid: js.UndefOr[Prepaid] = js.native
  var productId: js.UndefOr[String] = js.native
}

object BinData {
  @scala.inline
  def apply(): BinData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BinData]
  }
  @scala.inline
  implicit class BinDataOps[Self <: BinData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommercial(value: Commercial): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commercial")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommercial: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commercial")(js.undefined)
        ret
    }
    @scala.inline
    def withCountryOfIssuance(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countryOfIssuance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountryOfIssuance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countryOfIssuance")(js.undefined)
        ret
    }
    @scala.inline
    def withDebit(value: Debit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debit")(js.undefined)
        ret
    }
    @scala.inline
    def withDurbinRegulated(value: DurbinRegulated): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durbinRegulated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDurbinRegulated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durbinRegulated")(js.undefined)
        ret
    }
    @scala.inline
    def withHealthcare(value: HealthCare): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("healthcare")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHealthcare: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("healthcare")(js.undefined)
        ret
    }
    @scala.inline
    def withIssuingBank(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issuingBank")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIssuingBank: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issuingBank")(js.undefined)
        ret
    }
    @scala.inline
    def withPayroll(value: Payroll): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPayroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payroll")(js.undefined)
        ret
    }
    @scala.inline
    def withPrepaid(value: Prepaid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prepaid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrepaid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prepaid")(js.undefined)
        ret
    }
    @scala.inline
    def withProductId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productId")(js.undefined)
        ret
    }
  }
  
}

