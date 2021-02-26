package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.MigrationsListReposForUserEndpoint
import typingsSlinky.octokitTypes.endpointsMod.MigrationsListReposForUserResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `776` extends StObject {
  
  var parameters: RequestParameters with (Omit[MigrationsListReposForUserEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[MigrationsListReposForUserResponseData] = js.native
}
object `776` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[MigrationsListReposForUserEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[MigrationsListReposForUserResponseData]
  ): `776` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`776`]
  }
  
  @scala.inline
  implicit class `776MutableBuilder`[Self <: `776`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[MigrationsListReposForUserEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[MigrationsListReposForUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
