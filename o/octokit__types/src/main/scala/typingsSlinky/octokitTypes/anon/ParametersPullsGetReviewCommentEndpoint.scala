package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.PullsGetReviewCommentEndpoint
import typingsSlinky.octokitTypes.endpointsMod.PullsGetReviewCommentRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.PullsGetReviewCommentResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersPullsGetReviewCommentEndpoint extends StObject {
  
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
  implicit class ParametersPullsGetReviewCommentEndpointMutableBuilder[Self <: ParametersPullsGetReviewCommentEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: PullsGetReviewCommentEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: PullsGetReviewCommentRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[PullsGetReviewCommentResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
