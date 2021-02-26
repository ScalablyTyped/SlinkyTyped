package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ReposGetReleaseAssetEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposGetReleaseAssetRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ReposGetReleaseAssetResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposGetReleaseAssetEndpoint extends StObject {
  
  var parameters: ReposGetReleaseAssetEndpoint = js.native
  
  var request: ReposGetReleaseAssetRequestOptions = js.native
  
  var response: OctokitResponse[ReposGetReleaseAssetResponseData] = js.native
}
object ParametersReposGetReleaseAssetEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposGetReleaseAssetEndpoint,
    request: ReposGetReleaseAssetRequestOptions,
    response: OctokitResponse[ReposGetReleaseAssetResponseData]
  ): ParametersReposGetReleaseAssetEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetReleaseAssetEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposGetReleaseAssetEndpointMutableBuilder[Self <: ParametersReposGetReleaseAssetEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposGetReleaseAssetEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposGetReleaseAssetRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetReleaseAssetResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
