package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.PullsListCommentsForReviewEndpoint
import typingsSlinky.octokitTypes.endpointsMod.PullsListCommentsForReviewRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.PullsListCommentsForReviewResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersPullsListCommentsForReviewEndpoint extends StObject {
  
  var parameters: PullsListCommentsForReviewEndpoint = js.native
  
  var request: PullsListCommentsForReviewRequestOptions = js.native
  
  var response: OctokitResponse[PullsListCommentsForReviewResponseData] = js.native
}
object ParametersPullsListCommentsForReviewEndpoint {
  
  @scala.inline
  def apply(
    parameters: PullsListCommentsForReviewEndpoint,
    request: PullsListCommentsForReviewRequestOptions,
    response: OctokitResponse[PullsListCommentsForReviewResponseData]
  ): ParametersPullsListCommentsForReviewEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsListCommentsForReviewEndpoint]
  }
  
  @scala.inline
  implicit class ParametersPullsListCommentsForReviewEndpointMutableBuilder[Self <: ParametersPullsListCommentsForReviewEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: PullsListCommentsForReviewEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: PullsListCommentsForReviewRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[PullsListCommentsForReviewResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
