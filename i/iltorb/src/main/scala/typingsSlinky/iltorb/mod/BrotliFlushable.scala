package typingsSlinky.iltorb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrotliFlushable extends js.Object {
  def flush(): Unit = js.native
}

object BrotliFlushable {
  @scala.inline
  def apply(flush: () => Unit): BrotliFlushable = {
    val __obj = js.Dynamic.literal(flush = js.Any.fromFunction0(flush))
    __obj.asInstanceOf[BrotliFlushable]
  }
  @scala.inline
  implicit class BrotliFlushableOps[Self <: BrotliFlushable] (val x: Self) extends AnyVal {
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
  }
  
}

