package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.UsersListGpgKeysForAuthenticatedEndpoint
import typingsSlinky.octokitTypes.endpointsMod.UsersListGpgKeysForAuthenticatedRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.UsersListGpgKeysForAuthenticatedResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersUsersListGpgKeysForAuthenticatedEndpoint extends js.Object {
  
  var parameters: UsersListGpgKeysForAuthenticatedEndpoint = js.native
  
  var request: UsersListGpgKeysForAuthenticatedRequestOptions = js.native
  
  var response: OctokitResponse[UsersListGpgKeysForAuthenticatedResponseData] = js.native
}
object ParametersUsersListGpgKeysForAuthenticatedEndpoint {
  
  @scala.inline
  def apply(
    parameters: UsersListGpgKeysForAuthenticatedEndpoint,
    request: UsersListGpgKeysForAuthenticatedRequestOptions,
    response: OctokitResponse[UsersListGpgKeysForAuthenticatedResponseData]
  ): ParametersUsersListGpgKeysForAuthenticatedEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersListGpgKeysForAuthenticatedEndpoint]
  }
  
  @scala.inline
  implicit class ParametersUsersListGpgKeysForAuthenticatedEndpointOps[Self <: ParametersUsersListGpgKeysForAuthenticatedEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: UsersListGpgKeysForAuthenticatedEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: UsersListGpgKeysForAuthenticatedRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[UsersListGpgKeysForAuthenticatedResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
