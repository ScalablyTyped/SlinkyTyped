package typingsSlinky.octokitPluginPaginateRest.anon

import typingsSlinky.octokitTypes.endpointsMod.ReposListCommitCommentsForRepoEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposListCommitCommentsForRepoResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposListCommitCommentsForRepoEndpoint extends StObject {
  
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
  implicit class ParametersReposListCommitCommentsForRepoEndpointMutableBuilder[Self <: ParametersReposListCommitCommentsForRepoEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposListCommitCommentsForRepoEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposListCommitCommentsForRepoResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
