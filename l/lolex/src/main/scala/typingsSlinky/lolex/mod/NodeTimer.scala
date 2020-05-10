package typingsSlinky.lolex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeTimer extends js.Object {
  /**
    * Stub method call. Does nothing.
    */
  def ref(): Unit = js.native
  /**
    * Stub method call. Does nothing.
    */
  def unref(): Unit = js.native
}

object NodeTimer {
  @scala.inline
  def apply(ref: () => Unit, unref: () => Unit): NodeTimer = {
    val __obj = js.Dynamic.literal(ref = js.Any.fromFunction0(ref), unref = js.Any.fromFunction0(unref))
    __obj.asInstanceOf[NodeTimer]
  }
  @scala.inline
  implicit class NodeTimerOps[Self <: NodeTimer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRef(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUnref(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unref")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

