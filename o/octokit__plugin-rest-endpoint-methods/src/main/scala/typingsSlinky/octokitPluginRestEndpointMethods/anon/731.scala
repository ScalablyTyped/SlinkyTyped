package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.IssuesGetLabelEndpoint
import typingsSlinky.octokitTypes.endpointsMod.IssuesGetLabelResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `731` extends StObject {
  
  var parameters: RequestParameters with (Omit[IssuesGetLabelEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[IssuesGetLabelResponseData] = js.native
}
object `731` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[IssuesGetLabelEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[IssuesGetLabelResponseData]
  ): `731` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`731`]
  }
  
  @scala.inline
  implicit class `731MutableBuilder`[Self <: `731`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[IssuesGetLabelEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[IssuesGetLabelResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
