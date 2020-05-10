package typingsSlinky.pulumiKubernetes.inputMod.apps.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
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
  var collisionCount: js.UndefOr[Input[Double]] = js.native
  /**
    * Represents the latest available observations of a DaemonSet's current state.
    */
  var conditions: js.UndefOr[Input[js.Array[Input[DaemonSetCondition]]]] = js.native
  /**
    * The number of nodes that are running at least 1 daemon pod and are supposed to run the
    * daemon pod. More info: https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/
    */
  var currentNumberScheduled: Input[Double] = js.native
  /**
    * The total number of nodes that should be running the daemon pod (including nodes correctly
    * running the daemon pod). More info:
    * https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/
    */
  var desiredNumberScheduled: Input[Double] = js.native
  /**
    * The number of nodes that should be running the daemon pod and have one or more of the
    * daemon pod running and available (ready for at least spec.minReadySeconds)
    */
  var numberAvailable: js.UndefOr[Input[Double]] = js.native
  /**
    * The number of nodes that are running the daemon pod, but are not supposed to run the daemon
    * pod. More info: https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/
    */
  var numberMisscheduled: Input[Double] = js.native
  /**
    * The number of nodes that should be running the daemon pod and have one or more of the
    * daemon pod running and ready.
    */
  var numberReady: Input[Double] = js.native
  /**
    * The number of nodes that should be running the daemon pod and have none of the daemon pod
    * running and available (ready for at least spec.minReadySeconds)
    */
  var numberUnavailable: js.UndefOr[Input[Double]] = js.native
  /**
    * The most recent generation observed by the daemon set controller.
    */
  var observedGeneration: js.UndefOr[Input[Double]] = js.native
  /**
    * The total number of nodes that are running updated daemon pod
    */
  var updatedNumberScheduled: js.UndefOr[Input[Double]] = js.native
}

object DaemonSetStatus {
  @scala.inline
  def apply(
    currentNumberScheduled: Input[Double],
    desiredNumberScheduled: Input[Double],
    numberMisscheduled: Input[Double],
    numberReady: Input[Double]
  ): DaemonSetStatus = {
    val __obj = js.Dynamic.literal(currentNumberScheduled = currentNumberScheduled.asInstanceOf[js.Any], desiredNumberScheduled = desiredNumberScheduled.asInstanceOf[js.Any], numberMisscheduled = numberMisscheduled.asInstanceOf[js.Any], numberReady = numberReady.asInstanceOf[js.Any])
    __obj.asInstanceOf[DaemonSetStatus]
  }
  @scala.inline
  implicit class DaemonSetStatusOps[Self <: DaemonSetStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentNumberScheduled(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentNumberScheduled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDesiredNumberScheduled(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desiredNumberScheduled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumberMisscheduled(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberMisscheduled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumberReady(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberReady")(value.asInstanceOf[js.Any])
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
    def withConditions(value: Input[js.Array[Input[DaemonSetCondition]]]): Self = {
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
    def withNumberAvailable(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberAvailable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberAvailable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberAvailable")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberUnavailable(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberUnavailable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberUnavailable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberUnavailable")(js.undefined)
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
    def withUpdatedNumberScheduled(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatedNumberScheduled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdatedNumberScheduled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatedNumberScheduled")(js.undefined)
        ret
    }
  }
  
}

