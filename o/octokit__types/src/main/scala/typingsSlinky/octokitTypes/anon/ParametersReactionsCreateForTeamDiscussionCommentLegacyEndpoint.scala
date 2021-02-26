package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ReactionsCreateForTeamDiscussionCommentLegacyEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReactionsCreateForTeamDiscussionCommentLegacyRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ReactionsCreateForTeamDiscussionCommentLegacyResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReactionsCreateForTeamDiscussionCommentLegacyEndpoint extends StObject {
  
  var parameters: ReactionsCreateForTeamDiscussionCommentLegacyEndpoint = js.native
  
  var request: ReactionsCreateForTeamDiscussionCommentLegacyRequestOptions = js.native
  
  var response: OctokitResponse[ReactionsCreateForTeamDiscussionCommentLegacyResponseData] = js.native
}
object ParametersReactionsCreateForTeamDiscussionCommentLegacyEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReactionsCreateForTeamDiscussionCommentLegacyEndpoint,
    request: ReactionsCreateForTeamDiscussionCommentLegacyRequestOptions,
    response: OctokitResponse[ReactionsCreateForTeamDiscussionCommentLegacyResponseData]
  ): ParametersReactionsCreateForTeamDiscussionCommentLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReactionsCreateForTeamDiscussionCommentLegacyEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReactionsCreateForTeamDiscussionCommentLegacyEndpointMutableBuilder[Self <: ParametersReactionsCreateForTeamDiscussionCommentLegacyEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReactionsCreateForTeamDiscussionCommentLegacyEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReactionsCreateForTeamDiscussionCommentLegacyRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReactionsCreateForTeamDiscussionCommentLegacyResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
