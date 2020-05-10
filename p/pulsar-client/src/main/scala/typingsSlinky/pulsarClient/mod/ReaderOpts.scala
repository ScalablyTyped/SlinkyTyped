package typingsSlinky.pulsarClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReaderOpts extends js.Object {
  /**
    * The name of the reader.
    */
  var readerName: js.UndefOr[String] = js.native
  /**
    * Sets the size of the reader's receiver queue, i.e. the number of messages that can be accumulated by the reader before the application calls readNext.
    * A value higher than the default of 1000 could increase reader throughput, though at the expense of more memory utilization.
    * Default 1000
    */
  var receiverQueueSize: js.UndefOr[Double] = js.native
  /**
    * The initial reader position, i.e. the message at which the reader begins processing messages.
    * The options are Pulsar.MessageId.earliest (the earliest available message on the topic), Pulsar.MessageId.latest (the latest available message on the topic),
    * or a message ID object for a position that is not earliest or latest.
    */
  var startMessageId: MessageId = js.native
  /**
    * The subscription role prefix.
    */
  var subscriptionRolePrefix: js.UndefOr[String] = js.native
  /**
    * The Pulsar topic on which the reader will establish a subscription and listen for messages.
    */
  var topic: String = js.native
}

object ReaderOpts {
  @scala.inline
  def apply(startMessageId: MessageId, topic: String): ReaderOpts = {
    val __obj = js.Dynamic.literal(startMessageId = startMessageId.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaderOpts]
  }
  @scala.inline
  implicit class ReaderOptsOps[Self <: ReaderOpts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStartMessageId(value: MessageId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startMessageId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTopic(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReaderName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReaderName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readerName")(js.undefined)
        ret
    }
    @scala.inline
    def withReceiverQueueSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receiverQueueSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReceiverQueueSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receiverQueueSize")(js.undefined)
        ret
    }
    @scala.inline
    def withSubscriptionRolePrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscriptionRolePrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubscriptionRolePrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscriptionRolePrefix")(js.undefined)
        ret
    }
  }
  
}

