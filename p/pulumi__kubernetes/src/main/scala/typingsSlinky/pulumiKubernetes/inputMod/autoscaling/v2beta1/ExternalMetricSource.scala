package typingsSlinky.pulumiKubernetes.inputMod.autoscaling.v2beta1

import typingsSlinky.pulumiKubernetes.inputMod.meta.v1.LabelSelector
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ExternalMetricSource indicates how to scale on a metric not associated with any Kubernetes
  * object (for example length of queue in cloud messaging service, or QPS from loadbalancer
  * running outside of cluster). Exactly one "target" type should be set.
  */
@js.native
trait ExternalMetricSource extends js.Object {
  /**
    * metricName is the name of the metric in question.
    */
  var metricName: Input[String] = js.native
  /**
    * metricSelector is used to identify a specific time series within a given metric.
    */
  var metricSelector: js.UndefOr[Input[LabelSelector]] = js.native
  /**
    * targetAverageValue is the target per-pod value of global metric (as a quantity). Mutually
    * exclusive with TargetValue.
    */
  var targetAverageValue: js.UndefOr[Input[String]] = js.native
  /**
    * targetValue is the target value of the metric (as a quantity). Mutually exclusive with
    * TargetAverageValue.
    */
  var targetValue: js.UndefOr[Input[String]] = js.native
}

object ExternalMetricSource {
  @scala.inline
  def apply(metricName: Input[String]): ExternalMetricSource = {
    val __obj = js.Dynamic.literal(metricName = metricName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExternalMetricSource]
  }
  @scala.inline
  implicit class ExternalMetricSourceOps[Self <: ExternalMetricSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMetricName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricName")(value.asInstanceOf[js.Any])
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
    @scala.inline
    def withTargetAverageValue(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetAverageValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetAverageValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetAverageValue")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetValue(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetValue")(js.undefined)
        ret
    }
  }
  
}

