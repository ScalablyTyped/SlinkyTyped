package typingsSlinky.baseui.buttonGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait State extends js.Object {
  
  var selected: js.Array[Double] = js.native
}
object State {
  
  @scala.inline
  def apply(selected: js.Array[Double]): State = {
    val __obj = js.Dynamic.literal(selected = selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
  
  @scala.inline
  implicit class StateOps[Self <: State] (val x: Self) extends AnyVal {
    
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
    def setSelectedVarargs(value: Double*): Self = this.set("selected", js.Array(value :_*))
    
    @scala.inline
    def setSelected(value: js.Array[Double]): Self = this.set("selected", value.asInstanceOf[js.Any])
  }
}
