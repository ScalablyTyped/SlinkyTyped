package typingsSlinky.pulumiKubernetes.inputMod.batch.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
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
  var active: js.UndefOr[Input[Double]] = js.native
  /**
    * Represents time when the job was completed. It is not guaranteed to be set in
    * happens-before order across separate operations. It is represented in RFC3339 form and is
    * in UTC.
    */
  var completionTime: js.UndefOr[Input[String]] = js.native
  /**
    * The latest available observations of an object's current state. More info:
    * https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
    */
  var conditions: js.UndefOr[Input[js.Array[Input[JobCondition]]]] = js.native
  /**
    * The number of pods which reached phase Failed.
    */
  var failed: js.UndefOr[Input[Double]] = js.native
  /**
    * Represents time when the job was acknowledged by the job controller. It is not guaranteed
    * to be set in happens-before order across separate operations. It is represented in RFC3339
    * form and is in UTC.
    */
  var startTime: js.UndefOr[Input[String]] = js.native
  /**
    * The number of pods which reached phase Succeeded.
    */
  var succeeded: js.UndefOr[Input[Double]] = js.native
}

object JobStatus {
  @scala.inline
  def apply(): JobStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobStatus]
  }
  @scala.inline
  implicit class JobStatusOps[Self <: JobStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActive(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(js.undefined)
        ret
    }
    @scala.inline
    def withCompletionTime(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completionTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompletionTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completionTime")(js.undefined)
        ret
    }
    @scala.inline
    def withConditions(value: Input[js.Array[Input[JobCondition]]]): Self = {
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
    def withFailed(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failed")(js.undefined)
        ret
    }
    @scala.inline
    def withStartTime(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(js.undefined)
        ret
    }
    @scala.inline
    def withSucceeded(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("succeeded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSucceeded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("succeeded")(js.undefined)
        ret
    }
  }
  
}

