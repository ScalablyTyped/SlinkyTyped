package typingsSlinky.paypalRestSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SaleResource extends Resource {
  val billing_agreement_id: js.UndefOr[String] = js.native
  val clearing_time: js.UndefOr[String] = js.native
  val exchange_rate: js.UndefOr[String] = js.native
  val payment_hold_reasons: js.UndefOr[js.Array[String]] = js.native
  val payment_hold_status: js.UndefOr[String] = js.native
  val purchase_unit_reference_id: js.UndefOr[String] = js.native
  val transaction_fee: js.UndefOr[Currency] = js.native
}

object SaleResource {
  @scala.inline
  def apply(amount: Amount, id: String): SaleResource = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaleResource]
  }
  @scala.inline
  implicit class SaleResourceOps[Self <: SaleResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBilling_agreement_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billing_agreement_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBilling_agreement_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billing_agreement_id")(js.undefined)
        ret
    }
    @scala.inline
    def withClearing_time(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearing_time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearing_time: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearing_time")(js.undefined)
        ret
    }
    @scala.inline
    def withExchange_rate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exchange_rate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExchange_rate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exchange_rate")(js.undefined)
        ret
    }
    @scala.inline
    def withPayment_hold_reasons(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payment_hold_reasons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPayment_hold_reasons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payment_hold_reasons")(js.undefined)
        ret
    }
    @scala.inline
    def withPayment_hold_status(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payment_hold_status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPayment_hold_status: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payment_hold_status")(js.undefined)
        ret
    }
    @scala.inline
    def withPurchase_unit_reference_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("purchase_unit_reference_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPurchase_unit_reference_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("purchase_unit_reference_id")(js.undefined)
        ret
    }
    @scala.inline
    def withTransaction_fee(value: Currency): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transaction_fee")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransaction_fee: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transaction_fee")(js.undefined)
        ret
    }
  }
  
}

