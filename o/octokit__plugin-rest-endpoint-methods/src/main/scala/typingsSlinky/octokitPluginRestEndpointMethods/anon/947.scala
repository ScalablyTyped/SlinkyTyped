package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.ReposGetCollaboratorPermissionLevelEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposGetCollaboratorPermissionLevelResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `947` extends StObject {
  
  var parameters: RequestParameters with (Omit[ReposGetCollaboratorPermissionLevelEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[ReposGetCollaboratorPermissionLevelResponseData] = js.native
}
object `947` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposGetCollaboratorPermissionLevelEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposGetCollaboratorPermissionLevelResponseData]
  ): `947` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`947`]
  }
  
  @scala.inline
  implicit class `947MutableBuilder`[Self <: `947`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[ReposGetCollaboratorPermissionLevelEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetCollaboratorPermissionLevelResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
