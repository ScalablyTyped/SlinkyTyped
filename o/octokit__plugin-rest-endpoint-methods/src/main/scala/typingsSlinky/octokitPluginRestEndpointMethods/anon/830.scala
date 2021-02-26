package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.ProjectsGetCardEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ProjectsGetCardResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `830` extends StObject {
  
  var parameters: RequestParameters with (Omit[ProjectsGetCardEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[ProjectsGetCardResponseData] = js.native
}
object `830` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ProjectsGetCardEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ProjectsGetCardResponseData]
  ): `830` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`830`]
  }
  
  @scala.inline
  implicit class `830MutableBuilder`[Self <: `830`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[ProjectsGetCardEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ProjectsGetCardResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
