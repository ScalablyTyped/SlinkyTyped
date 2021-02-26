package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.ProjectsListCollaboratorsEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ProjectsListCollaboratorsResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `834` extends StObject {
  
  var parameters: RequestParameters with (Omit[ProjectsListCollaboratorsEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[ProjectsListCollaboratorsResponseData] = js.native
}
object `834` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ProjectsListCollaboratorsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ProjectsListCollaboratorsResponseData]
  ): `834` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`834`]
  }
  
  @scala.inline
  implicit class `834MutableBuilder`[Self <: `834`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[ProjectsListCollaboratorsEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ProjectsListCollaboratorsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
