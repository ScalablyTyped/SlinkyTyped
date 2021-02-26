package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ActivityListReposStarredByUserEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ActivityListReposStarredByUserRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ActivityListReposStarredByUserResponse200Data
import typingsSlinky.octokitTypes.endpointsMod.ActivityListReposStarredByUserResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActivityListReposStarredByUserEndpoint extends StObject {
  
  var parameters: ActivityListReposStarredByUserEndpoint = js.native
  
  var request: ActivityListReposStarredByUserRequestOptions = js.native
  
  var response: OctokitResponse[
    ActivityListReposStarredByUserResponseData | ActivityListReposStarredByUserResponse200Data
  ] = js.native
}
object ParametersActivityListReposStarredByUserEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActivityListReposStarredByUserEndpoint,
    request: ActivityListReposStarredByUserRequestOptions,
    response: OctokitResponse[
      ActivityListReposStarredByUserResponseData | ActivityListReposStarredByUserResponse200Data
    ]
  ): ParametersActivityListReposStarredByUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActivityListReposStarredByUserEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActivityListReposStarredByUserEndpointMutableBuilder[Self <: ParametersActivityListReposStarredByUserEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActivityListReposStarredByUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActivityListReposStarredByUserRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(
      value: OctokitResponse[
          ActivityListReposStarredByUserResponseData | ActivityListReposStarredByUserResponse200Data
        ]
    ): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
