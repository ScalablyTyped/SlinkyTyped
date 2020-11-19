package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ReposSetStatusCheckContextsEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposSetStatusCheckContextsRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ReposSetStatusCheckContextsResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposSetStatusCheckContextsEndpoint extends js.Object {
  
  var parameters: ReposSetStatusCheckContextsEndpoint = js.native
  
  var request: ReposSetStatusCheckContextsRequestOptions = js.native
  
  var response: OctokitResponse[ReposSetStatusCheckContextsResponseData] = js.native
}
object ParametersReposSetStatusCheckContextsEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposSetStatusCheckContextsEndpoint,
    request: ReposSetStatusCheckContextsRequestOptions,
    response: OctokitResponse[ReposSetStatusCheckContextsResponseData]
  ): ParametersReposSetStatusCheckContextsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposSetStatusCheckContextsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposSetStatusCheckContextsEndpointOps[Self <: ParametersReposSetStatusCheckContextsEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ReposSetStatusCheckContextsEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposSetStatusCheckContextsRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposSetStatusCheckContextsResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
