package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.MigrationsSetLfsPreferenceEndpoint
import typingsSlinky.octokitTypes.endpointsMod.MigrationsSetLfsPreferenceResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `778` extends StObject {
  
  var parameters: RequestParameters with (Omit[MigrationsSetLfsPreferenceEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[MigrationsSetLfsPreferenceResponseData] = js.native
}
object `778` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[MigrationsSetLfsPreferenceEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[MigrationsSetLfsPreferenceResponseData]
  ): `778` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`778`]
  }
  
  @scala.inline
  implicit class `778MutableBuilder`[Self <: `778`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[MigrationsSetLfsPreferenceEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[MigrationsSetLfsPreferenceResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
