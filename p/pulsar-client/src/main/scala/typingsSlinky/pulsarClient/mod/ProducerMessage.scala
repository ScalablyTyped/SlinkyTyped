package typingsSlinky.pulsarClient.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProducerMessage extends js.Object {
  /**
    * The actual data payload of the message.
    */
  var data: Buffer = js.native
  /**
    * The timestamp associated with the message.
    */
  var eventTimestamp: js.UndefOr[Double] = js.native
  /**
    * The optional key associated with the message (particularly useful for things like topic compaction).
    */
  var partitionKey: js.UndefOr[String] = js.native
  /**
    * A Object for any application-specific metadata attached to the message.
    */
  var properties: js.UndefOr[MessageProperties] = js.native
  /**
    * The clusters to which this message will be replicated. Pulsar brokers handle message replication automatically;
    * you should only change this setting if you want to override the broker default.
    */
  var replicationClusters: js.UndefOr[js.Array[String]] = js.native
  /**
    * The sequence ID of the message.
    */
  var sequenceId: js.UndefOr[Double] = js.native
}

object ProducerMessage {
  @scala.inline
  def apply(data: Buffer): ProducerMessage = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProducerMessage]
  }
  @scala.inline
  implicit class ProducerMessageOps[Self <: ProducerMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventTimestamp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventTimestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withPartitionKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partitionKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPartitionKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partitionKey")(js.undefined)
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
    def withReplicationClusters(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicationClusters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicationClusters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicationClusters")(js.undefined)
        ret
    }
    @scala.inline
    def withSequenceId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sequenceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSequenceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sequenceId")(js.undefined)
        ret
    }
  }
  
}

