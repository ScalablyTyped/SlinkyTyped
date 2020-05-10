package typingsSlinky.chartmogulNode.mod.Metrics.Customer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetricsSubscription extends js.Object {
  var arr: Double = js.native
  var `billing-cycle`: String = js.native
  var `billing-cycle-count`: Double = js.native
  var currency: String = js.native
  var `currency-sign`: String = js.native
  var `end-date`: String = js.native
  var external_id: String = js.native
  var id: Double = js.native
  var mrr: Double = js.native
  var plan: String = js.native
  var quantity: Double = js.native
  var `start-date`: String = js.native
  var status: String = js.native
}

object MetricsSubscription {
  @scala.inline
  def apply(
    arr: Double,
    `billing-cycle`: String,
    `billing-cycle-count`: Double,
    currency: String,
    `currency-sign`: String,
    `end-date`: String,
    external_id: String,
    id: Double,
    mrr: Double,
    plan: String,
    quantity: Double,
    `start-date`: String,
    status: String
  ): MetricsSubscription = {
    val __obj = js.Dynamic.literal(arr = arr.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], external_id = external_id.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], mrr = mrr.asInstanceOf[js.Any], plan = plan.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("billing-cycle")(`billing-cycle`.asInstanceOf[js.Any])
    __obj.updateDynamic("billing-cycle-count")(`billing-cycle-count`.asInstanceOf[js.Any])
    __obj.updateDynamic("currency-sign")(`currency-sign`.asInstanceOf[js.Any])
    __obj.updateDynamic("end-date")(`end-date`.asInstanceOf[js.Any])
    __obj.updateDynamic("start-date")(`start-date`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricsSubscription]
  }
  @scala.inline
  implicit class MetricsSubscriptionOps[Self <: MetricsSubscription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArr(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withBilling-cycle`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billing-cycle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withBilling-cycle-count`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billing-cycle-count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrency(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withCurrency-sign`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currency-sign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withEnd-date`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end-date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExternal_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("external_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMrr(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mrr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlan(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuantity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quantity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withStart-date`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start-date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

