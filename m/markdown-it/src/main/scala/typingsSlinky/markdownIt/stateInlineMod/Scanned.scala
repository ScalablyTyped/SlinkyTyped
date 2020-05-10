package typingsSlinky.markdownIt.stateInlineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Scanned extends js.Object {
  var can_close: Boolean = js.native
  var can_open: Boolean = js.native
  var length: Double = js.native
}

object Scanned {
  @scala.inline
  def apply(can_close: Boolean, can_open: Boolean, length: Double): Scanned = {
    val __obj = js.Dynamic.literal(can_close = can_close.asInstanceOf[js.Any], can_open = can_open.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scanned]
  }
  @scala.inline
  implicit class ScannedOps[Self <: Scanned] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCan_close(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("can_close")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCan_open(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("can_open")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

