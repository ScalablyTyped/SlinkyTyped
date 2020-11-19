package typingsSlinky.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrgsRemoveOutsideCollaboratorResponseData extends js.Object {
  
  var documentation_url: String = js.native
  
  var message: String = js.native
}
object OrgsRemoveOutsideCollaboratorResponseData {
  
  @scala.inline
  def apply(documentation_url: String, message: String): OrgsRemoveOutsideCollaboratorResponseData = {
    val __obj = js.Dynamic.literal(documentation_url = documentation_url.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgsRemoveOutsideCollaboratorResponseData]
  }
  
  @scala.inline
  implicit class OrgsRemoveOutsideCollaboratorResponseDataOps[Self <: OrgsRemoveOutsideCollaboratorResponseData] (val x: Self) extends AnyVal {
    
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
    def setDocumentation_url(value: String): Self = this.set("documentation_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
  }
}
