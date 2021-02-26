package typingsSlinky.octokitPluginPaginateRest.anon

import typingsSlinky.octokitTypes.endpointsMod.TeamsListMembersLegacyEndpoint
import typingsSlinky.octokitTypes.endpointsMod.TeamsListMembersLegacyResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersTeamsListMembersLegacyEndpoint extends StObject {
  
  var parameters: TeamsListMembersLegacyEndpoint = js.native
  
  var response: OctokitResponse[TeamsListMembersLegacyResponseData] = js.native
}
object ParametersTeamsListMembersLegacyEndpoint {
  
  @scala.inline
  def apply(
    parameters: TeamsListMembersLegacyEndpoint,
    response: OctokitResponse[TeamsListMembersLegacyResponseData]
  ): ParametersTeamsListMembersLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsListMembersLegacyEndpoint]
  }
  
  @scala.inline
  implicit class ParametersTeamsListMembersLegacyEndpointMutableBuilder[Self <: ParametersTeamsListMembersLegacyEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: TeamsListMembersLegacyEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsListMembersLegacyResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
