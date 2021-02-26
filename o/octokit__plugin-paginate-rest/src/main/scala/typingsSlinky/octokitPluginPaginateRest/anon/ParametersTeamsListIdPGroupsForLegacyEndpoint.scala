package typingsSlinky.octokitPluginPaginateRest.anon

import typingsSlinky.octokitTypes.endpointsMod.TeamsListIdPGroupsForLegacyEndpoint
import typingsSlinky.octokitTypes.endpointsMod.TeamsListIdPGroupsForLegacyResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersTeamsListIdPGroupsForLegacyEndpoint extends StObject {
  
  var parameters: TeamsListIdPGroupsForLegacyEndpoint = js.native
  
  var response: OctokitResponse[TeamsListIdPGroupsForLegacyResponseData] with `7` = js.native
}
object ParametersTeamsListIdPGroupsForLegacyEndpoint {
  
  @scala.inline
  def apply(
    parameters: TeamsListIdPGroupsForLegacyEndpoint,
    response: OctokitResponse[TeamsListIdPGroupsForLegacyResponseData] with `7`
  ): ParametersTeamsListIdPGroupsForLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsListIdPGroupsForLegacyEndpoint]
  }
  
  @scala.inline
  implicit class ParametersTeamsListIdPGroupsForLegacyEndpointMutableBuilder[Self <: ParametersTeamsListIdPGroupsForLegacyEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: TeamsListIdPGroupsForLegacyEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsListIdPGroupsForLegacyResponseData] with `7`): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
