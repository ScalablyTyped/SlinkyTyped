package typingsSlinky.pulumiKubernetes.inputMod.autoscaling.v2beta1

import typingsSlinky.pulumiKubernetes.inputMod.meta.v1.LabelSelector
import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ExternalMetricStatus indicates the current value of a global metric not associated with any Kubernetes object.
  */
@js.native
trait ExternalMetricStatus extends StObject {
  
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
  implicit class ExternalMetricStatusMutableBuilder[Self <: ExternalMetricStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentAverageValue(value: Input[String]): Self = StObject.set(x, "currentAverageValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentAverageValueUndefined: Self = StObject.set(x, "currentAverageValue", js.undefined)
    
    @scala.inline
    def setCurrentValue(value: Input[String]): Self = StObject.set(x, "currentValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricName(value: Input[String]): Self = StObject.set(x, "metricName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricSelector(value: Input[LabelSelector]): Self = StObject.set(x, "metricSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricSelectorUndefined: Self = StObject.set(x, "metricSelector", js.undefined)
  }
}
