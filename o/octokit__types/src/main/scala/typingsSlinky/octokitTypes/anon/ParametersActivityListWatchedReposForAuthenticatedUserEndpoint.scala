package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ActivityListWatchedReposForAuthenticatedUserEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ActivityListWatchedReposForAuthenticatedUserRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ActivityListWatchedReposForAuthenticatedUserResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActivityListWatchedReposForAuthenticatedUserEndpoint extends StObject {
  
  var parameters: ActivityListWatchedReposForAuthenticatedUserEndpoint = js.native
  
  var request: ActivityListWatchedReposForAuthenticatedUserRequestOptions = js.native
  
  var response: OctokitResponse[ActivityListWatchedReposForAuthenticatedUserResponseData] = js.native
}
object ParametersActivityListWatchedReposForAuthenticatedUserEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActivityListWatchedReposForAuthenticatedUserEndpoint,
    request: ActivityListWatchedReposForAuthenticatedUserRequestOptions,
    response: OctokitResponse[ActivityListWatchedReposForAuthenticatedUserResponseData]
  ): ParametersActivityListWatchedReposForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActivityListWatchedReposForAuthenticatedUserEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActivityListWatchedReposForAuthenticatedUserEndpointMutableBuilder[Self <: ParametersActivityListWatchedReposForAuthenticatedUserEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActivityListWatchedReposForAuthenticatedUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActivityListWatchedReposForAuthenticatedUserRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActivityListWatchedReposForAuthenticatedUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
