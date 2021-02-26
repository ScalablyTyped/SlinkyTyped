package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.PullsListFilesEndpoint
import typingsSlinky.octokitTypes.endpointsMod.PullsListFilesRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.PullsListFilesResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersPullsListFilesEndpoint extends StObject {
  
  var parameters: PullsListFilesEndpoint = js.native
  
  var request: PullsListFilesRequestOptions = js.native
  
  var response: OctokitResponse[PullsListFilesResponseData] = js.native
}
object ParametersPullsListFilesEndpoint {
  
  @scala.inline
  def apply(
    parameters: PullsListFilesEndpoint,
    request: PullsListFilesRequestOptions,
    response: OctokitResponse[PullsListFilesResponseData]
  ): ParametersPullsListFilesEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsListFilesEndpoint]
  }
  
  @scala.inline
  implicit class ParametersPullsListFilesEndpointMutableBuilder[Self <: ParametersPullsListFilesEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: PullsListFilesEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: PullsListFilesRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[PullsListFilesResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
