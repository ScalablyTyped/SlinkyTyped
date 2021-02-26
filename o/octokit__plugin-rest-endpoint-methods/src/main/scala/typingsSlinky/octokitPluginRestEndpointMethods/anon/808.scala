package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.OrgsListWebhooksEndpoint
import typingsSlinky.octokitTypes.endpointsMod.OrgsListWebhooksResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `808` extends StObject {
  
  var parameters: RequestParameters with (Omit[OrgsListWebhooksEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[OrgsListWebhooksResponseData] = js.native
}
object `808` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[OrgsListWebhooksEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[OrgsListWebhooksResponseData]
  ): `808` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`808`]
  }
  
  @scala.inline
  implicit class `808MutableBuilder`[Self <: `808`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[OrgsListWebhooksEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[OrgsListWebhooksResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
