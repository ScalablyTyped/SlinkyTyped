package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.IssuesUpdateEndpoint
import typingsSlinky.octokitTypes.endpointsMod.IssuesUpdateRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.IssuesUpdateResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersIssuesUpdateEndpoint extends js.Object {
  
  var parameters: IssuesUpdateEndpoint = js.native
  
  var request: IssuesUpdateRequestOptions = js.native
  
  var response: OctokitResponse[IssuesUpdateResponseData] = js.native
}
object ParametersIssuesUpdateEndpoint {
  
  @scala.inline
  def apply(
    parameters: IssuesUpdateEndpoint,
    request: IssuesUpdateRequestOptions,
    response: OctokitResponse[IssuesUpdateResponseData]
  ): ParametersIssuesUpdateEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesUpdateEndpoint]
  }
  
  @scala.inline
  implicit class ParametersIssuesUpdateEndpointOps[Self <: ParametersIssuesUpdateEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: IssuesUpdateEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: IssuesUpdateRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[IssuesUpdateResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
