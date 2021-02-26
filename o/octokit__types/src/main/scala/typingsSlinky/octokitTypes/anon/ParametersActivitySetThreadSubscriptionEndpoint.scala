package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ActivitySetThreadSubscriptionEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ActivitySetThreadSubscriptionRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ActivitySetThreadSubscriptionResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActivitySetThreadSubscriptionEndpoint extends StObject {
  
  var parameters: ActivitySetThreadSubscriptionEndpoint = js.native
  
  var request: ActivitySetThreadSubscriptionRequestOptions = js.native
  
  var response: OctokitResponse[ActivitySetThreadSubscriptionResponseData] = js.native
}
object ParametersActivitySetThreadSubscriptionEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActivitySetThreadSubscriptionEndpoint,
    request: ActivitySetThreadSubscriptionRequestOptions,
    response: OctokitResponse[ActivitySetThreadSubscriptionResponseData]
  ): ParametersActivitySetThreadSubscriptionEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActivitySetThreadSubscriptionEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActivitySetThreadSubscriptionEndpointMutableBuilder[Self <: ParametersActivitySetThreadSubscriptionEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActivitySetThreadSubscriptionEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActivitySetThreadSubscriptionRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActivitySetThreadSubscriptionResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
