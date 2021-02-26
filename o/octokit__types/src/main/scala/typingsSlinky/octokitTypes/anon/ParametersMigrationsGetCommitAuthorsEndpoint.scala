package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.MigrationsGetCommitAuthorsEndpoint
import typingsSlinky.octokitTypes.endpointsMod.MigrationsGetCommitAuthorsRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.MigrationsGetCommitAuthorsResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersMigrationsGetCommitAuthorsEndpoint extends StObject {
  
  var parameters: MigrationsGetCommitAuthorsEndpoint = js.native
  
  var request: MigrationsGetCommitAuthorsRequestOptions = js.native
  
  var response: OctokitResponse[MigrationsGetCommitAuthorsResponseData] = js.native
}
object ParametersMigrationsGetCommitAuthorsEndpoint {
  
  @scala.inline
  def apply(
    parameters: MigrationsGetCommitAuthorsEndpoint,
    request: MigrationsGetCommitAuthorsRequestOptions,
    response: OctokitResponse[MigrationsGetCommitAuthorsResponseData]
  ): ParametersMigrationsGetCommitAuthorsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersMigrationsGetCommitAuthorsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersMigrationsGetCommitAuthorsEndpointMutableBuilder[Self <: ParametersMigrationsGetCommitAuthorsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: MigrationsGetCommitAuthorsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: MigrationsGetCommitAuthorsRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[MigrationsGetCommitAuthorsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
