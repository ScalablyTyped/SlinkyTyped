package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.TeamsUpdateDiscussionCommentInOrgEndpoint
import typingsSlinky.octokitTypes.endpointsMod.TeamsUpdateDiscussionCommentInOrgRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.TeamsUpdateDiscussionCommentInOrgResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersTeamsUpdateDiscussionCommentInOrgEndpoint extends StObject {
  
  var parameters: TeamsUpdateDiscussionCommentInOrgEndpoint = js.native
  
  var request: TeamsUpdateDiscussionCommentInOrgRequestOptions = js.native
  
  var response: OctokitResponse[TeamsUpdateDiscussionCommentInOrgResponseData] = js.native
}
object ParametersTeamsUpdateDiscussionCommentInOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: TeamsUpdateDiscussionCommentInOrgEndpoint,
    request: TeamsUpdateDiscussionCommentInOrgRequestOptions,
    response: OctokitResponse[TeamsUpdateDiscussionCommentInOrgResponseData]
  ): ParametersTeamsUpdateDiscussionCommentInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsUpdateDiscussionCommentInOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersTeamsUpdateDiscussionCommentInOrgEndpointMutableBuilder[Self <: ParametersTeamsUpdateDiscussionCommentInOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: TeamsUpdateDiscussionCommentInOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: TeamsUpdateDiscussionCommentInOrgRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsUpdateDiscussionCommentInOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
