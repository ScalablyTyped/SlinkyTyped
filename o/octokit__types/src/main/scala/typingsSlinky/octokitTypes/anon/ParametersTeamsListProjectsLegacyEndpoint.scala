package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.TeamsListProjectsLegacyEndpoint
import typingsSlinky.octokitTypes.endpointsMod.TeamsListProjectsLegacyRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.TeamsListProjectsLegacyResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersTeamsListProjectsLegacyEndpoint extends js.Object {
  
  var parameters: TeamsListProjectsLegacyEndpoint = js.native
  
  var request: TeamsListProjectsLegacyRequestOptions = js.native
  
  var response: OctokitResponse[TeamsListProjectsLegacyResponseData] = js.native
}
object ParametersTeamsListProjectsLegacyEndpoint {
  
  @scala.inline
  def apply(
    parameters: TeamsListProjectsLegacyEndpoint,
    request: TeamsListProjectsLegacyRequestOptions,
    response: OctokitResponse[TeamsListProjectsLegacyResponseData]
  ): ParametersTeamsListProjectsLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsListProjectsLegacyEndpoint]
  }
  
  @scala.inline
  implicit class ParametersTeamsListProjectsLegacyEndpointOps[Self <: ParametersTeamsListProjectsLegacyEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: TeamsListProjectsLegacyEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: TeamsListProjectsLegacyRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsListProjectsLegacyResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
