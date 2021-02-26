package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.ReposAddCollaboratorEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposAddCollaboratorResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `894` extends StObject {
  
  var parameters: RequestParameters with (Omit[ReposAddCollaboratorEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[ReposAddCollaboratorResponseData] = js.native
}
object `894` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposAddCollaboratorEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposAddCollaboratorResponseData]
  ): `894` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`894`]
  }
  
  @scala.inline
  implicit class `894MutableBuilder`[Self <: `894`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[ReposAddCollaboratorEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposAddCollaboratorResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
