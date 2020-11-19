package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.TeamsListReposInOrgEndpoint
import typingsSlinky.octokitTypes.endpointsMod.TeamsListReposInOrgRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.TeamsListReposInOrgResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersTeamsListReposInOrgEndpoint extends js.Object {
  
  var parameters: TeamsListReposInOrgEndpoint = js.native
  
  var request: TeamsListReposInOrgRequestOptions = js.native
  
  var response: OctokitResponse[TeamsListReposInOrgResponseData] = js.native
}
object ParametersTeamsListReposInOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: TeamsListReposInOrgEndpoint,
    request: TeamsListReposInOrgRequestOptions,
    response: OctokitResponse[TeamsListReposInOrgResponseData]
  ): ParametersTeamsListReposInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsListReposInOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersTeamsListReposInOrgEndpointOps[Self <: ParametersTeamsListReposInOrgEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: TeamsListReposInOrgEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: TeamsListReposInOrgRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsListReposInOrgResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
