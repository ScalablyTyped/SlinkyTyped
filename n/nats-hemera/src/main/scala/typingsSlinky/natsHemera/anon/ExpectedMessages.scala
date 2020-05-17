package typingsSlinky.natsHemera.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpectedMessages extends js.Object {
  var expectedMessages: Double = js.native
  var maxMessages: Double = js.native
  var pubsub: Boolean = js.native
  var topic: String = js.native
}

object ExpectedMessages {
  @scala.inline
  def apply(expectedMessages: Double, maxMessages: Double, pubsub: Boolean, topic: String): ExpectedMessages = {
    val __obj = js.Dynamic.literal(expectedMessages = expectedMessages.asInstanceOf[js.Any], maxMessages = maxMessages.asInstanceOf[js.Any], pubsub = pubsub.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpectedMessages]
  }
  @scala.inline
  implicit class ExpectedMessagesOps[Self <: ExpectedMessages] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpectedMessages(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expectedMessages")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withTopic(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topic")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

