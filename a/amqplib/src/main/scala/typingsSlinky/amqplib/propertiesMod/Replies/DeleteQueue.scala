package typingsSlinky.amqplib.propertiesMod.Replies

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteQueue extends js.Object {
  var messageCount: Double = js.native
}

object DeleteQueue {
  @scala.inline
  def apply(messageCount: Double): DeleteQueue = {
    val __obj = js.Dynamic.literal(messageCount = messageCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteQueue]
  }
  @scala.inline
  implicit class DeleteQueueOps[Self <: DeleteQueue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessageCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageCount")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

