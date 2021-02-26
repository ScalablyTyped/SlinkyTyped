package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.TeamsCreateDiscussionCommentInOrgEndpoint
import typingsSlinky.octokitTypes.endpointsMod.TeamsCreateDiscussionCommentInOrgRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.TeamsCreateDiscussionCommentInOrgResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersTeamsCreateDiscussionCommentInOrgEndpoint extends StObject {
  
  var parameters: TeamsCreateDiscussionCommentInOrgEndpoint = js.native
  
  var request: TeamsCreateDiscussionCommentInOrgRequestOptions = js.native
  
  var response: OctokitResponse[TeamsCreateDiscussionCommentInOrgResponseData] = js.native
}
object ParametersTeamsCreateDiscussionCommentInOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: TeamsCreateDiscussionCommentInOrgEndpoint,
    request: TeamsCreateDiscussionCommentInOrgRequestOptions,
    response: OctokitResponse[TeamsCreateDiscussionCommentInOrgResponseData]
  ): ParametersTeamsCreateDiscussionCommentInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsCreateDiscussionCommentInOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersTeamsCreateDiscussionCommentInOrgEndpointMutableBuilder[Self <: ParametersTeamsCreateDiscussionCommentInOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: TeamsCreateDiscussionCommentInOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: TeamsCreateDiscussionCommentInOrgRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsCreateDiscussionCommentInOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
