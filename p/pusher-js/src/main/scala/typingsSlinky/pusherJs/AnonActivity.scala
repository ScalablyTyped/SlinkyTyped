package typingsSlinky.pusherJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonActivity extends js.Object {
  def activity(): Unit = js.native
  def closed(): Unit = js.native
  def error(error: js.Any): Unit = js.native
  def message(message: String): Unit = js.native
  def ping(): Unit = js.native
}

object AnonActivity {
  @scala.inline
  def apply(
    activity: () => Unit,
    closed: () => Unit,
    error: js.Any => Unit,
    message: String => Unit,
    ping: () => Unit
  ): AnonActivity = {
    val __obj = js.Dynamic.literal(activity = js.Any.fromFunction0(activity), closed = js.Any.fromFunction0(closed), error = js.Any.fromFunction1(error), message = js.Any.fromFunction1(message), ping = js.Any.fromFunction0(ping))
    __obj.asInstanceOf[AnonActivity]
  }
  @scala.inline
  implicit class AnonActivityOps[Self <: AnonActivity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivity(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activity")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withClosed(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closed")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withError(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMessage(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPing(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ping")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

