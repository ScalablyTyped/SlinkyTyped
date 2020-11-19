package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.UsersUnfollowEndpoint
import typingsSlinky.octokitTypes.endpointsMod.UsersUnfollowRequestOptions
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersUsersUnfollowEndpoint extends js.Object {
  
  var parameters: UsersUnfollowEndpoint = js.native
  
  var request: UsersUnfollowRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersUsersUnfollowEndpoint {
  
  @scala.inline
  def apply(
    parameters: UsersUnfollowEndpoint,
    request: UsersUnfollowRequestOptions,
    response: OctokitResponse[_]
  ): ParametersUsersUnfollowEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersUnfollowEndpoint]
  }
  
  @scala.inline
  implicit class ParametersUsersUnfollowEndpointOps[Self <: ParametersUsersUnfollowEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: UsersUnfollowEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: UsersUnfollowRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
