package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.MarkdownRenderEndpoint
import typingsSlinky.octokitTypes.endpointsMod.MarkdownRenderRequestOptions
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersMarkdownRenderEndpoint extends StObject {
  
  var parameters: MarkdownRenderEndpoint = js.native
  
  var request: MarkdownRenderRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersMarkdownRenderEndpoint {
  
  @scala.inline
  def apply(
    parameters: MarkdownRenderEndpoint,
    request: MarkdownRenderRequestOptions,
    response: OctokitResponse[_]
  ): ParametersMarkdownRenderEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersMarkdownRenderEndpoint]
  }
  
  @scala.inline
  implicit class ParametersMarkdownRenderEndpointMutableBuilder[Self <: ParametersMarkdownRenderEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: MarkdownRenderEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: MarkdownRenderRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
