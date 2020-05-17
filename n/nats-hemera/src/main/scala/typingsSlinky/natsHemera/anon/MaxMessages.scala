package typingsSlinky.natsHemera.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaxMessages extends js.Object {
  var maxMessages: Double = js.native
  var pubsub: Boolean = js.native
  var queue: String = js.native
  var topic: String = js.native
}

object MaxMessages {
  @scala.inline
  def apply(maxMessages: Double, pubsub: Boolean, queue: String, topic: String): MaxMessages = {
    val __obj = js.Dynamic.literal(maxMessages = maxMessages.asInstanceOf[js.Any], pubsub = pubsub.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxMessages]
  }
  @scala.inline
  implicit class MaxMessagesOps[Self <: MaxMessages] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxMessages(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxMessages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPubsub(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pubsub")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTopic(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topic")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

