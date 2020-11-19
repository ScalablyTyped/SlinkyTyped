package typingsSlinky.octokitPluginPaginateRest.anon

import typingsSlinky.octokitTypes.endpointsMod.PullsListFilesEndpoint
import typingsSlinky.octokitTypes.endpointsMod.PullsListFilesResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersPullsListFilesEndpoint extends js.Object {
  
  var parameters: PullsListFilesEndpoint = js.native
  
  var response: OctokitResponse[PullsListFilesResponseData] = js.native
}
object ParametersPullsListFilesEndpoint {
  
  @scala.inline
  def apply(parameters: PullsListFilesEndpoint, response: OctokitResponse[PullsListFilesResponseData]): ParametersPullsListFilesEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsListFilesEndpoint]
  }
  
  @scala.inline
  implicit class ParametersPullsListFilesEndpointOps[Self <: ParametersPullsListFilesEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: PullsListFilesEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[PullsListFilesResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
