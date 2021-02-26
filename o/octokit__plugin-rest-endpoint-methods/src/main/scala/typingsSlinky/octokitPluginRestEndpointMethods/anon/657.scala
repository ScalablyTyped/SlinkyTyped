package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.ChecksCreateEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ChecksCreateResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `657` extends StObject {
  
  var parameters: RequestParameters with (Omit[ChecksCreateEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[ChecksCreateResponseData] = js.native
}
object `657` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ChecksCreateEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ChecksCreateResponseData]
  ): `657` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`657`]
  }
  
  @scala.inline
  implicit class `657MutableBuilder`[Self <: `657`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[ChecksCreateEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ChecksCreateResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
