package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.GistsListCommitsEndpoint
import typingsSlinky.octokitTypes.endpointsMod.GistsListCommitsResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `688` extends StObject {
  
  var parameters: RequestParameters with (Omit[GistsListCommitsEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[GistsListCommitsResponseData] = js.native
}
object `688` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[GistsListCommitsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[GistsListCommitsResponseData]
  ): `688` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`688`]
  }
  
  @scala.inline
  implicit class `688MutableBuilder`[Self <: `688`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[GistsListCommitsEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[GistsListCommitsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
