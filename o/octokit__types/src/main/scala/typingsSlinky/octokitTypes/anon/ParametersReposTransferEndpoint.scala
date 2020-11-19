package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ReposTransferEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposTransferRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ReposTransferResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposTransferEndpoint extends js.Object {
  
  var parameters: ReposTransferEndpoint = js.native
  
  var request: ReposTransferRequestOptions = js.native
  
  var response: OctokitResponse[ReposTransferResponseData] = js.native
}
object ParametersReposTransferEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposTransferEndpoint,
    request: ReposTransferRequestOptions,
    response: OctokitResponse[ReposTransferResponseData]
  ): ParametersReposTransferEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposTransferEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposTransferEndpointOps[Self <: ParametersReposTransferEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ReposTransferEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposTransferRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposTransferResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
