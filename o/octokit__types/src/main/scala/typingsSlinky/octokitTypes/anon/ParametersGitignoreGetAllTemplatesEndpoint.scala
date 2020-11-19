package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.GitignoreGetAllTemplatesEndpoint
import typingsSlinky.octokitTypes.endpointsMod.GitignoreGetAllTemplatesRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.GitignoreGetAllTemplatesResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersGitignoreGetAllTemplatesEndpoint extends js.Object {
  
  var parameters: GitignoreGetAllTemplatesEndpoint = js.native
  
  var request: GitignoreGetAllTemplatesRequestOptions = js.native
  
  var response: OctokitResponse[GitignoreGetAllTemplatesResponseData] = js.native
}
object ParametersGitignoreGetAllTemplatesEndpoint {
  
  @scala.inline
  def apply(
    parameters: GitignoreGetAllTemplatesEndpoint,
    request: GitignoreGetAllTemplatesRequestOptions,
    response: OctokitResponse[GitignoreGetAllTemplatesResponseData]
  ): ParametersGitignoreGetAllTemplatesEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGitignoreGetAllTemplatesEndpoint]
  }
  
  @scala.inline
  implicit class ParametersGitignoreGetAllTemplatesEndpointOps[Self <: ParametersGitignoreGetAllTemplatesEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: GitignoreGetAllTemplatesEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: GitignoreGetAllTemplatesRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[GitignoreGetAllTemplatesResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
