package typingsSlinky.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListSimulationJobBatchesResponse extends StObject {
  
  /**
    * If the previous paginated request did not return all of the remaining results, the response object's nextToken parameter value is set to a token. To retrieve the next set of results, call ListSimulationJobBatches again and assign that token to the request object's nextToken parameter. If there are no remaining results, the previous response object's NextToken parameter is set to null. 
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  
  /**
    * A list of simulation job batch summaries.
    */
  var simulationJobBatchSummaries: js.UndefOr[SimulationJobBatchSummaries] = js.native
}
object ListSimulationJobBatchesResponse {
  
  @scala.inline
  def apply(): ListSimulationJobBatchesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSimulationJobBatchesResponse]
  }
  
  @scala.inline
  implicit class ListSimulationJobBatchesResponseMutableBuilder[Self <: ListSimulationJobBatchesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setSimulationJobBatchSummaries(value: SimulationJobBatchSummaries): Self = StObject.set(x, "simulationJobBatchSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSimulationJobBatchSummariesUndefined: Self = StObject.set(x, "simulationJobBatchSummaries", js.undefined)
    
    @scala.inline
    def setSimulationJobBatchSummariesVarargs(value: SimulationJobBatchSummary*): Self = StObject.set(x, "simulationJobBatchSummaries", js.Array(value :_*))
  }
}
