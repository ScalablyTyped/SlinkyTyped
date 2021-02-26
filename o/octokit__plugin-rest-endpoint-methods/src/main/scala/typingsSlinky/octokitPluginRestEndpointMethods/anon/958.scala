package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.ReposGetDeploymentStatusEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposGetDeploymentStatusResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `958` extends StObject {
  
  var parameters: RequestParameters with (Omit[ReposGetDeploymentStatusEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[ReposGetDeploymentStatusResponseData] = js.native
}
object `958` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposGetDeploymentStatusEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposGetDeploymentStatusResponseData]
  ): `958` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`958`]
  }
  
  @scala.inline
  implicit class `958MutableBuilder`[Self <: `958`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[ReposGetDeploymentStatusEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetDeploymentStatusResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
