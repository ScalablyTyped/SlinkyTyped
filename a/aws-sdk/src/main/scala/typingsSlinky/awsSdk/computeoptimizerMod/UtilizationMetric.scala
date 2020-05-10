package typingsSlinky.awsSdk.computeoptimizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UtilizationMetric extends js.Object {
  /**
    * The name of the utilization metric.  Memory metrics are only returned for resources that have the unified CloudWatch agent installed on them. For more information, see Enabling Memory Utilization with the CloudWatch Agent. 
    */
  var name: js.UndefOr[MetricName] = js.native
  /**
    * The statistic of the utilization metric.
    */
  var statistic: js.UndefOr[MetricStatistic] = js.native
  /**
    * The value of the utilization metric.
    */
  var value: js.UndefOr[MetricValue] = js.native
}

object UtilizationMetric {
  @scala.inline
  def apply(): UtilizationMetric = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UtilizationMetric]
  }
  @scala.inline
  implicit class UtilizationMetricOps[Self <: UtilizationMetric] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: MetricName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withStatistic(value: MetricStatistic): Self = {
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
    @scala.inline
    def withValue(value: MetricValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

