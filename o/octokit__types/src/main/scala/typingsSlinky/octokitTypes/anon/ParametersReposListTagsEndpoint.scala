package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ReposListTagsEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposListTagsRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ReposListTagsResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposListTagsEndpoint extends js.Object {
  
  var parameters: ReposListTagsEndpoint = js.native
  
  var request: ReposListTagsRequestOptions = js.native
  
  var response: OctokitResponse[ReposListTagsResponseData] = js.native
}
object ParametersReposListTagsEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposListTagsEndpoint,
    request: ReposListTagsRequestOptions,
    response: OctokitResponse[ReposListTagsResponseData]
  ): ParametersReposListTagsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListTagsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposListTagsEndpointOps[Self <: ParametersReposListTagsEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ReposListTagsEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposListTagsRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposListTagsResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
