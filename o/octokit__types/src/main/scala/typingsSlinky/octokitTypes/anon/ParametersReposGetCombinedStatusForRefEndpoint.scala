package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ReposGetCombinedStatusForRefEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposGetCombinedStatusForRefRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ReposGetCombinedStatusForRefResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposGetCombinedStatusForRefEndpoint extends js.Object {
  
  var parameters: ReposGetCombinedStatusForRefEndpoint = js.native
  
  var request: ReposGetCombinedStatusForRefRequestOptions = js.native
  
  var response: OctokitResponse[ReposGetCombinedStatusForRefResponseData] = js.native
}
object ParametersReposGetCombinedStatusForRefEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposGetCombinedStatusForRefEndpoint,
    request: ReposGetCombinedStatusForRefRequestOptions,
    response: OctokitResponse[ReposGetCombinedStatusForRefResponseData]
  ): ParametersReposGetCombinedStatusForRefEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetCombinedStatusForRefEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposGetCombinedStatusForRefEndpointOps[Self <: ParametersReposGetCombinedStatusForRefEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ReposGetCombinedStatusForRefEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposGetCombinedStatusForRefRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetCombinedStatusForRefResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
