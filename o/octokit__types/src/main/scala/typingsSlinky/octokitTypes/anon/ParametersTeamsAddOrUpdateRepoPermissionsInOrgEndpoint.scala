package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.TeamsAddOrUpdateRepoPermissionsInOrgEndpoint
import typingsSlinky.octokitTypes.endpointsMod.TeamsAddOrUpdateRepoPermissionsInOrgRequestOptions
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersTeamsAddOrUpdateRepoPermissionsInOrgEndpoint extends js.Object {
  
  var parameters: TeamsAddOrUpdateRepoPermissionsInOrgEndpoint = js.native
  
  var request: TeamsAddOrUpdateRepoPermissionsInOrgRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersTeamsAddOrUpdateRepoPermissionsInOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: TeamsAddOrUpdateRepoPermissionsInOrgEndpoint,
    request: TeamsAddOrUpdateRepoPermissionsInOrgRequestOptions,
    response: OctokitResponse[_]
  ): ParametersTeamsAddOrUpdateRepoPermissionsInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsAddOrUpdateRepoPermissionsInOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersTeamsAddOrUpdateRepoPermissionsInOrgEndpointOps[Self <: ParametersTeamsAddOrUpdateRepoPermissionsInOrgEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: TeamsAddOrUpdateRepoPermissionsInOrgEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: TeamsAddOrUpdateRepoPermissionsInOrgRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
