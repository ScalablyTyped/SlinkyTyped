package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.ReposGetParticipationStatsEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposGetParticipationStatsResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `963` extends StObject {
  
  var parameters: RequestParameters with (Omit[ReposGetParticipationStatsEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[ReposGetParticipationStatsResponseData] = js.native
}
object `963` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposGetParticipationStatsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposGetParticipationStatsResponseData]
  ): `963` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`963`]
  }
  
  @scala.inline
  implicit class `963MutableBuilder`[Self <: `963`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[ReposGetParticipationStatsEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetParticipationStatsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
