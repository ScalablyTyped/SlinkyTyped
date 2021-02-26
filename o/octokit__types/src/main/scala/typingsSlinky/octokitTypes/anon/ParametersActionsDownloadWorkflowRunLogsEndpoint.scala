package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ActionsDownloadWorkflowRunLogsEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ActionsDownloadWorkflowRunLogsRequestOptions
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActionsDownloadWorkflowRunLogsEndpoint extends StObject {
  
  var parameters: ActionsDownloadWorkflowRunLogsEndpoint = js.native
  
  var request: ActionsDownloadWorkflowRunLogsRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersActionsDownloadWorkflowRunLogsEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActionsDownloadWorkflowRunLogsEndpoint,
    request: ActionsDownloadWorkflowRunLogsRequestOptions,
    response: OctokitResponse[_]
  ): ParametersActionsDownloadWorkflowRunLogsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsDownloadWorkflowRunLogsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActionsDownloadWorkflowRunLogsEndpointMutableBuilder[Self <: ParametersActionsDownloadWorkflowRunLogsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActionsDownloadWorkflowRunLogsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActionsDownloadWorkflowRunLogsRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
