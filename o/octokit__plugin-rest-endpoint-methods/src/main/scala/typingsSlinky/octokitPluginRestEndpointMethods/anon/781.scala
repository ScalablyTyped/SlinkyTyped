package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.MigrationsStartImportEndpoint
import typingsSlinky.octokitTypes.endpointsMod.MigrationsStartImportResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `781` extends StObject {
  
  var parameters: RequestParameters with (Omit[MigrationsStartImportEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[MigrationsStartImportResponseData] = js.native
}
object `781` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[MigrationsStartImportEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[MigrationsStartImportResponseData]
  ): `781` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`781`]
  }
  
  @scala.inline
  implicit class `781MutableBuilder`[Self <: `781`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[MigrationsStartImportEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[MigrationsStartImportResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
