package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.SearchIssuesAndPullRequestsEndpoint
import typingsSlinky.octokitTypes.endpointsMod.SearchIssuesAndPullRequestsRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.SearchIssuesAndPullRequestsResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersSearchIssuesAndPullRequestsEndpoint extends StObject {
  
  var parameters: SearchIssuesAndPullRequestsEndpoint = js.native
  
  var request: SearchIssuesAndPullRequestsRequestOptions = js.native
  
  var response: OctokitResponse[SearchIssuesAndPullRequestsResponseData] = js.native
}
object ParametersSearchIssuesAndPullRequestsEndpoint {
  
  @scala.inline
  def apply(
    parameters: SearchIssuesAndPullRequestsEndpoint,
    request: SearchIssuesAndPullRequestsRequestOptions,
    response: OctokitResponse[SearchIssuesAndPullRequestsResponseData]
  ): ParametersSearchIssuesAndPullRequestsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersSearchIssuesAndPullRequestsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersSearchIssuesAndPullRequestsEndpointMutableBuilder[Self <: ParametersSearchIssuesAndPullRequestsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: SearchIssuesAndPullRequestsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: SearchIssuesAndPullRequestsRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[SearchIssuesAndPullRequestsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
