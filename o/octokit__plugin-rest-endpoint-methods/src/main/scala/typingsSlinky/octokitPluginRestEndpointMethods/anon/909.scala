package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.ReposCreateForkEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposCreateForkResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `909` extends StObject {
  
  var parameters: RequestParameters with (Omit[ReposCreateForkEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[ReposCreateForkResponseData] = js.native
}
object `909` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposCreateForkEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposCreateForkResponseData]
  ): `909` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`909`]
  }
  
  @scala.inline
  implicit class `909MutableBuilder`[Self <: `909`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[ReposCreateForkEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposCreateForkResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
