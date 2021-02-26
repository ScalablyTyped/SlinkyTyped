package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.UsersListEmailsForAuthenticatedEndpoint
import typingsSlinky.octokitTypes.endpointsMod.UsersListEmailsForAuthenticatedRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.UsersListEmailsForAuthenticatedResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersUsersListEmailsForAuthenticatedEndpoint extends StObject {
  
  var parameters: UsersListEmailsForAuthenticatedEndpoint = js.native
  
  var request: UsersListEmailsForAuthenticatedRequestOptions = js.native
  
  var response: OctokitResponse[UsersListEmailsForAuthenticatedResponseData] = js.native
}
object ParametersUsersListEmailsForAuthenticatedEndpoint {
  
  @scala.inline
  def apply(
    parameters: UsersListEmailsForAuthenticatedEndpoint,
    request: UsersListEmailsForAuthenticatedRequestOptions,
    response: OctokitResponse[UsersListEmailsForAuthenticatedResponseData]
  ): ParametersUsersListEmailsForAuthenticatedEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersListEmailsForAuthenticatedEndpoint]
  }
  
  @scala.inline
  implicit class ParametersUsersListEmailsForAuthenticatedEndpointMutableBuilder[Self <: ParametersUsersListEmailsForAuthenticatedEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: UsersListEmailsForAuthenticatedEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: UsersListEmailsForAuthenticatedRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[UsersListEmailsForAuthenticatedResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
