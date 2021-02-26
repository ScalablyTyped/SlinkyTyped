package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.MigrationsGetLargeFilesEndpoint
import typingsSlinky.octokitTypes.endpointsMod.MigrationsGetLargeFilesResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `770` extends StObject {
  
  var parameters: RequestParameters with (Omit[MigrationsGetLargeFilesEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[MigrationsGetLargeFilesResponseData] = js.native
}
object `770` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[MigrationsGetLargeFilesEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[MigrationsGetLargeFilesResponseData]
  ): `770` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`770`]
  }
  
  @scala.inline
  implicit class `770MutableBuilder`[Self <: `770`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[MigrationsGetLargeFilesEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[MigrationsGetLargeFilesResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
