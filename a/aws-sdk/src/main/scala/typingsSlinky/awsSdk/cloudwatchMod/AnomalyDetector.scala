package typingsSlinky.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnomalyDetector extends js.Object {
  /**
    * The configuration specifies details about how the anomaly detection model is to be trained, including time ranges to exclude from use for training the model, and the time zone to use for the metric.
    */
  var Configuration: js.UndefOr[AnomalyDetectorConfiguration] = js.native
  /**
    * The metric dimensions associated with the anomaly detection model.
    */
  var Dimensions: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.Dimensions] = js.native
  /**
    * The name of the metric associated with the anomaly detection model.
    */
  var MetricName: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.MetricName] = js.native
  /**
    * The namespace of the metric associated with the anomaly detection model.
    */
  var Namespace: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.Namespace] = js.native
  /**
    * The statistic associated with the anomaly detection model.
    */
  var Stat: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.Stat] = js.native
  /**
    * The current status of the anomaly detector's training. The possible values are TRAINED | PENDING_TRAINING | TRAINED_INSUFFICIENT_DATA 
    */
  var StateValue: js.UndefOr[AnomalyDetectorStateValue] = js.native
}

object AnomalyDetector {
  @scala.inline
  def apply(): AnomalyDetector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnomalyDetector]
  }
  @scala.inline
  implicit class AnomalyDetectorOps[Self <: AnomalyDetector] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfiguration(value: AnomalyDetectorConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Configuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Configuration")(js.undefined)
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
    def withStat(value: Stat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Stat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Stat")(js.undefined)
        ret
    }
    @scala.inline
    def withStateValue(value: AnomalyDetectorStateValue): Self = {
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
  }
  
}

