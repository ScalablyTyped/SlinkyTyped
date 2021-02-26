package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.MigrationsGetCommitAuthorsEndpoint
import typingsSlinky.octokitTypes.endpointsMod.MigrationsGetCommitAuthorsResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `768` extends StObject {
  
  var parameters: RequestParameters with (Omit[MigrationsGetCommitAuthorsEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[MigrationsGetCommitAuthorsResponseData] = js.native
}
object `768` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[MigrationsGetCommitAuthorsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[MigrationsGetCommitAuthorsResponseData]
  ): `768` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`768`]
  }
  
  @scala.inline
  implicit class `768MutableBuilder`[Self <: `768`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[MigrationsGetCommitAuthorsEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[MigrationsGetCommitAuthorsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
