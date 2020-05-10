package typingsSlinky.reduxOptimisticUi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptimisticState[TState] extends js.Object {
  /**
    * Before state
    */
  var beforeState: TState = js.native
  /**
    * Current state
    */
  var current: TState = js.native
  /**
    * History list
    * List is Immutable.List<>
    */
  var history: js.Any = js.native
}

object OptimisticState {
  @scala.inline
  def apply[TState](beforeState: TState, current: TState, history: js.Any): OptimisticState[TState] = {
    val __obj = js.Dynamic.literal(beforeState = beforeState.asInstanceOf[js.Any], current = current.asInstanceOf[js.Any], history = history.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptimisticState[TState]]
  }
  @scala.inline
  implicit class OptimisticStateOps[Self[tstate] <: OptimisticState[tstate], TState] (val x: Self[TState]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TState] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TState]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TState] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TState] with Other]
    @scala.inline
    def withBeforeState(value: TState): Self[TState] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrent(value: TState): Self[TState] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("current")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHistory(value: js.Any): Self[TState] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("history")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

