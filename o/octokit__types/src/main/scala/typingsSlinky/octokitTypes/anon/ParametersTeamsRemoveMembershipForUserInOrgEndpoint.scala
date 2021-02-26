package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.TeamsRemoveMembershipForUserInOrgEndpoint
import typingsSlinky.octokitTypes.endpointsMod.TeamsRemoveMembershipForUserInOrgRequestOptions
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersTeamsRemoveMembershipForUserInOrgEndpoint extends StObject {
  
  var parameters: TeamsRemoveMembershipForUserInOrgEndpoint = js.native
  
  var request: TeamsRemoveMembershipForUserInOrgRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersTeamsRemoveMembershipForUserInOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: TeamsRemoveMembershipForUserInOrgEndpoint,
    request: TeamsRemoveMembershipForUserInOrgRequestOptions,
    response: OctokitResponse[_]
  ): ParametersTeamsRemoveMembershipForUserInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsRemoveMembershipForUserInOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersTeamsRemoveMembershipForUserInOrgEndpointMutableBuilder[Self <: ParametersTeamsRemoveMembershipForUserInOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: TeamsRemoveMembershipForUserInOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: TeamsRemoveMembershipForUserInOrgRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
