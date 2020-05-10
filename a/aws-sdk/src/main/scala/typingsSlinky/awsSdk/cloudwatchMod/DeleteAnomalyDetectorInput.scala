package typingsSlinky.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteAnomalyDetectorInput extends js.Object {
  /**
    * The metric dimensions associated with the anomaly detection model to delete.
    */
  var Dimensions: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.Dimensions] = js.native
  /**
    * The metric name associated with the anomaly detection model to delete.
    */
  var MetricName: typingsSlinky.awsSdk.cloudwatchMod.MetricName = js.native
  /**
    * The namespace associated with the anomaly detection model to delete.
    */
  var Namespace: typingsSlinky.awsSdk.cloudwatchMod.Namespace = js.native
  /**
    * The statistic associated with the anomaly detection model to delete.
    */
  var Stat: typingsSlinky.awsSdk.cloudwatchMod.Stat = js.native
}

object DeleteAnomalyDetectorInput {
  @scala.inline
  def apply(MetricName: MetricName, Namespace: Namespace, Stat: Stat): DeleteAnomalyDetectorInput = {
    val __obj = js.Dynamic.literal(MetricName = MetricName.asInstanceOf[js.Any], Namespace = Namespace.asInstanceOf[js.Any], Stat = Stat.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAnomalyDetectorInput]
  }
  @scala.inline
  implicit class DeleteAnomalyDetectorInputOps[Self <: DeleteAnomalyDetectorInput] (val x: Self) extends AnyVal {
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

