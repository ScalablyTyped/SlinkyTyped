package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.AppsListSubscriptionsForAuthenticatedUserStubbedEndpoint
import typingsSlinky.octokitTypes.endpointsMod.AppsListSubscriptionsForAuthenticatedUserStubbedRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.AppsListSubscriptionsForAuthenticatedUserStubbedResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersAppsListSubscriptionsForAuthenticatedUserStubbedEndpoint extends StObject {
  
  var parameters: AppsListSubscriptionsForAuthenticatedUserStubbedEndpoint = js.native
  
  var request: AppsListSubscriptionsForAuthenticatedUserStubbedRequestOptions = js.native
  
  var response: OctokitResponse[AppsListSubscriptionsForAuthenticatedUserStubbedResponseData] = js.native
}
object ParametersAppsListSubscriptionsForAuthenticatedUserStubbedEndpoint {
  
  @scala.inline
  def apply(
    parameters: AppsListSubscriptionsForAuthenticatedUserStubbedEndpoint,
    request: AppsListSubscriptionsForAuthenticatedUserStubbedRequestOptions,
    response: OctokitResponse[AppsListSubscriptionsForAuthenticatedUserStubbedResponseData]
  ): ParametersAppsListSubscriptionsForAuthenticatedUserStubbedEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersAppsListSubscriptionsForAuthenticatedUserStubbedEndpoint]
  }
  
  @scala.inline
  implicit class ParametersAppsListSubscriptionsForAuthenticatedUserStubbedEndpointMutableBuilder[Self <: ParametersAppsListSubscriptionsForAuthenticatedUserStubbedEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: AppsListSubscriptionsForAuthenticatedUserStubbedEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: AppsListSubscriptionsForAuthenticatedUserStubbedRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[AppsListSubscriptionsForAuthenticatedUserStubbedResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
