package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.AppsListSubscriptionsForAuthenticatedUserEndpoint
import typingsSlinky.octokitTypes.endpointsMod.AppsListSubscriptionsForAuthenticatedUserResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `644` extends StObject {
  
  var parameters: RequestParameters with (Omit[AppsListSubscriptionsForAuthenticatedUserEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[AppsListSubscriptionsForAuthenticatedUserResponseData] = js.native
}
object `644` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[AppsListSubscriptionsForAuthenticatedUserEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[AppsListSubscriptionsForAuthenticatedUserResponseData]
  ): `644` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`644`]
  }
  
  @scala.inline
  implicit class `644MutableBuilder`[Self <: `644`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[AppsListSubscriptionsForAuthenticatedUserEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[AppsListSubscriptionsForAuthenticatedUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
