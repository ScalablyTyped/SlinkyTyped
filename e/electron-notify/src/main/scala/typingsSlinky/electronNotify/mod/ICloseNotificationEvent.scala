package typingsSlinky.electronNotify.mod

import typingsSlinky.electronNotify.electronNotifyStrings.click
import typingsSlinky.electronNotify.electronNotifyStrings.close
import typingsSlinky.electronNotify.electronNotifyStrings.show
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICloseNotificationEvent extends js.Object {
  var event: close | show | click = js.native
  var id: Double = js.native
}

object ICloseNotificationEvent {
  @scala.inline
  def apply(event: close | show | click, id: Double): ICloseNotificationEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICloseNotificationEvent]
  }
  @scala.inline
  implicit class ICloseNotificationEventOps[Self <: ICloseNotificationEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvent(value: close | show | click): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

