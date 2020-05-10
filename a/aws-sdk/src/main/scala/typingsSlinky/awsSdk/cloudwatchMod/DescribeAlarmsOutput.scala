package typingsSlinky.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAlarmsOutput extends js.Object {
  /**
    * The information about any composite alarms returned by the operation.
    */
  var CompositeAlarms: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.CompositeAlarms] = js.native
  /**
    * The information about any metric alarms returned by the operation.
    */
  var MetricAlarms: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.MetricAlarms] = js.native
  /**
    * The token that marks the start of the next batch of returned results.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.NextToken] = js.native
}

object DescribeAlarmsOutput {
  @scala.inline
  def apply(): DescribeAlarmsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAlarmsOutput]
  }
  @scala.inline
  implicit class DescribeAlarmsOutputOps[Self <: DescribeAlarmsOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompositeAlarms(value: CompositeAlarms): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CompositeAlarms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompositeAlarms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CompositeAlarms")(js.undefined)
        ret
    }
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
    @scala.inline
    def withNextToken(value: NextToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
  }
  
}

