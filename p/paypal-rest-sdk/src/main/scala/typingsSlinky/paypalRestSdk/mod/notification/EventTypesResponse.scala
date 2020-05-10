package typingsSlinky.paypalRestSdk.mod.notification

import typingsSlinky.paypalRestSdk.mod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventTypesResponse extends Response {
  val event_types: js.Array[NotificationEventType] = js.native
}

object EventTypesResponse {
  @scala.inline
  def apply(event_types: js.Array[NotificationEventType], httpStatusCode: Double): EventTypesResponse = {
    val __obj = js.Dynamic.literal(event_types = event_types.asInstanceOf[js.Any], httpStatusCode = httpStatusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventTypesResponse]
  }
  @scala.inline
  implicit class EventTypesResponseOps[Self <: EventTypesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvent_types(value: js.Array[NotificationEventType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event_types")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

