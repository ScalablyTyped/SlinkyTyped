package typingsSlinky.octokitPluginPaginateRest.anon

import typingsSlinky.octokitTypes.endpointsMod.ReactionsListForPullRequestReviewCommentEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReactionsListForPullRequestReviewCommentResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReactionsListForPullRequestReviewCommentEndpoint extends js.Object {
  
  var parameters: ReactionsListForPullRequestReviewCommentEndpoint = js.native
  
  var response: OctokitResponse[ReactionsListForPullRequestReviewCommentResponseData] = js.native
}
object ParametersReactionsListForPullRequestReviewCommentEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReactionsListForPullRequestReviewCommentEndpoint,
    response: OctokitResponse[ReactionsListForPullRequestReviewCommentResponseData]
  ): ParametersReactionsListForPullRequestReviewCommentEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReactionsListForPullRequestReviewCommentEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReactionsListForPullRequestReviewCommentEndpointOps[Self <: ParametersReactionsListForPullRequestReviewCommentEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ReactionsListForPullRequestReviewCommentEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReactionsListForPullRequestReviewCommentResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
