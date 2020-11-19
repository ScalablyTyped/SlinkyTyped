package typingsSlinky.octokitPluginPaginateRest.anon

import typingsSlinky.octokitTypes.endpointsMod.UsersListFollowersForAuthenticatedUserEndpoint
import typingsSlinky.octokitTypes.endpointsMod.UsersListFollowersForAuthenticatedUserResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersUsersListFollowersForAuthenticatedUserEndpoint extends js.Object {
  
  var parameters: UsersListFollowersForAuthenticatedUserEndpoint = js.native
  
  var response: OctokitResponse[UsersListFollowersForAuthenticatedUserResponseData] = js.native
}
object ParametersUsersListFollowersForAuthenticatedUserEndpoint {
  
  @scala.inline
  def apply(
    parameters: UsersListFollowersForAuthenticatedUserEndpoint,
    response: OctokitResponse[UsersListFollowersForAuthenticatedUserResponseData]
  ): ParametersUsersListFollowersForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersListFollowersForAuthenticatedUserEndpoint]
  }
  
  @scala.inline
  implicit class ParametersUsersListFollowersForAuthenticatedUserEndpointOps[Self <: ParametersUsersListFollowersForAuthenticatedUserEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setParameters(value: UsersListFollowersForAuthenticatedUserEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[UsersListFollowersForAuthenticatedUserResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
