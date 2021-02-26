package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.ProjectsUpdateCardEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ProjectsUpdateCardResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `843` extends StObject {
  
  var parameters: RequestParameters with (Omit[ProjectsUpdateCardEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[ProjectsUpdateCardResponseData] = js.native
}
object `843` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ProjectsUpdateCardEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ProjectsUpdateCardResponseData]
  ): `843` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`843`]
  }
  
  @scala.inline
  implicit class `843MutableBuilder`[Self <: `843`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[ProjectsUpdateCardEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ProjectsUpdateCardResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
