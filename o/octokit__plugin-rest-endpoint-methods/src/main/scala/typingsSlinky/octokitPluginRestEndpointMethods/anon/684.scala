package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.GistsGetCommentEndpoint
import typingsSlinky.octokitTypes.endpointsMod.GistsGetCommentResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `684` extends StObject {
  
  var parameters: RequestParameters with (Omit[GistsGetCommentEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[GistsGetCommentResponseData] = js.native
}
object `684` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[GistsGetCommentEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[GistsGetCommentResponseData]
  ): `684` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`684`]
  }
  
  @scala.inline
  implicit class `684MutableBuilder`[Self <: `684`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[GistsGetCommentEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[GistsGetCommentResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
