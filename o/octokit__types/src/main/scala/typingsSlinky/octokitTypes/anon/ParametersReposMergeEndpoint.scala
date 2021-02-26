package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ReposMergeEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposMergeRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ReposMergeResponse404Data
import typingsSlinky.octokitTypes.endpointsMod.ReposMergeResponse409Data
import typingsSlinky.octokitTypes.endpointsMod.ReposMergeResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposMergeEndpoint extends StObject {
  
  var parameters: ReposMergeEndpoint = js.native
  
  var request: ReposMergeRequestOptions = js.native
  
  var response: OctokitResponse[ReposMergeResponseData | ReposMergeResponse404Data | ReposMergeResponse409Data] = js.native
}
object ParametersReposMergeEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposMergeEndpoint,
    request: ReposMergeRequestOptions,
    response: OctokitResponse[ReposMergeResponseData | ReposMergeResponse404Data | ReposMergeResponse409Data]
  ): ParametersReposMergeEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposMergeEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposMergeEndpointMutableBuilder[Self <: ParametersReposMergeEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposMergeEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposMergeRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(
      value: OctokitResponse[ReposMergeResponseData | ReposMergeResponse404Data | ReposMergeResponse409Data]
    ): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
