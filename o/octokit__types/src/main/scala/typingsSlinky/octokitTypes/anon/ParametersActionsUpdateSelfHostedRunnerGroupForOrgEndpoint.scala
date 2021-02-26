package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ActionsUpdateSelfHostedRunnerGroupForOrgEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ActionsUpdateSelfHostedRunnerGroupForOrgRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ActionsUpdateSelfHostedRunnerGroupForOrgResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActionsUpdateSelfHostedRunnerGroupForOrgEndpoint extends StObject {
  
  var parameters: ActionsUpdateSelfHostedRunnerGroupForOrgEndpoint = js.native
  
  var request: ActionsUpdateSelfHostedRunnerGroupForOrgRequestOptions = js.native
  
  var response: OctokitResponse[ActionsUpdateSelfHostedRunnerGroupForOrgResponseData] = js.native
}
object ParametersActionsUpdateSelfHostedRunnerGroupForOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActionsUpdateSelfHostedRunnerGroupForOrgEndpoint,
    request: ActionsUpdateSelfHostedRunnerGroupForOrgRequestOptions,
    response: OctokitResponse[ActionsUpdateSelfHostedRunnerGroupForOrgResponseData]
  ): ParametersActionsUpdateSelfHostedRunnerGroupForOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsUpdateSelfHostedRunnerGroupForOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActionsUpdateSelfHostedRunnerGroupForOrgEndpointMutableBuilder[Self <: ParametersActionsUpdateSelfHostedRunnerGroupForOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActionsUpdateSelfHostedRunnerGroupForOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActionsUpdateSelfHostedRunnerGroupForOrgRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsUpdateSelfHostedRunnerGroupForOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
