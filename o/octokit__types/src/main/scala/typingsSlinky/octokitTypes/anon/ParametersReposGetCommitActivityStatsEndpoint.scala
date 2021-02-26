package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ReposGetCommitActivityStatsEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposGetCommitActivityStatsRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ReposGetCommitActivityStatsResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposGetCommitActivityStatsEndpoint extends StObject {
  
  var parameters: ReposGetCommitActivityStatsEndpoint = js.native
  
  var request: ReposGetCommitActivityStatsRequestOptions = js.native
  
  var response: OctokitResponse[ReposGetCommitActivityStatsResponseData] = js.native
}
object ParametersReposGetCommitActivityStatsEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposGetCommitActivityStatsEndpoint,
    request: ReposGetCommitActivityStatsRequestOptions,
    response: OctokitResponse[ReposGetCommitActivityStatsResponseData]
  ): ParametersReposGetCommitActivityStatsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetCommitActivityStatsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposGetCommitActivityStatsEndpointMutableBuilder[Self <: ParametersReposGetCommitActivityStatsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposGetCommitActivityStatsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposGetCommitActivityStatsRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetCommitActivityStatsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
