package typingsSlinky.pRetry.mod

import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FailedAttemptError extends Error {
  val attemptNumber: Double = js.native
  val retriesLeft: Double = js.native
}

object FailedAttemptError {
  @scala.inline
  def apply(attemptNumber: Double, message: String, name: String, retriesLeft: Double): FailedAttemptError = {
    val __obj = js.Dynamic.literal(attemptNumber = attemptNumber.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], retriesLeft = retriesLeft.asInstanceOf[js.Any])
    __obj.asInstanceOf[FailedAttemptError]
  }
  @scala.inline
  implicit class FailedAttemptErrorOps[Self <: FailedAttemptError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttemptNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attemptNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRetriesLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retriesLeft")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

