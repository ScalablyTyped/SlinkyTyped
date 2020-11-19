package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ActionsDownloadWorkflowRunLogsEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ActionsDownloadWorkflowRunLogsRequestOptions
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActionsDownloadWorkflowRunLogsEndpoint extends js.Object {
  
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
  implicit class ParametersActionsDownloadWorkflowRunLogsEndpointOps[Self <: ParametersActionsDownloadWorkflowRunLogsEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ActionsDownloadWorkflowRunLogsEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActionsDownloadWorkflowRunLogsRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
