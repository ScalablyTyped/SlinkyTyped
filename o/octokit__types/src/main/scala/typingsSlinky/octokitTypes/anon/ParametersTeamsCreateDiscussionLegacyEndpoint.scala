package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.TeamsCreateDiscussionLegacyEndpoint
import typingsSlinky.octokitTypes.endpointsMod.TeamsCreateDiscussionLegacyRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.TeamsCreateDiscussionLegacyResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersTeamsCreateDiscussionLegacyEndpoint extends StObject {
  
  var parameters: TeamsCreateDiscussionLegacyEndpoint = js.native
  
  var request: TeamsCreateDiscussionLegacyRequestOptions = js.native
  
  var response: OctokitResponse[TeamsCreateDiscussionLegacyResponseData] = js.native
}
object ParametersTeamsCreateDiscussionLegacyEndpoint {
  
  @scala.inline
  def apply(
    parameters: TeamsCreateDiscussionLegacyEndpoint,
    request: TeamsCreateDiscussionLegacyRequestOptions,
    response: OctokitResponse[TeamsCreateDiscussionLegacyResponseData]
  ): ParametersTeamsCreateDiscussionLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsCreateDiscussionLegacyEndpoint]
  }
  
  @scala.inline
  implicit class ParametersTeamsCreateDiscussionLegacyEndpointMutableBuilder[Self <: ParametersTeamsCreateDiscussionLegacyEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: TeamsCreateDiscussionLegacyEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: TeamsCreateDiscussionLegacyRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsCreateDiscussionLegacyResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
