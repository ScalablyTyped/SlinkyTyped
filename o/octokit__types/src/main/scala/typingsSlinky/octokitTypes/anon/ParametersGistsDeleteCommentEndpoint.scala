package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.GistsDeleteCommentEndpoint
import typingsSlinky.octokitTypes.endpointsMod.GistsDeleteCommentRequestOptions
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersGistsDeleteCommentEndpoint extends StObject {
  
  var parameters: GistsDeleteCommentEndpoint = js.native
  
  var request: GistsDeleteCommentRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersGistsDeleteCommentEndpoint {
  
  @scala.inline
  def apply(
    parameters: GistsDeleteCommentEndpoint,
    request: GistsDeleteCommentRequestOptions,
    response: OctokitResponse[_]
  ): ParametersGistsDeleteCommentEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGistsDeleteCommentEndpoint]
  }
  
  @scala.inline
  implicit class ParametersGistsDeleteCommentEndpointMutableBuilder[Self <: ParametersGistsDeleteCommentEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: GistsDeleteCommentEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: GistsDeleteCommentRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
