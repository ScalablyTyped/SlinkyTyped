package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.ReposGetPunchCardStatsEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposGetPunchCardStatsResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `965` extends StObject {
  
  var parameters: RequestParameters with (Omit[ReposGetPunchCardStatsEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[ReposGetPunchCardStatsResponseData] = js.native
}
object `965` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposGetPunchCardStatsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposGetPunchCardStatsResponseData]
  ): `965` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`965`]
  }
  
  @scala.inline
  implicit class `965MutableBuilder`[Self <: `965`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[ReposGetPunchCardStatsEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetPunchCardStatsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
