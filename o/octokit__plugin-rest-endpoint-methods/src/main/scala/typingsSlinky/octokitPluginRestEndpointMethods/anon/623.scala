package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.AppsCreateFromManifestEndpoint
import typingsSlinky.octokitTypes.endpointsMod.AppsCreateFromManifestResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `623` extends StObject {
  
  var parameters: RequestParameters with (Omit[AppsCreateFromManifestEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[AppsCreateFromManifestResponseData] = js.native
}
object `623` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[AppsCreateFromManifestEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[AppsCreateFromManifestResponseData]
  ): `623` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`623`]
  }
  
  @scala.inline
  implicit class `623MutableBuilder`[Self <: `623`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[AppsCreateFromManifestEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[AppsCreateFromManifestResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
