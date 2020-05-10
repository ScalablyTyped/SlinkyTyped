package typingsSlinky.reduxTestkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFlush extends js.Object {
  def flush(): Unit = js.native
  def reset(): Unit = js.native
}

object AnonFlush {
  @scala.inline
  def apply(flush: () => Unit, reset: () => Unit): AnonFlush = {
    val __obj = js.Dynamic.literal(flush = js.Any.fromFunction0(flush), reset = js.Any.fromFunction0(reset))
    __obj.asInstanceOf[AnonFlush]
  }
  @scala.inline
  implicit class AnonFlushOps[Self <: AnonFlush] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFlush(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flush")(js.Any.fromFunction0(value))
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

