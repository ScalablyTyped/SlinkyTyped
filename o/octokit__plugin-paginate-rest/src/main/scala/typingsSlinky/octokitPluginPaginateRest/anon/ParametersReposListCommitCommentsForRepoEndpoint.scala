package typingsSlinky.octokitPluginPaginateRest.anon

import typingsSlinky.octokitTypes.endpointsMod.ReposListCommitCommentsForRepoEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposListCommitCommentsForRepoResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposListCommitCommentsForRepoEndpoint extends js.Object {
  
  var parameters: ReposListCommitCommentsForRepoEndpoint = js.native
  
  var response: OctokitResponse[ReposListCommitCommentsForRepoResponseData] = js.native
}
object ParametersReposListCommitCommentsForRepoEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposListCommitCommentsForRepoEndpoint,
    response: OctokitResponse[ReposListCommitCommentsForRepoResponseData]
  ): ParametersReposListCommitCommentsForRepoEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListCommitCommentsForRepoEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposListCommitCommentsForRepoEndpointOps[Self <: ParametersReposListCommitCommentsForRepoEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ReposListCommitCommentsForRepoEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposListCommitCommentsForRepoResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
