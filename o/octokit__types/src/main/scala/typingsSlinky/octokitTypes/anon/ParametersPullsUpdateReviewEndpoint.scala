package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.PullsUpdateReviewEndpoint
import typingsSlinky.octokitTypes.endpointsMod.PullsUpdateReviewRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.PullsUpdateReviewResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersPullsUpdateReviewEndpoint extends StObject {
  
  var parameters: PullsUpdateReviewEndpoint = js.native
  
  var request: PullsUpdateReviewRequestOptions = js.native
  
  var response: OctokitResponse[PullsUpdateReviewResponseData] = js.native
}
object ParametersPullsUpdateReviewEndpoint {
  
  @scala.inline
  def apply(
    parameters: PullsUpdateReviewEndpoint,
    request: PullsUpdateReviewRequestOptions,
    response: OctokitResponse[PullsUpdateReviewResponseData]
  ): ParametersPullsUpdateReviewEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsUpdateReviewEndpoint]
  }
  
  @scala.inline
  implicit class ParametersPullsUpdateReviewEndpointMutableBuilder[Self <: ParametersPullsUpdateReviewEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: PullsUpdateReviewEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: PullsUpdateReviewRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[PullsUpdateReviewResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
