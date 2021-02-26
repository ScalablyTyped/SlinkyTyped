package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.TeamsListIdPGroupsForOrgEndpoint
import typingsSlinky.octokitTypes.endpointsMod.TeamsListIdPGroupsForOrgRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.TeamsListIdPGroupsForOrgResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersTeamsListIdPGroupsForOrgEndpoint extends StObject {
  
  var parameters: TeamsListIdPGroupsForOrgEndpoint = js.native
  
  var request: TeamsListIdPGroupsForOrgRequestOptions = js.native
  
  var response: OctokitResponse[TeamsListIdPGroupsForOrgResponseData] = js.native
}
object ParametersTeamsListIdPGroupsForOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: TeamsListIdPGroupsForOrgEndpoint,
    request: TeamsListIdPGroupsForOrgRequestOptions,
    response: OctokitResponse[TeamsListIdPGroupsForOrgResponseData]
  ): ParametersTeamsListIdPGroupsForOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsListIdPGroupsForOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersTeamsListIdPGroupsForOrgEndpointMutableBuilder[Self <: ParametersTeamsListIdPGroupsForOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: TeamsListIdPGroupsForOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: TeamsListIdPGroupsForOrgRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsListIdPGroupsForOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
