package typingsSlinky.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAlarmsForMetricInput extends js.Object {
  /**
    * The dimensions associated with the metric. If the metric has any associated dimensions, you must specify them in order for the call to succeed.
    */
  var Dimensions: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.Dimensions] = js.native
  /**
    * The percentile statistic for the metric. Specify a value between p0.0 and p100.
    */
  var ExtendedStatistic: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.ExtendedStatistic] = js.native
  /**
    * The name of the metric.
    */
  var MetricName: typingsSlinky.awsSdk.cloudwatchMod.MetricName = js.native
  /**
    * The namespace of the metric.
    */
  var Namespace: typingsSlinky.awsSdk.cloudwatchMod.Namespace = js.native
  /**
    * The period, in seconds, over which the statistic is applied.
    */
  var Period: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.Period] = js.native
  /**
    * The statistic for the metric, other than percentiles. For percentile statistics, use ExtendedStatistics.
    */
  var Statistic: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.Statistic] = js.native
  /**
    * The unit for the metric.
    */
  var Unit: js.UndefOr[StandardUnit] = js.native
}

object DescribeAlarmsForMetricInput {
  @scala.inline
  def apply(MetricName: MetricName, Namespace: Namespace): DescribeAlarmsForMetricInput = {
    val __obj = js.Dynamic.literal(MetricName = MetricName.asInstanceOf[js.Any], Namespace = Namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAlarmsForMetricInput]
  }
  @scala.inline
  implicit class DescribeAlarmsForMetricInputOps[Self <: DescribeAlarmsForMetricInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMetricName(value: MetricName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MetricName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNamespace(value: Namespace): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Namespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDimensions(value: Dimensions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Dimensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDimensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Dimensions")(js.undefined)
        ret
    }
    @scala.inline
    def withExtendedStatistic(value: ExtendedStatistic): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExtendedStatistic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtendedStatistic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExtendedStatistic")(js.undefined)
        ret
    }
    @scala.inline
    def withPeriod(value: Period): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Period")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Period")(js.undefined)
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
    def withUnit(value: StandardUnit): Self = {
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

