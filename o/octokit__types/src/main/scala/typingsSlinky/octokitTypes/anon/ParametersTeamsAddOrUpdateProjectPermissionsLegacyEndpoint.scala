package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.TeamsAddOrUpdateProjectPermissionsLegacyEndpoint
import typingsSlinky.octokitTypes.endpointsMod.TeamsAddOrUpdateProjectPermissionsLegacyRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.TeamsAddOrUpdateProjectPermissionsLegacyResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersTeamsAddOrUpdateProjectPermissionsLegacyEndpoint extends StObject {
  
  var parameters: TeamsAddOrUpdateProjectPermissionsLegacyEndpoint = js.native
  
  var request: TeamsAddOrUpdateProjectPermissionsLegacyRequestOptions = js.native
  
  var response: OctokitResponse[TeamsAddOrUpdateProjectPermissionsLegacyResponseData] = js.native
}
object ParametersTeamsAddOrUpdateProjectPermissionsLegacyEndpoint {
  
  @scala.inline
  def apply(
    parameters: TeamsAddOrUpdateProjectPermissionsLegacyEndpoint,
    request: TeamsAddOrUpdateProjectPermissionsLegacyRequestOptions,
    response: OctokitResponse[TeamsAddOrUpdateProjectPermissionsLegacyResponseData]
  ): ParametersTeamsAddOrUpdateProjectPermissionsLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsAddOrUpdateProjectPermissionsLegacyEndpoint]
  }
  
  @scala.inline
  implicit class ParametersTeamsAddOrUpdateProjectPermissionsLegacyEndpointMutableBuilder[Self <: ParametersTeamsAddOrUpdateProjectPermissionsLegacyEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: TeamsAddOrUpdateProjectPermissionsLegacyEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: TeamsAddOrUpdateProjectPermissionsLegacyRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsAddOrUpdateProjectPermissionsLegacyResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
