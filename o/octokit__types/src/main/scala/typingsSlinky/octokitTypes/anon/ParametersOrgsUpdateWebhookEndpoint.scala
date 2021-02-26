package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.OrgsUpdateWebhookEndpoint
import typingsSlinky.octokitTypes.endpointsMod.OrgsUpdateWebhookRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.OrgsUpdateWebhookResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersOrgsUpdateWebhookEndpoint extends StObject {
  
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
  implicit class ParametersOrgsUpdateWebhookEndpointMutableBuilder[Self <: ParametersOrgsUpdateWebhookEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: OrgsUpdateWebhookEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: OrgsUpdateWebhookRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[OrgsUpdateWebhookResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
