package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ReposListInvitationsEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposListInvitationsRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ReposListInvitationsResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposListInvitationsEndpoint extends js.Object {
  
  var parameters: ReposListInvitationsEndpoint = js.native
  
  var request: ReposListInvitationsRequestOptions = js.native
  
  var response: OctokitResponse[ReposListInvitationsResponseData] = js.native
}
object ParametersReposListInvitationsEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposListInvitationsEndpoint,
    request: ReposListInvitationsRequestOptions,
    response: OctokitResponse[ReposListInvitationsResponseData]
  ): ParametersReposListInvitationsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListInvitationsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposListInvitationsEndpointOps[Self <: ParametersReposListInvitationsEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ReposListInvitationsEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposListInvitationsRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposListInvitationsResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
