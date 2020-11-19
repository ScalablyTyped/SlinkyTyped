package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.PullsCreateReviewCommentEndpoint
import typingsSlinky.octokitTypes.endpointsMod.PullsCreateReviewCommentRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.PullsCreateReviewCommentResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersPullsCreateReviewCommentEndpoint extends js.Object {
  
  var parameters: PullsCreateReviewCommentEndpoint = js.native
  
  var request: PullsCreateReviewCommentRequestOptions = js.native
  
  var response: OctokitResponse[PullsCreateReviewCommentResponseData] = js.native
}
object ParametersPullsCreateReviewCommentEndpoint {
  
  @scala.inline
  def apply(
    parameters: PullsCreateReviewCommentEndpoint,
    request: PullsCreateReviewCommentRequestOptions,
    response: OctokitResponse[PullsCreateReviewCommentResponseData]
  ): ParametersPullsCreateReviewCommentEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsCreateReviewCommentEndpoint]
  }
  
  @scala.inline
  implicit class ParametersPullsCreateReviewCommentEndpointOps[Self <: ParametersPullsCreateReviewCommentEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: PullsCreateReviewCommentEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: PullsCreateReviewCommentRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[PullsCreateReviewCommentResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
