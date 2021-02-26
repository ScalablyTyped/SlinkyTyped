package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ActionsListWorkflowRunArtifactsEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ActionsListWorkflowRunArtifactsRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ActionsListWorkflowRunArtifactsResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActionsListWorkflowRunArtifactsEndpoint extends StObject {
  
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
  implicit class ParametersActionsListWorkflowRunArtifactsEndpointMutableBuilder[Self <: ParametersActionsListWorkflowRunArtifactsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActionsListWorkflowRunArtifactsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActionsListWorkflowRunArtifactsRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsListWorkflowRunArtifactsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
