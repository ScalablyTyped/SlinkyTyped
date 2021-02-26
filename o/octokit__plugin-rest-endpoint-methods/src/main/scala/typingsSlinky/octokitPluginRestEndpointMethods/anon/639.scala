package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.AppsListInstallationsEndpoint
import typingsSlinky.octokitTypes.endpointsMod.AppsListInstallationsResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `639` extends StObject {
  
  var parameters: RequestParameters with (Omit[AppsListInstallationsEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[AppsListInstallationsResponseData] = js.native
}
object `639` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[AppsListInstallationsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[AppsListInstallationsResponseData]
  ): `639` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`639`]
  }
  
  @scala.inline
  implicit class `639MutableBuilder`[Self <: `639`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[AppsListInstallationsEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[AppsListInstallationsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
