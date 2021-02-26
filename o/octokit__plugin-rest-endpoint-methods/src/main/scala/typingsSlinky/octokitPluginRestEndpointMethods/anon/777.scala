package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.MigrationsMapCommitAuthorEndpoint
import typingsSlinky.octokitTypes.endpointsMod.MigrationsMapCommitAuthorResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `777` extends StObject {
  
  var parameters: RequestParameters with (Omit[MigrationsMapCommitAuthorEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[MigrationsMapCommitAuthorResponseData] = js.native
}
object `777` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[MigrationsMapCommitAuthorEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[MigrationsMapCommitAuthorResponseData]
  ): `777` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`777`]
  }
  
  @scala.inline
  implicit class `777MutableBuilder`[Self <: `777`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[MigrationsMapCommitAuthorEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[MigrationsMapCommitAuthorResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
