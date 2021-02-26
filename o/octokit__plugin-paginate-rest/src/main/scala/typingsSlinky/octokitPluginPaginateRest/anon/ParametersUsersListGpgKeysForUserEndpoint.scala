package typingsSlinky.octokitPluginPaginateRest.anon

import typingsSlinky.octokitTypes.endpointsMod.UsersListGpgKeysForUserEndpoint
import typingsSlinky.octokitTypes.endpointsMod.UsersListGpgKeysForUserResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersUsersListGpgKeysForUserEndpoint extends StObject {
  
  var parameters: UsersListGpgKeysForUserEndpoint = js.native
  
  var response: OctokitResponse[UsersListGpgKeysForUserResponseData] = js.native
}
object ParametersUsersListGpgKeysForUserEndpoint {
  
  @scala.inline
  def apply(
    parameters: UsersListGpgKeysForUserEndpoint,
    response: OctokitResponse[UsersListGpgKeysForUserResponseData]
  ): ParametersUsersListGpgKeysForUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersListGpgKeysForUserEndpoint]
  }
  
  @scala.inline
  implicit class ParametersUsersListGpgKeysForUserEndpointMutableBuilder[Self <: ParametersUsersListGpgKeysForUserEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: UsersListGpgKeysForUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[UsersListGpgKeysForUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
