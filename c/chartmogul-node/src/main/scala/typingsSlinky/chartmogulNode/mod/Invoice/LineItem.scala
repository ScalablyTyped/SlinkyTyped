package typingsSlinky.chartmogulNode.mod.Invoice

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineItem extends js.Object {
  var account_code: js.UndefOr[String] = js.native
  var amount_in_cents: js.UndefOr[Double] = js.native
  var cancelled_at: js.UndefOr[String] = js.native
  var description: js.UndefOr[String] = js.native
  var discount_amount_in_cents: js.UndefOr[Double] = js.native
  var discount_code: js.UndefOr[String] = js.native
  var external_id: js.UndefOr[String] = js.native
  var plan_uuid: js.UndefOr[String] = js.native
  var prorated: js.UndefOr[Boolean] = js.native
  var quantity: js.UndefOr[Double] = js.native
  var service_period_end: js.UndefOr[String] = js.native
  var service_period_start: js.UndefOr[String] = js.native
  var subscription_external_id: js.UndefOr[String] = js.native
  var subscription_uuid: js.UndefOr[String] = js.native
  var tax_amount_in_cents: js.UndefOr[Double] = js.native
  var transaction_fees_in_cents: js.UndefOr[Double] = js.native
  var `type`: js.UndefOr[String] = js.native
  var uuid: js.UndefOr[String] = js.native
}

object LineItem {
  @scala.inline
  def apply(): LineItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineItem]
  }
  @scala.inline
  implicit class LineItemOps[Self <: LineItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccount_code(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("account_code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccount_code: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("account_code")(js.undefined)
        ret
    }
    @scala.inline
    def withAmount_in_cents(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amount_in_cents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAmount_in_cents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amount_in_cents")(js.undefined)
        ret
    }
    @scala.inline
    def withCancelled_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelled_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancelled_at: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelled_at")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withDiscount_amount_in_cents(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discount_amount_in_cents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiscount_amount_in_cents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discount_amount_in_cents")(js.undefined)
        ret
    }
    @scala.inline
    def withDiscount_code(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discount_code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiscount_code: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discount_code")(js.undefined)
        ret
    }
    @scala.inline
    def withExternal_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("external_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExternal_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("external_id")(js.undefined)
        ret
    }
    @scala.inline
    def withPlan_uuid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plan_uuid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlan_uuid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plan_uuid")(js.undefined)
        ret
    }
    @scala.inline
    def withProrated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prorated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProrated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prorated")(js.undefined)
        ret
    }
    @scala.inline
    def withQuantity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quantity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuantity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quantity")(js.undefined)
        ret
    }
    @scala.inline
    def withService_period_end(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("service_period_end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutService_period_end: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("service_period_end")(js.undefined)
        ret
    }
    @scala.inline
    def withService_period_start(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("service_period_start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutService_period_start: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("service_period_start")(js.undefined)
        ret
    }
    @scala.inline
    def withSubscription_external_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscription_external_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubscription_external_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscription_external_id")(js.undefined)
        ret
    }
    @scala.inline
    def withSubscription_uuid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscription_uuid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubscription_uuid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscription_uuid")(js.undefined)
        ret
    }
    @scala.inline
    def withTax_amount_in_cents(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tax_amount_in_cents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTax_amount_in_cents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tax_amount_in_cents")(js.undefined)
        ret
    }
    @scala.inline
    def withTransaction_fees_in_cents(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transaction_fees_in_cents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransaction_fees_in_cents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transaction_fees_in_cents")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withUuid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uuid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUuid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uuid")(js.undefined)
        ret
    }
  }
  
}

