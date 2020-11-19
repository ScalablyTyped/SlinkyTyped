package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.IssuesListEventsEndpoint
import typingsSlinky.octokitTypes.endpointsMod.IssuesListEventsRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.IssuesListEventsResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersIssuesListEventsEndpoint extends js.Object {
  
  var parameters: IssuesListEventsEndpoint = js.native
  
  var request: IssuesListEventsRequestOptions = js.native
  
  var response: OctokitResponse[IssuesListEventsResponseData] = js.native
}
object ParametersIssuesListEventsEndpoint {
  
  @scala.inline
  def apply(
    parameters: IssuesListEventsEndpoint,
    request: IssuesListEventsRequestOptions,
    response: OctokitResponse[IssuesListEventsResponseData]
  ): ParametersIssuesListEventsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesListEventsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersIssuesListEventsEndpointOps[Self <: ParametersIssuesListEventsEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: IssuesListEventsEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: IssuesListEventsRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[IssuesListEventsResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
