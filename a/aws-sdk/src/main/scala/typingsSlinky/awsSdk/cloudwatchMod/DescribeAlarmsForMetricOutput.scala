package typingsSlinky.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAlarmsForMetricOutput extends js.Object {
  /**
    * The information for each alarm with the specified metric.
    */
  var MetricAlarms: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.MetricAlarms] = js.native
}

object DescribeAlarmsForMetricOutput {
  @scala.inline
  def apply(): DescribeAlarmsForMetricOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAlarmsForMetricOutput]
  }
  @scala.inline
  implicit class DescribeAlarmsForMetricOutputOps[Self <: DescribeAlarmsForMetricOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMetricAlarms(value: MetricAlarms): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MetricAlarms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetricAlarms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MetricAlarms")(js.undefined)
        ret
    }
  }
  
}

