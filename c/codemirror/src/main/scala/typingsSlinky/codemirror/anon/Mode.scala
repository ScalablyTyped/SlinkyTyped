package typingsSlinky.codemirror.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Mode extends js.Object {
  
  var mode: typingsSlinky.codemirror.mod.Mode[_] = js.native
  
  var state: js.Any = js.native
}
object Mode {
  
  @scala.inline
  def apply(mode: typingsSlinky.codemirror.mod.Mode[_], state: js.Any): Mode = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mode]
  }
  
  @scala.inline
  implicit class ModeOps[Self <: Mode] (val x: Self) extends AnyVal {
    
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
    def setMode(value: typingsSlinky.codemirror.mod.Mode[_]): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: js.Any): Self = this.set("state", value.asInstanceOf[js.Any])
  }
}
