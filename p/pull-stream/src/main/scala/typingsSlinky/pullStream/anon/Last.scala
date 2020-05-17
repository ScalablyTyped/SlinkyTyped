package typingsSlinky.pullStream.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Last extends js.Object {
  var last: Boolean = js.native
}

object Last {
  @scala.inline
  def apply(last: Boolean): Last = {
    val __obj = js.Dynamic.literal(last = last.asInstanceOf[js.Any])
    __obj.asInstanceOf[Last]
  }
  @scala.inline
  implicit class LastOps[Self <: Last] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLast(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

