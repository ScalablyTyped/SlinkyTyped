package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.AppsListSubscriptionsForAuthenticatedUserEndpoint
import typingsSlinky.octokitTypes.endpointsMod.AppsListSubscriptionsForAuthenticatedUserRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.AppsListSubscriptionsForAuthenticatedUserResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersAppsListSubscriptionsForAuthenticatedUserEndpoint extends StObject {
  
  var parameters: AppsListSubscriptionsForAuthenticatedUserEndpoint = js.native
  
  var request: AppsListSubscriptionsForAuthenticatedUserRequestOptions = js.native
  
  var response: OctokitResponse[AppsListSubscriptionsForAuthenticatedUserResponseData] = js.native
}
object ParametersAppsListSubscriptionsForAuthenticatedUserEndpoint {
  
  @scala.inline
  def apply(
    parameters: AppsListSubscriptionsForAuthenticatedUserEndpoint,
    request: AppsListSubscriptionsForAuthenticatedUserRequestOptions,
    response: OctokitResponse[AppsListSubscriptionsForAuthenticatedUserResponseData]
  ): ParametersAppsListSubscriptionsForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersAppsListSubscriptionsForAuthenticatedUserEndpoint]
  }
  
  @scala.inline
  implicit class ParametersAppsListSubscriptionsForAuthenticatedUserEndpointMutableBuilder[Self <: ParametersAppsListSubscriptionsForAuthenticatedUserEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: AppsListSubscriptionsForAuthenticatedUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: AppsListSubscriptionsForAuthenticatedUserRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[AppsListSubscriptionsForAuthenticatedUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
