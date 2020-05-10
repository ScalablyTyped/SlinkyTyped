package typingsSlinky.cypress.cypressMod.Cypress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The clock starts at the unix epoch (timestamp of 0). This means that when you instantiate new Date in your application, it will have a time of January 1st, 1970.
  */
@js.native
trait Clock extends js.Object {
  /**
    * Restore all overridden native functions. This is automatically called between tests, so should not generally be needed.
    */
  def restore(): Unit = js.native
  /**
    * Move the clock the specified number of `milliseconds`.
    * Any timers within the affected range of time will be called.
    * @param time Number in ms to advance the clock
    */
  def tick(time: Double): Unit = js.native
}

object Clock {
  @scala.inline
  def apply(restore: () => Unit, tick: Double => Unit): Clock = {
    val __obj = js.Dynamic.literal(restore = js.Any.fromFunction0(restore), tick = js.Any.fromFunction1(tick))
    __obj.asInstanceOf[Clock]
  }
  @scala.inline
  implicit class ClockOps[Self <: Clock] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRestore(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restore")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTick(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tick")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

