package typingsSlinky.pulumiKubernetes.inputMod.autoscaling.v2beta1

import typingsSlinky.pulumiKubernetes.inputMod.meta.v1.LabelSelector
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ObjectMetricStatus indicates the current value of a metric describing a kubernetes object (for example, hits-per-second on an Ingress object).
  */
@js.native
trait ObjectMetricStatus extends js.Object {
  
  /**
    * averageValue is the current value of the average of the metric across all relevant pods (as a quantity)
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
    * selector is the string-encoded form of a standard kubernetes label selector for the given metric When set in the ObjectMetricSource, it is passed as an additional parameter to the metrics server for more specific metrics scoping. When unset, just the metricName will be used to gather metrics.
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCurrentValue(value: Input[String]): Self = this.set("currentValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricName(value: Input[String]): Self = this.set("metricName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: Input[CrossVersionObjectReference]): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAverageValue(value: Input[String]): Self = this.set("averageValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAverageValue: Self = this.set("averageValue", js.undefined)
    
    @scala.inline
    def setSelector(value: Input[LabelSelector]): Self = this.set("selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelector: Self = this.set("selector", js.undefined)
  }
}
