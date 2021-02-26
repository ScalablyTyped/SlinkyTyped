package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.ReposGetCommunityProfileMetricsEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposGetCommunityProfileMetricsResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `953` extends StObject {
  
  var parameters: RequestParameters with (Omit[ReposGetCommunityProfileMetricsEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[ReposGetCommunityProfileMetricsResponseData] = js.native
}
object `953` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposGetCommunityProfileMetricsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposGetCommunityProfileMetricsResponseData]
  ): `953` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`953`]
  }
  
  @scala.inline
  implicit class `953MutableBuilder`[Self <: `953`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[ReposGetCommunityProfileMetricsEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetCommunityProfileMetricsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
