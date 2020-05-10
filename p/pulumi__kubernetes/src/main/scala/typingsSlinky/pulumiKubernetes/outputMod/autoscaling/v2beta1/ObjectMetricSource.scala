package typingsSlinky.pulumiKubernetes.outputMod.autoscaling.v2beta1

import typingsSlinky.pulumiKubernetes.outputMod.meta.v1.LabelSelector
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
  val averageValue: String = js.native
  /**
    * metricName is the name of the metric in question.
    */
  val metricName: String = js.native
  /**
    * selector is the string-encoded form of a standard kubernetes label selector for the given
    * metric When set, it is passed as an additional parameter to the metrics server for more
    * specific metrics scoping When unset, just the metricName will be used to gather metrics.
    */
  val selector: LabelSelector = js.native
  /**
    * target is the described Kubernetes object.
    */
  val target: CrossVersionObjectReference = js.native
  /**
    * targetValue is the target value of the metric (as a quantity).
    */
  val targetValue: String = js.native
}

object ObjectMetricSource {
  @scala.inline
  def apply(
    averageValue: String,
    metricName: String,
    selector: LabelSelector,
    target: CrossVersionObjectReference,
    targetValue: String
  ): ObjectMetricSource = {
    val __obj = js.Dynamic.literal(averageValue = averageValue.asInstanceOf[js.Any], metricName = metricName.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], targetValue = targetValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectMetricSource]
  }
  @scala.inline
  implicit class ObjectMetricSourceOps[Self <: ObjectMetricSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAverageValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("averageValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetricName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelector(value: LabelSelector): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: CrossVersionObjectReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetValue")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

