package typingsSlinky.maximMazurokGapiClientAnalyticsreporting.gapi.client.analyticsreporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SegmentMetricFilter extends StObject {
  
  /** The value to compare against. If the operator is `BETWEEN`, this value is treated as minimum comparison value. */
  var comparisonValue: js.UndefOr[String] = js.native
  
  /** Max comparison value is only used for `BETWEEN` operator. */
  var maxComparisonValue: js.UndefOr[String] = js.native
  
  /** The metric that will be filtered on. A `metricFilter` must contain a metric name. */
  var metricName: js.UndefOr[String] = js.native
  
  /** Specifies is the operation to perform to compare the metric. The default is `EQUAL`. */
  var operator: js.UndefOr[String] = js.native
  
  /**
    * Scope for a metric defines the level at which that metric is defined. The specified metric scope must be equal to or greater than its primary scope as defined in the data model. The
    * primary scope is defined by if the segment is selecting users or sessions.
    */
  var scope: js.UndefOr[String] = js.native
}
object SegmentMetricFilter {
  
  @scala.inline
  def apply(): SegmentMetricFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SegmentMetricFilter]
  }
  
  @scala.inline
  implicit class SegmentMetricFilterMutableBuilder[Self <: SegmentMetricFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComparisonValue(value: String): Self = StObject.set(x, "comparisonValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComparisonValueUndefined: Self = StObject.set(x, "comparisonValue", js.undefined)
    
    @scala.inline
    def setMaxComparisonValue(value: String): Self = StObject.set(x, "maxComparisonValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxComparisonValueUndefined: Self = StObject.set(x, "maxComparisonValue", js.undefined)
    
    @scala.inline
    def setMetricName(value: String): Self = StObject.set(x, "metricName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricNameUndefined: Self = StObject.set(x, "metricName", js.undefined)
    
    @scala.inline
    def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
    
    @scala.inline
    def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
  }
}
