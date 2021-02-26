package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ActionsListSelfHostedRunnersInGroupForOrgEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ActionsListSelfHostedRunnersInGroupForOrgRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ActionsListSelfHostedRunnersInGroupForOrgResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActionsListSelfHostedRunnersInGroupForOrgEndpoint extends StObject {
  
  var parameters: ActionsListSelfHostedRunnersInGroupForOrgEndpoint = js.native
  
  var request: ActionsListSelfHostedRunnersInGroupForOrgRequestOptions = js.native
  
  var response: OctokitResponse[ActionsListSelfHostedRunnersInGroupForOrgResponseData] = js.native
}
object ParametersActionsListSelfHostedRunnersInGroupForOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActionsListSelfHostedRunnersInGroupForOrgEndpoint,
    request: ActionsListSelfHostedRunnersInGroupForOrgRequestOptions,
    response: OctokitResponse[ActionsListSelfHostedRunnersInGroupForOrgResponseData]
  ): ParametersActionsListSelfHostedRunnersInGroupForOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsListSelfHostedRunnersInGroupForOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActionsListSelfHostedRunnersInGroupForOrgEndpointMutableBuilder[Self <: ParametersActionsListSelfHostedRunnersInGroupForOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActionsListSelfHostedRunnersInGroupForOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActionsListSelfHostedRunnersInGroupForOrgRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsListSelfHostedRunnersInGroupForOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
