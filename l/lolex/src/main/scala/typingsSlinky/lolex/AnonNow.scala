package typingsSlinky.lolex

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonNow extends js.Object {
  def now(): Double = js.native
}

object AnonNow {
  @scala.inline
  def apply(now: () => Double): AnonNow = {
    val __obj = js.Dynamic.literal(now = js.Any.fromFunction0(now))
    __obj.asInstanceOf[AnonNow]
  }
  @scala.inline
  implicit class AnonNowOps[Self <: AnonNow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNow(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("now")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

