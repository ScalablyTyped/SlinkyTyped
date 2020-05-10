package typingsSlinky.schedule.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Deadline extends js.Object {
  var didTimeout: Boolean = js.native
  def timeRemaining(): Double = js.native
}

object Deadline {
  @scala.inline
  def apply(didTimeout: Boolean, timeRemaining: () => Double): Deadline = {
    val __obj = js.Dynamic.literal(didTimeout = didTimeout.asInstanceOf[js.Any], timeRemaining = js.Any.fromFunction0(timeRemaining))
    __obj.asInstanceOf[Deadline]
  }
  @scala.inline
  implicit class DeadlineOps[Self <: Deadline] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDidTimeout(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("didTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeRemaining(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeRemaining")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

