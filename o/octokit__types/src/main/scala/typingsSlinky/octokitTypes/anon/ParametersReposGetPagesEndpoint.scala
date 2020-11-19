package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ReposGetPagesEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposGetPagesRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ReposGetPagesResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposGetPagesEndpoint extends js.Object {
  
  var parameters: ReposGetPagesEndpoint = js.native
  
  var request: ReposGetPagesRequestOptions = js.native
  
  var response: OctokitResponse[ReposGetPagesResponseData] = js.native
}
object ParametersReposGetPagesEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposGetPagesEndpoint,
    request: ReposGetPagesRequestOptions,
    response: OctokitResponse[ReposGetPagesResponseData]
  ): ParametersReposGetPagesEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetPagesEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposGetPagesEndpointOps[Self <: ParametersReposGetPagesEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ReposGetPagesEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposGetPagesRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetPagesResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
