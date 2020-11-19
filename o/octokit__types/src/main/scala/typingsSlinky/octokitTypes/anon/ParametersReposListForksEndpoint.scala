package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ReposListForksEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposListForksRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ReposListForksResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposListForksEndpoint extends js.Object {
  
  var parameters: ReposListForksEndpoint = js.native
  
  var request: ReposListForksRequestOptions = js.native
  
  var response: OctokitResponse[ReposListForksResponseData] = js.native
}
object ParametersReposListForksEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposListForksEndpoint,
    request: ReposListForksRequestOptions,
    response: OctokitResponse[ReposListForksResponseData]
  ): ParametersReposListForksEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListForksEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposListForksEndpointOps[Self <: ParametersReposListForksEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ReposListForksEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposListForksRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposListForksResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
