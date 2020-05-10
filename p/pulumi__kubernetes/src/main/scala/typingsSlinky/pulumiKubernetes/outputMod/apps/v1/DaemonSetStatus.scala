package typingsSlinky.pulumiKubernetes.outputMod.apps.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DaemonSetStatus represents the current status of a daemon set.
  */
@js.native
trait DaemonSetStatus extends js.Object {
  /**
    * Count of hash collisions for the DaemonSet. The DaemonSet controller uses this field as a
    * collision avoidance mechanism when it needs to create the name for the newest
    * ControllerRevision.
    */
  val collisionCount: Double = js.native
  /**
    * Represents the latest available observations of a DaemonSet's current state.
    */
  val conditions: js.Array[DaemonSetCondition] = js.native
  /**
    * The number of nodes that are running at least 1 daemon pod and are supposed to run the
    * daemon pod. More info: https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/
    */
  val currentNumberScheduled: Double = js.native
  /**
    * The total number of nodes that should be running the daemon pod (including nodes correctly
    * running the daemon pod). More info:
    * https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/
    */
  val desiredNumberScheduled: Double = js.native
  /**
    * The number of nodes that should be running the daemon pod and have one or more of the
    * daemon pod running and available (ready for at least spec.minReadySeconds)
    */
  val numberAvailable: Double = js.native
  /**
    * The number of nodes that are running the daemon pod, but are not supposed to run the daemon
    * pod. More info: https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/
    */
  val numberMisscheduled: Double = js.native
  /**
    * The number of nodes that should be running the daemon pod and have one or more of the
    * daemon pod running and ready.
    */
  val numberReady: Double = js.native
  /**
    * The number of nodes that should be running the daemon pod and have none of the daemon pod
    * running and available (ready for at least spec.minReadySeconds)
    */
  val numberUnavailable: Double = js.native
  /**
    * The most recent generation observed by the daemon set controller.
    */
  val observedGeneration: Double = js.native
  /**
    * The total number of nodes that are running updated daemon pod
    */
  val updatedNumberScheduled: Double = js.native
}

object DaemonSetStatus {
  @scala.inline
  def apply(
    collisionCount: Double,
    conditions: js.Array[DaemonSetCondition],
    currentNumberScheduled: Double,
    desiredNumberScheduled: Double,
    numberAvailable: Double,
    numberMisscheduled: Double,
    numberReady: Double,
    numberUnavailable: Double,
    observedGeneration: Double,
    updatedNumberScheduled: Double
  ): DaemonSetStatus = {
    val __obj = js.Dynamic.literal(collisionCount = collisionCount.asInstanceOf[js.Any], conditions = conditions.asInstanceOf[js.Any], currentNumberScheduled = currentNumberScheduled.asInstanceOf[js.Any], desiredNumberScheduled = desiredNumberScheduled.asInstanceOf[js.Any], numberAvailable = numberAvailable.asInstanceOf[js.Any], numberMisscheduled = numberMisscheduled.asInstanceOf[js.Any], numberReady = numberReady.asInstanceOf[js.Any], numberUnavailable = numberUnavailable.asInstanceOf[js.Any], observedGeneration = observedGeneration.asInstanceOf[js.Any], updatedNumberScheduled = updatedNumberScheduled.asInstanceOf[js.Any])
    __obj.asInstanceOf[DaemonSetStatus]
  }
  @scala.inline
  implicit class DaemonSetStatusOps[Self <: DaemonSetStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollisionCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collisionCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConditions(value: js.Array[DaemonSetCondition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conditions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentNumberScheduled(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentNumberScheduled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDesiredNumberScheduled(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desiredNumberScheduled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumberAvailable(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberAvailable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumberMisscheduled(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberMisscheduled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumberReady(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberReady")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumberUnavailable(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberUnavailable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObservedGeneration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("observedGeneration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdatedNumberScheduled(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatedNumberScheduled")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

