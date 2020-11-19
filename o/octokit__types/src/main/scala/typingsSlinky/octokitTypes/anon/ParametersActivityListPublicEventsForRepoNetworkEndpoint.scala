package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ActivityListPublicEventsForRepoNetworkEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ActivityListPublicEventsForRepoNetworkRequestOptions
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActivityListPublicEventsForRepoNetworkEndpoint extends js.Object {
  
  var parameters: ActivityListPublicEventsForRepoNetworkEndpoint = js.native
  
  var request: ActivityListPublicEventsForRepoNetworkRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersActivityListPublicEventsForRepoNetworkEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActivityListPublicEventsForRepoNetworkEndpoint,
    request: ActivityListPublicEventsForRepoNetworkRequestOptions,
    response: OctokitResponse[_]
  ): ParametersActivityListPublicEventsForRepoNetworkEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActivityListPublicEventsForRepoNetworkEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActivityListPublicEventsForRepoNetworkEndpointOps[Self <: ParametersActivityListPublicEventsForRepoNetworkEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ActivityListPublicEventsForRepoNetworkEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActivityListPublicEventsForRepoNetworkRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
