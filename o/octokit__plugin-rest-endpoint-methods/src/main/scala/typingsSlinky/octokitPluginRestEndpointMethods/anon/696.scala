package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.GistsUpdateCommentEndpoint
import typingsSlinky.octokitTypes.endpointsMod.GistsUpdateCommentResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `696` extends StObject {
  
  var parameters: RequestParameters with (Omit[GistsUpdateCommentEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[GistsUpdateCommentResponseData] = js.native
}
object `696` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[GistsUpdateCommentEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[GistsUpdateCommentResponseData]
  ): `696` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`696`]
  }
  
  @scala.inline
  implicit class `696MutableBuilder`[Self <: `696`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[GistsUpdateCommentEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[GistsUpdateCommentResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
