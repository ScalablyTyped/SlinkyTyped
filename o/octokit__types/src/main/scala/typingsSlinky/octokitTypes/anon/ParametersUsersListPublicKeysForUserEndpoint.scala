package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.UsersListPublicKeysForUserEndpoint
import typingsSlinky.octokitTypes.endpointsMod.UsersListPublicKeysForUserRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.UsersListPublicKeysForUserResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersUsersListPublicKeysForUserEndpoint extends StObject {
  
  var parameters: UsersListPublicKeysForUserEndpoint = js.native
  
  var request: UsersListPublicKeysForUserRequestOptions = js.native
  
  var response: OctokitResponse[UsersListPublicKeysForUserResponseData] = js.native
}
object ParametersUsersListPublicKeysForUserEndpoint {
  
  @scala.inline
  def apply(
    parameters: UsersListPublicKeysForUserEndpoint,
    request: UsersListPublicKeysForUserRequestOptions,
    response: OctokitResponse[UsersListPublicKeysForUserResponseData]
  ): ParametersUsersListPublicKeysForUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersListPublicKeysForUserEndpoint]
  }
  
  @scala.inline
  implicit class ParametersUsersListPublicKeysForUserEndpointMutableBuilder[Self <: ParametersUsersListPublicKeysForUserEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: UsersListPublicKeysForUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: UsersListPublicKeysForUserRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[UsersListPublicKeysForUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
