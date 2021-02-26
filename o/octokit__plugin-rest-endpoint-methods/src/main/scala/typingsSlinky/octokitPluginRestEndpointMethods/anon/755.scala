package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.IssuesUpdateLabelEndpoint
import typingsSlinky.octokitTypes.endpointsMod.IssuesUpdateLabelResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `755` extends StObject {
  
  var parameters: RequestParameters with (Omit[IssuesUpdateLabelEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[IssuesUpdateLabelResponseData] = js.native
}
object `755` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[IssuesUpdateLabelEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[IssuesUpdateLabelResponseData]
  ): `755` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`755`]
  }
  
  @scala.inline
  implicit class `755MutableBuilder`[Self <: `755`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[IssuesUpdateLabelEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[IssuesUpdateLabelResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
