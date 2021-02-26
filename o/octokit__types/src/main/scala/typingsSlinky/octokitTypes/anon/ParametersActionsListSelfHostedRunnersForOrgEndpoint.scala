package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ActionsListSelfHostedRunnersForOrgEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ActionsListSelfHostedRunnersForOrgRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ActionsListSelfHostedRunnersForOrgResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActionsListSelfHostedRunnersForOrgEndpoint extends StObject {
  
  var parameters: ActionsListSelfHostedRunnersForOrgEndpoint = js.native
  
  var request: ActionsListSelfHostedRunnersForOrgRequestOptions = js.native
  
  var response: OctokitResponse[ActionsListSelfHostedRunnersForOrgResponseData] = js.native
}
object ParametersActionsListSelfHostedRunnersForOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActionsListSelfHostedRunnersForOrgEndpoint,
    request: ActionsListSelfHostedRunnersForOrgRequestOptions,
    response: OctokitResponse[ActionsListSelfHostedRunnersForOrgResponseData]
  ): ParametersActionsListSelfHostedRunnersForOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsListSelfHostedRunnersForOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActionsListSelfHostedRunnersForOrgEndpointMutableBuilder[Self <: ParametersActionsListSelfHostedRunnersForOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActionsListSelfHostedRunnersForOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActionsListSelfHostedRunnersForOrgRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsListSelfHostedRunnersForOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
