package typingsSlinky.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ReplicationControllerStatus represents the current status of a replication controller.
  */
@js.native
trait ReplicationControllerStatus extends js.Object {
  /**
    * The number of available replicas (ready for at least minReadySeconds) for this replication
    * controller.
    */
  val availableReplicas: Double = js.native
  /**
    * Represents the latest available observations of a replication controller's current state.
    */
  val conditions: js.Array[ReplicationControllerCondition] = js.native
  /**
    * The number of pods that have labels matching the labels of the pod template of the
    * replication controller.
    */
  val fullyLabeledReplicas: Double = js.native
  /**
    * ObservedGeneration reflects the generation of the most recently observed replication
    * controller.
    */
  val observedGeneration: Double = js.native
  /**
    * The number of ready replicas for this replication controller.
    */
  val readyReplicas: Double = js.native
  /**
    * Replicas is the most recently oberved number of replicas. More info:
    * https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#what-is-a-replicationcontroller
    */
  val replicas: Double = js.native
}

object ReplicationControllerStatus {
  @scala.inline
  def apply(
    availableReplicas: Double,
    conditions: js.Array[ReplicationControllerCondition],
    fullyLabeledReplicas: Double,
    observedGeneration: Double,
    readyReplicas: Double,
    replicas: Double
  ): ReplicationControllerStatus = {
    val __obj = js.Dynamic.literal(availableReplicas = availableReplicas.asInstanceOf[js.Any], conditions = conditions.asInstanceOf[js.Any], fullyLabeledReplicas = fullyLabeledReplicas.asInstanceOf[js.Any], observedGeneration = observedGeneration.asInstanceOf[js.Any], readyReplicas = readyReplicas.asInstanceOf[js.Any], replicas = replicas.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicationControllerStatus]
  }
  @scala.inline
  implicit class ReplicationControllerStatusOps[Self <: ReplicationControllerStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvailableReplicas(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availableReplicas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConditions(value: js.Array[ReplicationControllerCondition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conditions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFullyLabeledReplicas(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullyLabeledReplicas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObservedGeneration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("observedGeneration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReadyReplicas(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readyReplicas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReplicas(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicas")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

