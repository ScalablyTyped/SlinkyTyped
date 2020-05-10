package typingsSlinky.pulumiKubernetes.inputMod.apps.v1beta1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DeploymentStatus is the most recently observed status of the Deployment.
  */
@js.native
trait DeploymentStatus extends js.Object {
  /**
    * Total number of available pods (ready for at least minReadySeconds) targeted by this
    * deployment.
    */
  var availableReplicas: js.UndefOr[Input[Double]] = js.native
  /**
    * Count of hash collisions for the Deployment. The Deployment controller uses this field as a
    * collision avoidance mechanism when it needs to create the name for the newest ReplicaSet.
    */
  var collisionCount: js.UndefOr[Input[Double]] = js.native
  /**
    * Represents the latest available observations of a deployment's current state.
    */
  var conditions: js.UndefOr[Input[js.Array[Input[DeploymentCondition]]]] = js.native
  /**
    * The generation observed by the deployment controller.
    */
  var observedGeneration: js.UndefOr[Input[Double]] = js.native
  /**
    * Total number of ready pods targeted by this deployment.
    */
  var readyReplicas: js.UndefOr[Input[Double]] = js.native
  /**
    * Total number of non-terminated pods targeted by this deployment (their labels match the
    * selector).
    */
  var replicas: js.UndefOr[Input[Double]] = js.native
  /**
    * Total number of unavailable pods targeted by this deployment. This is the total number of
    * pods that are still required for the deployment to have 100% available capacity. They may
    * either be pods that are running but not yet available or pods that still have not been
    * created.
    */
  var unavailableReplicas: js.UndefOr[Input[Double]] = js.native
  /**
    * Total number of non-terminated pods targeted by this deployment that have the desired
    * template spec.
    */
  var updatedReplicas: js.UndefOr[Input[Double]] = js.native
}

object DeploymentStatus {
  @scala.inline
  def apply(): DeploymentStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentStatus]
  }
  @scala.inline
  implicit class DeploymentStatusOps[Self <: DeploymentStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withCollisionCount(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collisionCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollisionCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collisionCount")(js.undefined)
        ret
    }
    @scala.inline
    def withConditions(value: Input[js.Array[Input[DeploymentCondition]]]): Self = {
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
    @scala.inline
    def withReplicas(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicas")(js.undefined)
        ret
    }
    @scala.inline
    def withUnavailableReplicas(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unavailableReplicas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnavailableReplicas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unavailableReplicas")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdatedReplicas(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatedReplicas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdatedReplicas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatedReplicas")(js.undefined)
        ret
    }
  }
  
}

