package typingsSlinky.octokitPluginPaginateRest.anon

import typingsSlinky.octokitTypes.endpointsMod.TeamsListIdPGroupsInOrgEndpoint
import typingsSlinky.octokitTypes.endpointsMod.TeamsListIdPGroupsInOrgResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersTeamsListIdPGroupsInOrgEndpoint extends js.Object {
  
  var parameters: TeamsListIdPGroupsInOrgEndpoint = js.native
  
  var response: OctokitResponse[TeamsListIdPGroupsInOrgResponseData] with `7` = js.native
}
object ParametersTeamsListIdPGroupsInOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: TeamsListIdPGroupsInOrgEndpoint,
    response: OctokitResponse[TeamsListIdPGroupsInOrgResponseData] with `7`
  ): ParametersTeamsListIdPGroupsInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsListIdPGroupsInOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersTeamsListIdPGroupsInOrgEndpointOps[Self <: ParametersTeamsListIdPGroupsInOrgEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: TeamsListIdPGroupsInOrgEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsListIdPGroupsInOrgResponseData] with `7`): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
