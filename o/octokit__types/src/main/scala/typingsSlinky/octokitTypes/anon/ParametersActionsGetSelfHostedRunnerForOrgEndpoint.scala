package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ActionsGetSelfHostedRunnerForOrgEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ActionsGetSelfHostedRunnerForOrgRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ActionsGetSelfHostedRunnerForOrgResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActionsGetSelfHostedRunnerForOrgEndpoint extends js.Object {
  
  var parameters: ActionsGetSelfHostedRunnerForOrgEndpoint = js.native
  
  var request: ActionsGetSelfHostedRunnerForOrgRequestOptions = js.native
  
  var response: OctokitResponse[ActionsGetSelfHostedRunnerForOrgResponseData] = js.native
}
object ParametersActionsGetSelfHostedRunnerForOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActionsGetSelfHostedRunnerForOrgEndpoint,
    request: ActionsGetSelfHostedRunnerForOrgRequestOptions,
    response: OctokitResponse[ActionsGetSelfHostedRunnerForOrgResponseData]
  ): ParametersActionsGetSelfHostedRunnerForOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsGetSelfHostedRunnerForOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActionsGetSelfHostedRunnerForOrgEndpointOps[Self <: ParametersActionsGetSelfHostedRunnerForOrgEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ActionsGetSelfHostedRunnerForOrgEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActionsGetSelfHostedRunnerForOrgRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsGetSelfHostedRunnerForOrgResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
