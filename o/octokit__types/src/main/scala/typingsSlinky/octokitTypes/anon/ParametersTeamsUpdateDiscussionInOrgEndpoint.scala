package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.TeamsUpdateDiscussionInOrgEndpoint
import typingsSlinky.octokitTypes.endpointsMod.TeamsUpdateDiscussionInOrgRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.TeamsUpdateDiscussionInOrgResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersTeamsUpdateDiscussionInOrgEndpoint extends StObject {
  
  var parameters: TeamsUpdateDiscussionInOrgEndpoint = js.native
  
  var request: TeamsUpdateDiscussionInOrgRequestOptions = js.native
  
  var response: OctokitResponse[TeamsUpdateDiscussionInOrgResponseData] = js.native
}
object ParametersTeamsUpdateDiscussionInOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: TeamsUpdateDiscussionInOrgEndpoint,
    request: TeamsUpdateDiscussionInOrgRequestOptions,
    response: OctokitResponse[TeamsUpdateDiscussionInOrgResponseData]
  ): ParametersTeamsUpdateDiscussionInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsUpdateDiscussionInOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersTeamsUpdateDiscussionInOrgEndpointMutableBuilder[Self <: ParametersTeamsUpdateDiscussionInOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: TeamsUpdateDiscussionInOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: TeamsUpdateDiscussionInOrgRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsUpdateDiscussionInOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
