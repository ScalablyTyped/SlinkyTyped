package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.EnterpriseAdminCreateRemoveTokenForEnterpriseEndpoint
import typingsSlinky.octokitTypes.endpointsMod.EnterpriseAdminCreateRemoveTokenForEnterpriseRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.EnterpriseAdminCreateRemoveTokenForEnterpriseResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersEnterpriseAdminCreateRemoveTokenForEnterpriseEndpoint extends StObject {
  
  var parameters: EnterpriseAdminCreateRemoveTokenForEnterpriseEndpoint = js.native
  
  var request: EnterpriseAdminCreateRemoveTokenForEnterpriseRequestOptions = js.native
  
  var response: OctokitResponse[EnterpriseAdminCreateRemoveTokenForEnterpriseResponseData] = js.native
}
object ParametersEnterpriseAdminCreateRemoveTokenForEnterpriseEndpoint {
  
  @scala.inline
  def apply(
    parameters: EnterpriseAdminCreateRemoveTokenForEnterpriseEndpoint,
    request: EnterpriseAdminCreateRemoveTokenForEnterpriseRequestOptions,
    response: OctokitResponse[EnterpriseAdminCreateRemoveTokenForEnterpriseResponseData]
  ): ParametersEnterpriseAdminCreateRemoveTokenForEnterpriseEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersEnterpriseAdminCreateRemoveTokenForEnterpriseEndpoint]
  }
  
  @scala.inline
  implicit class ParametersEnterpriseAdminCreateRemoveTokenForEnterpriseEndpointMutableBuilder[Self <: ParametersEnterpriseAdminCreateRemoveTokenForEnterpriseEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: EnterpriseAdminCreateRemoveTokenForEnterpriseEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: EnterpriseAdminCreateRemoveTokenForEnterpriseRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[EnterpriseAdminCreateRemoveTokenForEnterpriseResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
