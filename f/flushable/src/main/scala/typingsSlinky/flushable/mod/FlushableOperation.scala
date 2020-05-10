package typingsSlinky.flushable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlushableOperation extends js.Object {
  /** Stops the callback from being executed */
  def cancel(): Unit = js.native
  /** Immediately executes the callback */
  def flush(): Unit = js.native
  /** Returns whether or not the callback has been executed */
  def pending(): Boolean = js.native
}

object FlushableOperation {
  @scala.inline
  def apply(cancel: () => Unit, flush: () => Unit, pending: () => Boolean): FlushableOperation = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), flush = js.Any.fromFunction0(flush), pending = js.Any.fromFunction0(pending))
    __obj.asInstanceOf[FlushableOperation]
  }
  @scala.inline
  implicit class FlushableOperationOps[Self <: FlushableOperation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancel(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFlush(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flush")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPending(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pending")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

