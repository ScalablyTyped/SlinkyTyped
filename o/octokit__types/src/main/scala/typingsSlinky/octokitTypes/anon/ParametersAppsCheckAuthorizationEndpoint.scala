package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.AppsCheckAuthorizationEndpoint
import typingsSlinky.octokitTypes.endpointsMod.AppsCheckAuthorizationRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.AppsCheckAuthorizationResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersAppsCheckAuthorizationEndpoint extends StObject {
  
  var parameters: AppsCheckAuthorizationEndpoint = js.native
  
  var request: AppsCheckAuthorizationRequestOptions = js.native
  
  var response: OctokitResponse[AppsCheckAuthorizationResponseData] = js.native
}
object ParametersAppsCheckAuthorizationEndpoint {
  
  @scala.inline
  def apply(
    parameters: AppsCheckAuthorizationEndpoint,
    request: AppsCheckAuthorizationRequestOptions,
    response: OctokitResponse[AppsCheckAuthorizationResponseData]
  ): ParametersAppsCheckAuthorizationEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersAppsCheckAuthorizationEndpoint]
  }
  
  @scala.inline
  implicit class ParametersAppsCheckAuthorizationEndpointMutableBuilder[Self <: ParametersAppsCheckAuthorizationEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: AppsCheckAuthorizationEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: AppsCheckAuthorizationRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[AppsCheckAuthorizationResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
