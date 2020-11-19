package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ReposDeclineInvitationEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposDeclineInvitationRequestOptions
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposDeclineInvitationEndpoint extends js.Object {
  
  var parameters: ReposDeclineInvitationEndpoint = js.native
  
  var request: ReposDeclineInvitationRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersReposDeclineInvitationEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposDeclineInvitationEndpoint,
    request: ReposDeclineInvitationRequestOptions,
    response: OctokitResponse[_]
  ): ParametersReposDeclineInvitationEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposDeclineInvitationEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposDeclineInvitationEndpointOps[Self <: ParametersReposDeclineInvitationEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ReposDeclineInvitationEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposDeclineInvitationRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
