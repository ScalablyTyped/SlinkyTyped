package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.AppsGetRepoInstallationEndpoint
import typingsSlinky.octokitTypes.endpointsMod.AppsGetRepoInstallationResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `632` extends StObject {
  
  var parameters: RequestParameters with (Omit[AppsGetRepoInstallationEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[AppsGetRepoInstallationResponseData] = js.native
}
object `632` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[AppsGetRepoInstallationEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[AppsGetRepoInstallationResponseData]
  ): `632` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`632`]
  }
  
  @scala.inline
  implicit class `632MutableBuilder`[Self <: `632`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[AppsGetRepoInstallationEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[AppsGetRepoInstallationResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
