package typingsSlinky.rmcInputNumber.baseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StateType extends js.Object {
  
  var focused: js.UndefOr[Boolean] = js.native
  
  var inputValue: js.UndefOr[Double] = js.native
  
  var value: Double = js.native
}
object StateType {
  
  @scala.inline
  def apply(value: Double): StateType = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateType]
  }
  
  @scala.inline
  implicit class StateTypeOps[Self <: StateType] (val x: Self) extends AnyVal {
    
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
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocused(value: Boolean): Self = this.set("focused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocused: Self = this.set("focused", js.undefined)
    
    @scala.inline
    def setInputValue(value: Double): Self = this.set("inputValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputValue: Self = this.set("inputValue", js.undefined)
  }
}
