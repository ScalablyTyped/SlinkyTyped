package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.TeamsUpdateDiscussionCommentLegacyEndpoint
import typingsSlinky.octokitTypes.endpointsMod.TeamsUpdateDiscussionCommentLegacyRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.TeamsUpdateDiscussionCommentLegacyResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersTeamsUpdateDiscussionCommentLegacyEndpoint extends js.Object {
  
  var parameters: TeamsUpdateDiscussionCommentLegacyEndpoint = js.native
  
  var request: TeamsUpdateDiscussionCommentLegacyRequestOptions = js.native
  
  var response: OctokitResponse[TeamsUpdateDiscussionCommentLegacyResponseData] = js.native
}
object ParametersTeamsUpdateDiscussionCommentLegacyEndpoint {
  
  @scala.inline
  def apply(
    parameters: TeamsUpdateDiscussionCommentLegacyEndpoint,
    request: TeamsUpdateDiscussionCommentLegacyRequestOptions,
    response: OctokitResponse[TeamsUpdateDiscussionCommentLegacyResponseData]
  ): ParametersTeamsUpdateDiscussionCommentLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsUpdateDiscussionCommentLegacyEndpoint]
  }
  
  @scala.inline
  implicit class ParametersTeamsUpdateDiscussionCommentLegacyEndpointOps[Self <: ParametersTeamsUpdateDiscussionCommentLegacyEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: TeamsUpdateDiscussionCommentLegacyEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: TeamsUpdateDiscussionCommentLegacyRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsUpdateDiscussionCommentLegacyResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
