package typingsSlinky.octokitPluginPaginateRest.anon

import typingsSlinky.octokitTypes.endpointsMod.TeamsListChildLegacyEndpoint
import typingsSlinky.octokitTypes.endpointsMod.TeamsListChildLegacyResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersTeamsListChildLegacyEndpoint extends StObject {
  
  var parameters: TeamsListChildLegacyEndpoint = js.native
  
  var response: OctokitResponse[TeamsListChildLegacyResponseData] = js.native
}
object ParametersTeamsListChildLegacyEndpoint {
  
  @scala.inline
  def apply(
    parameters: TeamsListChildLegacyEndpoint,
    response: OctokitResponse[TeamsListChildLegacyResponseData]
  ): ParametersTeamsListChildLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsListChildLegacyEndpoint]
  }
  
  @scala.inline
  implicit class ParametersTeamsListChildLegacyEndpointMutableBuilder[Self <: ParametersTeamsListChildLegacyEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: TeamsListChildLegacyEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsListChildLegacyResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
