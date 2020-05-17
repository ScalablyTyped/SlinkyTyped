package typingsSlinky.antd.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Closed extends js.Object {
  var closed: Boolean = js.native
  var closing: Boolean = js.native
}

object Closed {
  @scala.inline
  def apply(closed: Boolean, closing: Boolean): Closed = {
    val __obj = js.Dynamic.literal(closed = closed.asInstanceOf[js.Any], closing = closing.asInstanceOf[js.Any])
    __obj.asInstanceOf[Closed]
  }
  @scala.inline
  implicit class ClosedOps[Self <: Closed] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClosed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClosing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closing")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

