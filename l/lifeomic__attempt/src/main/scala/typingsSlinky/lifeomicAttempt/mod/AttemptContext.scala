package typingsSlinky.lifeomicAttempt.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttemptContext extends js.Object {
  var aborted: Boolean = js.native
  var attemptNum: Double = js.native
  var attemptsRemaining: Double = js.native
  def abort(): Unit = js.native
}

object AttemptContext {
  @scala.inline
  def apply(abort: () => Unit, aborted: Boolean, attemptNum: Double, attemptsRemaining: Double): AttemptContext = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), aborted = aborted.asInstanceOf[js.Any], attemptNum = attemptNum.asInstanceOf[js.Any], attemptsRemaining = attemptsRemaining.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttemptContext]
  }
  @scala.inline
  implicit class AttemptContextOps[Self <: AttemptContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbort(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abort")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAborted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aborted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttemptNum(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attemptNum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttemptsRemaining(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attemptsRemaining")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

