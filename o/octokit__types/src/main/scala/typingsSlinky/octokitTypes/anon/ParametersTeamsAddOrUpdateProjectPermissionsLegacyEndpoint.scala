package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.TeamsAddOrUpdateProjectPermissionsLegacyEndpoint
import typingsSlinky.octokitTypes.endpointsMod.TeamsAddOrUpdateProjectPermissionsLegacyRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.TeamsAddOrUpdateProjectPermissionsLegacyResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersTeamsAddOrUpdateProjectPermissionsLegacyEndpoint extends js.Object {
  
  var parameters: TeamsAddOrUpdateProjectPermissionsLegacyEndpoint = js.native
  
  var request: TeamsAddOrUpdateProjectPermissionsLegacyRequestOptions = js.native
  
  var response: OctokitResponse[TeamsAddOrUpdateProjectPermissionsLegacyResponseData] = js.native
}
object ParametersTeamsAddOrUpdateProjectPermissionsLegacyEndpoint {
  
  @scala.inline
  def apply(
    parameters: TeamsAddOrUpdateProjectPermissionsLegacyEndpoint,
    request: TeamsAddOrUpdateProjectPermissionsLegacyRequestOptions,
    response: OctokitResponse[TeamsAddOrUpdateProjectPermissionsLegacyResponseData]
  ): ParametersTeamsAddOrUpdateProjectPermissionsLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsAddOrUpdateProjectPermissionsLegacyEndpoint]
  }
  
  @scala.inline
  implicit class ParametersTeamsAddOrUpdateProjectPermissionsLegacyEndpointOps[Self <: ParametersTeamsAddOrUpdateProjectPermissionsLegacyEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: TeamsAddOrUpdateProjectPermissionsLegacyEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: TeamsAddOrUpdateProjectPermissionsLegacyRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsAddOrUpdateProjectPermissionsLegacyResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
