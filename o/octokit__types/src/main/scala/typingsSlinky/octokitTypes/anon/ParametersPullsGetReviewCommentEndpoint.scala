package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.PullsGetReviewCommentEndpoint
import typingsSlinky.octokitTypes.endpointsMod.PullsGetReviewCommentRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.PullsGetReviewCommentResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersPullsGetReviewCommentEndpoint extends js.Object {
  
  var parameters: PullsGetReviewCommentEndpoint = js.native
  
  var request: PullsGetReviewCommentRequestOptions = js.native
  
  var response: OctokitResponse[PullsGetReviewCommentResponseData] = js.native
}
object ParametersPullsGetReviewCommentEndpoint {
  
  @scala.inline
  def apply(
    parameters: PullsGetReviewCommentEndpoint,
    request: PullsGetReviewCommentRequestOptions,
    response: OctokitResponse[PullsGetReviewCommentResponseData]
  ): ParametersPullsGetReviewCommentEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsGetReviewCommentEndpoint]
  }
  
  @scala.inline
  implicit class ParametersPullsGetReviewCommentEndpointOps[Self <: ParametersPullsGetReviewCommentEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: PullsGetReviewCommentEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: PullsGetReviewCommentRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[PullsGetReviewCommentResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
