package typingsSlinky.reactDndHtml5Backend.enterLeaveCounterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnterLeaveCounter extends js.Object {
  var entered: js.Any = js.native
  var isNodeInDocument: js.Any = js.native
  def enter(enteringNode: js.Any): Boolean = js.native
  def leave(leavingNode: js.Any): Boolean = js.native
  def reset(): Unit = js.native
}

object EnterLeaveCounter {
  @scala.inline
  def apply(
    enter: js.Any => Boolean,
    entered: js.Any,
    isNodeInDocument: js.Any,
    leave: js.Any => Boolean,
    reset: () => Unit
  ): EnterLeaveCounter = {
    val __obj = js.Dynamic.literal(enter = js.Any.fromFunction1(enter), entered = entered.asInstanceOf[js.Any], isNodeInDocument = isNodeInDocument.asInstanceOf[js.Any], leave = js.Any.fromFunction1(leave), reset = js.Any.fromFunction0(reset))
    __obj.asInstanceOf[EnterLeaveCounter]
  }
  @scala.inline
  implicit class EnterLeaveCounterOps[Self <: EnterLeaveCounter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnter(value: js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEntered(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsNodeInDocument(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isNodeInDocument")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeave(value: js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leave")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReset(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

