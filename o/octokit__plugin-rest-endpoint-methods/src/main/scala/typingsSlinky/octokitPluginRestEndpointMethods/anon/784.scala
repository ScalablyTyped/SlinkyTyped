package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.MigrationsUpdateImportEndpoint
import typingsSlinky.octokitTypes.endpointsMod.MigrationsUpdateImportResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `784` extends StObject {
  
  var parameters: RequestParameters with (Omit[MigrationsUpdateImportEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[MigrationsUpdateImportResponseData] = js.native
}
object `784` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[MigrationsUpdateImportEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[MigrationsUpdateImportResponseData]
  ): `784` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`784`]
  }
  
  @scala.inline
  implicit class `784MutableBuilder`[Self <: `784`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[MigrationsUpdateImportEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[MigrationsUpdateImportResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
