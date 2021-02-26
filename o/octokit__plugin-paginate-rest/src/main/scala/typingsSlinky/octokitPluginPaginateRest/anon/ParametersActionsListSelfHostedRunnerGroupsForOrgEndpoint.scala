package typingsSlinky.octokitPluginPaginateRest.anon

import typingsSlinky.octokitTypes.endpointsMod.ActionsListSelfHostedRunnerGroupsForOrgEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ActionsListSelfHostedRunnerGroupsForOrgResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActionsListSelfHostedRunnerGroupsForOrgEndpoint extends StObject {
  
  var parameters: ActionsListSelfHostedRunnerGroupsForOrgEndpoint = js.native
  
  var response: OctokitResponse[ActionsListSelfHostedRunnerGroupsForOrgResponseData] with `2` = js.native
}
object ParametersActionsListSelfHostedRunnerGroupsForOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActionsListSelfHostedRunnerGroupsForOrgEndpoint,
    response: OctokitResponse[ActionsListSelfHostedRunnerGroupsForOrgResponseData] with `2`
  ): ParametersActionsListSelfHostedRunnerGroupsForOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsListSelfHostedRunnerGroupsForOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActionsListSelfHostedRunnerGroupsForOrgEndpointMutableBuilder[Self <: ParametersActionsListSelfHostedRunnerGroupsForOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActionsListSelfHostedRunnerGroupsForOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsListSelfHostedRunnerGroupsForOrgResponseData] with `2`): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
