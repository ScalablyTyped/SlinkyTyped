package typingsSlinky.googleCloudPubsub.pubsubMod.google.pubsub.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a PublishRequest. */
@js.native
trait IPublishRequest extends js.Object {
  /** PublishRequest messages */
  var messages: js.UndefOr[js.Array[IPubsubMessage] | Null] = js.native
  /** PublishRequest topic */
  var topic: js.UndefOr[String | Null] = js.native
}

object IPublishRequest {
  @scala.inline
  def apply(): IPublishRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPublishRequest]
  }
  @scala.inline
  implicit class IPublishRequestOps[Self <: IPublishRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessages(value: js.Array[IPubsubMessage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messages")(js.undefined)
        ret
    }
    @scala.inline
    def withMessagesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messages")(null)
        ret
    }
    @scala.inline
    def withTopic(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topic")(js.undefined)
        ret
    }
    @scala.inline
    def withTopicNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topic")(null)
        ret
    }
  }
  
}

