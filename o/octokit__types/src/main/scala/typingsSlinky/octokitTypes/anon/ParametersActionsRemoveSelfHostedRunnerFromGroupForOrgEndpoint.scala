package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ActionsRemoveSelfHostedRunnerFromGroupForOrgEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ActionsRemoveSelfHostedRunnerFromGroupForOrgRequestOptions
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActionsRemoveSelfHostedRunnerFromGroupForOrgEndpoint extends js.Object {
  
  var parameters: ActionsRemoveSelfHostedRunnerFromGroupForOrgEndpoint = js.native
  
  var request: ActionsRemoveSelfHostedRunnerFromGroupForOrgRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersActionsRemoveSelfHostedRunnerFromGroupForOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActionsRemoveSelfHostedRunnerFromGroupForOrgEndpoint,
    request: ActionsRemoveSelfHostedRunnerFromGroupForOrgRequestOptions,
    response: OctokitResponse[_]
  ): ParametersActionsRemoveSelfHostedRunnerFromGroupForOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsRemoveSelfHostedRunnerFromGroupForOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActionsRemoveSelfHostedRunnerFromGroupForOrgEndpointOps[Self <: ParametersActionsRemoveSelfHostedRunnerFromGroupForOrgEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ActionsRemoveSelfHostedRunnerFromGroupForOrgEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActionsRemoveSelfHostedRunnerFromGroupForOrgRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
