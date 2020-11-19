package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.TeamsCreateDiscussionCommentLegacyEndpoint
import typingsSlinky.octokitTypes.endpointsMod.TeamsCreateDiscussionCommentLegacyRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.TeamsCreateDiscussionCommentLegacyResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersTeamsCreateDiscussionCommentLegacyEndpoint extends js.Object {
  
  var parameters: TeamsCreateDiscussionCommentLegacyEndpoint = js.native
  
  var request: TeamsCreateDiscussionCommentLegacyRequestOptions = js.native
  
  var response: OctokitResponse[TeamsCreateDiscussionCommentLegacyResponseData] = js.native
}
object ParametersTeamsCreateDiscussionCommentLegacyEndpoint {
  
  @scala.inline
  def apply(
    parameters: TeamsCreateDiscussionCommentLegacyEndpoint,
    request: TeamsCreateDiscussionCommentLegacyRequestOptions,
    response: OctokitResponse[TeamsCreateDiscussionCommentLegacyResponseData]
  ): ParametersTeamsCreateDiscussionCommentLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsCreateDiscussionCommentLegacyEndpoint]
  }
  
  @scala.inline
  implicit class ParametersTeamsCreateDiscussionCommentLegacyEndpointOps[Self <: ParametersTeamsCreateDiscussionCommentLegacyEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setParameters(value: TeamsCreateDiscussionCommentLegacyEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: TeamsCreateDiscussionCommentLegacyRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsCreateDiscussionCommentLegacyResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
