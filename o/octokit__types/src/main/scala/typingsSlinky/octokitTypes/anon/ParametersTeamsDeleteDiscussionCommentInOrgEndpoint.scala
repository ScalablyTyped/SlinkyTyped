package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.TeamsDeleteDiscussionCommentInOrgEndpoint
import typingsSlinky.octokitTypes.endpointsMod.TeamsDeleteDiscussionCommentInOrgRequestOptions
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersTeamsDeleteDiscussionCommentInOrgEndpoint extends StObject {
  
  var parameters: TeamsDeleteDiscussionCommentInOrgEndpoint = js.native
  
  var request: TeamsDeleteDiscussionCommentInOrgRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersTeamsDeleteDiscussionCommentInOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: TeamsDeleteDiscussionCommentInOrgEndpoint,
    request: TeamsDeleteDiscussionCommentInOrgRequestOptions,
    response: OctokitResponse[_]
  ): ParametersTeamsDeleteDiscussionCommentInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsDeleteDiscussionCommentInOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersTeamsDeleteDiscussionCommentInOrgEndpointMutableBuilder[Self <: ParametersTeamsDeleteDiscussionCommentInOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: TeamsDeleteDiscussionCommentInOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: TeamsDeleteDiscussionCommentInOrgRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
