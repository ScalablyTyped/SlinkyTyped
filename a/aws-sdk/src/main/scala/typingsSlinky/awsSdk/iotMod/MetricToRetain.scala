package typingsSlinky.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetricToRetain extends StObject {
  
  /**
    * What is measured by the behavior.
    */
  var metric: BehaviorMetric = js.native
  
  /**
    * The dimension of a metric.
    */
  var metricDimension: js.UndefOr[MetricDimension] = js.native
}
object MetricToRetain {
  
  @scala.inline
  def apply(metric: BehaviorMetric): MetricToRetain = {
    val __obj = js.Dynamic.literal(metric = metric.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricToRetain]
  }
  
  @scala.inline
  implicit class MetricToRetainMutableBuilder[Self <: MetricToRetain] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetric(value: BehaviorMetric): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricDimension(value: MetricDimension): Self = StObject.set(x, "metricDimension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricDimensionUndefined: Self = StObject.set(x, "metricDimension", js.undefined)
  }
}
