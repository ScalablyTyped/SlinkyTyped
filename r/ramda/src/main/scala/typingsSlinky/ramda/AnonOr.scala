package typingsSlinky.ramda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOr extends js.Object {
  var or: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
}

object AnonOr {
  @scala.inline
  def apply(): AnonOr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonOr]
  }
  @scala.inline
  implicit class AnonOrOps[Self <: AnonOr] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOr(value: /* repeated */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("or")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("or")(js.undefined)
        ret
    }
  }
  
}

