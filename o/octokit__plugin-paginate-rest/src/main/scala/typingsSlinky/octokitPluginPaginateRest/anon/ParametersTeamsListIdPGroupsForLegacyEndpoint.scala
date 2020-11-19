package typingsSlinky.octokitPluginPaginateRest.anon

import typingsSlinky.octokitTypes.endpointsMod.TeamsListIdPGroupsForLegacyEndpoint
import typingsSlinky.octokitTypes.endpointsMod.TeamsListIdPGroupsForLegacyResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersTeamsListIdPGroupsForLegacyEndpoint extends js.Object {
  
  var parameters: TeamsListIdPGroupsForLegacyEndpoint = js.native
  
  var response: OctokitResponse[TeamsListIdPGroupsForLegacyResponseData] with `3` = js.native
}
object ParametersTeamsListIdPGroupsForLegacyEndpoint {
  
  @scala.inline
  def apply(
    parameters: TeamsListIdPGroupsForLegacyEndpoint,
    response: OctokitResponse[TeamsListIdPGroupsForLegacyResponseData] with `3`
  ): ParametersTeamsListIdPGroupsForLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsListIdPGroupsForLegacyEndpoint]
  }
  
  @scala.inline
  implicit class ParametersTeamsListIdPGroupsForLegacyEndpointOps[Self <: ParametersTeamsListIdPGroupsForLegacyEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: TeamsListIdPGroupsForLegacyEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsListIdPGroupsForLegacyResponseData] with `3`): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
