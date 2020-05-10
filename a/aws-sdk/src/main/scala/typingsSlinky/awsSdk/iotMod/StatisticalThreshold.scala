package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatisticalThreshold extends js.Object {
  /**
    * The percentile which resolves to a threshold value by which compliance with a behavior is determined. Metrics are collected over the specified period (durationSeconds) from all reporting devices in your account and statistical ranks are calculated. Then, the measurements from a device are collected over the same period. If the accumulated measurements from the device fall above or below (comparisonOperator) the value associated with the percentile specified, then the device is considered to be in compliance with the behavior, otherwise a violation occurs.
    */
  var statistic: js.UndefOr[EvaluationStatistic] = js.native
}

object StatisticalThreshold {
  @scala.inline
  def apply(): StatisticalThreshold = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatisticalThreshold]
  }
  @scala.inline
  implicit class StatisticalThresholdOps[Self <: StatisticalThreshold] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStatistic(value: EvaluationStatistic): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statistic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatistic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statistic")(js.undefined)
        ret
    }
  }
  
}

