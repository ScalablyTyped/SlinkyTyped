package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.UsersDeletePublicSshKeyForAuthenticatedEndpoint
import typingsSlinky.octokitTypes.endpointsMod.UsersDeletePublicSshKeyForAuthenticatedRequestOptions
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersUsersDeletePublicSshKeyForAuthenticatedEndpoint extends StObject {
  
  var parameters: UsersDeletePublicSshKeyForAuthenticatedEndpoint = js.native
  
  var request: UsersDeletePublicSshKeyForAuthenticatedRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersUsersDeletePublicSshKeyForAuthenticatedEndpoint {
  
  @scala.inline
  def apply(
    parameters: UsersDeletePublicSshKeyForAuthenticatedEndpoint,
    request: UsersDeletePublicSshKeyForAuthenticatedRequestOptions,
    response: OctokitResponse[_]
  ): ParametersUsersDeletePublicSshKeyForAuthenticatedEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersDeletePublicSshKeyForAuthenticatedEndpoint]
  }
  
  @scala.inline
  implicit class ParametersUsersDeletePublicSshKeyForAuthenticatedEndpointMutableBuilder[Self <: ParametersUsersDeletePublicSshKeyForAuthenticatedEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: UsersDeletePublicSshKeyForAuthenticatedEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: UsersDeletePublicSshKeyForAuthenticatedRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
