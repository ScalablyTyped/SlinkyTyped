package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.UsersCheckPersonIsFollowedByAuthenticatedEndpoint
import typingsSlinky.octokitTypes.endpointsMod.UsersCheckPersonIsFollowedByAuthenticatedRequestOptions
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersUsersCheckPersonIsFollowedByAuthenticatedEndpoint extends js.Object {
  
  var parameters: UsersCheckPersonIsFollowedByAuthenticatedEndpoint = js.native
  
  var request: UsersCheckPersonIsFollowedByAuthenticatedRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersUsersCheckPersonIsFollowedByAuthenticatedEndpoint {
  
  @scala.inline
  def apply(
    parameters: UsersCheckPersonIsFollowedByAuthenticatedEndpoint,
    request: UsersCheckPersonIsFollowedByAuthenticatedRequestOptions,
    response: OctokitResponse[_]
  ): ParametersUsersCheckPersonIsFollowedByAuthenticatedEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersCheckPersonIsFollowedByAuthenticatedEndpoint]
  }
  
  @scala.inline
  implicit class ParametersUsersCheckPersonIsFollowedByAuthenticatedEndpointOps[Self <: ParametersUsersCheckPersonIsFollowedByAuthenticatedEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: UsersCheckPersonIsFollowedByAuthenticatedEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: UsersCheckPersonIsFollowedByAuthenticatedRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
