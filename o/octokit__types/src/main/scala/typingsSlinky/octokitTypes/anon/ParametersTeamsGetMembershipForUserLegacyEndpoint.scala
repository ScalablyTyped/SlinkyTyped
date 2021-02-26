package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.TeamsGetMembershipForUserLegacyEndpoint
import typingsSlinky.octokitTypes.endpointsMod.TeamsGetMembershipForUserLegacyRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.TeamsGetMembershipForUserLegacyResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersTeamsGetMembershipForUserLegacyEndpoint extends StObject {
  
  var parameters: TeamsGetMembershipForUserLegacyEndpoint = js.native
  
  var request: TeamsGetMembershipForUserLegacyRequestOptions = js.native
  
  var response: OctokitResponse[TeamsGetMembershipForUserLegacyResponseData] = js.native
}
object ParametersTeamsGetMembershipForUserLegacyEndpoint {
  
  @scala.inline
  def apply(
    parameters: TeamsGetMembershipForUserLegacyEndpoint,
    request: TeamsGetMembershipForUserLegacyRequestOptions,
    response: OctokitResponse[TeamsGetMembershipForUserLegacyResponseData]
  ): ParametersTeamsGetMembershipForUserLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsGetMembershipForUserLegacyEndpoint]
  }
  
  @scala.inline
  implicit class ParametersTeamsGetMembershipForUserLegacyEndpointMutableBuilder[Self <: ParametersTeamsGetMembershipForUserLegacyEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: TeamsGetMembershipForUserLegacyEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: TeamsGetMembershipForUserLegacyRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsGetMembershipForUserLegacyResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
