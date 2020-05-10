package typingsSlinky.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetricAlarm extends js.Object {
  /**
    * Indicates whether actions should be executed during any changes to the alarm state.
    */
  var ActionsEnabled: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.ActionsEnabled] = js.native
  /**
    * The actions to execute when this alarm transitions to the ALARM state from any other state. Each action is specified as an Amazon Resource Name (ARN).
    */
  var AlarmActions: js.UndefOr[ResourceList] = js.native
  /**
    * The Amazon Resource Name (ARN) of the alarm.
    */
  var AlarmArn: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.AlarmArn] = js.native
  /**
    * The time stamp of the last update to the alarm configuration.
    */
  var AlarmConfigurationUpdatedTimestamp: js.UndefOr[js.Date] = js.native
  /**
    * The description of the alarm.
    */
  var AlarmDescription: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.AlarmDescription] = js.native
  /**
    * The name of the alarm.
    */
  var AlarmName: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.AlarmName] = js.native
  /**
    * The arithmetic operation to use when comparing the specified statistic and threshold. The specified statistic value is used as the first operand.
    */
  var ComparisonOperator: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.ComparisonOperator] = js.native
  /**
    * The number of data points that must be breaching to trigger the alarm.
    */
  var DatapointsToAlarm: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.DatapointsToAlarm] = js.native
  /**
    * The dimensions for the metric associated with the alarm.
    */
  var Dimensions: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.Dimensions] = js.native
  /**
    * Used only for alarms based on percentiles. If ignore, the alarm state does not change during periods with too few data points to be statistically significant. If evaluate or this parameter is not used, the alarm is always evaluated and possibly changes state no matter how many data points are available.
    */
  var EvaluateLowSampleCountPercentile: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.EvaluateLowSampleCountPercentile] = js.native
  /**
    * The number of periods over which data is compared to the specified threshold.
    */
  var EvaluationPeriods: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.EvaluationPeriods] = js.native
  /**
    * The percentile statistic for the metric associated with the alarm. Specify a value between p0.0 and p100.
    */
  var ExtendedStatistic: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.ExtendedStatistic] = js.native
  /**
    * The actions to execute when this alarm transitions to the INSUFFICIENT_DATA state from any other state. Each action is specified as an Amazon Resource Name (ARN).
    */
  var InsufficientDataActions: js.UndefOr[ResourceList] = js.native
  /**
    * The name of the metric associated with the alarm, if this is an alarm based on a single metric.
    */
  var MetricName: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.MetricName] = js.native
  /**
    * An array of MetricDataQuery structures, used in an alarm based on a metric math expression. Each structure either retrieves a metric or performs a math expression. One item in the Metrics array is the math expression that the alarm watches. This expression by designated by having ReturnValue set to true.
    */
  var Metrics: js.UndefOr[MetricDataQueries] = js.native
  /**
    * The namespace of the metric associated with the alarm.
    */
  var Namespace: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.Namespace] = js.native
  /**
    * The actions to execute when this alarm transitions to the OK state from any other state. Each action is specified as an Amazon Resource Name (ARN).
    */
  var OKActions: js.UndefOr[ResourceList] = js.native
  /**
    * The period, in seconds, over which the statistic is applied.
    */
  var Period: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.Period] = js.native
  /**
    * An explanation for the alarm state, in text format.
    */
  var StateReason: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.StateReason] = js.native
  /**
    * An explanation for the alarm state, in JSON format.
    */
  var StateReasonData: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.StateReasonData] = js.native
  /**
    * The time stamp of the last update to the alarm state.
    */
  var StateUpdatedTimestamp: js.UndefOr[js.Date] = js.native
  /**
    * The state value for the alarm.
    */
  var StateValue: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.StateValue] = js.native
  /**
    * The statistic for the metric associated with the alarm, other than percentile. For percentile statistics, use ExtendedStatistic.
    */
  var Statistic: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.Statistic] = js.native
  /**
    * The value to compare with the specified statistic.
    */
  var Threshold: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.Threshold] = js.native
  /**
    * In an alarm based on an anomaly detection model, this is the ID of the ANOMALY_DETECTION_BAND function used as the threshold for the alarm.
    */
  var ThresholdMetricId: js.UndefOr[MetricId] = js.native
  /**
    * Sets how this alarm is to handle missing data points. If this parameter is omitted, the default behavior of missing is used.
    */
  var TreatMissingData: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.TreatMissingData] = js.native
  /**
    * The unit of the metric associated with the alarm.
    */
  var Unit: js.UndefOr[StandardUnit] = js.native
}

object MetricAlarm {
  @scala.inline
  def apply(): MetricAlarm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricAlarm]
  }
  @scala.inline
  implicit class MetricAlarmOps[Self <: MetricAlarm] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionsEnabled(value: ActionsEnabled): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActionsEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActionsEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActionsEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withAlarmActions(value: ResourceList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AlarmActions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlarmActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AlarmActions")(js.undefined)
        ret
    }
    @scala.inline
    def withAlarmArn(value: AlarmArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AlarmArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlarmArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AlarmArn")(js.undefined)
        ret
    }
    @scala.inline
    def withAlarmConfigurationUpdatedTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AlarmConfigurationUpdatedTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlarmConfigurationUpdatedTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AlarmConfigurationUpdatedTimestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withAlarmDescription(value: AlarmDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AlarmDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlarmDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AlarmDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withAlarmName(value: AlarmName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AlarmName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlarmName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AlarmName")(js.undefined)
        ret
    }
    @scala.inline
    def withComparisonOperator(value: ComparisonOperator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComparisonOperator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComparisonOperator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComparisonOperator")(js.undefined)
        ret
    }
    @scala.inline
    def withDatapointsToAlarm(value: DatapointsToAlarm): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DatapointsToAlarm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatapointsToAlarm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DatapointsToAlarm")(js.undefined)
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
    def withEvaluateLowSampleCountPercentile(value: EvaluateLowSampleCountPercentile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EvaluateLowSampleCountPercentile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvaluateLowSampleCountPercentile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EvaluateLowSampleCountPercentile")(js.undefined)
        ret
    }
    @scala.inline
    def withEvaluationPeriods(value: EvaluationPeriods): Self = {
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
    def withInsufficientDataActions(value: ResourceList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InsufficientDataActions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsufficientDataActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InsufficientDataActions")(js.undefined)
        ret
    }
    @scala.inline
    def withMetricName(value: MetricName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MetricName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetricName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MetricName")(js.undefined)
        ret
    }
    @scala.inline
    def withMetrics(value: MetricDataQueries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Metrics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetrics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Metrics")(js.undefined)
        ret
    }
    @scala.inline
    def withNamespace(value: Namespace): Self = {
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
    def withOKActions(value: ResourceList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OKActions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOKActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OKActions")(js.undefined)
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
    def withStateReason(value: StateReason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StateReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStateReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StateReason")(js.undefined)
        ret
    }
    @scala.inline
    def withStateReasonData(value: StateReasonData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StateReasonData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStateReasonData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StateReasonData")(js.undefined)
        ret
    }
    @scala.inline
    def withStateUpdatedTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StateUpdatedTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStateUpdatedTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StateUpdatedTimestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withStateValue(value: StateValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StateValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStateValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StateValue")(js.undefined)
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
    def withThresholdMetricId(value: MetricId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ThresholdMetricId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThresholdMetricId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ThresholdMetricId")(js.undefined)
        ret
    }
    @scala.inline
    def withTreatMissingData(value: TreatMissingData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TreatMissingData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTreatMissingData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TreatMissingData")(js.undefined)
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

