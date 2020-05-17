package typingsSlinky.kefir.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlushOnEnd extends js.Object {
  var flushOnEnd: Boolean = js.native
}

object FlushOnEnd {
  @scala.inline
  def apply(flushOnEnd: Boolean): FlushOnEnd = {
    val __obj = js.Dynamic.literal(flushOnEnd = flushOnEnd.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlushOnEnd]
  }
  @scala.inline
  implicit class FlushOnEndOps[Self <: FlushOnEnd] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFlushOnEnd(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flushOnEnd")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

