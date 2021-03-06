package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.UsersCheckFollowingForUserEndpoint
import typingsSlinky.octokitTypes.endpointsMod.UsersCheckFollowingForUserRequestOptions
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersUsersCheckFollowingForUserEndpoint extends StObject {
  
  var parameters: UsersCheckFollowingForUserEndpoint = js.native
  
  var request: UsersCheckFollowingForUserRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersUsersCheckFollowingForUserEndpoint {
  
  @scala.inline
  def apply(
    parameters: UsersCheckFollowingForUserEndpoint,
    request: UsersCheckFollowingForUserRequestOptions,
    response: OctokitResponse[_]
  ): ParametersUsersCheckFollowingForUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersCheckFollowingForUserEndpoint]
  }
  
  @scala.inline
  implicit class ParametersUsersCheckFollowingForUserEndpointMutableBuilder[Self <: ParametersUsersCheckFollowingForUserEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: UsersCheckFollowingForUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: UsersCheckFollowingForUserRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
