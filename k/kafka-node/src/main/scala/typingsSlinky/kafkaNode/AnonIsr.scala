package typingsSlinky.kafkaNode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIsr extends js.Object {
  var isr: js.Array[Double] = js.native
  var leader: Double = js.native
  var partition: Double = js.native
  var replicas: js.Array[Double] = js.native
  var topic: String = js.native
}

object AnonIsr {
  @scala.inline
  def apply(
    isr: js.Array[Double],
    leader: Double,
    partition: Double,
    replicas: js.Array[Double],
    topic: String
  ): AnonIsr = {
    val __obj = js.Dynamic.literal(isr = isr.asInstanceOf[js.Any], leader = leader.asInstanceOf[js.Any], partition = partition.asInstanceOf[js.Any], replicas = replicas.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIsr]
  }
  @scala.inline
  implicit class AnonIsrOps[Self <: AnonIsr] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsr(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeader(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPartition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReplicas(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicas")(value.asInstanceOf[js.Any])
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

