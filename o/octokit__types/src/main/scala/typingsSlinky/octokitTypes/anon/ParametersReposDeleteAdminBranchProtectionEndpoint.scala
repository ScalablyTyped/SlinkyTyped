package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ReposDeleteAdminBranchProtectionEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposDeleteAdminBranchProtectionRequestOptions
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposDeleteAdminBranchProtectionEndpoint extends js.Object {
  
  var parameters: ReposDeleteAdminBranchProtectionEndpoint = js.native
  
  var request: ReposDeleteAdminBranchProtectionRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersReposDeleteAdminBranchProtectionEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposDeleteAdminBranchProtectionEndpoint,
    request: ReposDeleteAdminBranchProtectionRequestOptions,
    response: OctokitResponse[_]
  ): ParametersReposDeleteAdminBranchProtectionEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposDeleteAdminBranchProtectionEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposDeleteAdminBranchProtectionEndpointOps[Self <: ParametersReposDeleteAdminBranchProtectionEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ReposDeleteAdminBranchProtectionEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposDeleteAdminBranchProtectionRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
