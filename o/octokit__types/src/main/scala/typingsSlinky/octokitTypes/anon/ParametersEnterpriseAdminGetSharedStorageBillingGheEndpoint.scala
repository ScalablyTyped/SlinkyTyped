package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.EnterpriseAdminGetSharedStorageBillingGheEndpoint
import typingsSlinky.octokitTypes.endpointsMod.EnterpriseAdminGetSharedStorageBillingGheRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.EnterpriseAdminGetSharedStorageBillingGheResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersEnterpriseAdminGetSharedStorageBillingGheEndpoint extends StObject {
  
  var parameters: EnterpriseAdminGetSharedStorageBillingGheEndpoint = js.native
  
  var request: EnterpriseAdminGetSharedStorageBillingGheRequestOptions = js.native
  
  var response: OctokitResponse[EnterpriseAdminGetSharedStorageBillingGheResponseData] = js.native
}
object ParametersEnterpriseAdminGetSharedStorageBillingGheEndpoint {
  
  @scala.inline
  def apply(
    parameters: EnterpriseAdminGetSharedStorageBillingGheEndpoint,
    request: EnterpriseAdminGetSharedStorageBillingGheRequestOptions,
    response: OctokitResponse[EnterpriseAdminGetSharedStorageBillingGheResponseData]
  ): ParametersEnterpriseAdminGetSharedStorageBillingGheEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersEnterpriseAdminGetSharedStorageBillingGheEndpoint]
  }
  
  @scala.inline
  implicit class ParametersEnterpriseAdminGetSharedStorageBillingGheEndpointMutableBuilder[Self <: ParametersEnterpriseAdminGetSharedStorageBillingGheEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: EnterpriseAdminGetSharedStorageBillingGheEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: EnterpriseAdminGetSharedStorageBillingGheRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[EnterpriseAdminGetSharedStorageBillingGheResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
