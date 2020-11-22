package typingsSlinky.antd.textAreaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextAreaState extends js.Object {
  
  /** `value` from prev props */
  var prevValue: js.Any = js.native
  
  var value: js.Any = js.native
}
object TextAreaState {
  
  @scala.inline
  def apply(prevValue: js.Any, value: js.Any): TextAreaState = {
    val __obj = js.Dynamic.literal(prevValue = prevValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextAreaState]
  }
  
  @scala.inline
  implicit class TextAreaStateOps[Self <: TextAreaState] (val x: Self) extends AnyVal {
    
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
    def setPrevValue(value: js.Any): Self = this.set("prevValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
