package typingsSlinky.reactWait.mod

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WaitingContext extends js.Object {
  var Wait: ReactComponentClass[WaitingContextWaitProps] = js.native
  def endWaiting(): Unit = js.native
  def isWaiting(): Boolean = js.native
  def startWaiting(): Unit = js.native
}

object WaitingContext {
  @scala.inline
  def apply(
    Wait: ReactComponentClass[WaitingContextWaitProps],
    endWaiting: () => Unit,
    isWaiting: () => Boolean,
    startWaiting: () => Unit
  ): WaitingContext = {
    val __obj = js.Dynamic.literal(Wait = Wait.asInstanceOf[js.Any], endWaiting = js.Any.fromFunction0(endWaiting), isWaiting = js.Any.fromFunction0(isWaiting), startWaiting = js.Any.fromFunction0(startWaiting))
    __obj.asInstanceOf[WaitingContext]
  }
  @scala.inline
  implicit class WaitingContextOps[Self <: WaitingContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWait(value: ReactComponentClass[WaitingContextWaitProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Wait")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndWaiting(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endWaiting")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsWaiting(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isWaiting")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStartWaiting(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startWaiting")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

