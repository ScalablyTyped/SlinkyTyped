package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.GistsForkEndpoint
import typingsSlinky.octokitTypes.endpointsMod.GistsForkRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.GistsForkResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersGistsForkEndpoint extends StObject {
  
  var parameters: GistsForkEndpoint = js.native
  
  var request: GistsForkRequestOptions = js.native
  
  var response: OctokitResponse[GistsForkResponseData] = js.native
}
object ParametersGistsForkEndpoint {
  
  @scala.inline
  def apply(
    parameters: GistsForkEndpoint,
    request: GistsForkRequestOptions,
    response: OctokitResponse[GistsForkResponseData]
  ): ParametersGistsForkEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGistsForkEndpoint]
  }
  
  @scala.inline
  implicit class ParametersGistsForkEndpointMutableBuilder[Self <: ParametersGistsForkEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: GistsForkEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: GistsForkRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[GistsForkResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
