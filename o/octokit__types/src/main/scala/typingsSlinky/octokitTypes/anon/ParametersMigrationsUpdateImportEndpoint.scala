package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.MigrationsUpdateImportEndpoint
import typingsSlinky.octokitTypes.endpointsMod.MigrationsUpdateImportRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.MigrationsUpdateImportResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersMigrationsUpdateImportEndpoint extends js.Object {
  
  var parameters: MigrationsUpdateImportEndpoint = js.native
  
  var request: MigrationsUpdateImportRequestOptions = js.native
  
  var response: OctokitResponse[MigrationsUpdateImportResponseData] = js.native
}
object ParametersMigrationsUpdateImportEndpoint {
  
  @scala.inline
  def apply(
    parameters: MigrationsUpdateImportEndpoint,
    request: MigrationsUpdateImportRequestOptions,
    response: OctokitResponse[MigrationsUpdateImportResponseData]
  ): ParametersMigrationsUpdateImportEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersMigrationsUpdateImportEndpoint]
  }
  
  @scala.inline
  implicit class ParametersMigrationsUpdateImportEndpointOps[Self <: ParametersMigrationsUpdateImportEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setParameters(value: MigrationsUpdateImportEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: MigrationsUpdateImportRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[MigrationsUpdateImportResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
