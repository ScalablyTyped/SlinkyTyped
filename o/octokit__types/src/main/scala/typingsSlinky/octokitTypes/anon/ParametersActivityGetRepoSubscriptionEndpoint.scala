package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ActivityGetRepoSubscriptionEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ActivityGetRepoSubscriptionRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ActivityGetRepoSubscriptionResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActivityGetRepoSubscriptionEndpoint extends StObject {
  
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
  implicit class ParametersActivityGetRepoSubscriptionEndpointMutableBuilder[Self <: ParametersActivityGetRepoSubscriptionEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActivityGetRepoSubscriptionEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActivityGetRepoSubscriptionRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActivityGetRepoSubscriptionResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
