package typingsSlinky.octokitPluginPaginateRest.anon

import typingsSlinky.octokitTypes.endpointsMod.ActionsListRepoSecretsEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ActionsListRepoSecretsResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActionsListRepoSecretsEndpoint extends StObject {
  
  var parameters: ActionsListRepoSecretsEndpoint = js.native
  
  var response: OctokitResponse[ActionsListRepoSecretsResponseData] with `11` = js.native
}
object ParametersActionsListRepoSecretsEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActionsListRepoSecretsEndpoint,
    response: OctokitResponse[ActionsListRepoSecretsResponseData] with `11`
  ): ParametersActionsListRepoSecretsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsListRepoSecretsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActionsListRepoSecretsEndpointMutableBuilder[Self <: ParametersActionsListRepoSecretsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActionsListRepoSecretsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsListRepoSecretsResponseData] with `11`): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
