package typingsSlinky.octokitPluginPaginateRest.anon

import typingsSlinky.octokitTypes.endpointsMod.SearchLabelsEndpoint
import typingsSlinky.octokitTypes.endpointsMod.SearchLabelsResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersSearchLabelsEndpoint extends js.Object {
  
  var parameters: SearchLabelsEndpoint = js.native
  
  var response: OctokitResponse[SearchLabelsResponseData] with `16` = js.native
}
object ParametersSearchLabelsEndpoint {
  
  @scala.inline
  def apply(parameters: SearchLabelsEndpoint, response: OctokitResponse[SearchLabelsResponseData] with `16`): ParametersSearchLabelsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersSearchLabelsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersSearchLabelsEndpointOps[Self <: ParametersSearchLabelsEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: SearchLabelsEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[SearchLabelsResponseData] with `16`): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
