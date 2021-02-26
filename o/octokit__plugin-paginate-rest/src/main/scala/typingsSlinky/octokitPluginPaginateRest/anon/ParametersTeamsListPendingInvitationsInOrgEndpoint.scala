package typingsSlinky.octokitPluginPaginateRest.anon

import typingsSlinky.octokitTypes.endpointsMod.TeamsListPendingInvitationsInOrgEndpoint
import typingsSlinky.octokitTypes.endpointsMod.TeamsListPendingInvitationsInOrgResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersTeamsListPendingInvitationsInOrgEndpoint extends StObject {
  
  var parameters: TeamsListPendingInvitationsInOrgEndpoint = js.native
  
  var response: OctokitResponse[TeamsListPendingInvitationsInOrgResponseData] = js.native
}
object ParametersTeamsListPendingInvitationsInOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: TeamsListPendingInvitationsInOrgEndpoint,
    response: OctokitResponse[TeamsListPendingInvitationsInOrgResponseData]
  ): ParametersTeamsListPendingInvitationsInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsListPendingInvitationsInOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersTeamsListPendingInvitationsInOrgEndpointMutableBuilder[Self <: ParametersTeamsListPendingInvitationsInOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: TeamsListPendingInvitationsInOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsListPendingInvitationsInOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
