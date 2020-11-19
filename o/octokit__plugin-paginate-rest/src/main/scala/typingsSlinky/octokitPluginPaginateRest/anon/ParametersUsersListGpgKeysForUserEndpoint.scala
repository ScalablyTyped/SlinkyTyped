package typingsSlinky.octokitPluginPaginateRest.anon

import typingsSlinky.octokitTypes.endpointsMod.UsersListGpgKeysForUserEndpoint
import typingsSlinky.octokitTypes.endpointsMod.UsersListGpgKeysForUserResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersUsersListGpgKeysForUserEndpoint extends js.Object {
  
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
  implicit class ParametersUsersListGpgKeysForUserEndpointOps[Self <: ParametersUsersListGpgKeysForUserEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: UsersListGpgKeysForUserEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[UsersListGpgKeysForUserResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
