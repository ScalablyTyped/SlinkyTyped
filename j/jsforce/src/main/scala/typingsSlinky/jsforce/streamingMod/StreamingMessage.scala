package typingsSlinky.jsforce.streamingMod

import typingsSlinky.jsforce.anon.CreatedDate
import typingsSlinky.jsforce.recordMod.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StreamingMessage extends js.Object {
  var event: CreatedDate = js.native
  var sobject: Record[_] = js.native
}

object StreamingMessage {
  @scala.inline
  def apply(event: CreatedDate, sobject: Record[_]): StreamingMessage = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], sobject = sobject.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamingMessage]
  }
  @scala.inline
  implicit class StreamingMessageOps[Self <: StreamingMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvent(value: CreatedDate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSobject(value: Record[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sobject")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

