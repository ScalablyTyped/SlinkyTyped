package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.GistsCreateCommentEndpoint
import typingsSlinky.octokitTypes.endpointsMod.GistsCreateCommentRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.GistsCreateCommentResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersGistsCreateCommentEndpoint extends js.Object {
  
  var parameters: GistsCreateCommentEndpoint = js.native
  
  var request: GistsCreateCommentRequestOptions = js.native
  
  var response: OctokitResponse[GistsCreateCommentResponseData] = js.native
}
object ParametersGistsCreateCommentEndpoint {
  
  @scala.inline
  def apply(
    parameters: GistsCreateCommentEndpoint,
    request: GistsCreateCommentRequestOptions,
    response: OctokitResponse[GistsCreateCommentResponseData]
  ): ParametersGistsCreateCommentEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGistsCreateCommentEndpoint]
  }
  
  @scala.inline
  implicit class ParametersGistsCreateCommentEndpointOps[Self <: ParametersGistsCreateCommentEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: GistsCreateCommentEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: GistsCreateCommentRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[GistsCreateCommentResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
