package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.TeamsListDiscussionCommentsLegacyEndpoint
import typingsSlinky.octokitTypes.endpointsMod.TeamsListDiscussionCommentsLegacyRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.TeamsListDiscussionCommentsLegacyResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersTeamsListDiscussionCommentsLegacyEndpoint extends js.Object {
  
  var parameters: TeamsListDiscussionCommentsLegacyEndpoint = js.native
  
  var request: TeamsListDiscussionCommentsLegacyRequestOptions = js.native
  
  var response: OctokitResponse[TeamsListDiscussionCommentsLegacyResponseData] = js.native
}
object ParametersTeamsListDiscussionCommentsLegacyEndpoint {
  
  @scala.inline
  def apply(
    parameters: TeamsListDiscussionCommentsLegacyEndpoint,
    request: TeamsListDiscussionCommentsLegacyRequestOptions,
    response: OctokitResponse[TeamsListDiscussionCommentsLegacyResponseData]
  ): ParametersTeamsListDiscussionCommentsLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsListDiscussionCommentsLegacyEndpoint]
  }
  
  @scala.inline
  implicit class ParametersTeamsListDiscussionCommentsLegacyEndpointOps[Self <: ParametersTeamsListDiscussionCommentsLegacyEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: TeamsListDiscussionCommentsLegacyEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: TeamsListDiscussionCommentsLegacyRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsListDiscussionCommentsLegacyResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
