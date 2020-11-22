package typingsSlinky.reactNativeFirebaseApp.mod.Utils_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Statics extends js.Object {
  
  var FilePath: typingsSlinky.reactNativeFirebaseApp.mod.Utils_.FilePath = js.native
}
object Statics {
  
  @scala.inline
  def apply(FilePath: FilePath): Statics = {
    val __obj = js.Dynamic.literal(FilePath = FilePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statics]
  }
  
  @scala.inline
  implicit class StaticsOps[Self <: Statics] (val x: Self) extends AnyVal {
    
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
    def setFilePath(value: FilePath): Self = this.set("FilePath", value.asInstanceOf[js.Any])
  }
}
