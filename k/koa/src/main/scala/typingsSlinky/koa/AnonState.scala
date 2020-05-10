package typingsSlinky.koa

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonState[StateT] extends js.Object {
  var state: StateT = js.native
}

object AnonState {
  @scala.inline
  def apply[StateT](state: StateT): AnonState[StateT] = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonState[StateT]]
  }
  @scala.inline
  implicit class AnonStateOps[Self[statet] <: AnonState[statet], StateT] (val x: Self[StateT]) extends AnyVal {
    @scala.inline
    def duplicate: Self[StateT] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[StateT]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[StateT] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[StateT] with Other]
    @scala.inline
    def withState(value: StateT): Self[StateT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

