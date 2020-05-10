package typingsSlinky.firebaseFirestore.specsSpecTestRunnerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpecWatchStreamClose extends js.Object {
  var error: SpecError = js.native
  var runBackoffTimer: Boolean = js.native
}

object SpecWatchStreamClose {
  @scala.inline
  def apply(error: SpecError, runBackoffTimer: Boolean): SpecWatchStreamClose = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], runBackoffTimer = runBackoffTimer.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpecWatchStreamClose]
  }
  @scala.inline
  implicit class SpecWatchStreamCloseOps[Self <: SpecWatchStreamClose] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withError(value: SpecError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRunBackoffTimer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runBackoffTimer")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

