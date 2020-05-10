package typingsSlinky.fastDiff.mod

import typingsSlinky.fastDiff.AnonIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CursorInfo extends js.Object {
  var newRange: AnonIndex = js.native
  var oldRange: AnonIndex = js.native
}

object CursorInfo {
  @scala.inline
  def apply(newRange: AnonIndex, oldRange: AnonIndex): CursorInfo = {
    val __obj = js.Dynamic.literal(newRange = newRange.asInstanceOf[js.Any], oldRange = oldRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[CursorInfo]
  }
  @scala.inline
  implicit class CursorInfoOps[Self <: CursorInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNewRange(value: AnonIndex): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldRange(value: AnonIndex): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldRange")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

