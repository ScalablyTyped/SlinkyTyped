package typingsSlinky.octokitPluginPaginateRest.anon

import typingsSlinky.octokitTypes.endpointsMod.TeamsListDiscussionsLegacyEndpoint
import typingsSlinky.octokitTypes.endpointsMod.TeamsListDiscussionsLegacyResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersTeamsListDiscussionsLegacyEndpoint extends StObject {
  
  var parameters: TeamsListDiscussionsLegacyEndpoint = js.native
  
  var response: OctokitResponse[TeamsListDiscussionsLegacyResponseData] = js.native
}
object ParametersTeamsListDiscussionsLegacyEndpoint {
  
  @scala.inline
  def apply(
    parameters: TeamsListDiscussionsLegacyEndpoint,
    response: OctokitResponse[TeamsListDiscussionsLegacyResponseData]
  ): ParametersTeamsListDiscussionsLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsListDiscussionsLegacyEndpoint]
  }
  
  @scala.inline
  implicit class ParametersTeamsListDiscussionsLegacyEndpointMutableBuilder[Self <: ParametersTeamsListDiscussionsLegacyEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: TeamsListDiscussionsLegacyEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsListDiscussionsLegacyResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
