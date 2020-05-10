package typingsSlinky.pullStream

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLast extends js.Object {
  var last: Boolean = js.native
}

object AnonLast {
  @scala.inline
  def apply(last: Boolean): AnonLast = {
    val __obj = js.Dynamic.literal(last = last.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLast]
  }
  @scala.inline
  implicit class AnonLastOps[Self <: AnonLast] (val x: Self) extends AnyVal {
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

