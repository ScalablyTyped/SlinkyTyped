package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ReposGetPagesBuildEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposGetPagesBuildRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ReposGetPagesBuildResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposGetPagesBuildEndpoint extends StObject {
  
  var parameters: ReposGetPagesBuildEndpoint = js.native
  
  var request: ReposGetPagesBuildRequestOptions = js.native
  
  var response: OctokitResponse[ReposGetPagesBuildResponseData] = js.native
}
object ParametersReposGetPagesBuildEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposGetPagesBuildEndpoint,
    request: ReposGetPagesBuildRequestOptions,
    response: OctokitResponse[ReposGetPagesBuildResponseData]
  ): ParametersReposGetPagesBuildEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetPagesBuildEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposGetPagesBuildEndpointMutableBuilder[Self <: ParametersReposGetPagesBuildEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposGetPagesBuildEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposGetPagesBuildRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetPagesBuildResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
