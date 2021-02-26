package typingsSlinky.octokitPluginPaginateRest.anon

import typingsSlinky.octokitTypes.endpointsMod.UsersListFollowedByAuthenticatedEndpoint
import typingsSlinky.octokitTypes.endpointsMod.UsersListFollowedByAuthenticatedResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersUsersListFollowedByAuthenticatedEndpoint extends StObject {
  
  var parameters: UsersListFollowedByAuthenticatedEndpoint = js.native
  
  var response: OctokitResponse[UsersListFollowedByAuthenticatedResponseData] = js.native
}
object ParametersUsersListFollowedByAuthenticatedEndpoint {
  
  @scala.inline
  def apply(
    parameters: UsersListFollowedByAuthenticatedEndpoint,
    response: OctokitResponse[UsersListFollowedByAuthenticatedResponseData]
  ): ParametersUsersListFollowedByAuthenticatedEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersListFollowedByAuthenticatedEndpoint]
  }
  
  @scala.inline
  implicit class ParametersUsersListFollowedByAuthenticatedEndpointMutableBuilder[Self <: ParametersUsersListFollowedByAuthenticatedEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: UsersListFollowedByAuthenticatedEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[UsersListFollowedByAuthenticatedResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
