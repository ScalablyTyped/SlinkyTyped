package typingsSlinky.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutAnomalyDetectorInput extends js.Object {
  /**
    * The configuration specifies details about how the anomaly detection model is to be trained, including time ranges to exclude when training and updating the model. You can specify as many as 10 time ranges. The configuration can also include the time zone to use for the metric. You can in
    */
  var Configuration: js.UndefOr[AnomalyDetectorConfiguration] = js.native
  /**
    * The metric dimensions to create the anomaly detection model for.
    */
  var Dimensions: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.Dimensions] = js.native
  /**
    * The name of the metric to create the anomaly detection model for.
    */
  var MetricName: typingsSlinky.awsSdk.cloudwatchMod.MetricName = js.native
  /**
    * The namespace of the metric to create the anomaly detection model for.
    */
  var Namespace: typingsSlinky.awsSdk.cloudwatchMod.Namespace = js.native
  /**
    * The statistic to use for the metric and the anomaly detection model.
    */
  var Stat: typingsSlinky.awsSdk.cloudwatchMod.Stat = js.native
}

object PutAnomalyDetectorInput {
  @scala.inline
  def apply(MetricName: MetricName, Namespace: Namespace, Stat: Stat): PutAnomalyDetectorInput = {
    val __obj = js.Dynamic.literal(MetricName = MetricName.asInstanceOf[js.Any], Namespace = Namespace.asInstanceOf[js.Any], Stat = Stat.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutAnomalyDetectorInput]
  }
  @scala.inline
  implicit class PutAnomalyDetectorInputOps[Self <: PutAnomalyDetectorInput] (val x: Self) extends AnyVal {
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
    def withStat(value: Stat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Stat")(value.asInstanceOf[js.Any])
        ret
    }
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
  }
  
}

