package typingsSlinky.pulumiKubernetes.inputMod.autoscaling.v2beta1

import typingsSlinky.pulumiKubernetes.inputMod.meta.v1.LabelSelector
import typingsSlinky.pulumiPulumi.outputMod.Input
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
  var currentAverageValue: js.UndefOr[Input[String]] = js.native
  /**
    * currentValue is the current value of the metric (as a quantity)
    */
  var currentValue: Input[String] = js.native
  /**
    * metricName is the name of a metric used for autoscaling in metric system.
    */
  var metricName: Input[String] = js.native
  /**
    * metricSelector is used to identify a specific time series within a given metric.
    */
  var metricSelector: js.UndefOr[Input[LabelSelector]] = js.native
}

object ExternalMetricStatus {
  @scala.inline
  def apply(currentValue: Input[String], metricName: Input[String]): ExternalMetricStatus = {
    val __obj = js.Dynamic.literal(currentValue = currentValue.asInstanceOf[js.Any], metricName = metricName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExternalMetricStatus]
  }
  @scala.inline
  implicit class ExternalMetricStatusOps[Self <: ExternalMetricStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentValue(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetricName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentAverageValue(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentAverageValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentAverageValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentAverageValue")(js.undefined)
        ret
    }
    @scala.inline
    def withMetricSelector(value: Input[LabelSelector]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetricSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricSelector")(js.undefined)
        ret
    }
  }
  
}

