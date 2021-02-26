package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.PullsDismissReviewEndpoint
import typingsSlinky.octokitTypes.endpointsMod.PullsDismissReviewRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.PullsDismissReviewResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersPullsDismissReviewEndpoint extends StObject {
  
  var parameters: PullsDismissReviewEndpoint = js.native
  
  var request: PullsDismissReviewRequestOptions = js.native
  
  var response: OctokitResponse[PullsDismissReviewResponseData] = js.native
}
object ParametersPullsDismissReviewEndpoint {
  
  @scala.inline
  def apply(
    parameters: PullsDismissReviewEndpoint,
    request: PullsDismissReviewRequestOptions,
    response: OctokitResponse[PullsDismissReviewResponseData]
  ): ParametersPullsDismissReviewEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsDismissReviewEndpoint]
  }
  
  @scala.inline
  implicit class ParametersPullsDismissReviewEndpointMutableBuilder[Self <: ParametersPullsDismissReviewEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: PullsDismissReviewEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: PullsDismissReviewRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[PullsDismissReviewResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
