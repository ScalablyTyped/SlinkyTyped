package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ActivityListStargazersForRepoEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ActivityListStargazersForRepoRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ActivityListStargazersForRepoResponse200Data
import typingsSlinky.octokitTypes.endpointsMod.ActivityListStargazersForRepoResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActivityListStargazersForRepoEndpoint extends StObject {
  
  var parameters: ActivityListStargazersForRepoEndpoint = js.native
  
  var request: ActivityListStargazersForRepoRequestOptions = js.native
  
  var response: OctokitResponse[
    ActivityListStargazersForRepoResponseData | ActivityListStargazersForRepoResponse200Data
  ] = js.native
}
object ParametersActivityListStargazersForRepoEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActivityListStargazersForRepoEndpoint,
    request: ActivityListStargazersForRepoRequestOptions,
    response: OctokitResponse[
      ActivityListStargazersForRepoResponseData | ActivityListStargazersForRepoResponse200Data
    ]
  ): ParametersActivityListStargazersForRepoEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActivityListStargazersForRepoEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActivityListStargazersForRepoEndpointMutableBuilder[Self <: ParametersActivityListStargazersForRepoEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActivityListStargazersForRepoEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActivityListStargazersForRepoRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(
      value: OctokitResponse[
          ActivityListStargazersForRepoResponseData | ActivityListStargazersForRepoResponse200Data
        ]
    ): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
