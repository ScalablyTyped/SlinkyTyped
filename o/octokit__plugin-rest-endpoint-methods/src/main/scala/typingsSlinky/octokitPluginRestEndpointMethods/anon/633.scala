package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.AppsGetSubscriptionPlanForAccountEndpoint
import typingsSlinky.octokitTypes.endpointsMod.AppsGetSubscriptionPlanForAccountResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `633` extends StObject {
  
  var parameters: RequestParameters with (Omit[AppsGetSubscriptionPlanForAccountEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[AppsGetSubscriptionPlanForAccountResponseData] = js.native
}
object `633` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[AppsGetSubscriptionPlanForAccountEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[AppsGetSubscriptionPlanForAccountResponseData]
  ): `633` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`633`]
  }
  
  @scala.inline
  implicit class `633MutableBuilder`[Self <: `633`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[AppsGetSubscriptionPlanForAccountEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[AppsGetSubscriptionPlanForAccountResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
