package typingsSlinky.pulumiKubernetes.inputMod.apps.v1beta2

import typingsSlinky.pulumiPulumi.outputMod.Input
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
  var availableReplicas: js.UndefOr[Input[Double]] = js.native
  /**
    * Represents the latest available observations of a replica set's current state.
    */
  var conditions: js.UndefOr[Input[js.Array[Input[ReplicaSetCondition]]]] = js.native
  /**
    * The number of pods that have labels matching the labels of the pod template of the
    * replicaset.
    */
  var fullyLabeledReplicas: js.UndefOr[Input[Double]] = js.native
  /**
    * ObservedGeneration reflects the generation of the most recently observed ReplicaSet.
    */
  var observedGeneration: js.UndefOr[Input[Double]] = js.native
  /**
    * The number of ready replicas for this replica set.
    */
  var readyReplicas: js.UndefOr[Input[Double]] = js.native
  /**
    * Replicas is the most recently oberved number of replicas. More info:
    * https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller/#what-is-a-replicationcontroller
    */
  var replicas: Input[Double] = js.native
}

object ReplicaSetStatus {
  @scala.inline
  def apply(replicas: Input[Double]): ReplicaSetStatus = {
    val __obj = js.Dynamic.literal(replicas = replicas.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicaSetStatus]
  }
  @scala.inline
  implicit class ReplicaSetStatusOps[Self <: ReplicaSetStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReplicas(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAvailableReplicas(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availableReplicas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailableReplicas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availableReplicas")(js.undefined)
        ret
    }
    @scala.inline
    def withConditions(value: Input[js.Array[Input[ReplicaSetCondition]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conditions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConditions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conditions")(js.undefined)
        ret
    }
    @scala.inline
    def withFullyLabeledReplicas(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullyLabeledReplicas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullyLabeledReplicas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullyLabeledReplicas")(js.undefined)
        ret
    }
    @scala.inline
    def withObservedGeneration(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("observedGeneration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObservedGeneration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("observedGeneration")(js.undefined)
        ret
    }
    @scala.inline
    def withReadyReplicas(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readyReplicas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadyReplicas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readyReplicas")(js.undefined)
        ret
    }
  }
  
}

