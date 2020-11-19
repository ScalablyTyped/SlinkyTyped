package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.UsersListPublicKeysForUserEndpoint
import typingsSlinky.octokitTypes.endpointsMod.UsersListPublicKeysForUserRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.UsersListPublicKeysForUserResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersUsersListPublicKeysForUserEndpoint extends js.Object {
  
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
  implicit class ParametersUsersListPublicKeysForUserEndpointOps[Self <: ParametersUsersListPublicKeysForUserEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: UsersListPublicKeysForUserEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: UsersListPublicKeysForUserRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[UsersListPublicKeysForUserResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
