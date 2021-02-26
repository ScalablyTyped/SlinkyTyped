package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ActivityListNotificationsForAuthenticatedUserEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ActivityListNotificationsForAuthenticatedUserRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ActivityListNotificationsForAuthenticatedUserResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActivityListNotificationsForAuthenticatedUserEndpoint extends StObject {
  
  var parameters: ActivityListNotificationsForAuthenticatedUserEndpoint = js.native
  
  var request: ActivityListNotificationsForAuthenticatedUserRequestOptions = js.native
  
  var response: OctokitResponse[ActivityListNotificationsForAuthenticatedUserResponseData] = js.native
}
object ParametersActivityListNotificationsForAuthenticatedUserEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActivityListNotificationsForAuthenticatedUserEndpoint,
    request: ActivityListNotificationsForAuthenticatedUserRequestOptions,
    response: OctokitResponse[ActivityListNotificationsForAuthenticatedUserResponseData]
  ): ParametersActivityListNotificationsForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActivityListNotificationsForAuthenticatedUserEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActivityListNotificationsForAuthenticatedUserEndpointMutableBuilder[Self <: ParametersActivityListNotificationsForAuthenticatedUserEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActivityListNotificationsForAuthenticatedUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActivityListNotificationsForAuthenticatedUserRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActivityListNotificationsForAuthenticatedUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
