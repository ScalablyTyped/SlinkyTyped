package typingsSlinky.bugsnagJs.clientMod

import typingsSlinky.bugsnagJs.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IReportPayload extends js.Object {
  var apiKey: String
  var events: js.Array[typingsSlinky.bugsnagJs.reportMod.default]
  var notifier: Name
}

object IReportPayload {
  @scala.inline
  def apply(apiKey: String, events: js.Array[typingsSlinky.bugsnagJs.reportMod.default], notifier: Name): IReportPayload = {
    val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], notifier = notifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[IReportPayload]
  }
}

