package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.TeamsUpdateDiscussionLegacyEndpoint
import typingsSlinky.octokitTypes.endpointsMod.TeamsUpdateDiscussionLegacyRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.TeamsUpdateDiscussionLegacyResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersTeamsUpdateDiscussionLegacyEndpoint extends StObject {
  
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
  implicit class ParametersTeamsUpdateDiscussionLegacyEndpointMutableBuilder[Self <: ParametersTeamsUpdateDiscussionLegacyEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: TeamsUpdateDiscussionLegacyEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: TeamsUpdateDiscussionLegacyRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsUpdateDiscussionLegacyResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
