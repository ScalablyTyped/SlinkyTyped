package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.MigrationsListForAuthenticatedUserEndpoint
import typingsSlinky.octokitTypes.endpointsMod.MigrationsListForAuthenticatedUserResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `773` extends StObject {
  
  var parameters: RequestParameters with (Omit[MigrationsListForAuthenticatedUserEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[MigrationsListForAuthenticatedUserResponseData] = js.native
}
object `773` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[MigrationsListForAuthenticatedUserEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[MigrationsListForAuthenticatedUserResponseData]
  ): `773` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`773`]
  }
  
  @scala.inline
  implicit class `773MutableBuilder`[Self <: `773`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[MigrationsListForAuthenticatedUserEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[MigrationsListForAuthenticatedUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
