package typingsSlinky.reactTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UseRowStateRowProps[D /* <: js.Object */] extends js.Object {
  var state: UseRowStateLocalState[D, _] = js.native
  def setState(updater: UseRowUpdater[_]): Unit = js.native
}

object UseRowStateRowProps {
  @scala.inline
  def apply[D](setState: UseRowUpdater[_] => Unit, state: UseRowStateLocalState[D, _]): UseRowStateRowProps[D] = {
    val __obj = js.Dynamic.literal(setState = js.Any.fromFunction1(setState), state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseRowStateRowProps[D]]
  }
  @scala.inline
  implicit class UseRowStateRowPropsOps[Self[d] <: UseRowStateRowProps[d], D] (val x: Self[D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[D] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[D] with Other]
    @scala.inline
    def withSetState(value: UseRowUpdater[_] => Unit): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setState")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withState(value: UseRowStateLocalState[D, _]): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

