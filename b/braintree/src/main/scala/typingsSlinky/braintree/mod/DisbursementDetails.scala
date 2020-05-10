package typingsSlinky.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisbursementDetails extends js.Object {
  var disbursementDate: js.Date = js.native
  var fundsHeld: Boolean = js.native
  var settlementAmount: String = js.native
  var settlementCurrencyExchangeRate: String = js.native
  var settlementCurrencyIsoCode: String = js.native
  var success: Boolean = js.native
}

object DisbursementDetails {
  @scala.inline
  def apply(
    disbursementDate: js.Date,
    fundsHeld: Boolean,
    settlementAmount: String,
    settlementCurrencyExchangeRate: String,
    settlementCurrencyIsoCode: String,
    success: Boolean
  ): DisbursementDetails = {
    val __obj = js.Dynamic.literal(disbursementDate = disbursementDate.asInstanceOf[js.Any], fundsHeld = fundsHeld.asInstanceOf[js.Any], settlementAmount = settlementAmount.asInstanceOf[js.Any], settlementCurrencyExchangeRate = settlementCurrencyExchangeRate.asInstanceOf[js.Any], settlementCurrencyIsoCode = settlementCurrencyIsoCode.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisbursementDetails]
  }
  @scala.inline
  implicit class DisbursementDetailsOps[Self <: DisbursementDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisbursementDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disbursementDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFundsHeld(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fundsHeld")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSettlementAmount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settlementAmount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSettlementCurrencyExchangeRate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settlementCurrencyExchangeRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSettlementCurrencyIsoCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settlementCurrencyIsoCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuccess(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

