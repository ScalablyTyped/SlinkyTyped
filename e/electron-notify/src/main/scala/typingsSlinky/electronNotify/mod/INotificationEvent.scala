package typingsSlinky.electronNotify.mod

import typingsSlinky.electronNotify.electronNotifyStrings.click
import typingsSlinky.electronNotify.electronNotifyStrings.close
import typingsSlinky.electronNotify.electronNotifyStrings.show
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INotificationEvent extends ICloseNotificationEvent {
  def closeNotification(reason: js.Any): Unit = js.native
}

object INotificationEvent {
  @scala.inline
  def apply(closeNotification: js.Any => Unit, event: close | show | click, id: Double): INotificationEvent = {
    val __obj = js.Dynamic.literal(closeNotification = js.Any.fromFunction1(closeNotification), event = event.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[INotificationEvent]
  }
  @scala.inline
  implicit class INotificationEventOps[Self <: INotificationEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCloseNotification(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeNotification")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

