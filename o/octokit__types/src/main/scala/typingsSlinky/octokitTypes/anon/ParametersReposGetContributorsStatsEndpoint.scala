package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ReposGetContributorsStatsEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposGetContributorsStatsRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ReposGetContributorsStatsResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposGetContributorsStatsEndpoint extends StObject {
  
  var parameters: ReposGetContributorsStatsEndpoint = js.native
  
  var request: ReposGetContributorsStatsRequestOptions = js.native
  
  var response: OctokitResponse[ReposGetContributorsStatsResponseData] = js.native
}
object ParametersReposGetContributorsStatsEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposGetContributorsStatsEndpoint,
    request: ReposGetContributorsStatsRequestOptions,
    response: OctokitResponse[ReposGetContributorsStatsResponseData]
  ): ParametersReposGetContributorsStatsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetContributorsStatsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposGetContributorsStatsEndpointMutableBuilder[Self <: ParametersReposGetContributorsStatsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposGetContributorsStatsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposGetContributorsStatsRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetContributorsStatsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
