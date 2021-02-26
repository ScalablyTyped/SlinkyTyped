package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ReposListBranchesForHeadCommitEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposListBranchesForHeadCommitRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ReposListBranchesForHeadCommitResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposListBranchesForHeadCommitEndpoint extends StObject {
  
  var parameters: ReposListBranchesForHeadCommitEndpoint = js.native
  
  var request: ReposListBranchesForHeadCommitRequestOptions = js.native
  
  var response: OctokitResponse[ReposListBranchesForHeadCommitResponseData] = js.native
}
object ParametersReposListBranchesForHeadCommitEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposListBranchesForHeadCommitEndpoint,
    request: ReposListBranchesForHeadCommitRequestOptions,
    response: OctokitResponse[ReposListBranchesForHeadCommitResponseData]
  ): ParametersReposListBranchesForHeadCommitEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListBranchesForHeadCommitEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposListBranchesForHeadCommitEndpointMutableBuilder[Self <: ParametersReposListBranchesForHeadCommitEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposListBranchesForHeadCommitEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposListBranchesForHeadCommitRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposListBranchesForHeadCommitResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
