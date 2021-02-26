package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.ChecksSetSuitesPreferencesEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ChecksSetSuitesPreferencesResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `666` extends StObject {
  
  var parameters: RequestParameters with (Omit[ChecksSetSuitesPreferencesEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[ChecksSetSuitesPreferencesResponseData] = js.native
}
object `666` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ChecksSetSuitesPreferencesEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ChecksSetSuitesPreferencesResponseData]
  ): `666` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`666`]
  }
  
  @scala.inline
  implicit class `666MutableBuilder`[Self <: `666`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[ChecksSetSuitesPreferencesEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ChecksSetSuitesPreferencesResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
