package typingsSlinky.pulsarClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubscribeOpts extends js.Object {
  /**
    * Acknowledge timeout in milliseconds.
    * Default: 0
    */
  var ackTimeoutMs: js.UndefOr[Double] = js.native
  /**
    * The name of consumer. Currently, failover mode uses consumer name for ordering.
    */
  var consumerName: js.UndefOr[String] = js.native
  /**
    * The metadata of consumer.
    */
  var properties: js.UndefOr[MessageProperties] = js.native
  /**
    * Sets the size of the consumer's receiver queue, i.e. the number of messages that can be accumulated by the consumer before the application calls receive.
    * A value higher than the default could increase consumer throughput, though at the expense of more memory utilization.
    * Default: 1000
    */
  var receiverQueueSize: js.UndefOr[Double] = js.native
  /**
    * Set the max total receiver queue size across partitions.
    * This setting will be used to reduce the receiver queue size for individual partitions if the total exceeds this value.
    * Default: 50000
    */
  var receiverQueueSizeAcrossPartitions: js.UndefOr[Double] = js.native
  /**
    * The subscription name for this consumer.
    */
  var subscription: String = js.native
  /**
    * Available options are Exclusive, Shared, and Failover.
    * Default: Exclusive
    */
  var subscriptionType: js.UndefOr[SubscriptionType] = js.native
  /**
    * The Pulsar topic on which the consumer will establish a subscription and listen for messages.
    */
  var topic: String = js.native
}

object SubscribeOpts {
  @scala.inline
  def apply(subscription: String, topic: String): SubscribeOpts = {
    val __obj = js.Dynamic.literal(subscription = subscription.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscribeOpts]
  }
  @scala.inline
  implicit class SubscribeOptsOps[Self <: SubscribeOpts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSubscription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTopic(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAckTimeoutMs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ackTimeoutMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAckTimeoutMs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ackTimeoutMs")(js.undefined)
        ret
    }
    @scala.inline
    def withConsumerName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consumerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConsumerName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consumerName")(js.undefined)
        ret
    }
    @scala.inline
    def withProperties(value: MessageProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(js.undefined)
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
    def withReceiverQueueSizeAcrossPartitions(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receiverQueueSizeAcrossPartitions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReceiverQueueSizeAcrossPartitions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receiverQueueSizeAcrossPartitions")(js.undefined)
        ret
    }
    @scala.inline
    def withSubscriptionType(value: SubscriptionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscriptionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubscriptionType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscriptionType")(js.undefined)
        ret
    }
  }
  
}

