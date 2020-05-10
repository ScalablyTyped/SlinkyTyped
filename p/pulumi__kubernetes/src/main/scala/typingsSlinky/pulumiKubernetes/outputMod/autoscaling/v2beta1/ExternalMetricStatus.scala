package typingsSlinky.pulumiKubernetes.outputMod.autoscaling.v2beta1

import typingsSlinky.pulumiKubernetes.outputMod.meta.v1.LabelSelector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ExternalMetricStatus indicates the current value of a global metric not associated with any
  * Kubernetes object.
  */
@js.native
trait ExternalMetricStatus extends js.Object {
  /**
    * currentAverageValue is the current value of metric averaged over autoscaled pods.
    */
  val currentAverageValue: String = js.native
  /**
    * currentValue is the current value of the metric (as a quantity)
    */
  val currentValue: String = js.native
  /**
    * metricName is the name of a metric used for autoscaling in metric system.
    */
  val metricName: String = js.native
  /**
    * metricSelector is used to identify a specific time series within a given metric.
    */
  val metricSelector: LabelSelector = js.native
}

object ExternalMetricStatus {
  @scala.inline
  def apply(
    currentAverageValue: String,
    currentValue: String,
    metricName: String,
    metricSelector: LabelSelector
  ): ExternalMetricStatus = {
    val __obj = js.Dynamic.literal(currentAverageValue = currentAverageValue.asInstanceOf[js.Any], currentValue = currentValue.asInstanceOf[js.Any], metricName = metricName.asInstanceOf[js.Any], metricSelector = metricSelector.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExternalMetricStatus]
  }
  @scala.inline
  implicit class ExternalMetricStatusOps[Self <: ExternalMetricStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentAverageValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentAverageValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetricName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetricSelector(value: LabelSelector): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricSelector")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

