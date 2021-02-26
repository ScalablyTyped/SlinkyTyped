package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.PullsListFilesEndpoint
import typingsSlinky.octokitTypes.endpointsMod.PullsListFilesResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `859` extends StObject {
  
  var parameters: RequestParameters with (Omit[PullsListFilesEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[PullsListFilesResponseData] = js.native
}
object `859` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[PullsListFilesEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[PullsListFilesResponseData]
  ): `859` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`859`]
  }
  
  @scala.inline
  implicit class `859MutableBuilder`[Self <: `859`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[PullsListFilesEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[PullsListFilesResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
