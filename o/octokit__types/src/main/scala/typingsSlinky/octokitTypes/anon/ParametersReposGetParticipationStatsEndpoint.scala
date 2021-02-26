package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ReposGetParticipationStatsEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposGetParticipationStatsRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ReposGetParticipationStatsResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposGetParticipationStatsEndpoint extends StObject {
  
  var parameters: ReposGetParticipationStatsEndpoint = js.native
  
  var request: ReposGetParticipationStatsRequestOptions = js.native
  
  var response: OctokitResponse[ReposGetParticipationStatsResponseData] = js.native
}
object ParametersReposGetParticipationStatsEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposGetParticipationStatsEndpoint,
    request: ReposGetParticipationStatsRequestOptions,
    response: OctokitResponse[ReposGetParticipationStatsResponseData]
  ): ParametersReposGetParticipationStatsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetParticipationStatsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposGetParticipationStatsEndpointMutableBuilder[Self <: ParametersReposGetParticipationStatsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposGetParticipationStatsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposGetParticipationStatsRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetParticipationStatsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
