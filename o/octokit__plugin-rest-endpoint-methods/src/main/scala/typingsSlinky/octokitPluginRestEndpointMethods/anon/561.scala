package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.ActionsGetArtifactEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ActionsGetArtifactResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `561` extends StObject {
  
  var parameters: RequestParameters with (Omit[ActionsGetArtifactEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[ActionsGetArtifactResponseData] = js.native
}
object `561` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ActionsGetArtifactEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ActionsGetArtifactResponseData]
  ): `561` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`561`]
  }
  
  @scala.inline
  implicit class `561MutableBuilder`[Self <: `561`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[ActionsGetArtifactEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsGetArtifactResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
