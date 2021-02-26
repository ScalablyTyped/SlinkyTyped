package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.AppsCreateContentAttachmentEndpoint
import typingsSlinky.octokitTypes.endpointsMod.AppsCreateContentAttachmentResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `622` extends StObject {
  
  var parameters: RequestParameters with (Omit[AppsCreateContentAttachmentEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[AppsCreateContentAttachmentResponseData] = js.native
}
object `622` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[AppsCreateContentAttachmentEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[AppsCreateContentAttachmentResponseData]
  ): `622` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`622`]
  }
  
  @scala.inline
  implicit class `622MutableBuilder`[Self <: `622`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[AppsCreateContentAttachmentEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[AppsCreateContentAttachmentResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
