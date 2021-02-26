package typingsSlinky.octokitPluginPaginateRest.anon

import typingsSlinky.octokitTypes.endpointsMod.ActivityListReposStarredByAuthenticatedUserEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ActivityListReposStarredByAuthenticatedUserResponse200Data
import typingsSlinky.octokitTypes.endpointsMod.ActivityListReposStarredByAuthenticatedUserResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActivityListReposStarredByAuthenticatedUserEndpoint extends StObject {
  
  var parameters: ActivityListReposStarredByAuthenticatedUserEndpoint = js.native
  
  var response: OctokitResponse[
    ActivityListReposStarredByAuthenticatedUserResponseData | ActivityListReposStarredByAuthenticatedUserResponse200Data
  ] = js.native
}
object ParametersActivityListReposStarredByAuthenticatedUserEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActivityListReposStarredByAuthenticatedUserEndpoint,
    response: OctokitResponse[
      ActivityListReposStarredByAuthenticatedUserResponseData | ActivityListReposStarredByAuthenticatedUserResponse200Data
    ]
  ): ParametersActivityListReposStarredByAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActivityListReposStarredByAuthenticatedUserEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActivityListReposStarredByAuthenticatedUserEndpointMutableBuilder[Self <: ParametersActivityListReposStarredByAuthenticatedUserEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActivityListReposStarredByAuthenticatedUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(
      value: OctokitResponse[
          ActivityListReposStarredByAuthenticatedUserResponseData | ActivityListReposStarredByAuthenticatedUserResponse200Data
        ]
    ): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
