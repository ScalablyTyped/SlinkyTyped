package typingsSlinky.googleCloudPubsub.subscriptionMod

import typingsSlinky.googleCloudPubsub.leaseManagerMod.FlowControlOptions
import typingsSlinky.googleCloudPubsub.messageQueuesMod.BatchOptions
import typingsSlinky.googleCloudPubsub.messageStreamMod.MessageStreamOptions
import typingsSlinky.googleCloudPubsub.topicMod.Topic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @google-cloud/pubsub.@google-cloud/pubsub/build/src/subscriber.SubscriberOptions & {  topic ? :@google-cloud/pubsub.@google-cloud/pubsub/build/src/topic.Topic} */
@js.native
trait SubscriptionOptions extends js.Object {
  var ackDeadline: js.UndefOr[Double] = js.native
  var batching: js.UndefOr[BatchOptions] = js.native
  var flowControl: js.UndefOr[FlowControlOptions] = js.native
  var streamingOptions: js.UndefOr[MessageStreamOptions] = js.native
  var topic: js.UndefOr[Topic] = js.native
}

object SubscriptionOptions {
  @scala.inline
  def apply(): SubscriptionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubscriptionOptions]
  }
  @scala.inline
  implicit class SubscriptionOptionsOps[Self <: SubscriptionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAckDeadline(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ackDeadline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAckDeadline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ackDeadline")(js.undefined)
        ret
    }
    @scala.inline
    def withBatching(value: BatchOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batching")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBatching: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batching")(js.undefined)
        ret
    }
    @scala.inline
    def withFlowControl(value: FlowControlOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flowControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlowControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flowControl")(js.undefined)
        ret
    }
    @scala.inline
    def withStreamingOptions(value: MessageStreamOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streamingOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStreamingOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streamingOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withTopic(value: Topic): Self = {
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
  }
  
}

