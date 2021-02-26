package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ActivityListReposWatchedByUserEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ActivityListReposWatchedByUserRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ActivityListReposWatchedByUserResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActivityListReposWatchedByUserEndpoint extends StObject {
  
  var parameters: ActivityListReposWatchedByUserEndpoint = js.native
  
  var request: ActivityListReposWatchedByUserRequestOptions = js.native
  
  var response: OctokitResponse[ActivityListReposWatchedByUserResponseData] = js.native
}
object ParametersActivityListReposWatchedByUserEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActivityListReposWatchedByUserEndpoint,
    request: ActivityListReposWatchedByUserRequestOptions,
    response: OctokitResponse[ActivityListReposWatchedByUserResponseData]
  ): ParametersActivityListReposWatchedByUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActivityListReposWatchedByUserEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActivityListReposWatchedByUserEndpointMutableBuilder[Self <: ParametersActivityListReposWatchedByUserEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActivityListReposWatchedByUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActivityListReposWatchedByUserRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActivityListReposWatchedByUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
