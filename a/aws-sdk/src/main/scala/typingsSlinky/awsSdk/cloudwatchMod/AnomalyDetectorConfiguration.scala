package typingsSlinky.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnomalyDetectorConfiguration extends js.Object {
  /**
    * An array of time ranges to exclude from use when the anomaly detection model is trained. Use this to make sure that events that could cause unusual values for the metric, such as deployments, aren't used when CloudWatch creates the model.
    */
  var ExcludedTimeRanges: js.UndefOr[AnomalyDetectorExcludedTimeRanges] = js.native
  /**
    * The time zone to use for the metric. This is useful to enable the model to automatically account for daylight savings time changes if the metric is sensitive to such time changes. To specify a time zone, use the name of the time zone as specified in the standard tz database. For more information, see tz database.
    */
  var MetricTimezone: js.UndefOr[AnomalyDetectorMetricTimezone] = js.native
}

object AnomalyDetectorConfiguration {
  @scala.inline
  def apply(): AnomalyDetectorConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnomalyDetectorConfiguration]
  }
  @scala.inline
  implicit class AnomalyDetectorConfigurationOps[Self <: AnomalyDetectorConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExcludedTimeRanges(value: AnomalyDetectorExcludedTimeRanges): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExcludedTimeRanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludedTimeRanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExcludedTimeRanges")(js.undefined)
        ret
    }
    @scala.inline
    def withMetricTimezone(value: AnomalyDetectorMetricTimezone): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MetricTimezone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetricTimezone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MetricTimezone")(js.undefined)
        ret
    }
  }
  
}

