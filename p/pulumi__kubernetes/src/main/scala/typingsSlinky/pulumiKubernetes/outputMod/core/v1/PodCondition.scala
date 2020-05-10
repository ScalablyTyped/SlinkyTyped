package typingsSlinky.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PodCondition contains details for the current condition of this pod.
  */
@js.native
trait PodCondition extends js.Object {
  /**
    * Last time we probed the condition.
    */
  val lastProbeTime: String = js.native
  /**
    * Last time the condition transitioned from one status to another.
    */
  val lastTransitionTime: String = js.native
  /**
    * Human-readable message indicating details about last transition.
    */
  val message: String = js.native
  /**
    * Unique, one-word, CamelCase reason for the condition's last transition.
    */
  val reason: String = js.native
  /**
    * Status is the status of the condition. Can be True, False, Unknown. More info:
    * https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-conditions
    */
  val status: String = js.native
  /**
    * Type is the type of the condition. More info:
    * https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-conditions
    */
  val `type`: String = js.native
}

object PodCondition {
  @scala.inline
  def apply(
    lastProbeTime: String,
    lastTransitionTime: String,
    message: String,
    reason: String,
    status: String,
    `type`: String
  ): PodCondition = {
    val __obj = js.Dynamic.literal(lastProbeTime = lastProbeTime.asInstanceOf[js.Any], lastTransitionTime = lastTransitionTime.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PodCondition]
  }
  @scala.inline
  implicit class PodConditionOps[Self <: PodCondition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLastProbeTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastProbeTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastTransitionTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastTransitionTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

