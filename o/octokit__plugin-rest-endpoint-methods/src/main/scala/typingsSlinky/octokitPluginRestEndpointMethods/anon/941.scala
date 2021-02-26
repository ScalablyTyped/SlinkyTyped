package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.ReposGetAllTopicsEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposGetAllTopicsResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `941` extends StObject {
  
  var parameters: RequestParameters with (Omit[ReposGetAllTopicsEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[ReposGetAllTopicsResponseData] = js.native
}
object `941` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposGetAllTopicsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposGetAllTopicsResponseData]
  ): `941` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`941`]
  }
  
  @scala.inline
  implicit class `941MutableBuilder`[Self <: `941`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[ReposGetAllTopicsEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetAllTopicsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
