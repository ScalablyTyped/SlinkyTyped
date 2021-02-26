package typingsSlinky.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListSimulationJobsResponse extends StObject {
  
  /**
    * If the previous paginated request did not return all of the remaining results, the response object's nextToken parameter value is set to a token. To retrieve the next set of results, call ListSimulationJobs again and assign that token to the request object's nextToken parameter. If there are no remaining results, the previous response object's NextToken parameter is set to null. 
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  
  /**
    * A list of simulation job summaries that meet the criteria of the request.
    */
  var simulationJobSummaries: SimulationJobSummaries = js.native
}
object ListSimulationJobsResponse {
  
  @scala.inline
  def apply(simulationJobSummaries: SimulationJobSummaries): ListSimulationJobsResponse = {
    val __obj = js.Dynamic.literal(simulationJobSummaries = simulationJobSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSimulationJobsResponse]
  }
  
  @scala.inline
  implicit class ListSimulationJobsResponseMutableBuilder[Self <: ListSimulationJobsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setSimulationJobSummaries(value: SimulationJobSummaries): Self = StObject.set(x, "simulationJobSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSimulationJobSummariesVarargs(value: SimulationJobSummary*): Self = StObject.set(x, "simulationJobSummaries", js.Array(value :_*))
  }
}
