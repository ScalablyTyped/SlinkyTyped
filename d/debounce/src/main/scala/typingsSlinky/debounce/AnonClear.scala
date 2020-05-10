package typingsSlinky.debounce

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonClear extends js.Object {
  def clear(): Unit = js.native
  def flush(): Unit = js.native
}

object AnonClear {
  @scala.inline
  def apply(clear: () => Unit, flush: () => Unit): AnonClear = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), flush = js.Any.fromFunction0(flush))
    __obj.asInstanceOf[AnonClear]
  }
  @scala.inline
  implicit class AnonClearOps[Self <: AnonClear] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClear(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFlush(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flush")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

