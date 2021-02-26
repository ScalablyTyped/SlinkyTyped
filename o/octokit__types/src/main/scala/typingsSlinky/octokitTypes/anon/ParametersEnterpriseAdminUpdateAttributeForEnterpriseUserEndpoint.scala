package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.EnterpriseAdminUpdateAttributeForEnterpriseUserEndpoint
import typingsSlinky.octokitTypes.endpointsMod.EnterpriseAdminUpdateAttributeForEnterpriseUserRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.EnterpriseAdminUpdateAttributeForEnterpriseUserResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersEnterpriseAdminUpdateAttributeForEnterpriseUserEndpoint extends StObject {
  
  var parameters: EnterpriseAdminUpdateAttributeForEnterpriseUserEndpoint = js.native
  
  var request: EnterpriseAdminUpdateAttributeForEnterpriseUserRequestOptions = js.native
  
  var response: OctokitResponse[EnterpriseAdminUpdateAttributeForEnterpriseUserResponseData] = js.native
}
object ParametersEnterpriseAdminUpdateAttributeForEnterpriseUserEndpoint {
  
  @scala.inline
  def apply(
    parameters: EnterpriseAdminUpdateAttributeForEnterpriseUserEndpoint,
    request: EnterpriseAdminUpdateAttributeForEnterpriseUserRequestOptions,
    response: OctokitResponse[EnterpriseAdminUpdateAttributeForEnterpriseUserResponseData]
  ): ParametersEnterpriseAdminUpdateAttributeForEnterpriseUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersEnterpriseAdminUpdateAttributeForEnterpriseUserEndpoint]
  }
  
  @scala.inline
  implicit class ParametersEnterpriseAdminUpdateAttributeForEnterpriseUserEndpointMutableBuilder[Self <: ParametersEnterpriseAdminUpdateAttributeForEnterpriseUserEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: EnterpriseAdminUpdateAttributeForEnterpriseUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: EnterpriseAdminUpdateAttributeForEnterpriseUserRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[EnterpriseAdminUpdateAttributeForEnterpriseUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
