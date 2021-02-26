package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.UsersUpdateAuthenticatedEndpoint
import typingsSlinky.octokitTypes.endpointsMod.UsersUpdateAuthenticatedRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.UsersUpdateAuthenticatedResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersUsersUpdateAuthenticatedEndpoint extends StObject {
  
  var parameters: UsersUpdateAuthenticatedEndpoint = js.native
  
  var request: UsersUpdateAuthenticatedRequestOptions = js.native
  
  var response: OctokitResponse[UsersUpdateAuthenticatedResponseData] = js.native
}
object ParametersUsersUpdateAuthenticatedEndpoint {
  
  @scala.inline
  def apply(
    parameters: UsersUpdateAuthenticatedEndpoint,
    request: UsersUpdateAuthenticatedRequestOptions,
    response: OctokitResponse[UsersUpdateAuthenticatedResponseData]
  ): ParametersUsersUpdateAuthenticatedEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersUpdateAuthenticatedEndpoint]
  }
  
  @scala.inline
  implicit class ParametersUsersUpdateAuthenticatedEndpointMutableBuilder[Self <: ParametersUsersUpdateAuthenticatedEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: UsersUpdateAuthenticatedEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: UsersUpdateAuthenticatedRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[UsersUpdateAuthenticatedResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
