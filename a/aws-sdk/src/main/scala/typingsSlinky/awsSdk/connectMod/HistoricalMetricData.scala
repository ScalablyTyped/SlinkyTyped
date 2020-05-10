package typingsSlinky.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HistoricalMetricData extends js.Object {
  /**
    * Information about the metric.
    */
  var Metric: js.UndefOr[HistoricalMetric] = js.native
  /**
    * The value of the metric.
    */
  var Value: js.UndefOr[typingsSlinky.awsSdk.connectMod.Value] = js.native
}

object HistoricalMetricData {
  @scala.inline
  def apply(): HistoricalMetricData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HistoricalMetricData]
  }
  @scala.inline
  implicit class HistoricalMetricDataOps[Self <: HistoricalMetricData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMetric(value: HistoricalMetric): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Metric")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetric: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Metric")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: Value): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(js.undefined)
        ret
    }
  }
  
}

