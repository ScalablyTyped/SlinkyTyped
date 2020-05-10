package typingsSlinky.pulumiKubernetes.inputMod.autoscaling.v2beta1

import typingsSlinky.pulumiKubernetes.inputMod.meta.v1.LabelSelector
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ObjectMetricStatus indicates the current value of a metric describing a kubernetes object
  * (for example, hits-per-second on an Ingress object).
  */
@js.native
trait ObjectMetricStatus extends js.Object {
  /**
    * averageValue is the current value of the average of the metric across all relevant pods (as
    * a quantity)
    */
  var averageValue: js.UndefOr[Input[String]] = js.native
  /**
    * currentValue is the current value of the metric (as a quantity).
    */
  var currentValue: Input[String] = js.native
  /**
    * metricName is the name of the metric in question.
    */
  var metricName: Input[String] = js.native
  /**
    * selector is the string-encoded form of a standard kubernetes label selector for the given
    * metric When set in the ObjectMetricSource, it is passed as an additional parameter to the
    * metrics server for more specific metrics scoping. When unset, just the metricName will be
    * used to gather metrics.
    */
  var selector: js.UndefOr[Input[LabelSelector]] = js.native
  /**
    * target is the described Kubernetes object.
    */
  var target: Input[CrossVersionObjectReference] = js.native
}

object ObjectMetricStatus {
  @scala.inline
  def apply(currentValue: Input[String], metricName: Input[String], target: Input[CrossVersionObjectReference]): ObjectMetricStatus = {
    val __obj = js.Dynamic.literal(currentValue = currentValue.asInstanceOf[js.Any], metricName = metricName.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectMetricStatus]
  }
  @scala.inline
  implicit class ObjectMetricStatusOps[Self <: ObjectMetricStatus] (val x: Self) extends AnyVal {
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
    def withTarget(value: Input[CrossVersionObjectReference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
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

