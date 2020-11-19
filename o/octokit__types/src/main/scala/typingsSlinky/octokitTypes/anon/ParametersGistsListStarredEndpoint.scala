package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.GistsListStarredEndpoint
import typingsSlinky.octokitTypes.endpointsMod.GistsListStarredRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.GistsListStarredResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersGistsListStarredEndpoint extends js.Object {
  
  var parameters: GistsListStarredEndpoint = js.native
  
  var request: GistsListStarredRequestOptions = js.native
  
  var response: OctokitResponse[GistsListStarredResponseData] = js.native
}
object ParametersGistsListStarredEndpoint {
  
  @scala.inline
  def apply(
    parameters: GistsListStarredEndpoint,
    request: GistsListStarredRequestOptions,
    response: OctokitResponse[GistsListStarredResponseData]
  ): ParametersGistsListStarredEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGistsListStarredEndpoint]
  }
  
  @scala.inline
  implicit class ParametersGistsListStarredEndpointOps[Self <: ParametersGistsListStarredEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: GistsListStarredEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: GistsListStarredRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[GistsListStarredResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
