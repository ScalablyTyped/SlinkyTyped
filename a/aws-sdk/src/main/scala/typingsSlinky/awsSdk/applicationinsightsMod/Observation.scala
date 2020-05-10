package typingsSlinky.awsSdk.applicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Observation extends js.Object {
  /**
    * The time when the observation ended, in epoch seconds.
    */
  var EndTime: js.UndefOr[js.Date] = js.native
  /**
    * The ID of the observation type.
    */
  var Id: js.UndefOr[ObservationId] = js.native
  /**
    * The timestamp in the CloudWatch Logs that specifies when the matched line occurred.
    */
  var LineTime: js.UndefOr[js.Date] = js.native
  /**
    * The log filter of the observation.
    */
  var LogFilter: js.UndefOr[typingsSlinky.awsSdk.applicationinsightsMod.LogFilter] = js.native
  /**
    * The log group name.
    */
  var LogGroup: js.UndefOr[typingsSlinky.awsSdk.applicationinsightsMod.LogGroup] = js.native
  /**
    * The log text of the observation.
    */
  var LogText: js.UndefOr[typingsSlinky.awsSdk.applicationinsightsMod.LogText] = js.native
  /**
    * The name of the observation metric.
    */
  var MetricName: js.UndefOr[typingsSlinky.awsSdk.applicationinsightsMod.MetricName] = js.native
  /**
    * The namespace of the observation metric.
    */
  var MetricNamespace: js.UndefOr[typingsSlinky.awsSdk.applicationinsightsMod.MetricNamespace] = js.native
  /**
    * The source resource ARN of the observation.
    */
  var SourceARN: js.UndefOr[typingsSlinky.awsSdk.applicationinsightsMod.SourceARN] = js.native
  /**
    * The source type of the observation.
    */
  var SourceType: js.UndefOr[typingsSlinky.awsSdk.applicationinsightsMod.SourceType] = js.native
  /**
    * The time when the observation was first detected, in epoch seconds.
    */
  var StartTime: js.UndefOr[js.Date] = js.native
  /**
    * The unit of the source observation metric.
    */
  var Unit: js.UndefOr[typingsSlinky.awsSdk.applicationinsightsMod.Unit] = js.native
  /**
    * The value of the source observation metric.
    */
  var Value: js.UndefOr[typingsSlinky.awsSdk.applicationinsightsMod.Value] = js.native
}

object Observation {
  @scala.inline
  def apply(): Observation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Observation]
  }
  @scala.inline
  implicit class ObservationOps[Self <: Observation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndTime")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: ObservationId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(js.undefined)
        ret
    }
    @scala.inline
    def withLineTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LineTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LineTime")(js.undefined)
        ret
    }
    @scala.inline
    def withLogFilter(value: LogFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withLogGroup(value: LogGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withLogText(value: LogText): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogText")(js.undefined)
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
    def withMetricNamespace(value: MetricNamespace): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MetricNamespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetricNamespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MetricNamespace")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceARN(value: SourceARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceARN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceARN")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceType(value: SourceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceType")(js.undefined)
        ret
    }
    @scala.inline
    def withStartTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartTime")(js.undefined)
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

