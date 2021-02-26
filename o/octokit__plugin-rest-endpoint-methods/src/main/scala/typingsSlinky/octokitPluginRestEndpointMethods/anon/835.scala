package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.ProjectsListColumnsEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ProjectsListColumnsResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `835` extends StObject {
  
  var parameters: RequestParameters with (Omit[ProjectsListColumnsEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[ProjectsListColumnsResponseData] = js.native
}
object `835` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ProjectsListColumnsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ProjectsListColumnsResponseData]
  ): `835` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`835`]
  }
  
  @scala.inline
  implicit class `835MutableBuilder`[Self <: `835`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[ProjectsListColumnsEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ProjectsListColumnsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
