package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ActivityGetRepoSubscriptionEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ActivityGetRepoSubscriptionRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ActivityGetRepoSubscriptionResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActivityGetRepoSubscriptionEndpoint extends js.Object {
  
  var parameters: ActivityGetRepoSubscriptionEndpoint = js.native
  
  var request: ActivityGetRepoSubscriptionRequestOptions = js.native
  
  var response: OctokitResponse[ActivityGetRepoSubscriptionResponseData] = js.native
}
object ParametersActivityGetRepoSubscriptionEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActivityGetRepoSubscriptionEndpoint,
    request: ActivityGetRepoSubscriptionRequestOptions,
    response: OctokitResponse[ActivityGetRepoSubscriptionResponseData]
  ): ParametersActivityGetRepoSubscriptionEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActivityGetRepoSubscriptionEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActivityGetRepoSubscriptionEndpointOps[Self <: ParametersActivityGetRepoSubscriptionEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ActivityGetRepoSubscriptionEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActivityGetRepoSubscriptionRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActivityGetRepoSubscriptionResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
