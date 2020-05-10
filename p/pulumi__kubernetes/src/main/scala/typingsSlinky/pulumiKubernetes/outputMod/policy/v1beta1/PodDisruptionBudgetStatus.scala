package typingsSlinky.pulumiKubernetes.outputMod.policy.v1beta1

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
  val currentHealthy: Double = js.native
  /**
    * minimum desired number of healthy pods
    */
  val desiredHealthy: Double = js.native
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
  val disruptedPods: js.Object = js.native
  /**
    * Number of pod disruptions that are currently allowed.
    */
  val disruptionsAllowed: Double = js.native
  /**
    * total number of pods counted by this disruption budget
    */
  val expectedPods: Double = js.native
  /**
    * Most recent generation observed when updating this PDB status. PodDisruptionsAllowed and
    * other status information is valid only if observedGeneration equals to PDB's object
    * generation.
    */
  val observedGeneration: Double = js.native
}

object PodDisruptionBudgetStatus {
  @scala.inline
  def apply(
    currentHealthy: Double,
    desiredHealthy: Double,
    disruptedPods: js.Object,
    disruptionsAllowed: Double,
    expectedPods: Double,
    observedGeneration: Double
  ): PodDisruptionBudgetStatus = {
    val __obj = js.Dynamic.literal(currentHealthy = currentHealthy.asInstanceOf[js.Any], desiredHealthy = desiredHealthy.asInstanceOf[js.Any], disruptedPods = disruptedPods.asInstanceOf[js.Any], disruptionsAllowed = disruptionsAllowed.asInstanceOf[js.Any], expectedPods = expectedPods.asInstanceOf[js.Any], observedGeneration = observedGeneration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PodDisruptionBudgetStatus]
  }
  @scala.inline
  implicit class PodDisruptionBudgetStatusOps[Self <: PodDisruptionBudgetStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentHealthy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentHealthy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDesiredHealthy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desiredHealthy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisruptedPods(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disruptedPods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisruptionsAllowed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disruptionsAllowed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpectedPods(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expectedPods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObservedGeneration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("observedGeneration")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

