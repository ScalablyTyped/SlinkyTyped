package typingsSlinky.gitParse.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileRename extends js.Object {
  
  var newPath: String = js.native
  
  var oldPath: String = js.native
}
object FileRename {
  
  @scala.inline
  def apply(newPath: String, oldPath: String): FileRename = {
    val __obj = js.Dynamic.literal(newPath = newPath.asInstanceOf[js.Any], oldPath = oldPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileRename]
  }
  
  @scala.inline
  implicit class FileRenameOps[Self <: FileRename] (val x: Self) extends AnyVal {
    
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
    def setNewPath(value: String): Self = this.set("newPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldPath(value: String): Self = this.set("oldPath", value.asInstanceOf[js.Any])
  }
}
