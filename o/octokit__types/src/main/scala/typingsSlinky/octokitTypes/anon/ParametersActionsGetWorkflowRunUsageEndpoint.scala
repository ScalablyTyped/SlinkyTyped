package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ActionsGetWorkflowRunUsageEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ActionsGetWorkflowRunUsageRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ActionsGetWorkflowRunUsageResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActionsGetWorkflowRunUsageEndpoint extends js.Object {
  
  var parameters: ActionsGetWorkflowRunUsageEndpoint = js.native
  
  var request: ActionsGetWorkflowRunUsageRequestOptions = js.native
  
  var response: OctokitResponse[ActionsGetWorkflowRunUsageResponseData] = js.native
}
object ParametersActionsGetWorkflowRunUsageEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActionsGetWorkflowRunUsageEndpoint,
    request: ActionsGetWorkflowRunUsageRequestOptions,
    response: OctokitResponse[ActionsGetWorkflowRunUsageResponseData]
  ): ParametersActionsGetWorkflowRunUsageEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsGetWorkflowRunUsageEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActionsGetWorkflowRunUsageEndpointOps[Self <: ParametersActionsGetWorkflowRunUsageEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ActionsGetWorkflowRunUsageEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActionsGetWorkflowRunUsageRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsGetWorkflowRunUsageResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
