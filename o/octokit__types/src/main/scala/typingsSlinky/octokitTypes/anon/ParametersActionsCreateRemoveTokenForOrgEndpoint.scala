package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ActionsCreateRemoveTokenForOrgEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ActionsCreateRemoveTokenForOrgRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ActionsCreateRemoveTokenForOrgResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActionsCreateRemoveTokenForOrgEndpoint extends StObject {
  
  var parameters: ActionsCreateRemoveTokenForOrgEndpoint = js.native
  
  var request: ActionsCreateRemoveTokenForOrgRequestOptions = js.native
  
  var response: OctokitResponse[ActionsCreateRemoveTokenForOrgResponseData] = js.native
}
object ParametersActionsCreateRemoveTokenForOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActionsCreateRemoveTokenForOrgEndpoint,
    request: ActionsCreateRemoveTokenForOrgRequestOptions,
    response: OctokitResponse[ActionsCreateRemoveTokenForOrgResponseData]
  ): ParametersActionsCreateRemoveTokenForOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsCreateRemoveTokenForOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActionsCreateRemoveTokenForOrgEndpointMutableBuilder[Self <: ParametersActionsCreateRemoveTokenForOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActionsCreateRemoveTokenForOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActionsCreateRemoveTokenForOrgRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsCreateRemoveTokenForOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
