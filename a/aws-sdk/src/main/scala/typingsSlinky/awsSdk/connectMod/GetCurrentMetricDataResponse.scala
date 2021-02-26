package typingsSlinky.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCurrentMetricDataResponse extends StObject {
  
  /**
    * The time at which the metrics were retrieved and cached for pagination.
    */
  var DataSnapshotTime: js.UndefOr[js.Date] = js.native
  
  /**
    * Information about the real-time metrics.
    */
  var MetricResults: js.UndefOr[CurrentMetricResults] = js.native
  
  /**
    * If there are additional results, this is the token for the next set of results. The token expires after 5 minutes from the time it is created. Subsequent requests that use the token must use the same request parameters as the request that generated the token.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.connectMod.NextToken] = js.native
}
object GetCurrentMetricDataResponse {
  
  @scala.inline
  def apply(): GetCurrentMetricDataResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCurrentMetricDataResponse]
  }
  
  @scala.inline
  implicit class GetCurrentMetricDataResponseMutableBuilder[Self <: GetCurrentMetricDataResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataSnapshotTime(value: js.Date): Self = StObject.set(x, "DataSnapshotTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSnapshotTimeUndefined: Self = StObject.set(x, "DataSnapshotTime", js.undefined)
    
    @scala.inline
    def setMetricResults(value: CurrentMetricResults): Self = StObject.set(x, "MetricResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricResultsUndefined: Self = StObject.set(x, "MetricResults", js.undefined)
    
    @scala.inline
    def setMetricResultsVarargs(value: CurrentMetricResult*): Self = StObject.set(x, "MetricResults", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
