package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.TeamsListDiscussionsLegacyEndpoint
import typingsSlinky.octokitTypes.endpointsMod.TeamsListDiscussionsLegacyRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.TeamsListDiscussionsLegacyResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersTeamsListDiscussionsLegacyEndpoint extends StObject {
  
  var parameters: TeamsListDiscussionsLegacyEndpoint = js.native
  
  var request: TeamsListDiscussionsLegacyRequestOptions = js.native
  
  var response: OctokitResponse[TeamsListDiscussionsLegacyResponseData] = js.native
}
object ParametersTeamsListDiscussionsLegacyEndpoint {
  
  @scala.inline
  def apply(
    parameters: TeamsListDiscussionsLegacyEndpoint,
    request: TeamsListDiscussionsLegacyRequestOptions,
    response: OctokitResponse[TeamsListDiscussionsLegacyResponseData]
  ): ParametersTeamsListDiscussionsLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsListDiscussionsLegacyEndpoint]
  }
  
  @scala.inline
  implicit class ParametersTeamsListDiscussionsLegacyEndpointMutableBuilder[Self <: ParametersTeamsListDiscussionsLegacyEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: TeamsListDiscussionsLegacyEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: TeamsListDiscussionsLegacyRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsListDiscussionsLegacyResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
