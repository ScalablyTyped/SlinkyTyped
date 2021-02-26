package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ReactionsListForTeamDiscussionInOrgEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReactionsListForTeamDiscussionInOrgRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ReactionsListForTeamDiscussionInOrgResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReactionsListForTeamDiscussionInOrgEndpoint extends StObject {
  
  var parameters: ReactionsListForTeamDiscussionInOrgEndpoint = js.native
  
  var request: ReactionsListForTeamDiscussionInOrgRequestOptions = js.native
  
  var response: OctokitResponse[ReactionsListForTeamDiscussionInOrgResponseData] = js.native
}
object ParametersReactionsListForTeamDiscussionInOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReactionsListForTeamDiscussionInOrgEndpoint,
    request: ReactionsListForTeamDiscussionInOrgRequestOptions,
    response: OctokitResponse[ReactionsListForTeamDiscussionInOrgResponseData]
  ): ParametersReactionsListForTeamDiscussionInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReactionsListForTeamDiscussionInOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReactionsListForTeamDiscussionInOrgEndpointMutableBuilder[Self <: ParametersReactionsListForTeamDiscussionInOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReactionsListForTeamDiscussionInOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReactionsListForTeamDiscussionInOrgRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReactionsListForTeamDiscussionInOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
