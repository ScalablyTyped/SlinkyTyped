package typingsSlinky.openfin.transportMod

import typingsSlinky.openfin.anon.NotificationId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationEvent extends js.Object {
  var payload: NotificationId = js.native
  var `type`: String | js.Symbol = js.native
}

object NotificationEvent {
  @scala.inline
  def apply(payload: NotificationId, `type`: String | js.Symbol): NotificationEvent = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationEvent]
  }
  @scala.inline
  implicit class NotificationEventOps[Self <: NotificationEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPayload(value: NotificationId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String | js.Symbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

