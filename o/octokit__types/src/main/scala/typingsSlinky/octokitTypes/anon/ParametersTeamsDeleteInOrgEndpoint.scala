package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.TeamsDeleteInOrgEndpoint
import typingsSlinky.octokitTypes.endpointsMod.TeamsDeleteInOrgRequestOptions
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersTeamsDeleteInOrgEndpoint extends js.Object {
  
  var parameters: TeamsDeleteInOrgEndpoint = js.native
  
  var request: TeamsDeleteInOrgRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersTeamsDeleteInOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: TeamsDeleteInOrgEndpoint,
    request: TeamsDeleteInOrgRequestOptions,
    response: OctokitResponse[_]
  ): ParametersTeamsDeleteInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsDeleteInOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersTeamsDeleteInOrgEndpointOps[Self <: ParametersTeamsDeleteInOrgEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: TeamsDeleteInOrgEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: TeamsDeleteInOrgRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
