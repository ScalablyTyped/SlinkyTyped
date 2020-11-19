package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.PullsListEndpoint
import typingsSlinky.octokitTypes.endpointsMod.PullsListRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.PullsListResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersPullsListEndpoint extends js.Object {
  
  var parameters: PullsListEndpoint = js.native
  
  var request: PullsListRequestOptions = js.native
  
  var response: OctokitResponse[PullsListResponseData] = js.native
}
object ParametersPullsListEndpoint {
  
  @scala.inline
  def apply(
    parameters: PullsListEndpoint,
    request: PullsListRequestOptions,
    response: OctokitResponse[PullsListResponseData]
  ): ParametersPullsListEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsListEndpoint]
  }
  
  @scala.inline
  implicit class ParametersPullsListEndpointOps[Self <: ParametersPullsListEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: PullsListEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: PullsListRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[PullsListResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
