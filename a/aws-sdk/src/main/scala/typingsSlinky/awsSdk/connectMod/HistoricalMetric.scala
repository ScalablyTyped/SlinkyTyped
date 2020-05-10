package typingsSlinky.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HistoricalMetric extends js.Object {
  /**
    * The name of the metric.
    */
  var Name: js.UndefOr[HistoricalMetricName] = js.native
  /**
    * The statistic for the metric.
    */
  var Statistic: js.UndefOr[typingsSlinky.awsSdk.connectMod.Statistic] = js.native
  /**
    * The threshold for the metric, used with service level metrics.
    */
  var Threshold: js.UndefOr[typingsSlinky.awsSdk.connectMod.Threshold] = js.native
  /**
    * The unit for the metric.
    */
  var Unit: js.UndefOr[typingsSlinky.awsSdk.connectMod.Unit] = js.native
}

object HistoricalMetric {
  @scala.inline
  def apply(): HistoricalMetric = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HistoricalMetric]
  }
  @scala.inline
  implicit class HistoricalMetricOps[Self <: HistoricalMetric] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: HistoricalMetricName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
    @scala.inline
    def withStatistic(value: Statistic): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Statistic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatistic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Statistic")(js.undefined)
        ret
    }
    @scala.inline
    def withThreshold(value: Threshold): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Threshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Threshold")(js.undefined)
        ret
    }
    @scala.inline
    def withUnit(value: Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Unit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Unit")(js.undefined)
        ret
    }
  }
  
}

