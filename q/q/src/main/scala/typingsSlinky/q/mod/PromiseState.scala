package typingsSlinky.q.mod

import typingsSlinky.q.qStrings.fulfilled
import typingsSlinky.q.qStrings.pending
import typingsSlinky.q.qStrings.rejected
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PromiseState[T] extends js.Object {
  
  var reason: js.UndefOr[js.Any] = js.native
  
  var state: fulfilled | rejected | pending = js.native
  
  var value: js.UndefOr[T] = js.native
}
object PromiseState {
  
  @scala.inline
  def apply[T](state: fulfilled | rejected | pending): PromiseState[T] = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromiseState[T]]
  }
  
  @scala.inline
  implicit class PromiseStateOps[Self <: PromiseState[_], T] (val x: Self with PromiseState[T]) extends AnyVal {
    
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
    def setState(value: fulfilled | rejected | pending): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: js.Any): Self = this.set("reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReason: Self = this.set("reason", js.undefined)
    
    @scala.inline
    def setValue(value: T): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
