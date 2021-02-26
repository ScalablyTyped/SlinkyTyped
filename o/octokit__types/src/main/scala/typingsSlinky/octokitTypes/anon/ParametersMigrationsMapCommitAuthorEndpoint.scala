package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.MigrationsMapCommitAuthorEndpoint
import typingsSlinky.octokitTypes.endpointsMod.MigrationsMapCommitAuthorRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.MigrationsMapCommitAuthorResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersMigrationsMapCommitAuthorEndpoint extends StObject {
  
  var parameters: MigrationsMapCommitAuthorEndpoint = js.native
  
  var request: MigrationsMapCommitAuthorRequestOptions = js.native
  
  var response: OctokitResponse[MigrationsMapCommitAuthorResponseData] = js.native
}
object ParametersMigrationsMapCommitAuthorEndpoint {
  
  @scala.inline
  def apply(
    parameters: MigrationsMapCommitAuthorEndpoint,
    request: MigrationsMapCommitAuthorRequestOptions,
    response: OctokitResponse[MigrationsMapCommitAuthorResponseData]
  ): ParametersMigrationsMapCommitAuthorEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersMigrationsMapCommitAuthorEndpoint]
  }
  
  @scala.inline
  implicit class ParametersMigrationsMapCommitAuthorEndpointMutableBuilder[Self <: ParametersMigrationsMapCommitAuthorEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: MigrationsMapCommitAuthorEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: MigrationsMapCommitAuthorRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[MigrationsMapCommitAuthorResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
