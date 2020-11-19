package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.TeamsUpdateDiscussionLegacyEndpoint
import typingsSlinky.octokitTypes.endpointsMod.TeamsUpdateDiscussionLegacyRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.TeamsUpdateDiscussionLegacyResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersTeamsUpdateDiscussionLegacyEndpoint extends js.Object {
  
  var parameters: TeamsUpdateDiscussionLegacyEndpoint = js.native
  
  var request: TeamsUpdateDiscussionLegacyRequestOptions = js.native
  
  var response: OctokitResponse[TeamsUpdateDiscussionLegacyResponseData] = js.native
}
object ParametersTeamsUpdateDiscussionLegacyEndpoint {
  
  @scala.inline
  def apply(
    parameters: TeamsUpdateDiscussionLegacyEndpoint,
    request: TeamsUpdateDiscussionLegacyRequestOptions,
    response: OctokitResponse[TeamsUpdateDiscussionLegacyResponseData]
  ): ParametersTeamsUpdateDiscussionLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsUpdateDiscussionLegacyEndpoint]
  }
  
  @scala.inline
  implicit class ParametersTeamsUpdateDiscussionLegacyEndpointOps[Self <: ParametersTeamsUpdateDiscussionLegacyEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: TeamsUpdateDiscussionLegacyEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: TeamsUpdateDiscussionLegacyRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsUpdateDiscussionLegacyResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
