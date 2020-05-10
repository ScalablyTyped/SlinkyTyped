package typingsSlinky.pulumiKubernetes.outputMod.apps.v1beta1

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
  val collisionCount: Double = js.native
  /**
    * Represents the latest available observations of a statefulset's current state.
    */
  val conditions: js.Array[StatefulSetCondition] = js.native
  /**
    * currentReplicas is the number of Pods created by the StatefulSet controller from the
    * StatefulSet version indicated by currentRevision.
    */
  val currentReplicas: Double = js.native
  /**
    * currentRevision, if not empty, indicates the version of the StatefulSet used to generate
    * Pods in the sequence [0,currentReplicas).
    */
  val currentRevision: String = js.native
  /**
    * observedGeneration is the most recent generation observed for this StatefulSet. It
    * corresponds to the StatefulSet's generation, which is updated on mutation by the API
    * Server.
    */
  val observedGeneration: Double = js.native
  /**
    * readyReplicas is the number of Pods created by the StatefulSet controller that have a Ready
    * Condition.
    */
  val readyReplicas: Double = js.native
  /**
    * replicas is the number of Pods created by the StatefulSet controller.
    */
  val replicas: Double = js.native
  /**
    * updateRevision, if not empty, indicates the version of the StatefulSet used to generate
    * Pods in the sequence [replicas-updatedReplicas,replicas)
    */
  val updateRevision: String = js.native
  /**
    * updatedReplicas is the number of Pods created by the StatefulSet controller from the
    * StatefulSet version indicated by updateRevision.
    */
  val updatedReplicas: Double = js.native
}

object StatefulSetStatus {
  @scala.inline
  def apply(
    collisionCount: Double,
    conditions: js.Array[StatefulSetCondition],
    currentReplicas: Double,
    currentRevision: String,
    observedGeneration: Double,
    readyReplicas: Double,
    replicas: Double,
    updateRevision: String,
    updatedReplicas: Double
  ): StatefulSetStatus = {
    val __obj = js.Dynamic.literal(collisionCount = collisionCount.asInstanceOf[js.Any], conditions = conditions.asInstanceOf[js.Any], currentReplicas = currentReplicas.asInstanceOf[js.Any], currentRevision = currentRevision.asInstanceOf[js.Any], observedGeneration = observedGeneration.asInstanceOf[js.Any], readyReplicas = readyReplicas.asInstanceOf[js.Any], replicas = replicas.asInstanceOf[js.Any], updateRevision = updateRevision.asInstanceOf[js.Any], updatedReplicas = updatedReplicas.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatefulSetStatus]
  }
  @scala.inline
  implicit class StatefulSetStatusOps[Self <: StatefulSetStatus] (val x: Self) extends AnyVal {
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
    def withConditions(value: js.Array[StatefulSetCondition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conditions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentReplicas(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentReplicas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentRevision(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentRevision")(value.asInstanceOf[js.Any])
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
    @scala.inline
    def withUpdateRevision(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateRevision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdatedReplicas(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatedReplicas")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

