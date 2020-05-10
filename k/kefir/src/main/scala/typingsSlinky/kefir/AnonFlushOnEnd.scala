package typingsSlinky.kefir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFlushOnEnd extends js.Object {
  var flushOnEnd: Boolean = js.native
}

object AnonFlushOnEnd {
  @scala.inline
  def apply(flushOnEnd: Boolean): AnonFlushOnEnd = {
    val __obj = js.Dynamic.literal(flushOnEnd = flushOnEnd.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFlushOnEnd]
  }
  @scala.inline
  implicit class AnonFlushOnEndOps[Self <: AnonFlushOnEnd] (val x: Self) extends AnyVal {
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

