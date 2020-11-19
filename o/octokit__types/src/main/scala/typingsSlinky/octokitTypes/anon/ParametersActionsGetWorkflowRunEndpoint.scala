package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ActionsGetWorkflowRunEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ActionsGetWorkflowRunRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ActionsGetWorkflowRunResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActionsGetWorkflowRunEndpoint extends js.Object {
  
  var parameters: ActionsGetWorkflowRunEndpoint = js.native
  
  var request: ActionsGetWorkflowRunRequestOptions = js.native
  
  var response: OctokitResponse[ActionsGetWorkflowRunResponseData] = js.native
}
object ParametersActionsGetWorkflowRunEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActionsGetWorkflowRunEndpoint,
    request: ActionsGetWorkflowRunRequestOptions,
    response: OctokitResponse[ActionsGetWorkflowRunResponseData]
  ): ParametersActionsGetWorkflowRunEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsGetWorkflowRunEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActionsGetWorkflowRunEndpointOps[Self <: ParametersActionsGetWorkflowRunEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ActionsGetWorkflowRunEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActionsGetWorkflowRunRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsGetWorkflowRunResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
