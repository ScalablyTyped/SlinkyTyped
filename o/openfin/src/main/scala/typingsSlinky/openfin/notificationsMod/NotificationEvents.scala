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

@js.native
trait NotificationEvents extends BaseEventMap {
  var click: RuntimeEvent[notification, typingsSlinky.openfin.openfinStrings.click] = js.native
  var close: RuntimeEvent[notification, typingsSlinky.openfin.openfinStrings.close] = js.native
  var error: RuntimeEvent[notification, typingsSlinky.openfin.openfinStrings.error] = js.native
  var message: RuntimeEvent[notification, typingsSlinky.openfin.openfinStrings.message] = js.native
  var show: RuntimeEvent[notification, typingsSlinky.openfin.openfinStrings.show] = js.native
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
  @scala.inline
  implicit class NotificationEventsOps[Self <: NotificationEvents] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClick(value: RuntimeEvent[notification, click]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClose(value: RuntimeEvent[notification, close]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError(value: RuntimeEvent[notification, error]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: RuntimeEvent[notification, message]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShow(value: RuntimeEvent[notification, show]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

