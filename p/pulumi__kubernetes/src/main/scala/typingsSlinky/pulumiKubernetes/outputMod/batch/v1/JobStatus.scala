package typingsSlinky.pulumiKubernetes.outputMod.batch.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JobStatus represents the current state of a Job.
  */
@js.native
trait JobStatus extends js.Object {
  /**
    * The number of actively running pods.
    */
  val active: Double = js.native
  /**
    * Represents time when the job was completed. It is not guaranteed to be set in
    * happens-before order across separate operations. It is represented in RFC3339 form and is
    * in UTC.
    */
  val completionTime: String = js.native
  /**
    * The latest available observations of an object's current state. More info:
    * https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
    */
  val conditions: js.Array[JobCondition] = js.native
  /**
    * The number of pods which reached phase Failed.
    */
  val failed: Double = js.native
  /**
    * Represents time when the job was acknowledged by the job controller. It is not guaranteed
    * to be set in happens-before order across separate operations. It is represented in RFC3339
    * form and is in UTC.
    */
  val startTime: String = js.native
  /**
    * The number of pods which reached phase Succeeded.
    */
  val succeeded: Double = js.native
}

object JobStatus {
  @scala.inline
  def apply(
    active: Double,
    completionTime: String,
    conditions: js.Array[JobCondition],
    failed: Double,
    startTime: String,
    succeeded: Double
  ): JobStatus = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], completionTime = completionTime.asInstanceOf[js.Any], conditions = conditions.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobStatus]
  }
  @scala.inline
  implicit class JobStatusOps[Self <: JobStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActive(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompletionTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completionTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConditions(value: js.Array[JobCondition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conditions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFailed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSucceeded(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("succeeded")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

