package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ActionsGetArtifactEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ActionsGetArtifactRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ActionsGetArtifactResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActionsGetArtifactEndpoint extends js.Object {
  
  var parameters: ActionsGetArtifactEndpoint = js.native
  
  var request: ActionsGetArtifactRequestOptions = js.native
  
  var response: OctokitResponse[ActionsGetArtifactResponseData] = js.native
}
object ParametersActionsGetArtifactEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActionsGetArtifactEndpoint,
    request: ActionsGetArtifactRequestOptions,
    response: OctokitResponse[ActionsGetArtifactResponseData]
  ): ParametersActionsGetArtifactEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsGetArtifactEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActionsGetArtifactEndpointOps[Self <: ParametersActionsGetArtifactEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ActionsGetArtifactEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActionsGetArtifactRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsGetArtifactResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
