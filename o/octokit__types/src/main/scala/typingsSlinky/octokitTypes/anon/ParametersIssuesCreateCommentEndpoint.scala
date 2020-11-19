package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.IssuesCreateCommentEndpoint
import typingsSlinky.octokitTypes.endpointsMod.IssuesCreateCommentRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.IssuesCreateCommentResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersIssuesCreateCommentEndpoint extends js.Object {
  
  var parameters: IssuesCreateCommentEndpoint = js.native
  
  var request: IssuesCreateCommentRequestOptions = js.native
  
  var response: OctokitResponse[IssuesCreateCommentResponseData] = js.native
}
object ParametersIssuesCreateCommentEndpoint {
  
  @scala.inline
  def apply(
    parameters: IssuesCreateCommentEndpoint,
    request: IssuesCreateCommentRequestOptions,
    response: OctokitResponse[IssuesCreateCommentResponseData]
  ): ParametersIssuesCreateCommentEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesCreateCommentEndpoint]
  }
  
  @scala.inline
  implicit class ParametersIssuesCreateCommentEndpointOps[Self <: ParametersIssuesCreateCommentEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: IssuesCreateCommentEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: IssuesCreateCommentRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[IssuesCreateCommentResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
