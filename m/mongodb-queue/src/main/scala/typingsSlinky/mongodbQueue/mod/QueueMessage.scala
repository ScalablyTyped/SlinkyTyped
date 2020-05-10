package typingsSlinky.mongodbQueue.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueueMessage extends js.Object {
  var ack: String = js.native
  var id: String = js.native
  var payload: String = js.native
  var tries: Double = js.native
}

object QueueMessage {
  @scala.inline
  def apply(ack: String, id: String, payload: String, tries: Double): QueueMessage = {
    val __obj = js.Dynamic.literal(ack = ack.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], tries = tries.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueueMessage]
  }
  @scala.inline
  implicit class QueueMessageOps[Self <: QueueMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAck(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPayload(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTries(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tries")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

