package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ReactionsCreateForTeamDiscussionInOrgEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReactionsCreateForTeamDiscussionInOrgRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ReactionsCreateForTeamDiscussionInOrgResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReactionsCreateForTeamDiscussionInOrgEndpoint extends StObject {
  
  var parameters: ReactionsCreateForTeamDiscussionInOrgEndpoint = js.native
  
  var request: ReactionsCreateForTeamDiscussionInOrgRequestOptions = js.native
  
  var response: OctokitResponse[ReactionsCreateForTeamDiscussionInOrgResponseData] = js.native
}
object ParametersReactionsCreateForTeamDiscussionInOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReactionsCreateForTeamDiscussionInOrgEndpoint,
    request: ReactionsCreateForTeamDiscussionInOrgRequestOptions,
    response: OctokitResponse[ReactionsCreateForTeamDiscussionInOrgResponseData]
  ): ParametersReactionsCreateForTeamDiscussionInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReactionsCreateForTeamDiscussionInOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReactionsCreateForTeamDiscussionInOrgEndpointMutableBuilder[Self <: ParametersReactionsCreateForTeamDiscussionInOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReactionsCreateForTeamDiscussionInOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReactionsCreateForTeamDiscussionInOrgRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReactionsCreateForTeamDiscussionInOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
