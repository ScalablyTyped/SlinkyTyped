package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.PullsRemoveRequestedReviewersEndpoint
import typingsSlinky.octokitTypes.endpointsMod.PullsRemoveRequestedReviewersRequestOptions
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersPullsRemoveRequestedReviewersEndpoint extends js.Object {
  
  var parameters: PullsRemoveRequestedReviewersEndpoint = js.native
  
  var request: PullsRemoveRequestedReviewersRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersPullsRemoveRequestedReviewersEndpoint {
  
  @scala.inline
  def apply(
    parameters: PullsRemoveRequestedReviewersEndpoint,
    request: PullsRemoveRequestedReviewersRequestOptions,
    response: OctokitResponse[_]
  ): ParametersPullsRemoveRequestedReviewersEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsRemoveRequestedReviewersEndpoint]
  }
  
  @scala.inline
  implicit class ParametersPullsRemoveRequestedReviewersEndpointOps[Self <: ParametersPullsRemoveRequestedReviewersEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: PullsRemoveRequestedReviewersEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: PullsRemoveRequestedReviewersRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
