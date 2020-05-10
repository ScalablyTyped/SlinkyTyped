package typingsSlinky.fsExtraPromiseEs6

import typingsSlinky.fsExtraPromiseEs6.mod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCurr extends js.Object {
  var curr: Stats = js.native
  var prev: Stats = js.native
}

object AnonCurr {
  @scala.inline
  def apply(curr: Stats, prev: Stats): AnonCurr = {
    val __obj = js.Dynamic.literal(curr = curr.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCurr]
  }
  @scala.inline
  implicit class AnonCurrOps[Self <: AnonCurr] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurr(value: Stats): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("curr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrev(value: Stats): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prev")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

