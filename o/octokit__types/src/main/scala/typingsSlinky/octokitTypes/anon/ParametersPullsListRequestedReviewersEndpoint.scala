package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.PullsListRequestedReviewersEndpoint
import typingsSlinky.octokitTypes.endpointsMod.PullsListRequestedReviewersRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.PullsListRequestedReviewersResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersPullsListRequestedReviewersEndpoint extends StObject {
  
  var parameters: PullsListRequestedReviewersEndpoint = js.native
  
  var request: PullsListRequestedReviewersRequestOptions = js.native
  
  var response: OctokitResponse[PullsListRequestedReviewersResponseData] = js.native
}
object ParametersPullsListRequestedReviewersEndpoint {
  
  @scala.inline
  def apply(
    parameters: PullsListRequestedReviewersEndpoint,
    request: PullsListRequestedReviewersRequestOptions,
    response: OctokitResponse[PullsListRequestedReviewersResponseData]
  ): ParametersPullsListRequestedReviewersEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsListRequestedReviewersEndpoint]
  }
  
  @scala.inline
  implicit class ParametersPullsListRequestedReviewersEndpointMutableBuilder[Self <: ParametersPullsListRequestedReviewersEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: PullsListRequestedReviewersEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: PullsListRequestedReviewersRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[PullsListRequestedReviewersResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
