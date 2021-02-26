package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.OrgsDeleteWebhookEndpoint
import typingsSlinky.octokitTypes.endpointsMod.OrgsDeleteWebhookRequestOptions
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersOrgsDeleteWebhookEndpoint extends StObject {
  
  var parameters: OrgsDeleteWebhookEndpoint = js.native
  
  var request: OrgsDeleteWebhookRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersOrgsDeleteWebhookEndpoint {
  
  @scala.inline
  def apply(
    parameters: OrgsDeleteWebhookEndpoint,
    request: OrgsDeleteWebhookRequestOptions,
    response: OctokitResponse[_]
  ): ParametersOrgsDeleteWebhookEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsDeleteWebhookEndpoint]
  }
  
  @scala.inline
  implicit class ParametersOrgsDeleteWebhookEndpointMutableBuilder[Self <: ParametersOrgsDeleteWebhookEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: OrgsDeleteWebhookEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: OrgsDeleteWebhookRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
