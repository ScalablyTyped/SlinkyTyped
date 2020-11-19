package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.OrgsUpdateWebhookEndpoint
import typingsSlinky.octokitTypes.endpointsMod.OrgsUpdateWebhookRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.OrgsUpdateWebhookResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersOrgsUpdateWebhookEndpoint extends js.Object {
  
  var parameters: OrgsUpdateWebhookEndpoint = js.native
  
  var request: OrgsUpdateWebhookRequestOptions = js.native
  
  var response: OctokitResponse[OrgsUpdateWebhookResponseData] = js.native
}
object ParametersOrgsUpdateWebhookEndpoint {
  
  @scala.inline
  def apply(
    parameters: OrgsUpdateWebhookEndpoint,
    request: OrgsUpdateWebhookRequestOptions,
    response: OctokitResponse[OrgsUpdateWebhookResponseData]
  ): ParametersOrgsUpdateWebhookEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsUpdateWebhookEndpoint]
  }
  
  @scala.inline
  implicit class ParametersOrgsUpdateWebhookEndpointOps[Self <: ParametersOrgsUpdateWebhookEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: OrgsUpdateWebhookEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: OrgsUpdateWebhookRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[OrgsUpdateWebhookResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
