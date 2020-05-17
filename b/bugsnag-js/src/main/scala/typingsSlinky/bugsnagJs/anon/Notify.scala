package typingsSlinky.bugsnagJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Notify extends js.Object {
  @JSName("notify")
  var notify_FNotify: String = js.native
  var sessions: String = js.native
}

object Notify {
  @scala.inline
  def apply(notify: String, sessions: String): Notify = {
    val __obj = js.Dynamic.literal(notify = notify.asInstanceOf[js.Any], sessions = sessions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Notify]
  }
  @scala.inline
  implicit class NotifyOps[Self <: Notify] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNotify(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notify")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSessions(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

