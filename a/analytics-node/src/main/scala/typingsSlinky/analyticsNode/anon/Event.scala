package typingsSlinky.analyticsNode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event extends js.Object {
  var context: js.UndefOr[js.Any] = js.undefined
  var event: String
  var integrations: js.UndefOr[typingsSlinky.analyticsNode.mod.AnalyticsNode.Integrations] = js.undefined
  var properties: js.UndefOr[js.Any] = js.undefined
  var timestamp: js.UndefOr[js.Date] = js.undefined
}

object Event {
  @scala.inline
  def apply(
    event: String,
    context: js.Any = null,
    integrations: typingsSlinky.analyticsNode.mod.AnalyticsNode.Integrations = null,
    properties: js.Any = null,
    timestamp: js.Date = null
  ): Event = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (integrations != null) __obj.updateDynamic("integrations")(integrations.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
}

