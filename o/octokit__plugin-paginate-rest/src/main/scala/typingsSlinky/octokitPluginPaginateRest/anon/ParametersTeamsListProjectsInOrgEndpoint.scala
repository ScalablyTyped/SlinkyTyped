package typingsSlinky.octokitPluginPaginateRest.anon

import typingsSlinky.octokitTypes.endpointsMod.TeamsListProjectsInOrgEndpoint
import typingsSlinky.octokitTypes.endpointsMod.TeamsListProjectsInOrgResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersTeamsListProjectsInOrgEndpoint extends js.Object {
  
  var parameters: TeamsListProjectsInOrgEndpoint = js.native
  
  var response: OctokitResponse[TeamsListProjectsInOrgResponseData] = js.native
}
object ParametersTeamsListProjectsInOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: TeamsListProjectsInOrgEndpoint,
    response: OctokitResponse[TeamsListProjectsInOrgResponseData]
  ): ParametersTeamsListProjectsInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsListProjectsInOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersTeamsListProjectsInOrgEndpointOps[Self <: ParametersTeamsListProjectsInOrgEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: TeamsListProjectsInOrgEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsListProjectsInOrgResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
