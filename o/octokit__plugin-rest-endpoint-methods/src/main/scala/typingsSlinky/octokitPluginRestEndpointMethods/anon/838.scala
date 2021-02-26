package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.ProjectsListForUserEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ProjectsListForUserResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `838` extends StObject {
  
  var parameters: RequestParameters with (Omit[ProjectsListForUserEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[ProjectsListForUserResponseData] = js.native
}
object `838` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ProjectsListForUserEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ProjectsListForUserResponseData]
  ): `838` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`838`]
  }
  
  @scala.inline
  implicit class `838MutableBuilder`[Self <: `838`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[ProjectsListForUserEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ProjectsListForUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
