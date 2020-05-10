package typingsSlinky.pulumiKubernetes.inputMod.policy.v1beta1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PodDisruptionBudgetStatus represents information about the status of a PodDisruptionBudget.
  * Status may trail the actual state of a system.
  */
@js.native
trait PodDisruptionBudgetStatus extends js.Object {
  /**
    * current number of healthy pods
    */
  var currentHealthy: Input[Double] = js.native
  /**
    * minimum desired number of healthy pods
    */
  var desiredHealthy: Input[Double] = js.native
  /**
    * DisruptedPods contains information about pods whose eviction was processed by the API
    * server eviction subresource handler but has not yet been observed by the
    * PodDisruptionBudget controller. A pod will be in this map from the time when the API server
    * processed the eviction request to the time when the pod is seen by PDB controller as having
    * been marked for deletion (or after a timeout). The key in the map is the name of the pod
    * and the value is the time when the API server processed the eviction request. If the
    * deletion didn't occur and a pod is still there it will be removed from the list
    * automatically by PodDisruptionBudget controller after some time. If everything goes smooth
    * this map should be empty for the most of the time. Large number of entries in the map may
    * indicate problems with pod deletions.
    */
  var disruptedPods: js.UndefOr[Input[js.Object]] = js.native
  /**
    * Number of pod disruptions that are currently allowed.
    */
  var disruptionsAllowed: Input[Double] = js.native
  /**
    * total number of pods counted by this disruption budget
    */
  var expectedPods: Input[Double] = js.native
  /**
    * Most recent generation observed when updating this PDB status. PodDisruptionsAllowed and
    * other status information is valid only if observedGeneration equals to PDB's object
    * generation.
    */
  var observedGeneration: js.UndefOr[Input[Double]] = js.native
}

object PodDisruptionBudgetStatus {
  @scala.inline
  def apply(
    currentHealthy: Input[Double],
    desiredHealthy: Input[Double],
    disruptionsAllowed: Input[Double],
    expectedPods: Input[Double]
  ): PodDisruptionBudgetStatus = {
    val __obj = js.Dynamic.literal(currentHealthy = currentHealthy.asInstanceOf[js.Any], desiredHealthy = desiredHealthy.asInstanceOf[js.Any], disruptionsAllowed = disruptionsAllowed.asInstanceOf[js.Any], expectedPods = expectedPods.asInstanceOf[js.Any])
    __obj.asInstanceOf[PodDisruptionBudgetStatus]
  }
  @scala.inline
  implicit class PodDisruptionBudgetStatusOps[Self <: PodDisruptionBudgetStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentHealthy(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentHealthy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDesiredHealthy(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desiredHealthy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisruptionsAllowed(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disruptionsAllowed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpectedPods(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expectedPods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisruptedPods(value: Input[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disruptedPods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisruptedPods: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disruptedPods")(js.undefined)
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
  }
  
}

