package typingsSlinky.pulsarClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProducerOpts extends js.Object {
  /**
    * If set to true, the producer send message as batch.
    * Default: true
    */
  var batchingEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The maximum size of sending message in each time of batching.
    * Default: 1000
    */
  var batchingMaxMessages: js.UndefOr[Double] = js.native
  /**
    * The maximum time of delay sending message in batching.
    * Default: 10
    */
  var batchingMaxPublishDelayMs: js.UndefOr[Double] = js.native
  /**
    * If set to true, the producer's send method will wait when the outgoing message queue is full rather than failing and throwing an error
    * (the size of that queue is dictated by the maxPendingMessages parameter); if set to false (the default),send operations will fail and
    * throw a error when the queue is full.
    * Default: false
    */
  var blockIfQueueFull: js.UndefOr[Boolean] = js.native
  /**
    * The message data compression type used by the producer. The available options are LZ4, and Zlib.
    * Default: No Compression
    */
  var compressionType: js.UndefOr[CompressionType] = js.native
  /**
    * The hashing function that determines the partition on which a particular message is published (partitioned topics only).
    * The available options are: JavaStringHash (the equivalent of String.hashCode() in Java), Murmur3_32Hash (applies the Murmur3 hashing function),
    * or BoostHash (applies the hashing function from C++'s Boost library).
    * Default: BoostHash
    */
  var hashingScheme: js.UndefOr[HashingScheme] = js.native
  /**
    * The initial sequence ID of the message. When producer send message, add sequence ID to message. The ID is increased each time to send.
    */
  var initialSequenceId: js.UndefOr[Double] = js.native
  /**
    * The maximum size of the queue holding pending messages (i.e. messages waiting to receive an acknowledgment from the broker).
    * By default, when the queue is full all calls to the send method will fail unless blockIfQueueFull is set to true.
    * Default: 1000
    */
  var maxPendingMessages: js.UndefOr[Double] = js.native
  /**
    * The maximum size of the sum of partition's pending queue.
    * Default: 50000
    */
  var maxPendingMessagesAcrossPartitions: js.UndefOr[Double] = js.native
  /**
    * The message routing logic (for producers on partitioned topics). This logic is applied only when no key is set on messages. The available
    * options are: round robin (RoundRobinDistribution), or publishing all messages to a single partition (UseSinglePartition).
    * Default: UseSinglePartition
    */
  var messageRoutingMode: js.UndefOr[MessageRoutingModes] = js.native
  /**
    * A name for the producer. If you do not explicitly assign a name, Pulsar will automatically generate a globally unique name.
    * If you choose to explicitly assign a name, it will need to be unique across all Pulsar clusters, otherwise the creation operation will throw an error.
    */
  var producerName: js.UndefOr[String] = js.native
  /**
    * The metadata of producer.
    */
  var properties: js.UndefOr[MessageProperties] = js.native
  /**
    * When publishing a message to a topic, the producer will wait for an acknowledgment from the responsible Pulsar broker.
    * If a message is not acknowledged within the threshold set by this parameter, an error will be thrown. If you set sendTimeoutMs to -1,
    * the timeout will be set to infinity (and thus removed). Removing the send timeout is recommended when using Pulsar's message de-duplication feature.
    * Default: 30000
    */
  var sendTimeoutMs: js.UndefOr[Double] = js.native
  /**
    * The Pulsar topic to which the producer will publish messages.
    */
  var topic: String = js.native
}

object ProducerOpts {
  @scala.inline
  def apply(topic: String): ProducerOpts = {
    val __obj = js.Dynamic.literal(topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProducerOpts]
  }
  @scala.inline
  implicit class ProducerOptsOps[Self <: ProducerOpts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTopic(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBatchingEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchingEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBatchingEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchingEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withBatchingMaxMessages(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchingMaxMessages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBatchingMaxMessages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchingMaxMessages")(js.undefined)
        ret
    }
    @scala.inline
    def withBatchingMaxPublishDelayMs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchingMaxPublishDelayMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBatchingMaxPublishDelayMs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchingMaxPublishDelayMs")(js.undefined)
        ret
    }
    @scala.inline
    def withBlockIfQueueFull(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockIfQueueFull")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlockIfQueueFull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockIfQueueFull")(js.undefined)
        ret
    }
    @scala.inline
    def withCompressionType(value: CompressionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compressionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompressionType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compressionType")(js.undefined)
        ret
    }
    @scala.inline
    def withHashingScheme(value: HashingScheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashingScheme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHashingScheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashingScheme")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialSequenceId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialSequenceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialSequenceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialSequenceId")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxPendingMessages(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxPendingMessages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxPendingMessages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxPendingMessages")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxPendingMessagesAcrossPartitions(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxPendingMessagesAcrossPartitions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxPendingMessagesAcrossPartitions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxPendingMessagesAcrossPartitions")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageRoutingMode(value: MessageRoutingModes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageRoutingMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageRoutingMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageRoutingMode")(js.undefined)
        ret
    }
    @scala.inline
    def withProducerName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("producerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProducerName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("producerName")(js.undefined)
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
    def withSendTimeoutMs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendTimeoutMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSendTimeoutMs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendTimeoutMs")(js.undefined)
        ret
    }
  }
  
}

