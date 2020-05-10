package typingsSlinky.ngxInfiniteScroll

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonTotalToScroll extends js.Object {
  var totalToScroll: js.Any = js.native
}

object AnonTotalToScroll {
  @scala.inline
  def apply(totalToScroll: js.Any): AnonTotalToScroll = {
    val __obj = js.Dynamic.literal(totalToScroll = totalToScroll.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTotalToScroll]
  }
  @scala.inline
  implicit class AnonTotalToScrollOps[Self <: AnonTotalToScroll] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTotalToScroll(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalToScroll")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

