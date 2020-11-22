package typingsSlinky.octokitPluginPaginateRest.anon

import typingsSlinky.octokitTypes.endpointsMod.TeamsListIdPGroupsForOrgEndpoint
import typingsSlinky.octokitTypes.endpointsMod.TeamsListIdPGroupsForOrgResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersTeamsListIdPGroupsForOrgEndpoint extends js.Object {
  
  var parameters: TeamsListIdPGroupsForOrgEndpoint = js.native
  
  var response: OctokitResponse[TeamsListIdPGroupsForOrgResponseData] with `7` = js.native
}
object ParametersTeamsListIdPGroupsForOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: TeamsListIdPGroupsForOrgEndpoint,
    response: OctokitResponse[TeamsListIdPGroupsForOrgResponseData] with `7`
  ): ParametersTeamsListIdPGroupsForOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsListIdPGroupsForOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersTeamsListIdPGroupsForOrgEndpointOps[Self <: ParametersTeamsListIdPGroupsForOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setParameters(value: TeamsListIdPGroupsForOrgEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsListIdPGroupsForOrgResponseData] with `7`): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
