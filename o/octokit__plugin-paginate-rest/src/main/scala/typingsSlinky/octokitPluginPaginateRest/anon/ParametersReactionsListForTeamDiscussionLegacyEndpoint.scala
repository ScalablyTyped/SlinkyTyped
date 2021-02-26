package typingsSlinky.octokitPluginPaginateRest.anon

import typingsSlinky.octokitTypes.endpointsMod.ReactionsListForTeamDiscussionLegacyEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReactionsListForTeamDiscussionLegacyResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReactionsListForTeamDiscussionLegacyEndpoint extends StObject {
  
  var parameters: ReactionsListForTeamDiscussionLegacyEndpoint = js.native
  
  var response: OctokitResponse[ReactionsListForTeamDiscussionLegacyResponseData] = js.native
}
object ParametersReactionsListForTeamDiscussionLegacyEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReactionsListForTeamDiscussionLegacyEndpoint,
    response: OctokitResponse[ReactionsListForTeamDiscussionLegacyResponseData]
  ): ParametersReactionsListForTeamDiscussionLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReactionsListForTeamDiscussionLegacyEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReactionsListForTeamDiscussionLegacyEndpointMutableBuilder[Self <: ParametersReactionsListForTeamDiscussionLegacyEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReactionsListForTeamDiscussionLegacyEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReactionsListForTeamDiscussionLegacyResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
