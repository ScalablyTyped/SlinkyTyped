package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.TeamsCreateOrUpdateIdPGroupConnectionsLegacyEndpoint
import typingsSlinky.octokitTypes.endpointsMod.TeamsCreateOrUpdateIdPGroupConnectionsLegacyRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.TeamsCreateOrUpdateIdPGroupConnectionsLegacyResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersTeamsCreateOrUpdateIdPGroupConnectionsLegacyEndpoint extends StObject {
  
  var parameters: TeamsCreateOrUpdateIdPGroupConnectionsLegacyEndpoint = js.native
  
  var request: TeamsCreateOrUpdateIdPGroupConnectionsLegacyRequestOptions = js.native
  
  var response: OctokitResponse[TeamsCreateOrUpdateIdPGroupConnectionsLegacyResponseData] = js.native
}
object ParametersTeamsCreateOrUpdateIdPGroupConnectionsLegacyEndpoint {
  
  @scala.inline
  def apply(
    parameters: TeamsCreateOrUpdateIdPGroupConnectionsLegacyEndpoint,
    request: TeamsCreateOrUpdateIdPGroupConnectionsLegacyRequestOptions,
    response: OctokitResponse[TeamsCreateOrUpdateIdPGroupConnectionsLegacyResponseData]
  ): ParametersTeamsCreateOrUpdateIdPGroupConnectionsLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsCreateOrUpdateIdPGroupConnectionsLegacyEndpoint]
  }
  
  @scala.inline
  implicit class ParametersTeamsCreateOrUpdateIdPGroupConnectionsLegacyEndpointMutableBuilder[Self <: ParametersTeamsCreateOrUpdateIdPGroupConnectionsLegacyEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: TeamsCreateOrUpdateIdPGroupConnectionsLegacyEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: TeamsCreateOrUpdateIdPGroupConnectionsLegacyRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsCreateOrUpdateIdPGroupConnectionsLegacyResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
