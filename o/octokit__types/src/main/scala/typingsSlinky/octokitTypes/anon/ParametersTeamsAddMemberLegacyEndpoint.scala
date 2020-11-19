package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.TeamsAddMemberLegacyEndpoint
import typingsSlinky.octokitTypes.endpointsMod.TeamsAddMemberLegacyRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.TeamsAddMemberLegacyResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersTeamsAddMemberLegacyEndpoint extends js.Object {
  
  var parameters: TeamsAddMemberLegacyEndpoint = js.native
  
  var request: TeamsAddMemberLegacyRequestOptions = js.native
  
  var response: OctokitResponse[TeamsAddMemberLegacyResponseData] = js.native
}
object ParametersTeamsAddMemberLegacyEndpoint {
  
  @scala.inline
  def apply(
    parameters: TeamsAddMemberLegacyEndpoint,
    request: TeamsAddMemberLegacyRequestOptions,
    response: OctokitResponse[TeamsAddMemberLegacyResponseData]
  ): ParametersTeamsAddMemberLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsAddMemberLegacyEndpoint]
  }
  
  @scala.inline
  implicit class ParametersTeamsAddMemberLegacyEndpointOps[Self <: ParametersTeamsAddMemberLegacyEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: TeamsAddMemberLegacyEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: TeamsAddMemberLegacyRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsAddMemberLegacyResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
