package typingsSlinky.octokitPluginPaginateRest.anon

import typingsSlinky.octokitTypes.endpointsMod.UsersListBlockedByAuthenticatedEndpoint
import typingsSlinky.octokitTypes.endpointsMod.UsersListBlockedByAuthenticatedResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersUsersListBlockedByAuthenticatedEndpoint extends StObject {
  
  var parameters: UsersListBlockedByAuthenticatedEndpoint = js.native
  
  var response: OctokitResponse[UsersListBlockedByAuthenticatedResponseData] = js.native
}
object ParametersUsersListBlockedByAuthenticatedEndpoint {
  
  @scala.inline
  def apply(
    parameters: UsersListBlockedByAuthenticatedEndpoint,
    response: OctokitResponse[UsersListBlockedByAuthenticatedResponseData]
  ): ParametersUsersListBlockedByAuthenticatedEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersListBlockedByAuthenticatedEndpoint]
  }
  
  @scala.inline
  implicit class ParametersUsersListBlockedByAuthenticatedEndpointMutableBuilder[Self <: ParametersUsersListBlockedByAuthenticatedEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: UsersListBlockedByAuthenticatedEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[UsersListBlockedByAuthenticatedResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
