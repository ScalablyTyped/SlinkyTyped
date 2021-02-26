package typingsSlinky.octokitPluginPaginateRest.anon

import typingsSlinky.octokitTypes.endpointsMod.ActionsListRunnerApplicationsForOrgEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ActionsListRunnerApplicationsForOrgResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActionsListRunnerApplicationsForOrgEndpoint extends StObject {
  
  var parameters: ActionsListRunnerApplicationsForOrgEndpoint = js.native
  
  var response: OctokitResponse[ActionsListRunnerApplicationsForOrgResponseData] = js.native
}
object ParametersActionsListRunnerApplicationsForOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActionsListRunnerApplicationsForOrgEndpoint,
    response: OctokitResponse[ActionsListRunnerApplicationsForOrgResponseData]
  ): ParametersActionsListRunnerApplicationsForOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsListRunnerApplicationsForOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActionsListRunnerApplicationsForOrgEndpointMutableBuilder[Self <: ParametersActionsListRunnerApplicationsForOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActionsListRunnerApplicationsForOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsListRunnerApplicationsForOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
