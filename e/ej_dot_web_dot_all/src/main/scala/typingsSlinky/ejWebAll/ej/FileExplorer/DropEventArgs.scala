package typingsSlinky.ejWebAll.ej.FileExplorer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DropEventArgs extends js.Object {
  
  /** set to true when the event has to be canceled, else false.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  
  /** returns the action, which is performed after dropping the files (upload/ move).
    */
  var dropAction: js.UndefOr[String] = js.native
  
  /** returns the dragging element details.
    */
  var fileInfo: js.UndefOr[js.Any] = js.native
  
  /** returns the FileExplorer model.
    */
  var model: js.UndefOr[Model] = js.native
  
  /** returns the target element.
    */
  var target: js.UndefOr[js.Any] = js.native
  
  /** returns the name of target folder.
    */
  var targetFolder: js.UndefOr[String] = js.native
  
  /** returns the path of target folder.
    */
  var targetPath: js.UndefOr[String] = js.native
  
  /** returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.native
}
object DropEventArgs {
  
  @scala.inline
  def apply(): DropEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropEventArgs]
  }
  
  @scala.inline
  implicit class DropEventArgsOps[Self <: DropEventArgs] (val x: Self) extends AnyVal {
    
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
    def setCancel(value: Boolean): Self = this.set("cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    
    @scala.inline
    def setDropAction(value: String): Self = this.set("dropAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDropAction: Self = this.set("dropAction", js.undefined)
    
    @scala.inline
    def setFileInfo(value: js.Any): Self = this.set("fileInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileInfo: Self = this.set("fileInfo", js.undefined)
    
    @scala.inline
    def setModel(value: Model): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    
    @scala.inline
    def setTarget(value: js.Any): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    
    @scala.inline
    def setTargetFolder(value: String): Self = this.set("targetFolder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetFolder: Self = this.set("targetFolder", js.undefined)
    
    @scala.inline
    def setTargetPath(value: String): Self = this.set("targetPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetPath: Self = this.set("targetPath", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
