package typingsSlinky.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PersistentVolumeClaimCondition contails details about state of pvc
  */
@js.native
trait PersistentVolumeClaimCondition extends js.Object {
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
    * Unique, this should be a short, machine understandable string that gives the reason for
    * condition's last transition. If it reports "ResizeStarted" that means the underlying
    * persistent volume is being resized.
    */
  val reason: String = js.native
  val status: String = js.native
  val `type`: String = js.native
}

object PersistentVolumeClaimCondition {
  @scala.inline
  def apply(
    lastProbeTime: String,
    lastTransitionTime: String,
    message: String,
    reason: String,
    status: String,
    `type`: String
  ): PersistentVolumeClaimCondition = {
    val __obj = js.Dynamic.literal(lastProbeTime = lastProbeTime.asInstanceOf[js.Any], lastTransitionTime = lastTransitionTime.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PersistentVolumeClaimCondition]
  }
  @scala.inline
  implicit class PersistentVolumeClaimConditionOps[Self <: PersistentVolumeClaimCondition] (val x: Self) extends AnyVal {
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

