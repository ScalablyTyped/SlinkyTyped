package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.ProjectsGetPermissionForUserEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ProjectsGetPermissionForUserResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `832` extends StObject {
  
  var parameters: RequestParameters with (Omit[ProjectsGetPermissionForUserEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[ProjectsGetPermissionForUserResponseData] = js.native
}
object `832` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ProjectsGetPermissionForUserEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ProjectsGetPermissionForUserResponseData]
  ): `832` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`832`]
  }
  
  @scala.inline
  implicit class `832MutableBuilder`[Self <: `832`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[ProjectsGetPermissionForUserEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ProjectsGetPermissionForUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
