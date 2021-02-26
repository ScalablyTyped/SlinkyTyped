package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.UsersCheckPersonIsFollowedByAuthenticatedEndpoint
import typingsSlinky.octokitTypes.endpointsMod.UsersCheckPersonIsFollowedByAuthenticatedRequestOptions
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersUsersCheckPersonIsFollowedByAuthenticatedEndpoint extends StObject {
  
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
  implicit class ParametersUsersCheckPersonIsFollowedByAuthenticatedEndpointMutableBuilder[Self <: ParametersUsersCheckPersonIsFollowedByAuthenticatedEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: UsersCheckPersonIsFollowedByAuthenticatedEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: UsersCheckPersonIsFollowedByAuthenticatedRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
