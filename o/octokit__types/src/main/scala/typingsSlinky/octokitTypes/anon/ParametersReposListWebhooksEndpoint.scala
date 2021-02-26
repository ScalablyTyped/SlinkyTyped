package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ReposListWebhooksEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposListWebhooksRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ReposListWebhooksResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposListWebhooksEndpoint extends StObject {
  
  var parameters: ReposListWebhooksEndpoint = js.native
  
  var request: ReposListWebhooksRequestOptions = js.native
  
  var response: OctokitResponse[ReposListWebhooksResponseData] = js.native
}
object ParametersReposListWebhooksEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposListWebhooksEndpoint,
    request: ReposListWebhooksRequestOptions,
    response: OctokitResponse[ReposListWebhooksResponseData]
  ): ParametersReposListWebhooksEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListWebhooksEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposListWebhooksEndpointMutableBuilder[Self <: ParametersReposListWebhooksEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposListWebhooksEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposListWebhooksRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposListWebhooksResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
