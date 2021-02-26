package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.GistsListCommentsEndpoint
import typingsSlinky.octokitTypes.endpointsMod.GistsListCommentsResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `687` extends StObject {
  
  var parameters: RequestParameters with (Omit[GistsListCommentsEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[GistsListCommentsResponseData] = js.native
}
object `687` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[GistsListCommentsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[GistsListCommentsResponseData]
  ): `687` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`687`]
  }
  
  @scala.inline
  implicit class `687MutableBuilder`[Self <: `687`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[GistsListCommentsEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[GistsListCommentsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
