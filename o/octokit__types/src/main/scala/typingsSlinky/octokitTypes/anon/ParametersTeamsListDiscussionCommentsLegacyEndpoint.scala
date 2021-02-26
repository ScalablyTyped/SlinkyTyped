package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.TeamsListDiscussionCommentsLegacyEndpoint
import typingsSlinky.octokitTypes.endpointsMod.TeamsListDiscussionCommentsLegacyRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.TeamsListDiscussionCommentsLegacyResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersTeamsListDiscussionCommentsLegacyEndpoint extends StObject {
  
  var parameters: TeamsListDiscussionCommentsLegacyEndpoint = js.native
  
  var request: TeamsListDiscussionCommentsLegacyRequestOptions = js.native
  
  var response: OctokitResponse[TeamsListDiscussionCommentsLegacyResponseData] = js.native
}
object ParametersTeamsListDiscussionCommentsLegacyEndpoint {
  
  @scala.inline
  def apply(
    parameters: TeamsListDiscussionCommentsLegacyEndpoint,
    request: TeamsListDiscussionCommentsLegacyRequestOptions,
    response: OctokitResponse[TeamsListDiscussionCommentsLegacyResponseData]
  ): ParametersTeamsListDiscussionCommentsLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsListDiscussionCommentsLegacyEndpoint]
  }
  
  @scala.inline
  implicit class ParametersTeamsListDiscussionCommentsLegacyEndpointMutableBuilder[Self <: ParametersTeamsListDiscussionCommentsLegacyEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: TeamsListDiscussionCommentsLegacyEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: TeamsListDiscussionCommentsLegacyRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsListDiscussionCommentsLegacyResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
