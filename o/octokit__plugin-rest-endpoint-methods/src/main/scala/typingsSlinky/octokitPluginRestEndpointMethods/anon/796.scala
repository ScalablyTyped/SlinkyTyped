package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.OrgsGetWebhookEndpoint
import typingsSlinky.octokitTypes.endpointsMod.OrgsGetWebhookResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `796` extends StObject {
  
  var parameters: RequestParameters with (Omit[OrgsGetWebhookEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[OrgsGetWebhookResponseData] = js.native
}
object `796` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[OrgsGetWebhookEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[OrgsGetWebhookResponseData]
  ): `796` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`796`]
  }
  
  @scala.inline
  implicit class `796MutableBuilder`[Self <: `796`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[OrgsGetWebhookEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[OrgsGetWebhookResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
