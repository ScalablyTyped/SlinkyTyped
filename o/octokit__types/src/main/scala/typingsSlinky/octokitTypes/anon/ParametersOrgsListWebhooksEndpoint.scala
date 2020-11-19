package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.OrgsListWebhooksEndpoint
import typingsSlinky.octokitTypes.endpointsMod.OrgsListWebhooksRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.OrgsListWebhooksResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersOrgsListWebhooksEndpoint extends js.Object {
  
  var parameters: OrgsListWebhooksEndpoint = js.native
  
  var request: OrgsListWebhooksRequestOptions = js.native
  
  var response: OctokitResponse[OrgsListWebhooksResponseData] = js.native
}
object ParametersOrgsListWebhooksEndpoint {
  
  @scala.inline
  def apply(
    parameters: OrgsListWebhooksEndpoint,
    request: OrgsListWebhooksRequestOptions,
    response: OctokitResponse[OrgsListWebhooksResponseData]
  ): ParametersOrgsListWebhooksEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsListWebhooksEndpoint]
  }
  
  @scala.inline
  implicit class ParametersOrgsListWebhooksEndpointOps[Self <: ParametersOrgsListWebhooksEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: OrgsListWebhooksEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: OrgsListWebhooksRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[OrgsListWebhooksResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
