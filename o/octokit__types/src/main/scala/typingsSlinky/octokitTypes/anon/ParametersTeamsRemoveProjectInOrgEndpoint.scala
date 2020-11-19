package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.TeamsRemoveProjectInOrgEndpoint
import typingsSlinky.octokitTypes.endpointsMod.TeamsRemoveProjectInOrgRequestOptions
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersTeamsRemoveProjectInOrgEndpoint extends js.Object {
  
  var parameters: TeamsRemoveProjectInOrgEndpoint = js.native
  
  var request: TeamsRemoveProjectInOrgRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersTeamsRemoveProjectInOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: TeamsRemoveProjectInOrgEndpoint,
    request: TeamsRemoveProjectInOrgRequestOptions,
    response: OctokitResponse[_]
  ): ParametersTeamsRemoveProjectInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsRemoveProjectInOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersTeamsRemoveProjectInOrgEndpointOps[Self <: ParametersTeamsRemoveProjectInOrgEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: TeamsRemoveProjectInOrgEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: TeamsRemoveProjectInOrgRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
