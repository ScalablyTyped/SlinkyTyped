package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.ReposGetTopReferrersEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposGetTopReferrersResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `973` extends StObject {
  
  var parameters: RequestParameters with (Omit[ReposGetTopReferrersEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[ReposGetTopReferrersResponseData] = js.native
}
object `973` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposGetTopReferrersEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposGetTopReferrersResponseData]
  ): `973` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`973`]
  }
  
  @scala.inline
  implicit class `973MutableBuilder`[Self <: `973`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[ReposGetTopReferrersEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetTopReferrersResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
