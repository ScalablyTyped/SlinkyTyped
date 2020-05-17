package typingsSlinky.googleCloudPubsub.subscriberMod

import typingsSlinky.googleCloudPubsub.leaseManagerMod.FlowControlOptions
import typingsSlinky.googleCloudPubsub.messageQueuesMod.BatchOptions
import typingsSlinky.googleCloudPubsub.messageStreamMod.MessageStreamOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubscriberOptions extends js.Object {
  var ackDeadline: js.UndefOr[Double] = js.native
  var batching: js.UndefOr[BatchOptions] = js.native
  var flowControl: js.UndefOr[FlowControlOptions] = js.native
  var streamingOptions: js.UndefOr[MessageStreamOptions] = js.native
}

object SubscriberOptions {
  @scala.inline
  def apply(): SubscriberOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubscriberOptions]
  }
  @scala.inline
  implicit class SubscriberOptionsOps[Self <: SubscriberOptions] (val x: Self) extends AnyVal {
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
  }
  
}

