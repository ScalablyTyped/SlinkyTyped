package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.PullsDismissReviewEndpoint
import typingsSlinky.octokitTypes.endpointsMod.PullsDismissReviewRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.PullsDismissReviewResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersPullsDismissReviewEndpoint extends js.Object {
  
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
  implicit class ParametersPullsDismissReviewEndpointOps[Self <: ParametersPullsDismissReviewEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: PullsDismissReviewEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: PullsDismissReviewRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[PullsDismissReviewResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
