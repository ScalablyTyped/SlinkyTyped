package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.ReposGetCommitActivityStatsEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposGetCommitActivityStatsResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `950` extends StObject {
  
  var parameters: RequestParameters with (Omit[ReposGetCommitActivityStatsEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[ReposGetCommitActivityStatsResponseData] = js.native
}
object `950` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposGetCommitActivityStatsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposGetCommitActivityStatsResponseData]
  ): `950` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`950`]
  }
  
  @scala.inline
  implicit class `950MutableBuilder`[Self <: `950`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[ReposGetCommitActivityStatsEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetCommitActivityStatsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
