package typingsSlinky.rsvp.mod.RSVP

import typingsSlinky.rsvp.mod.RSVP.State.fulfilled
import typingsSlinky.rsvp.mod.RSVP.State.pending
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _PromiseState[T] extends js.Object
object _PromiseState {
  
  @scala.inline
  def Resolved[T](state: fulfilled, value: T): _PromiseState[T] = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[_PromiseState[T]]
  }
  
  @scala.inline
  def Pending[T](state: pending): _PromiseState[T] = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[_PromiseState[T]]
  }
}
