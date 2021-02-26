package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.ProjectsUpdateColumnEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ProjectsUpdateColumnResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `844` extends StObject {
  
  var parameters: RequestParameters with (Omit[ProjectsUpdateColumnEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[ProjectsUpdateColumnResponseData] = js.native
}
object `844` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ProjectsUpdateColumnEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ProjectsUpdateColumnResponseData]
  ): `844` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`844`]
  }
  
  @scala.inline
  implicit class `844MutableBuilder`[Self <: `844`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[ProjectsUpdateColumnEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ProjectsUpdateColumnResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
