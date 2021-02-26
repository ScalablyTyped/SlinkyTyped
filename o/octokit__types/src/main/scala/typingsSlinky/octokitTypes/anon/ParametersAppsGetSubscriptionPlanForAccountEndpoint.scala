package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.AppsGetSubscriptionPlanForAccountEndpoint
import typingsSlinky.octokitTypes.endpointsMod.AppsGetSubscriptionPlanForAccountRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.AppsGetSubscriptionPlanForAccountResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersAppsGetSubscriptionPlanForAccountEndpoint extends StObject {
  
  var parameters: AppsGetSubscriptionPlanForAccountEndpoint = js.native
  
  var request: AppsGetSubscriptionPlanForAccountRequestOptions = js.native
  
  var response: OctokitResponse[AppsGetSubscriptionPlanForAccountResponseData] = js.native
}
object ParametersAppsGetSubscriptionPlanForAccountEndpoint {
  
  @scala.inline
  def apply(
    parameters: AppsGetSubscriptionPlanForAccountEndpoint,
    request: AppsGetSubscriptionPlanForAccountRequestOptions,
    response: OctokitResponse[AppsGetSubscriptionPlanForAccountResponseData]
  ): ParametersAppsGetSubscriptionPlanForAccountEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersAppsGetSubscriptionPlanForAccountEndpoint]
  }
  
  @scala.inline
  implicit class ParametersAppsGetSubscriptionPlanForAccountEndpointMutableBuilder[Self <: ParametersAppsGetSubscriptionPlanForAccountEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: AppsGetSubscriptionPlanForAccountEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: AppsGetSubscriptionPlanForAccountRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[AppsGetSubscriptionPlanForAccountResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
