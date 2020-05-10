package typingsSlinky.chartmogulNode.mod.Metrics.Customer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetricsActivity extends js.Object {
  var `activity-arr`: Double = js.native
  var `activity-mrr`: Double = js.native
  var `activity-mrr-movement`: Double = js.native
  var currency: String = js.native
  var `currency-sign`: String = js.native
  var date: String = js.native
  var description: String = js.native
  var id: Double = js.native
  var `type`: String = js.native
}

object MetricsActivity {
  @scala.inline
  def apply(
    `activity-arr`: Double,
    `activity-mrr`: Double,
    `activity-mrr-movement`: Double,
    currency: String,
    `currency-sign`: String,
    date: String,
    description: String,
    id: Double,
    `type`: String
  ): MetricsActivity = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("activity-arr")(`activity-arr`.asInstanceOf[js.Any])
    __obj.updateDynamic("activity-mrr")(`activity-mrr`.asInstanceOf[js.Any])
    __obj.updateDynamic("activity-mrr-movement")(`activity-mrr-movement`.asInstanceOf[js.Any])
    __obj.updateDynamic("currency-sign")(`currency-sign`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricsActivity]
  }
  @scala.inline
  implicit class MetricsActivityOps[Self <: MetricsActivity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withActivity-arr`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activity-arr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withActivity-mrr`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activity-mrr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withActivity-mrr-movement`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activity-mrr-movement")(value.asInstanceOf[js.Any])
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
    def withDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

