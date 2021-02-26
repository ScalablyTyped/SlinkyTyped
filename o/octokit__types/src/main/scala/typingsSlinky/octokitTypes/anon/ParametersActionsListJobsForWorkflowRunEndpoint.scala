package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ActionsListJobsForWorkflowRunEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ActionsListJobsForWorkflowRunRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ActionsListJobsForWorkflowRunResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActionsListJobsForWorkflowRunEndpoint extends StObject {
  
  var parameters: ActionsListJobsForWorkflowRunEndpoint = js.native
  
  var request: ActionsListJobsForWorkflowRunRequestOptions = js.native
  
  var response: OctokitResponse[ActionsListJobsForWorkflowRunResponseData] = js.native
}
object ParametersActionsListJobsForWorkflowRunEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActionsListJobsForWorkflowRunEndpoint,
    request: ActionsListJobsForWorkflowRunRequestOptions,
    response: OctokitResponse[ActionsListJobsForWorkflowRunResponseData]
  ): ParametersActionsListJobsForWorkflowRunEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsListJobsForWorkflowRunEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActionsListJobsForWorkflowRunEndpointMutableBuilder[Self <: ParametersActionsListJobsForWorkflowRunEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActionsListJobsForWorkflowRunEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActionsListJobsForWorkflowRunRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsListJobsForWorkflowRunResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
