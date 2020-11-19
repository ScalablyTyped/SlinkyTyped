package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ActionsReRunWorkflowEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ActionsReRunWorkflowRequestOptions
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActionsReRunWorkflowEndpoint extends js.Object {
  
  var parameters: ActionsReRunWorkflowEndpoint = js.native
  
  var request: ActionsReRunWorkflowRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersActionsReRunWorkflowEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActionsReRunWorkflowEndpoint,
    request: ActionsReRunWorkflowRequestOptions,
    response: OctokitResponse[_]
  ): ParametersActionsReRunWorkflowEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsReRunWorkflowEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActionsReRunWorkflowEndpointOps[Self <: ParametersActionsReRunWorkflowEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ActionsReRunWorkflowEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActionsReRunWorkflowRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
