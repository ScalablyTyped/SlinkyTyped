package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.AppsListReposAccessibleToInstallationEndpoint
import typingsSlinky.octokitTypes.endpointsMod.AppsListReposAccessibleToInstallationResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `643` extends StObject {
  
  var parameters: RequestParameters with (Omit[AppsListReposAccessibleToInstallationEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[AppsListReposAccessibleToInstallationResponseData] = js.native
}
object `643` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[AppsListReposAccessibleToInstallationEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[AppsListReposAccessibleToInstallationResponseData]
  ): `643` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`643`]
  }
  
  @scala.inline
  implicit class `643MutableBuilder`[Self <: `643`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[AppsListReposAccessibleToInstallationEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[AppsListReposAccessibleToInstallationResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
