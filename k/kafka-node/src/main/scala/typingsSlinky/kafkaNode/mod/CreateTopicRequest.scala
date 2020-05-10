package typingsSlinky.kafkaNode.mod

import typingsSlinky.kafkaNode.AnonName
import typingsSlinky.kafkaNode.AnonPartition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTopicRequest extends js.Object {
  var configEntries: js.UndefOr[js.Array[AnonName]] = js.native
  var partitions: Double = js.native
  var replicaAssignment: js.UndefOr[js.Array[AnonPartition]] = js.native
  var replicationFactor: Double = js.native
  var topic: String = js.native
}

object CreateTopicRequest {
  @scala.inline
  def apply(partitions: Double, replicationFactor: Double, topic: String): CreateTopicRequest = {
    val __obj = js.Dynamic.literal(partitions = partitions.asInstanceOf[js.Any], replicationFactor = replicationFactor.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTopicRequest]
  }
  @scala.inline
  implicit class CreateTopicRequestOps[Self <: CreateTopicRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPartitions(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partitions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReplicationFactor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicationFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTopic(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfigEntries(value: js.Array[AnonName]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configEntries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigEntries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configEntries")(js.undefined)
        ret
    }
    @scala.inline
    def withReplicaAssignment(value: js.Array[AnonPartition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicaAssignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicaAssignment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicaAssignment")(js.undefined)
        ret
    }
  }
  
}

