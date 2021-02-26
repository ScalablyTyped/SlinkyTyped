package typingsSlinky.octokitPluginPaginateRest.anon

import typingsSlinky.octokitTypes.endpointsMod.ActionsListOrgSecretsEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ActionsListOrgSecretsResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActionsListOrgSecretsEndpoint extends StObject {
  
  var parameters: ActionsListOrgSecretsEndpoint = js.native
  
  var response: OctokitResponse[ActionsListOrgSecretsResponseData] with `4` = js.native
}
object ParametersActionsListOrgSecretsEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActionsListOrgSecretsEndpoint,
    response: OctokitResponse[ActionsListOrgSecretsResponseData] with `4`
  ): ParametersActionsListOrgSecretsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsListOrgSecretsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActionsListOrgSecretsEndpointMutableBuilder[Self <: ParametersActionsListOrgSecretsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActionsListOrgSecretsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsListOrgSecretsResponseData] with `4`): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
