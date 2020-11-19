package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ChecksUpdateEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ChecksUpdateRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ChecksUpdateResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersChecksUpdateEndpoint extends js.Object {
  
  var parameters: ChecksUpdateEndpoint = js.native
  
  var request: ChecksUpdateRequestOptions = js.native
  
  var response: OctokitResponse[ChecksUpdateResponseData] = js.native
}
object ParametersChecksUpdateEndpoint {
  
  @scala.inline
  def apply(
    parameters: ChecksUpdateEndpoint,
    request: ChecksUpdateRequestOptions,
    response: OctokitResponse[ChecksUpdateResponseData]
  ): ParametersChecksUpdateEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersChecksUpdateEndpoint]
  }
  
  @scala.inline
  implicit class ParametersChecksUpdateEndpointOps[Self <: ParametersChecksUpdateEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ChecksUpdateEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ChecksUpdateRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ChecksUpdateResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
