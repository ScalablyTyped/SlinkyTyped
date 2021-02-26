package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.ReposGetLatestPagesBuildEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposGetLatestPagesBuildResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `959` extends StObject {
  
  var parameters: RequestParameters with (Omit[ReposGetLatestPagesBuildEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[ReposGetLatestPagesBuildResponseData] = js.native
}
object `959` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposGetLatestPagesBuildEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposGetLatestPagesBuildResponseData]
  ): `959` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`959`]
  }
  
  @scala.inline
  implicit class `959MutableBuilder`[Self <: `959`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[ReposGetLatestPagesBuildEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetLatestPagesBuildResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
