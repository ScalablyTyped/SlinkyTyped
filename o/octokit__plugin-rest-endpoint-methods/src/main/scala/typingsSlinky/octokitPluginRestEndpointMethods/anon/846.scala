package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.PullsCreateEndpoint
import typingsSlinky.octokitTypes.endpointsMod.PullsCreateResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `846` extends StObject {
  
  var parameters: RequestParameters with (Omit[PullsCreateEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[PullsCreateResponseData] = js.native
}
object `846` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[PullsCreateEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[PullsCreateResponseData]
  ): `846` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`846`]
  }
  
  @scala.inline
  implicit class `846MutableBuilder`[Self <: `846`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[PullsCreateEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[PullsCreateResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
