package typingsSlinky.rcEasyui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Buttons extends js.Object {
  
  var buttons: js.Array[_] = js.native
  
  var defaultCancel: String = js.native
  
  var defaultOk: String = js.native
}
object Buttons {
  
  @scala.inline
  def apply(buttons: js.Array[_], defaultCancel: String, defaultOk: String): Buttons = {
    val __obj = js.Dynamic.literal(buttons = buttons.asInstanceOf[js.Any], defaultCancel = defaultCancel.asInstanceOf[js.Any], defaultOk = defaultOk.asInstanceOf[js.Any])
    __obj.asInstanceOf[Buttons]
  }
  
  @scala.inline
  implicit class ButtonsOps[Self <: Buttons] (val x: Self) extends AnyVal {
    
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
    def setButtonsVarargs(value: js.Any*): Self = this.set("buttons", js.Array(value :_*))
    
    @scala.inline
    def setButtons(value: js.Array[_]): Self = this.set("buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultCancel(value: String): Self = this.set("defaultCancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultOk(value: String): Self = this.set("defaultOk", value.asInstanceOf[js.Any])
  }
}
