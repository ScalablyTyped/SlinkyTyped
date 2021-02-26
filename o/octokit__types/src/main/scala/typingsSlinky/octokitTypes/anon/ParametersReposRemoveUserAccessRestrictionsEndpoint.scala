package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ReposRemoveUserAccessRestrictionsEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposRemoveUserAccessRestrictionsRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ReposRemoveUserAccessRestrictionsResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposRemoveUserAccessRestrictionsEndpoint extends StObject {
  
  var parameters: ReposRemoveUserAccessRestrictionsEndpoint = js.native
  
  var request: ReposRemoveUserAccessRestrictionsRequestOptions = js.native
  
  var response: OctokitResponse[ReposRemoveUserAccessRestrictionsResponseData] = js.native
}
object ParametersReposRemoveUserAccessRestrictionsEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposRemoveUserAccessRestrictionsEndpoint,
    request: ReposRemoveUserAccessRestrictionsRequestOptions,
    response: OctokitResponse[ReposRemoveUserAccessRestrictionsResponseData]
  ): ParametersReposRemoveUserAccessRestrictionsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposRemoveUserAccessRestrictionsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposRemoveUserAccessRestrictionsEndpointMutableBuilder[Self <: ParametersReposRemoveUserAccessRestrictionsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposRemoveUserAccessRestrictionsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposRemoveUserAccessRestrictionsRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposRemoveUserAccessRestrictionsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
