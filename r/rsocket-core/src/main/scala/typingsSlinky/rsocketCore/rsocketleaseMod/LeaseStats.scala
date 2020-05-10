package typingsSlinky.rsocketCore.rsocketleaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LeaseStats extends js.Object {
  def onEvent(event: EventType): Unit = js.native
}

object LeaseStats {
  @scala.inline
  def apply(onEvent: EventType => Unit): LeaseStats = {
    val __obj = js.Dynamic.literal(onEvent = js.Any.fromFunction1(onEvent))
    __obj.asInstanceOf[LeaseStats]
  }
  @scala.inline
  implicit class LeaseStatsOps[Self <: LeaseStats] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnEvent(value: EventType => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEvent")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

