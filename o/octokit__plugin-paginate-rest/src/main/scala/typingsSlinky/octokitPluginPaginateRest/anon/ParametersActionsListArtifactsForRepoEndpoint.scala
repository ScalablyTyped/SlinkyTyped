package typingsSlinky.octokitPluginPaginateRest.anon

import typingsSlinky.octokitTypes.endpointsMod.ActionsListArtifactsForRepoEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ActionsListArtifactsForRepoResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActionsListArtifactsForRepoEndpoint extends js.Object {
  
  var parameters: ActionsListArtifactsForRepoEndpoint = js.native
  
  var response: OctokitResponse[ActionsListArtifactsForRepoResponseData] with `4` = js.native
}
object ParametersActionsListArtifactsForRepoEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActionsListArtifactsForRepoEndpoint,
    response: OctokitResponse[ActionsListArtifactsForRepoResponseData] with `4`
  ): ParametersActionsListArtifactsForRepoEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsListArtifactsForRepoEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActionsListArtifactsForRepoEndpointOps[Self <: ParametersActionsListArtifactsForRepoEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ActionsListArtifactsForRepoEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsListArtifactsForRepoResponseData] with `4`): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
