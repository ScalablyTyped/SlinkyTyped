package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.AppsGetSubscriptionPlanForAccountStubbedEndpoint
import typingsSlinky.octokitTypes.endpointsMod.AppsGetSubscriptionPlanForAccountStubbedResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `634` extends StObject {
  
  var parameters: RequestParameters with (Omit[AppsGetSubscriptionPlanForAccountStubbedEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[AppsGetSubscriptionPlanForAccountStubbedResponseData] = js.native
}
object `634` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[AppsGetSubscriptionPlanForAccountStubbedEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[AppsGetSubscriptionPlanForAccountStubbedResponseData]
  ): `634` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`634`]
  }
  
  @scala.inline
  implicit class `634MutableBuilder`[Self <: `634`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[AppsGetSubscriptionPlanForAccountStubbedEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[AppsGetSubscriptionPlanForAccountStubbedResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
