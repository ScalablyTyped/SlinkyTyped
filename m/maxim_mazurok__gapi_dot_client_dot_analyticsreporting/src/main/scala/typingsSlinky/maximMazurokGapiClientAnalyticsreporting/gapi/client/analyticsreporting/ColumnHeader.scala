package typingsSlinky.maximMazurokGapiClientAnalyticsreporting.gapi.client.analyticsreporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnHeader extends StObject {
  
  /** The dimension names in the response. */
  var dimensions: js.UndefOr[js.Array[String]] = js.native
  
  /** Metric headers for the metrics in the response. */
  var metricHeader: js.UndefOr[MetricHeader] = js.native
}
object ColumnHeader {
  
  @scala.inline
  def apply(): ColumnHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnHeader]
  }
  
  @scala.inline
  implicit class ColumnHeaderMutableBuilder[Self <: ColumnHeader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDimensions(value: js.Array[String]): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
    
    @scala.inline
    def setDimensionsVarargs(value: String*): Self = StObject.set(x, "dimensions", js.Array(value :_*))
    
    @scala.inline
    def setMetricHeader(value: MetricHeader): Self = StObject.set(x, "metricHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricHeaderUndefined: Self = StObject.set(x, "metricHeader", js.undefined)
  }
}
