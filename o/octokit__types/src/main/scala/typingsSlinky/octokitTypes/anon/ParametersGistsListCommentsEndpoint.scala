package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.GistsListCommentsEndpoint
import typingsSlinky.octokitTypes.endpointsMod.GistsListCommentsRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.GistsListCommentsResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersGistsListCommentsEndpoint extends js.Object {
  
  var parameters: GistsListCommentsEndpoint = js.native
  
  var request: GistsListCommentsRequestOptions = js.native
  
  var response: OctokitResponse[GistsListCommentsResponseData] = js.native
}
object ParametersGistsListCommentsEndpoint {
  
  @scala.inline
  def apply(
    parameters: GistsListCommentsEndpoint,
    request: GistsListCommentsRequestOptions,
    response: OctokitResponse[GistsListCommentsResponseData]
  ): ParametersGistsListCommentsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGistsListCommentsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersGistsListCommentsEndpointOps[Self <: ParametersGistsListCommentsEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: GistsListCommentsEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: GistsListCommentsRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[GistsListCommentsResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
