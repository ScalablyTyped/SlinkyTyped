package typingsSlinky.bugsnagDashJs.typesSessionMod

import typingsSlinky.bugsnagDashJs.Anon_Handled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Session extends js.Object {
  var events: Anon_Handled
  var id: String
  var startedAt: String
  def trackError(report: typingsSlinky.bugsnagDashJs.typesReportMod.default): Unit
}

object Session {
  @scala.inline
  def apply(
    events: Anon_Handled,
    id: String,
    startedAt: String,
    trackError: typingsSlinky.bugsnagDashJs.typesReportMod.default => Unit
  ): Session = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], startedAt = startedAt.asInstanceOf[js.Any], trackError = js.Any.fromFunction1(trackError))
  
    __obj.asInstanceOf[Session]
  }
}

