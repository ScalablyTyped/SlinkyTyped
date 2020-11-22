package typingsSlinky.asana.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined asana.asana.resources.Tasks.CreateParams & {  workspace :string} */
@js.native
trait CreateParamsworkspacestriCompleted extends js.Object {
  
  var completed: js.UndefOr[Boolean] = js.native
  
  var custom_fields: js.UndefOr[js.Object] = js.native
  
  var hearted: js.UndefOr[Boolean] = js.native
  
  var name: String = js.native
  
  var notes: js.UndefOr[String] = js.native
  
  var workspace: String = js.native
}
object CreateParamsworkspacestriCompleted {
  
  @scala.inline
  def apply(name: String, workspace: String): CreateParamsworkspacestriCompleted = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], workspace = workspace.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateParamsworkspacestriCompleted]
  }
  
  @scala.inline
  implicit class CreateParamsworkspacestriCompletedOps[Self <: CreateParamsworkspacestriCompleted] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkspace(value: String): Self = this.set("workspace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompleted(value: Boolean): Self = this.set("completed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompleted: Self = this.set("completed", js.undefined)
    
    @scala.inline
    def setCustom_fields(value: js.Object): Self = this.set("custom_fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustom_fields: Self = this.set("custom_fields", js.undefined)
    
    @scala.inline
    def setHearted(value: Boolean): Self = this.set("hearted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHearted: Self = this.set("hearted", js.undefined)
    
    @scala.inline
    def setNotes(value: String): Self = this.set("notes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotes: Self = this.set("notes", js.undefined)
  }
}
