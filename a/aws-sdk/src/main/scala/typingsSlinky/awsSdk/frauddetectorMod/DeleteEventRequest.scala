package typingsSlinky.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteEventRequest extends js.Object {
  /**
    * The ID of the event to delete.
    */
  var eventId: String = js.native
}

object DeleteEventRequest {
  @scala.inline
  def apply(eventId: String): DeleteEventRequest = {
    val __obj = js.Dynamic.literal(eventId = eventId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteEventRequest]
  }
  @scala.inline
  implicit class DeleteEventRequestOps[Self <: DeleteEventRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEventId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

