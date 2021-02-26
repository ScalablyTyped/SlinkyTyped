package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.EnterpriseAdminGetGithubActionsBillingGheEndpoint
import typingsSlinky.octokitTypes.endpointsMod.EnterpriseAdminGetGithubActionsBillingGheRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.EnterpriseAdminGetGithubActionsBillingGheResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersEnterpriseAdminGetGithubActionsBillingGheEndpoint extends StObject {
  
  var parameters: EnterpriseAdminGetGithubActionsBillingGheEndpoint = js.native
  
  var request: EnterpriseAdminGetGithubActionsBillingGheRequestOptions = js.native
  
  var response: OctokitResponse[EnterpriseAdminGetGithubActionsBillingGheResponseData] = js.native
}
object ParametersEnterpriseAdminGetGithubActionsBillingGheEndpoint {
  
  @scala.inline
  def apply(
    parameters: EnterpriseAdminGetGithubActionsBillingGheEndpoint,
    request: EnterpriseAdminGetGithubActionsBillingGheRequestOptions,
    response: OctokitResponse[EnterpriseAdminGetGithubActionsBillingGheResponseData]
  ): ParametersEnterpriseAdminGetGithubActionsBillingGheEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersEnterpriseAdminGetGithubActionsBillingGheEndpoint]
  }
  
  @scala.inline
  implicit class ParametersEnterpriseAdminGetGithubActionsBillingGheEndpointMutableBuilder[Self <: ParametersEnterpriseAdminGetGithubActionsBillingGheEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: EnterpriseAdminGetGithubActionsBillingGheEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: EnterpriseAdminGetGithubActionsBillingGheRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[EnterpriseAdminGetGithubActionsBillingGheResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
