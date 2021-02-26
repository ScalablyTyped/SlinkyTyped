package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.OrgsRemoveOutsideCollaboratorEndpoint
import typingsSlinky.octokitTypes.endpointsMod.OrgsRemoveOutsideCollaboratorResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `812` extends StObject {
  
  var parameters: RequestParameters with (Omit[OrgsRemoveOutsideCollaboratorEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[OrgsRemoveOutsideCollaboratorResponseData] = js.native
}
object `812` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[OrgsRemoveOutsideCollaboratorEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[OrgsRemoveOutsideCollaboratorResponseData]
  ): `812` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`812`]
  }
  
  @scala.inline
  implicit class `812MutableBuilder`[Self <: `812`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[OrgsRemoveOutsideCollaboratorEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[OrgsRemoveOutsideCollaboratorResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
