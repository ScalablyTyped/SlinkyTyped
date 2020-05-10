package typingsSlinky.pulumiKubernetes.outputMod.apps.v1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ReplicaSetStatus represents the current status of a ReplicaSet.
  */
@js.native
trait ReplicaSetStatus extends js.Object {
  /**
    * The number of available replicas (ready for at least minReadySeconds) for this replica set.
    */
  val availableReplicas: Double = js.native
  /**
    * Represents the latest available observations of a replica set's current state.
    */
  val conditions: js.Array[ReplicaSetCondition] = js.native
  /**
    * The number of pods that have labels matching the labels of the pod template of the
    * replicaset.
    */
  val fullyLabeledReplicas: Double = js.native
  /**
    * ObservedGeneration reflects the generation of the most recently observed ReplicaSet.
    */
  val observedGeneration: Double = js.native
  /**
    * The number of ready replicas for this replica set.
    */
  val readyReplicas: Double = js.native
  /**
    * Replicas is the most recently oberved number of replicas. More info:
    * https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller/#what-is-a-replicationcontroller
    */
  val replicas: Double = js.native
}

object ReplicaSetStatus {
  @scala.inline
  def apply(
    availableReplicas: Double,
    conditions: js.Array[ReplicaSetCondition],
    fullyLabeledReplicas: Double,
    observedGeneration: Double,
    readyReplicas: Double,
    replicas: Double
  ): ReplicaSetStatus = {
    val __obj = js.Dynamic.literal(availableReplicas = availableReplicas.asInstanceOf[js.Any], conditions = conditions.asInstanceOf[js.Any], fullyLabeledReplicas = fullyLabeledReplicas.asInstanceOf[js.Any], observedGeneration = observedGeneration.asInstanceOf[js.Any], readyReplicas = readyReplicas.asInstanceOf[js.Any], replicas = replicas.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicaSetStatus]
  }
  @scala.inline
  implicit class ReplicaSetStatusOps[Self <: ReplicaSetStatus] (val x: Self) extends AnyVal {
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
    def withConditions(value: js.Array[ReplicaSetCondition]): Self = {
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

