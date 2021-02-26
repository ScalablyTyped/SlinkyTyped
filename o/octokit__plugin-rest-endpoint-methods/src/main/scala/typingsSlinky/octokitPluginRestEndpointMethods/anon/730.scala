package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.IssuesGetEventEndpoint
import typingsSlinky.octokitTypes.endpointsMod.IssuesGetEventResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `730` extends StObject {
  
  var parameters: RequestParameters with (Omit[IssuesGetEventEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[IssuesGetEventResponseData] = js.native
}
object `730` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[IssuesGetEventEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[IssuesGetEventResponseData]
  ): `730` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`730`]
  }
  
  @scala.inline
  implicit class `730MutableBuilder`[Self <: `730`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[IssuesGetEventEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[IssuesGetEventResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
