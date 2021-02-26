package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.AppsGetOrgInstallationEndpoint
import typingsSlinky.octokitTypes.endpointsMod.AppsGetOrgInstallationResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `631` extends StObject {
  
  var parameters: RequestParameters with (Omit[AppsGetOrgInstallationEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[AppsGetOrgInstallationResponseData] = js.native
}
object `631` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[AppsGetOrgInstallationEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[AppsGetOrgInstallationResponseData]
  ): `631` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`631`]
  }
  
  @scala.inline
  implicit class `631MutableBuilder`[Self <: `631`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[AppsGetOrgInstallationEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[AppsGetOrgInstallationResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
