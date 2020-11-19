package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ActionsListWorkflowRunsForRepoEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ActionsListWorkflowRunsForRepoRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ActionsListWorkflowRunsForRepoResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActionsListWorkflowRunsForRepoEndpoint extends js.Object {
  
  var parameters: ActionsListWorkflowRunsForRepoEndpoint = js.native
  
  var request: ActionsListWorkflowRunsForRepoRequestOptions = js.native
  
  var response: OctokitResponse[ActionsListWorkflowRunsForRepoResponseData] = js.native
}
object ParametersActionsListWorkflowRunsForRepoEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActionsListWorkflowRunsForRepoEndpoint,
    request: ActionsListWorkflowRunsForRepoRequestOptions,
    response: OctokitResponse[ActionsListWorkflowRunsForRepoResponseData]
  ): ParametersActionsListWorkflowRunsForRepoEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsListWorkflowRunsForRepoEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActionsListWorkflowRunsForRepoEndpointOps[Self <: ParametersActionsListWorkflowRunsForRepoEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ActionsListWorkflowRunsForRepoEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActionsListWorkflowRunsForRepoRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsListWorkflowRunsForRepoResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
