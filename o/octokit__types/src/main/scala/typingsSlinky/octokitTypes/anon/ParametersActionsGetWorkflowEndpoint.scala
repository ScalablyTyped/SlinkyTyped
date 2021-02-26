package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ActionsGetWorkflowEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ActionsGetWorkflowRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ActionsGetWorkflowResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActionsGetWorkflowEndpoint extends StObject {
  
  var parameters: ActionsGetWorkflowEndpoint = js.native
  
  var request: ActionsGetWorkflowRequestOptions = js.native
  
  var response: OctokitResponse[ActionsGetWorkflowResponseData] = js.native
}
object ParametersActionsGetWorkflowEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActionsGetWorkflowEndpoint,
    request: ActionsGetWorkflowRequestOptions,
    response: OctokitResponse[ActionsGetWorkflowResponseData]
  ): ParametersActionsGetWorkflowEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsGetWorkflowEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActionsGetWorkflowEndpointMutableBuilder[Self <: ParametersActionsGetWorkflowEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActionsGetWorkflowEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActionsGetWorkflowRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsGetWorkflowResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
