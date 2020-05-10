package typingsSlinky.pulumiKubernetes.inputMod.apps.v1beta2

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * StatefulSetStatus represents the current state of a StatefulSet.
  */
@js.native
trait StatefulSetStatus extends js.Object {
  /**
    * collisionCount is the count of hash collisions for the StatefulSet. The StatefulSet
    * controller uses this field as a collision avoidance mechanism when it needs to create the
    * name for the newest ControllerRevision.
    */
  var collisionCount: js.UndefOr[Input[Double]] = js.native
  /**
    * Represents the latest available observations of a statefulset's current state.
    */
  var conditions: js.UndefOr[Input[js.Array[Input[StatefulSetCondition]]]] = js.native
  /**
    * currentReplicas is the number of Pods created by the StatefulSet controller from the
    * StatefulSet version indicated by currentRevision.
    */
  var currentReplicas: js.UndefOr[Input[Double]] = js.native
  /**
    * currentRevision, if not empty, indicates the version of the StatefulSet used to generate
    * Pods in the sequence [0,currentReplicas).
    */
  var currentRevision: js.UndefOr[Input[String]] = js.native
  /**
    * observedGeneration is the most recent generation observed for this StatefulSet. It
    * corresponds to the StatefulSet's generation, which is updated on mutation by the API
    * Server.
    */
  var observedGeneration: js.UndefOr[Input[Double]] = js.native
  /**
    * readyReplicas is the number of Pods created by the StatefulSet controller that have a Ready
    * Condition.
    */
  var readyReplicas: js.UndefOr[Input[Double]] = js.native
  /**
    * replicas is the number of Pods created by the StatefulSet controller.
    */
  var replicas: Input[Double] = js.native
  /**
    * updateRevision, if not empty, indicates the version of the StatefulSet used to generate
    * Pods in the sequence [replicas-updatedReplicas,replicas)
    */
  var updateRevision: js.UndefOr[Input[String]] = js.native
  /**
    * updatedReplicas is the number of Pods created by the StatefulSet controller from the
    * StatefulSet version indicated by updateRevision.
    */
  var updatedReplicas: js.UndefOr[Input[Double]] = js.native
}

object StatefulSetStatus {
  @scala.inline
  def apply(replicas: Input[Double]): StatefulSetStatus = {
    val __obj = js.Dynamic.literal(replicas = replicas.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatefulSetStatus]
  }
  @scala.inline
  implicit class StatefulSetStatusOps[Self <: StatefulSetStatus] (val x: Self) extends AnyVal {
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
    def withConditions(value: Input[js.Array[Input[StatefulSetCondition]]]): Self = {
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
    def withCurrentReplicas(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentReplicas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentReplicas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentReplicas")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentRevision(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentRevision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentRevision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentRevision")(js.undefined)
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
    def withUpdateRevision(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateRevision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateRevision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateRevision")(js.undefined)
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

