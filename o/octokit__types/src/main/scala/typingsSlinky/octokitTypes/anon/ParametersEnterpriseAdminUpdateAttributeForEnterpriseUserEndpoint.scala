package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.EnterpriseAdminUpdateAttributeForEnterpriseUserEndpoint
import typingsSlinky.octokitTypes.endpointsMod.EnterpriseAdminUpdateAttributeForEnterpriseUserRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.EnterpriseAdminUpdateAttributeForEnterpriseUserResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersEnterpriseAdminUpdateAttributeForEnterpriseUserEndpoint extends js.Object {
  
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
  implicit class ParametersEnterpriseAdminUpdateAttributeForEnterpriseUserEndpointOps[Self <: ParametersEnterpriseAdminUpdateAttributeForEnterpriseUserEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setParameters(value: EnterpriseAdminUpdateAttributeForEnterpriseUserEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: EnterpriseAdminUpdateAttributeForEnterpriseUserRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[EnterpriseAdminUpdateAttributeForEnterpriseUserResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
