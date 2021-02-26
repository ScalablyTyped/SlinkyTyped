package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.AppsCreateInstallationAccessTokenEndpoint
import typingsSlinky.octokitTypes.endpointsMod.AppsCreateInstallationAccessTokenResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `624` extends StObject {
  
  var parameters: RequestParameters with (Omit[AppsCreateInstallationAccessTokenEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[AppsCreateInstallationAccessTokenResponseData] = js.native
}
object `624` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[AppsCreateInstallationAccessTokenEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[AppsCreateInstallationAccessTokenResponseData]
  ): `624` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`624`]
  }
  
  @scala.inline
  implicit class `624MutableBuilder`[Self <: `624`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[AppsCreateInstallationAccessTokenEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[AppsCreateInstallationAccessTokenResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
