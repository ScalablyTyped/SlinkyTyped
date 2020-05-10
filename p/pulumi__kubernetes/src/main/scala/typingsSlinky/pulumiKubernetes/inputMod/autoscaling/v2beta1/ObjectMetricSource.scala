package typingsSlinky.pulumiKubernetes.inputMod.autoscaling.v2beta1

import typingsSlinky.pulumiKubernetes.inputMod.meta.v1.LabelSelector
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ObjectMetricSource indicates how to scale on a metric describing a kubernetes object (for
  * example, hits-per-second on an Ingress object).
  */
@js.native
trait ObjectMetricSource extends js.Object {
  /**
    * averageValue is the target value of the average of the metric across all relevant pods (as
    * a quantity)
    */
  var averageValue: js.UndefOr[Input[String]] = js.native
  /**
    * metricName is the name of the metric in question.
    */
  var metricName: Input[String] = js.native
  /**
    * selector is the string-encoded form of a standard kubernetes label selector for the given
    * metric When set, it is passed as an additional parameter to the metrics server for more
    * specific metrics scoping When unset, just the metricName will be used to gather metrics.
    */
  var selector: js.UndefOr[Input[LabelSelector]] = js.native
  /**
    * target is the described Kubernetes object.
    */
  var target: Input[CrossVersionObjectReference] = js.native
  /**
    * targetValue is the target value of the metric (as a quantity).
    */
  var targetValue: Input[String] = js.native
}

object ObjectMetricSource {
  @scala.inline
  def apply(metricName: Input[String], target: Input[CrossVersionObjectReference], targetValue: Input[String]): ObjectMetricSource = {
    val __obj = js.Dynamic.literal(metricName = metricName.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], targetValue = targetValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectMetricSource]
  }
  @scala.inline
  implicit class ObjectMetricSourceOps[Self <: ObjectMetricSource] (val x: Self) extends AnyVal {
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
    def withTarget(value: Input[CrossVersionObjectReference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetValue(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAverageValue(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("averageValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAverageValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("averageValue")(js.undefined)
        ret
    }
    @scala.inline
    def withSelector(value: Input[LabelSelector]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(js.undefined)
        ret
    }
  }
  
}

