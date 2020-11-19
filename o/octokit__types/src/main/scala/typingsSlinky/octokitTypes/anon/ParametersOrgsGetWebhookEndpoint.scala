package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.OrgsGetWebhookEndpoint
import typingsSlinky.octokitTypes.endpointsMod.OrgsGetWebhookRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.OrgsGetWebhookResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersOrgsGetWebhookEndpoint extends js.Object {
  
  var parameters: OrgsGetWebhookEndpoint = js.native
  
  var request: OrgsGetWebhookRequestOptions = js.native
  
  var response: OctokitResponse[OrgsGetWebhookResponseData] = js.native
}
object ParametersOrgsGetWebhookEndpoint {
  
  @scala.inline
  def apply(
    parameters: OrgsGetWebhookEndpoint,
    request: OrgsGetWebhookRequestOptions,
    response: OctokitResponse[OrgsGetWebhookResponseData]
  ): ParametersOrgsGetWebhookEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsGetWebhookEndpoint]
  }
  
  @scala.inline
  implicit class ParametersOrgsGetWebhookEndpointOps[Self <: ParametersOrgsGetWebhookEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: OrgsGetWebhookEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: OrgsGetWebhookRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[OrgsGetWebhookResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
