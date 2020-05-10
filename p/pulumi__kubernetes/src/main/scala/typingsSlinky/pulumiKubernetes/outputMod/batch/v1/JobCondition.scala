package typingsSlinky.pulumiKubernetes.outputMod.batch.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JobCondition describes current state of a job.
  */
@js.native
trait JobCondition extends js.Object {
  /**
    * Last time the condition was checked.
    */
  val lastProbeTime: String = js.native
  /**
    * Last time the condition transit from one status to another.
    */
  val lastTransitionTime: String = js.native
  /**
    * Human readable message indicating details about last transition.
    */
  val message: String = js.native
  /**
    * (brief) reason for the condition's last transition.
    */
  val reason: String = js.native
  /**
    * Status of the condition, one of True, False, Unknown.
    */
  val status: String = js.native
  /**
    * Type of job condition, Complete or Failed.
    */
  val `type`: String = js.native
}

object JobCondition {
  @scala.inline
  def apply(
    lastProbeTime: String,
    lastTransitionTime: String,
    message: String,
    reason: String,
    status: String,
    `type`: String
  ): JobCondition = {
    val __obj = js.Dynamic.literal(lastProbeTime = lastProbeTime.asInstanceOf[js.Any], lastTransitionTime = lastTransitionTime.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobCondition]
  }
  @scala.inline
  implicit class JobConditionOps[Self <: JobCondition] (val x: Self) extends AnyVal {
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

