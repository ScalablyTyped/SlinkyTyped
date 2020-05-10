package typingsSlinky.firebaseFirestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRunBackoffTimer extends js.Object {
  var runBackoffTimer: Boolean = js.native
}

object AnonRunBackoffTimer {
  @scala.inline
  def apply(runBackoffTimer: Boolean): AnonRunBackoffTimer = {
    val __obj = js.Dynamic.literal(runBackoffTimer = runBackoffTimer.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRunBackoffTimer]
  }
  @scala.inline
  implicit class AnonRunBackoffTimerOps[Self <: AnonRunBackoffTimer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRunBackoffTimer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runBackoffTimer")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

