package typingsSlinky.pulumiKubernetes.inputMod.autoscaling.v2beta2

import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * PodsMetricSource indicates how to scale on a metric describing each pod in the current scale target (for example, transactions-processed-per-second). The values will be averaged together before being compared to the target value.
  */
@js.native
trait PodsMetricSource extends StObject {
  
  /**
    * metric identifies the target metric by name and selector
    */
  var metric: Input[MetricIdentifier] = js.native
  
  /**
    * target specifies the target value for the given metric
    */
  var target: Input[MetricTarget] = js.native
}
object PodsMetricSource {
  
  @scala.inline
  def apply(metric: Input[MetricIdentifier], target: Input[MetricTarget]): PodsMetricSource = {
    val __obj = js.Dynamic.literal(metric = metric.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[PodsMetricSource]
  }
  
  @scala.inline
  implicit class PodsMetricSourceMutableBuilder[Self <: PodsMetricSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetric(value: Input[MetricIdentifier]): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: Input[MetricTarget]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
