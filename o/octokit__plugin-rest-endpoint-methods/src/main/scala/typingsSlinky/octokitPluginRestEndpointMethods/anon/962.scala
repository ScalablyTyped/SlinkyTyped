package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.ReposGetPagesBuildEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposGetPagesBuildResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `962` extends StObject {
  
  var parameters: RequestParameters with (Omit[ReposGetPagesBuildEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[ReposGetPagesBuildResponseData] = js.native
}
object `962` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposGetPagesBuildEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposGetPagesBuildResponseData]
  ): `962` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`962`]
  }
  
  @scala.inline
  implicit class `962MutableBuilder`[Self <: `962`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[ReposGetPagesBuildEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetPagesBuildResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
