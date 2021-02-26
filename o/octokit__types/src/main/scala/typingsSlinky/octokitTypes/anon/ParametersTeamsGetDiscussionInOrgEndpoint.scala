package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.TeamsGetDiscussionInOrgEndpoint
import typingsSlinky.octokitTypes.endpointsMod.TeamsGetDiscussionInOrgRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.TeamsGetDiscussionInOrgResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersTeamsGetDiscussionInOrgEndpoint extends StObject {
  
  var parameters: TeamsGetDiscussionInOrgEndpoint = js.native
  
  var request: TeamsGetDiscussionInOrgRequestOptions = js.native
  
  var response: OctokitResponse[TeamsGetDiscussionInOrgResponseData] = js.native
}
object ParametersTeamsGetDiscussionInOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: TeamsGetDiscussionInOrgEndpoint,
    request: TeamsGetDiscussionInOrgRequestOptions,
    response: OctokitResponse[TeamsGetDiscussionInOrgResponseData]
  ): ParametersTeamsGetDiscussionInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsGetDiscussionInOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersTeamsGetDiscussionInOrgEndpointMutableBuilder[Self <: ParametersTeamsGetDiscussionInOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: TeamsGetDiscussionInOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: TeamsGetDiscussionInOrgRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsGetDiscussionInOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
