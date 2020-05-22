package typingsSlinky.openfin.notificationsMod

import typingsSlinky.openfin.eventsBaseMod.BaseEventMap
import typingsSlinky.openfin.eventsBaseMod.RuntimeEvent
import typingsSlinky.openfin.openfinStrings.click
import typingsSlinky.openfin.openfinStrings.close
import typingsSlinky.openfin.openfinStrings.error
import typingsSlinky.openfin.openfinStrings.message
import typingsSlinky.openfin.openfinStrings.notification
import typingsSlinky.openfin.openfinStrings.show
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationEvents extends BaseEventMap {
  var click: RuntimeEvent[notification, typingsSlinky.openfin.openfinStrings.click]
  var close: RuntimeEvent[notification, typingsSlinky.openfin.openfinStrings.close]
  var error: RuntimeEvent[notification, typingsSlinky.openfin.openfinStrings.error]
  var message: RuntimeEvent[notification, typingsSlinky.openfin.openfinStrings.message]
  var show: RuntimeEvent[notification, typingsSlinky.openfin.openfinStrings.show]
}

object NotificationEvents {
  @scala.inline
  def apply(
    click: RuntimeEvent[notification, click],
    close: RuntimeEvent[notification, close],
    error: RuntimeEvent[notification, error],
    listenerRemoved: String,
    message: RuntimeEvent[notification, message],
    newListener: String,
    show: RuntimeEvent[notification, show]
  ): NotificationEvents = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], listenerRemoved = listenerRemoved.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], newListener = newListener.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationEvents]
  }
}

