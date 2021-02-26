package typingsSlinky.octokitPluginPaginateRest.anon

import typingsSlinky.octokitTypes.endpointsMod.ActionsListSelfHostedRunnersInGroupForOrgEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ActionsListSelfHostedRunnersInGroupForOrgResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActionsListSelfHostedRunnersInGroupForOrgEndpoint extends StObject {
  
  var parameters: ActionsListSelfHostedRunnersInGroupForOrgEndpoint = js.native
  
  var response: OctokitResponse[ActionsListSelfHostedRunnersInGroupForOrgResponseData] with `0` = js.native
}
object ParametersActionsListSelfHostedRunnersInGroupForOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActionsListSelfHostedRunnersInGroupForOrgEndpoint,
    response: OctokitResponse[ActionsListSelfHostedRunnersInGroupForOrgResponseData] with `0`
  ): ParametersActionsListSelfHostedRunnersInGroupForOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsListSelfHostedRunnersInGroupForOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActionsListSelfHostedRunnersInGroupForOrgEndpointMutableBuilder[Self <: ParametersActionsListSelfHostedRunnersInGroupForOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActionsListSelfHostedRunnersInGroupForOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsListSelfHostedRunnersInGroupForOrgResponseData] with `0`): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
