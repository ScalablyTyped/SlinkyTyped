package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ActionsListWorkflowRunArtifactsEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ActionsListWorkflowRunArtifactsRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ActionsListWorkflowRunArtifactsResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActionsListWorkflowRunArtifactsEndpoint extends js.Object {
  
  var parameters: ActionsListWorkflowRunArtifactsEndpoint = js.native
  
  var request: ActionsListWorkflowRunArtifactsRequestOptions = js.native
  
  var response: OctokitResponse[ActionsListWorkflowRunArtifactsResponseData] = js.native
}
object ParametersActionsListWorkflowRunArtifactsEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActionsListWorkflowRunArtifactsEndpoint,
    request: ActionsListWorkflowRunArtifactsRequestOptions,
    response: OctokitResponse[ActionsListWorkflowRunArtifactsResponseData]
  ): ParametersActionsListWorkflowRunArtifactsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsListWorkflowRunArtifactsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActionsListWorkflowRunArtifactsEndpointOps[Self <: ParametersActionsListWorkflowRunArtifactsEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ActionsListWorkflowRunArtifactsEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActionsListWorkflowRunArtifactsRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsListWorkflowRunArtifactsResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
