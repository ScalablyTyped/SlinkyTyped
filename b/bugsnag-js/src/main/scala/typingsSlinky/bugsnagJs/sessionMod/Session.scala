package typingsSlinky.bugsnagJs.sessionMod

import typingsSlinky.bugsnagJs.anon.Handled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Session extends js.Object {
  var events: Handled = js.native
  var id: String = js.native
  var startedAt: String = js.native
  def trackError(report: typingsSlinky.bugsnagJs.reportMod.default): Unit = js.native
}

object Session {
  @scala.inline
  def apply(
    events: Handled,
    id: String,
    startedAt: String,
    trackError: typingsSlinky.bugsnagJs.reportMod.default => Unit
  ): Session = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], startedAt = startedAt.asInstanceOf[js.Any], trackError = js.Any.fromFunction1(trackError))
    __obj.asInstanceOf[Session]
  }
  @scala.inline
  implicit class SessionOps[Self <: Session] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvents(value: Handled): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartedAt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrackError(value: typingsSlinky.bugsnagJs.reportMod.default => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackError")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

