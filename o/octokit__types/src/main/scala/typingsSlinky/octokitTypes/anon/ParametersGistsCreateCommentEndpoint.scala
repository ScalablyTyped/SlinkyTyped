package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.GistsCreateCommentEndpoint
import typingsSlinky.octokitTypes.endpointsMod.GistsCreateCommentRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.GistsCreateCommentResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersGistsCreateCommentEndpoint extends StObject {
  
  var parameters: GistsCreateCommentEndpoint = js.native
  
  var request: GistsCreateCommentRequestOptions = js.native
  
  var response: OctokitResponse[GistsCreateCommentResponseData] = js.native
}
object ParametersGistsCreateCommentEndpoint {
  
  @scala.inline
  def apply(
    parameters: GistsCreateCommentEndpoint,
    request: GistsCreateCommentRequestOptions,
    response: OctokitResponse[GistsCreateCommentResponseData]
  ): ParametersGistsCreateCommentEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGistsCreateCommentEndpoint]
  }
  
  @scala.inline
  implicit class ParametersGistsCreateCommentEndpointMutableBuilder[Self <: ParametersGistsCreateCommentEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: GistsCreateCommentEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: GistsCreateCommentRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[GistsCreateCommentResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
