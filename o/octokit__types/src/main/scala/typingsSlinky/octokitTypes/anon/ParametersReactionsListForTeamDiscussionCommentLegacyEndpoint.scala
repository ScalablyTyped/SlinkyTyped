package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ReactionsListForTeamDiscussionCommentLegacyEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReactionsListForTeamDiscussionCommentLegacyRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ReactionsListForTeamDiscussionCommentLegacyResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReactionsListForTeamDiscussionCommentLegacyEndpoint extends StObject {
  
  var parameters: ReactionsListForTeamDiscussionCommentLegacyEndpoint = js.native
  
  var request: ReactionsListForTeamDiscussionCommentLegacyRequestOptions = js.native
  
  var response: OctokitResponse[ReactionsListForTeamDiscussionCommentLegacyResponseData] = js.native
}
object ParametersReactionsListForTeamDiscussionCommentLegacyEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReactionsListForTeamDiscussionCommentLegacyEndpoint,
    request: ReactionsListForTeamDiscussionCommentLegacyRequestOptions,
    response: OctokitResponse[ReactionsListForTeamDiscussionCommentLegacyResponseData]
  ): ParametersReactionsListForTeamDiscussionCommentLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReactionsListForTeamDiscussionCommentLegacyEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReactionsListForTeamDiscussionCommentLegacyEndpointMutableBuilder[Self <: ParametersReactionsListForTeamDiscussionCommentLegacyEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReactionsListForTeamDiscussionCommentLegacyEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReactionsListForTeamDiscussionCommentLegacyRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReactionsListForTeamDiscussionCommentLegacyResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
