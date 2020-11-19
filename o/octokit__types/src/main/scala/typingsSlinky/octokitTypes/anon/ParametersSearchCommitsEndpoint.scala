package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.SearchCommitsEndpoint
import typingsSlinky.octokitTypes.endpointsMod.SearchCommitsRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.SearchCommitsResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersSearchCommitsEndpoint extends js.Object {
  
  var parameters: SearchCommitsEndpoint = js.native
  
  var request: SearchCommitsRequestOptions = js.native
  
  var response: OctokitResponse[SearchCommitsResponseData] = js.native
}
object ParametersSearchCommitsEndpoint {
  
  @scala.inline
  def apply(
    parameters: SearchCommitsEndpoint,
    request: SearchCommitsRequestOptions,
    response: OctokitResponse[SearchCommitsResponseData]
  ): ParametersSearchCommitsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersSearchCommitsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersSearchCommitsEndpointOps[Self <: ParametersSearchCommitsEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: SearchCommitsEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: SearchCommitsRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[SearchCommitsResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
