package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.UsersListPublicSshKeysForAuthenticatedEndpoint
import typingsSlinky.octokitTypes.endpointsMod.UsersListPublicSshKeysForAuthenticatedRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.UsersListPublicSshKeysForAuthenticatedResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersUsersListPublicSshKeysForAuthenticatedEndpoint extends StObject {
  
  var parameters: UsersListPublicSshKeysForAuthenticatedEndpoint = js.native
  
  var request: UsersListPublicSshKeysForAuthenticatedRequestOptions = js.native
  
  var response: OctokitResponse[UsersListPublicSshKeysForAuthenticatedResponseData] = js.native
}
object ParametersUsersListPublicSshKeysForAuthenticatedEndpoint {
  
  @scala.inline
  def apply(
    parameters: UsersListPublicSshKeysForAuthenticatedEndpoint,
    request: UsersListPublicSshKeysForAuthenticatedRequestOptions,
    response: OctokitResponse[UsersListPublicSshKeysForAuthenticatedResponseData]
  ): ParametersUsersListPublicSshKeysForAuthenticatedEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersListPublicSshKeysForAuthenticatedEndpoint]
  }
  
  @scala.inline
  implicit class ParametersUsersListPublicSshKeysForAuthenticatedEndpointMutableBuilder[Self <: ParametersUsersListPublicSshKeysForAuthenticatedEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: UsersListPublicSshKeysForAuthenticatedEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: UsersListPublicSshKeysForAuthenticatedRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[UsersListPublicSshKeysForAuthenticatedResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
