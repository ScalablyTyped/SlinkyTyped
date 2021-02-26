package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ReposCreateCommitStatusEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposCreateCommitStatusRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ReposCreateCommitStatusResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposCreateCommitStatusEndpoint extends StObject {
  
  var parameters: ReposCreateCommitStatusEndpoint = js.native
  
  var request: ReposCreateCommitStatusRequestOptions = js.native
  
  var response: OctokitResponse[ReposCreateCommitStatusResponseData] = js.native
}
object ParametersReposCreateCommitStatusEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposCreateCommitStatusEndpoint,
    request: ReposCreateCommitStatusRequestOptions,
    response: OctokitResponse[ReposCreateCommitStatusResponseData]
  ): ParametersReposCreateCommitStatusEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposCreateCommitStatusEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposCreateCommitStatusEndpointMutableBuilder[Self <: ParametersReposCreateCommitStatusEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposCreateCommitStatusEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposCreateCommitStatusRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposCreateCommitStatusResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
