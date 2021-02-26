package typingsSlinky.pulumiKubernetes.outputMod.autoscaling.v2beta1

import typingsSlinky.pulumiKubernetes.outputMod.meta.v1.LabelSelector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ExternalMetricSource indicates how to scale on a metric not associated with any Kubernetes object (for example length of queue in cloud messaging service, or QPS from loadbalancer running outside of cluster). Exactly one "target" type should be set.
  */
@js.native
trait ExternalMetricSource extends StObject {
  
  /**
    * metricName is the name of the metric in question.
    */
  var metricName: String = js.native
  
  /**
    * metricSelector is used to identify a specific time series within a given metric.
    */
  var metricSelector: LabelSelector = js.native
  
  /**
    * targetAverageValue is the target per-pod value of global metric (as a quantity). Mutually exclusive with TargetValue.
    */
  var targetAverageValue: String = js.native
  
  /**
    * targetValue is the target value of the metric (as a quantity). Mutually exclusive with TargetAverageValue.
    */
  var targetValue: String = js.native
}
object ExternalMetricSource {
  
  @scala.inline
  def apply(metricName: String, metricSelector: LabelSelector, targetAverageValue: String, targetValue: String): ExternalMetricSource = {
    val __obj = js.Dynamic.literal(metricName = metricName.asInstanceOf[js.Any], metricSelector = metricSelector.asInstanceOf[js.Any], targetAverageValue = targetAverageValue.asInstanceOf[js.Any], targetValue = targetValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExternalMetricSource]
  }
  
  @scala.inline
  implicit class ExternalMetricSourceMutableBuilder[Self <: ExternalMetricSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetricName(value: String): Self = StObject.set(x, "metricName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricSelector(value: LabelSelector): Self = StObject.set(x, "metricSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetAverageValue(value: String): Self = StObject.set(x, "targetAverageValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetValue(value: String): Self = StObject.set(x, "targetValue", value.asInstanceOf[js.Any])
  }
}
