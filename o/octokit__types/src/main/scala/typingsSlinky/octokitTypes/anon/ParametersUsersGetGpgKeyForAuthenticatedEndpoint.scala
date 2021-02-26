package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.UsersGetGpgKeyForAuthenticatedEndpoint
import typingsSlinky.octokitTypes.endpointsMod.UsersGetGpgKeyForAuthenticatedRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.UsersGetGpgKeyForAuthenticatedResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersUsersGetGpgKeyForAuthenticatedEndpoint extends StObject {
  
  var parameters: UsersGetGpgKeyForAuthenticatedEndpoint = js.native
  
  var request: UsersGetGpgKeyForAuthenticatedRequestOptions = js.native
  
  var response: OctokitResponse[UsersGetGpgKeyForAuthenticatedResponseData] = js.native
}
object ParametersUsersGetGpgKeyForAuthenticatedEndpoint {
  
  @scala.inline
  def apply(
    parameters: UsersGetGpgKeyForAuthenticatedEndpoint,
    request: UsersGetGpgKeyForAuthenticatedRequestOptions,
    response: OctokitResponse[UsersGetGpgKeyForAuthenticatedResponseData]
  ): ParametersUsersGetGpgKeyForAuthenticatedEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersGetGpgKeyForAuthenticatedEndpoint]
  }
  
  @scala.inline
  implicit class ParametersUsersGetGpgKeyForAuthenticatedEndpointMutableBuilder[Self <: ParametersUsersGetGpgKeyForAuthenticatedEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: UsersGetGpgKeyForAuthenticatedEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: UsersGetGpgKeyForAuthenticatedRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[UsersGetGpgKeyForAuthenticatedResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
