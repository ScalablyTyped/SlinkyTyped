package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ReposListBranchesEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposListBranchesRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ReposListBranchesResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposListBranchesEndpoint extends js.Object {
  
  var parameters: ReposListBranchesEndpoint = js.native
  
  var request: ReposListBranchesRequestOptions = js.native
  
  var response: OctokitResponse[ReposListBranchesResponseData] = js.native
}
object ParametersReposListBranchesEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposListBranchesEndpoint,
    request: ReposListBranchesRequestOptions,
    response: OctokitResponse[ReposListBranchesResponseData]
  ): ParametersReposListBranchesEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListBranchesEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposListBranchesEndpointOps[Self <: ParametersReposListBranchesEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ReposListBranchesEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposListBranchesRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposListBranchesResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
