package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.ProjectsUpdateEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ProjectsUpdateResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `842` extends StObject {
  
  var parameters: RequestParameters with (Omit[ProjectsUpdateEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[ProjectsUpdateResponseData] = js.native
}
object `842` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ProjectsUpdateEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ProjectsUpdateResponseData]
  ): `842` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`842`]
  }
  
  @scala.inline
  implicit class `842MutableBuilder`[Self <: `842`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[ProjectsUpdateEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ProjectsUpdateResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
