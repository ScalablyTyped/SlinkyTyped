package typingsSlinky.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pivot extends StObject {
  
  /**
    * Dimension names for visible columns in the report response. Including "dateRange" produces a date range column; for each row in the response, dimension values in the date range
    * column will indicate the corresponding date range from the request.
    */
  var fieldNames: js.UndefOr[js.Array[String]] = js.native
  
  /** The number of rows to return in this pivot. If unspecified, 10 rows are returned. If -1, all rows are returned. */
  var limit: js.UndefOr[String] = js.native
  
  /** Aggregate the metrics by dimensions in this pivot using the specified metric_aggregations. */
  var metricAggregations: js.UndefOr[js.Array[String]] = js.native
  
  /** The row count of the start row. The first row is counted as row 0. */
  var offset: js.UndefOr[String] = js.native
  
  /**
    * Specifies how dimensions are ordered in the pivot. In the first Pivot, the OrderBys determine Row and PivotDimensionHeader ordering; in subsequent Pivots, the OrderBys determine
    * only PivotDimensionHeader ordering. Dimensions specified in these OrderBys must be a subset of Pivot.field_names.
    */
  var orderBys: js.UndefOr[js.Array[OrderBy]] = js.native
}
object Pivot {
  
  @scala.inline
  def apply(): Pivot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Pivot]
  }
  
  @scala.inline
  implicit class PivotMutableBuilder[Self <: Pivot] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFieldNames(value: js.Array[String]): Self = StObject.set(x, "fieldNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldNamesUndefined: Self = StObject.set(x, "fieldNames", js.undefined)
    
    @scala.inline
    def setFieldNamesVarargs(value: String*): Self = StObject.set(x, "fieldNames", js.Array(value :_*))
    
    @scala.inline
    def setLimit(value: String): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setMetricAggregations(value: js.Array[String]): Self = StObject.set(x, "metricAggregations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricAggregationsUndefined: Self = StObject.set(x, "metricAggregations", js.undefined)
    
    @scala.inline
    def setMetricAggregationsVarargs(value: String*): Self = StObject.set(x, "metricAggregations", js.Array(value :_*))
    
    @scala.inline
    def setOffset(value: String): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setOrderBys(value: js.Array[OrderBy]): Self = StObject.set(x, "orderBys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderBysUndefined: Self = StObject.set(x, "orderBys", js.undefined)
    
    @scala.inline
    def setOrderBysVarargs(value: OrderBy*): Self = StObject.set(x, "orderBys", js.Array(value :_*))
  }
}
