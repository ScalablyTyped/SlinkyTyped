package typingsSlinky.octokitPluginPaginateRest.anon

import typingsSlinky.octokitTypes.endpointsMod.ReactionsListForPullRequestReviewCommentEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReactionsListForPullRequestReviewCommentResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReactionsListForPullRequestReviewCommentEndpoint extends StObject {
  
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
  implicit class ParametersReactionsListForPullRequestReviewCommentEndpointMutableBuilder[Self <: ParametersReactionsListForPullRequestReviewCommentEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReactionsListForPullRequestReviewCommentEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReactionsListForPullRequestReviewCommentResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
