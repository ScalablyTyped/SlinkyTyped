package typingsSlinky.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudWatchAlarmDefinition extends js.Object {
  /**
    * Determines how the metric specified by MetricName is compared to the value specified by Threshold.
    */
  var ComparisonOperator: typingsSlinky.awsSdk.emrMod.ComparisonOperator = js.native
  /**
    * A CloudWatch metric dimension.
    */
  var Dimensions: js.UndefOr[MetricDimensionList] = js.native
  /**
    * The number of periods, in five-minute increments, during which the alarm condition must exist before the alarm triggers automatic scaling activity. The default value is 1.
    */
  var EvaluationPeriods: js.UndefOr[Integer] = js.native
  /**
    * The name of the CloudWatch metric that is watched to determine an alarm condition.
    */
  var MetricName: String = js.native
  /**
    * The namespace for the CloudWatch metric. The default is AWS/ElasticMapReduce.
    */
  var Namespace: js.UndefOr[String] = js.native
  /**
    * The period, in seconds, over which the statistic is applied. EMR CloudWatch metrics are emitted every five minutes (300 seconds), so if an EMR CloudWatch metric is specified, specify 300.
    */
  var Period: Integer = js.native
  /**
    * The statistic to apply to the metric associated with the alarm. The default is AVERAGE.
    */
  var Statistic: js.UndefOr[typingsSlinky.awsSdk.emrMod.Statistic] = js.native
  /**
    * The value against which the specified statistic is compared.
    */
  var Threshold: NonNegativeDouble = js.native
  /**
    * The unit of measure associated with the CloudWatch metric being watched. The value specified for Unit must correspond to the units specified in the CloudWatch metric.
    */
  var Unit: js.UndefOr[typingsSlinky.awsSdk.emrMod.Unit] = js.native
}

object CloudWatchAlarmDefinition {
  @scala.inline
  def apply(
    ComparisonOperator: ComparisonOperator,
    MetricName: String,
    Period: Integer,
    Threshold: NonNegativeDouble
  ): CloudWatchAlarmDefinition = {
    val __obj = js.Dynamic.literal(ComparisonOperator = ComparisonOperator.asInstanceOf[js.Any], MetricName = MetricName.asInstanceOf[js.Any], Period = Period.asInstanceOf[js.Any], Threshold = Threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudWatchAlarmDefinition]
  }
  @scala.inline
  implicit class CloudWatchAlarmDefinitionOps[Self <: CloudWatchAlarmDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComparisonOperator(value: ComparisonOperator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComparisonOperator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetricName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MetricName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPeriod(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Period")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThreshold(value: NonNegativeDouble): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Threshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDimensions(value: MetricDimensionList): Self = {
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
    def withEvaluationPeriods(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EvaluationPeriods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvaluationPeriods: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EvaluationPeriods")(js.undefined)
        ret
    }
    @scala.inline
    def withNamespace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Namespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Namespace")(js.undefined)
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

