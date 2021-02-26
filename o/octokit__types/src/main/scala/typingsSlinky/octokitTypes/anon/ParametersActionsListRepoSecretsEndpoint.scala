package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ActionsListRepoSecretsEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ActionsListRepoSecretsRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ActionsListRepoSecretsResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActionsListRepoSecretsEndpoint extends StObject {
  
  var parameters: ActionsListRepoSecretsEndpoint = js.native
  
  var request: ActionsListRepoSecretsRequestOptions = js.native
  
  var response: OctokitResponse[ActionsListRepoSecretsResponseData] = js.native
}
object ParametersActionsListRepoSecretsEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActionsListRepoSecretsEndpoint,
    request: ActionsListRepoSecretsRequestOptions,
    response: OctokitResponse[ActionsListRepoSecretsResponseData]
  ): ParametersActionsListRepoSecretsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsListRepoSecretsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActionsListRepoSecretsEndpointMutableBuilder[Self <: ParametersActionsListRepoSecretsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActionsListRepoSecretsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActionsListRepoSecretsRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsListRepoSecretsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
