package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.EnterpriseAdminGetSharedStorageBillingGheDeprecatedEnterpriseIdEndpoint
import typingsSlinky.octokitTypes.endpointsMod.EnterpriseAdminGetSharedStorageBillingGheRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.EnterpriseAdminGetSharedStorageBillingGheResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersEnterpriseAdminGetSharedStorageBillingGheDeprecatedEnterpriseIdEndpoint extends StObject {
  
  var parameters: EnterpriseAdminGetSharedStorageBillingGheDeprecatedEnterpriseIdEndpoint = js.native
  
  var request: EnterpriseAdminGetSharedStorageBillingGheRequestOptions = js.native
  
  var response: OctokitResponse[EnterpriseAdminGetSharedStorageBillingGheResponseData] = js.native
}
object ParametersEnterpriseAdminGetSharedStorageBillingGheDeprecatedEnterpriseIdEndpoint {
  
  @scala.inline
  def apply(
    parameters: EnterpriseAdminGetSharedStorageBillingGheDeprecatedEnterpriseIdEndpoint,
    request: EnterpriseAdminGetSharedStorageBillingGheRequestOptions,
    response: OctokitResponse[EnterpriseAdminGetSharedStorageBillingGheResponseData]
  ): ParametersEnterpriseAdminGetSharedStorageBillingGheDeprecatedEnterpriseIdEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersEnterpriseAdminGetSharedStorageBillingGheDeprecatedEnterpriseIdEndpoint]
  }
  
  @scala.inline
  implicit class ParametersEnterpriseAdminGetSharedStorageBillingGheDeprecatedEnterpriseIdEndpointMutableBuilder[Self <: ParametersEnterpriseAdminGetSharedStorageBillingGheDeprecatedEnterpriseIdEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: EnterpriseAdminGetSharedStorageBillingGheDeprecatedEnterpriseIdEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: EnterpriseAdminGetSharedStorageBillingGheRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[EnterpriseAdminGetSharedStorageBillingGheResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
