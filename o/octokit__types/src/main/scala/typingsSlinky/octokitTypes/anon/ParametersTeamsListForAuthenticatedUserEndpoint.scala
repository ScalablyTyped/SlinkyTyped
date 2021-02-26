package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.TeamsListForAuthenticatedUserEndpoint
import typingsSlinky.octokitTypes.endpointsMod.TeamsListForAuthenticatedUserRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.TeamsListForAuthenticatedUserResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersTeamsListForAuthenticatedUserEndpoint extends StObject {
  
  var parameters: TeamsListForAuthenticatedUserEndpoint = js.native
  
  var request: TeamsListForAuthenticatedUserRequestOptions = js.native
  
  var response: OctokitResponse[TeamsListForAuthenticatedUserResponseData] = js.native
}
object ParametersTeamsListForAuthenticatedUserEndpoint {
  
  @scala.inline
  def apply(
    parameters: TeamsListForAuthenticatedUserEndpoint,
    request: TeamsListForAuthenticatedUserRequestOptions,
    response: OctokitResponse[TeamsListForAuthenticatedUserResponseData]
  ): ParametersTeamsListForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsListForAuthenticatedUserEndpoint]
  }
  
  @scala.inline
  implicit class ParametersTeamsListForAuthenticatedUserEndpointMutableBuilder[Self <: ParametersTeamsListForAuthenticatedUserEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: TeamsListForAuthenticatedUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: TeamsListForAuthenticatedUserRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsListForAuthenticatedUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
