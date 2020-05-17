package typingsSlinky.firebaseFirestore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RunBackoffTimer extends js.Object {
  var runBackoffTimer: Boolean = js.native
}

object RunBackoffTimer {
  @scala.inline
  def apply(runBackoffTimer: Boolean): RunBackoffTimer = {
    val __obj = js.Dynamic.literal(runBackoffTimer = runBackoffTimer.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunBackoffTimer]
  }
  @scala.inline
  implicit class RunBackoffTimerOps[Self <: RunBackoffTimer] (val x: Self) extends AnyVal {
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

