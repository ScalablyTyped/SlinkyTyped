package typingsSlinky.maximMazurokGapiClientSpanner.gapi.client.spanner

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResultSetStats extends StObject {
  
  /** QueryPlan for the query associated with this result. */
  var queryPlan: js.UndefOr[QueryPlan] = js.native
  
  /**
    * Aggregated statistics from the execution of the query. Only present when the query is profiled. For example, a query could return the statistics as follows: { "rows_returned": "3",
    * "elapsed_time": "1.22 secs", "cpu_time": "1.19 secs" }
    */
  var queryStats: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typingsSlinky.maximMazurokGapiClientSpanner.maximMazurokGapiClientSpannerStrings.ResultSetStats with TopLevel[js.Any]
  ] = js.native
  
  /** Standard DML returns an exact count of rows that were modified. */
  var rowCountExact: js.UndefOr[String] = js.native
  
  /** Partitioned DML does not offer exactly-once semantics, so it returns a lower bound of the rows modified. */
  var rowCountLowerBound: js.UndefOr[String] = js.native
}
object ResultSetStats {
  
  @scala.inline
  def apply(): ResultSetStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResultSetStats]
  }
  
  @scala.inline
  implicit class ResultSetStatsMutableBuilder[Self <: ResultSetStats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQueryPlan(value: QueryPlan): Self = StObject.set(x, "queryPlan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryPlanUndefined: Self = StObject.set(x, "queryPlan", js.undefined)
    
    @scala.inline
    def setQueryStats(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typingsSlinky.maximMazurokGapiClientSpanner.maximMazurokGapiClientSpannerStrings.ResultSetStats with TopLevel[js.Any]
    ): Self = StObject.set(x, "queryStats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryStatsUndefined: Self = StObject.set(x, "queryStats", js.undefined)
    
    @scala.inline
    def setRowCountExact(value: String): Self = StObject.set(x, "rowCountExact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowCountExactUndefined: Self = StObject.set(x, "rowCountExact", js.undefined)
    
    @scala.inline
    def setRowCountLowerBound(value: String): Self = StObject.set(x, "rowCountLowerBound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowCountLowerBoundUndefined: Self = StObject.set(x, "rowCountLowerBound", js.undefined)
  }
}
