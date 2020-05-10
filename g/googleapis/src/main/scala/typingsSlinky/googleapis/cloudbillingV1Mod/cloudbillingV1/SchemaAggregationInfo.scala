package typingsSlinky.googleapis.cloudbillingV1Mod.cloudbillingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the aggregation level and interval for pricing of a single SKU.
  */
@js.native
trait SchemaAggregationInfo extends js.Object {
  /**
    * The number of intervals to aggregate over. Example: If aggregation_level
    * is &quot;DAILY&quot; and aggregation_count is 14, aggregation will be
    * over 14 days.
    */
  var aggregationCount: js.UndefOr[Double] = js.native
  var aggregationInterval: js.UndefOr[String] = js.native
  var aggregationLevel: js.UndefOr[String] = js.native
}

object SchemaAggregationInfo {
  @scala.inline
  def apply(): SchemaAggregationInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAggregationInfo]
  }
  @scala.inline
  implicit class SchemaAggregationInfoOps[Self <: SchemaAggregationInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAggregationCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregationCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAggregationCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregationCount")(js.undefined)
        ret
    }
    @scala.inline
    def withAggregationInterval(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregationInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAggregationInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregationInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withAggregationLevel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregationLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAggregationLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregationLevel")(js.undefined)
        ret
    }
  }
  
}

