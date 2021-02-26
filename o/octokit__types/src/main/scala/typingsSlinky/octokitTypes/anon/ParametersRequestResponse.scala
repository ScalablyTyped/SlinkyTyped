package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.AppsRevokeAuthorizationForApplicationEndpoint
import typingsSlinky.octokitTypes.endpointsMod.AppsRevokeAuthorizationForApplicationRequestOptions
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersRequestResponse extends StObject {
  
  var parameters: AppsRevokeAuthorizationForApplicationEndpoint = js.native
  
  var request: AppsRevokeAuthorizationForApplicationRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersRequestResponse {
  
  @scala.inline
  def apply(
    parameters: AppsRevokeAuthorizationForApplicationEndpoint,
    request: AppsRevokeAuthorizationForApplicationRequestOptions,
    response: OctokitResponse[_]
  ): ParametersRequestResponse = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersRequestResponse]
  }
  
  @scala.inline
  implicit class ParametersRequestResponseMutableBuilder[Self <: ParametersRequestResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: AppsRevokeAuthorizationForApplicationEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: AppsRevokeAuthorizationForApplicationRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
