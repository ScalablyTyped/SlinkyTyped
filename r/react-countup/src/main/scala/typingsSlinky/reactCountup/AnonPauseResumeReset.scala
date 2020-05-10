package typingsSlinky.reactCountup

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPauseResumeReset extends js.Object {
  def pauseResume(): Unit = js.native
  def reset(): Unit = js.native
  def start(): Unit = js.native
}

object AnonPauseResumeReset {
  @scala.inline
  def apply(pauseResume: () => Unit, reset: () => Unit, start: () => Unit): AnonPauseResumeReset = {
    val __obj = js.Dynamic.literal(pauseResume = js.Any.fromFunction0(pauseResume), reset = js.Any.fromFunction0(reset), start = js.Any.fromFunction0(start))
    __obj.asInstanceOf[AnonPauseResumeReset]
  }
  @scala.inline
  implicit class AnonPauseResumeResetOps[Self <: AnonPauseResumeReset] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPauseResume(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pauseResume")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReset(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStart(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

