package typingsSlinky.annyang.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommandOptionRegex extends js.Object {
  
  def callback(): Unit = js.native
  
  var regexp: js.RegExp = js.native
}
object CommandOptionRegex {
  
  @scala.inline
  def apply(callback: () => Unit, regexp: js.RegExp): CommandOptionRegex = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction0(callback), regexp = regexp.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandOptionRegex]
  }
  
  @scala.inline
  implicit class CommandOptionRegexOps[Self <: CommandOptionRegex] (val x: Self) extends AnyVal {
    
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
    def setCallback(value: () => Unit): Self = this.set("callback", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRegexp(value: js.RegExp): Self = this.set("regexp", value.asInstanceOf[js.Any])
  }
}
