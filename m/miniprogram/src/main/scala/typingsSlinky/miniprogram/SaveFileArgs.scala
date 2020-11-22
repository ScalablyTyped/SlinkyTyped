package typingsSlinky.miniprogram

import typingsSlinky.miniprogram.anon.ApFilePath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SaveFileArgs extends AsyncCallback[ApFilePath] {
  
  var apFilePath: String = js.native
}
object SaveFileArgs {
  
  @scala.inline
  def apply(apFilePath: String): SaveFileArgs = {
    val __obj = js.Dynamic.literal(apFilePath = apFilePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaveFileArgs]
  }
  
  @scala.inline
  implicit class SaveFileArgsOps[Self <: SaveFileArgs] (val x: Self) extends AnyVal {
    
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
    def setApFilePath(value: String): Self = this.set("apFilePath", value.asInstanceOf[js.Any])
  }
}
