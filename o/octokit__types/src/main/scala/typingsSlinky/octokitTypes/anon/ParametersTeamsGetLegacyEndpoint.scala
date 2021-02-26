package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.TeamsGetLegacyEndpoint
import typingsSlinky.octokitTypes.endpointsMod.TeamsGetLegacyRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.TeamsGetLegacyResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersTeamsGetLegacyEndpoint extends StObject {
  
  var parameters: TeamsGetLegacyEndpoint = js.native
  
  var request: TeamsGetLegacyRequestOptions = js.native
  
  var response: OctokitResponse[TeamsGetLegacyResponseData] = js.native
}
object ParametersTeamsGetLegacyEndpoint {
  
  @scala.inline
  def apply(
    parameters: TeamsGetLegacyEndpoint,
    request: TeamsGetLegacyRequestOptions,
    response: OctokitResponse[TeamsGetLegacyResponseData]
  ): ParametersTeamsGetLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsGetLegacyEndpoint]
  }
  
  @scala.inline
  implicit class ParametersTeamsGetLegacyEndpointMutableBuilder[Self <: ParametersTeamsGetLegacyEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: TeamsGetLegacyEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: TeamsGetLegacyRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsGetLegacyResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
