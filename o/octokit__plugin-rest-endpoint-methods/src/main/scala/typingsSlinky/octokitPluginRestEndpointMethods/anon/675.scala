package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.CodesOfConductGetForRepoEndpoint
import typingsSlinky.octokitTypes.endpointsMod.CodesOfConductGetForRepoResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `675` extends StObject {
  
  var parameters: RequestParameters with (Omit[CodesOfConductGetForRepoEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[CodesOfConductGetForRepoResponseData] = js.native
}
object `675` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[CodesOfConductGetForRepoEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[CodesOfConductGetForRepoResponseData]
  ): `675` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`675`]
  }
  
  @scala.inline
  implicit class `675MutableBuilder`[Self <: `675`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[CodesOfConductGetForRepoEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[CodesOfConductGetForRepoResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
