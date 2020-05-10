package typingsSlinky.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Alarm extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the alarm.
    */
  var arn: js.UndefOr[NonEmptyString] = js.native
  /**
    * The arithmetic operation used when comparing the specified statistic and threshold.
    */
  var comparisonOperator: js.UndefOr[ComparisonOperator] = js.native
  /**
    * The contact protocols for the alarm, such as Email, SMS (text messaging), or both.
    */
  var contactProtocols: js.UndefOr[ContactProtocolsList] = js.native
  /**
    * The timestamp when the alarm was created.
    */
  var createdAt: js.UndefOr[js.Date] = js.native
  /**
    * The number of data points that must not within the specified threshold to trigger the alarm.
    */
  var datapointsToAlarm: js.UndefOr[integer] = js.native
  /**
    * The number of periods over which data is compared to the specified threshold.
    */
  var evaluationPeriods: js.UndefOr[integer] = js.native
  /**
    * An object that lists information about the location of the alarm.
    */
  var location: js.UndefOr[ResourceLocation] = js.native
  /**
    * The name of the metric associated with the alarm.
    */
  var metricName: js.UndefOr[MetricName] = js.native
  /**
    * An object that lists information about the resource monitored by the alarm.
    */
  var monitoredResourceInfo: js.UndefOr[MonitoredResourceInfo] = js.native
  /**
    * The name of the alarm.
    */
  var name: js.UndefOr[ResourceName] = js.native
  /**
    * Indicates whether the alarm is enabled.
    */
  var notificationEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The alarm states that trigger a notification.
    */
  var notificationTriggers: js.UndefOr[NotificationTriggerList] = js.native
  /**
    * The period, in seconds, over which the statistic is applied.
    */
  var period: js.UndefOr[MetricPeriod] = js.native
  /**
    * The Lightsail resource type (e.g., Alarm).
    */
  var resourceType: js.UndefOr[ResourceType] = js.native
  /**
    * The current state of the alarm. An alarm has the following possible states:    ALARM — The metric is outside of the defined threshold.    INSUFFICIENT_DATA — The alarm has just started, the metric is not available, or not enough data is available for the metric to determine the alarm state.    OK — The metric is within the defined threshold.  
    */
  var state: js.UndefOr[AlarmState] = js.native
  /**
    * The statistic for the metric associated with the alarm. The following statistics are available:    Minimum — The lowest value observed during the specified period. Use this value to determine low volumes of activity for your application.    Maximum — The highest value observed during the specified period. Use this value to determine high volumes of activity for your application.    Sum — All values submitted for the matching metric added together. You can use this statistic to determine the total volume of a metric.    Average — The value of Sum / SampleCount during the specified period. By comparing this statistic with the Minimum and Maximum values, you can determine the full scope of a metric and how close the average use is to the Minimum and Maximum values. This comparison helps you to know when to increase or decrease your resources.    SampleCount — The count, or number, of data points used for the statistical calculation.  
    */
  var statistic: js.UndefOr[MetricStatistic] = js.native
  /**
    * The support code. Include this code in your email to support when you have questions about your Lightsail alarm. This code enables our support team to look up your Lightsail information more easily.
    */
  var supportCode: js.UndefOr[String] = js.native
  /**
    * The value against which the specified statistic is compared.
    */
  var threshold: js.UndefOr[double] = js.native
  /**
    * Specifies how the alarm handles missing data points. An alarm can treat missing data in the following ways:    breaching — Assume the missing data is not within the threshold. Missing data counts towards the number of times the metric is not within the threshold.    notBreaching — Assume the missing data is within the threshold. Missing data does not count towards the number of times the metric is not within the threshold.    ignore — Ignore the missing data. Maintains the current alarm state.    missing — Missing data is treated as missing.  
    */
  var treatMissingData: js.UndefOr[TreatMissingData] = js.native
  /**
    * The unit of the metric associated with the alarm.
    */
  var unit: js.UndefOr[MetricUnit] = js.native
}

object Alarm {
  @scala.inline
  def apply(): Alarm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Alarm]
  }
  @scala.inline
  implicit class AlarmOps[Self <: Alarm] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(js.undefined)
        ret
    }
    @scala.inline
    def withComparisonOperator(value: ComparisonOperator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comparisonOperator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComparisonOperator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comparisonOperator")(js.undefined)
        ret
    }
    @scala.inline
    def withContactProtocols(value: ContactProtocolsList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contactProtocols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContactProtocols: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contactProtocols")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdAt")(js.undefined)
        ret
    }
    @scala.inline
    def withDatapointsToAlarm(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datapointsToAlarm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatapointsToAlarm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datapointsToAlarm")(js.undefined)
        ret
    }
    @scala.inline
    def withEvaluationPeriods(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("evaluationPeriods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvaluationPeriods: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("evaluationPeriods")(js.undefined)
        ret
    }
    @scala.inline
    def withLocation(value: ResourceLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
    @scala.inline
    def withMetricName(value: MetricName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetricName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricName")(js.undefined)
        ret
    }
    @scala.inline
    def withMonitoredResourceInfo(value: MonitoredResourceInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monitoredResourceInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonitoredResourceInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monitoredResourceInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: ResourceName): Self = {
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
    def withNotificationEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotificationEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withNotificationTriggers(value: NotificationTriggerList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationTriggers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotificationTriggers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationTriggers")(js.undefined)
        ret
    }
    @scala.inline
    def withPeriod(value: MetricPeriod): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("period")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("period")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceType(value: ResourceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceType")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: AlarmState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
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
    def withSupportCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportCode")(js.undefined)
        ret
    }
    @scala.inline
    def withThreshold(value: double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threshold")(js.undefined)
        ret
    }
    @scala.inline
    def withTreatMissingData(value: TreatMissingData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treatMissingData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTreatMissingData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treatMissingData")(js.undefined)
        ret
    }
    @scala.inline
    def withUnit(value: MetricUnit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unit")(js.undefined)
        ret
    }
  }
  
}

