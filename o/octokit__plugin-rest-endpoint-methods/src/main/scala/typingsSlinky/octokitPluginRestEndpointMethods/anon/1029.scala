package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.ReposUpdateWebhookEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposUpdateWebhookResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `1029` extends StObject {
  
  var parameters: RequestParameters with (Omit[ReposUpdateWebhookEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[ReposUpdateWebhookResponseData] = js.native
}
object `1029` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposUpdateWebhookEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposUpdateWebhookResponseData]
  ): `1029` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1029`]
  }
  
  @scala.inline
  implicit class `1029MutableBuilder`[Self <: `1029`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[ReposUpdateWebhookEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposUpdateWebhookResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
