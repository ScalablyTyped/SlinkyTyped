package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutEventsResponse extends js.Object {
  var EventsResponse: typingsSlinky.awsSdk.pinpointMod.EventsResponse = js.native
}

object PutEventsResponse {
  @scala.inline
  def apply(EventsResponse: EventsResponse): PutEventsResponse = {
    val __obj = js.Dynamic.literal(EventsResponse = EventsResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutEventsResponse]
  }
  @scala.inline
  implicit class PutEventsResponseOps[Self <: PutEventsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEventsResponse(value: EventsResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventsResponse")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

