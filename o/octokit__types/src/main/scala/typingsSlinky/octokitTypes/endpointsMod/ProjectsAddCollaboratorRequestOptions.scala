package typingsSlinky.octokitTypes.endpointsMod

import typingsSlinky.octokitTypes.octokitTypesStrings.PUT
import typingsSlinky.octokitTypes.octokitTypesStrings.SlashprojectsSlashColonproject_idSlashcollaboratorsSlashColonusername
import typingsSlinky.octokitTypes.requestHeadersMod.RequestHeaders
import typingsSlinky.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectsAddCollaboratorRequestOptions extends js.Object {
  
  var headers: RequestHeaders = js.native
  
  var method: PUT = js.native
  
  var request: RequestRequestOptions = js.native
  
  var url: SlashprojectsSlashColonproject_idSlashcollaboratorsSlashColonusername = js.native
}
object ProjectsAddCollaboratorRequestOptions {
  
  @scala.inline
  def apply(
    headers: RequestHeaders,
    method: PUT,
    request: RequestRequestOptions,
    url: SlashprojectsSlashColonproject_idSlashcollaboratorsSlashColonusername
  ): ProjectsAddCollaboratorRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsAddCollaboratorRequestOptions]
  }
  
  @scala.inline
  implicit class ProjectsAddCollaboratorRequestOptionsOps[Self <: ProjectsAddCollaboratorRequestOptions] (val x: Self) extends AnyVal {
    
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
    def setHeaders(value: RequestHeaders): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: PUT): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: RequestRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: SlashprojectsSlashColonproject_idSlashcollaboratorsSlashColonusername): Self = this.set("url", value.asInstanceOf[js.Any])
  }
}
