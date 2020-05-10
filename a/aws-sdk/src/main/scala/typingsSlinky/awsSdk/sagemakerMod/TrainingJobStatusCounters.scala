package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrainingJobStatusCounters extends js.Object {
  /**
    * The number of completed training jobs launched by the hyperparameter tuning job.
    */
  var Completed: js.UndefOr[TrainingJobStatusCounter] = js.native
  /**
    * The number of in-progress training jobs launched by a hyperparameter tuning job.
    */
  var InProgress: js.UndefOr[TrainingJobStatusCounter] = js.native
  /**
    * The number of training jobs that failed and can't be retried. A failed training job can't be retried if it failed because a client error occurred.
    */
  var NonRetryableError: js.UndefOr[TrainingJobStatusCounter] = js.native
  /**
    * The number of training jobs that failed, but can be retried. A failed training job can be retried only if it failed because an internal service error occurred.
    */
  var RetryableError: js.UndefOr[TrainingJobStatusCounter] = js.native
  /**
    * The number of training jobs launched by a hyperparameter tuning job that were manually stopped.
    */
  var Stopped: js.UndefOr[TrainingJobStatusCounter] = js.native
}

object TrainingJobStatusCounters {
  @scala.inline
  def apply(): TrainingJobStatusCounters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrainingJobStatusCounters]
  }
  @scala.inline
  implicit class TrainingJobStatusCountersOps[Self <: TrainingJobStatusCounters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompleted(value: TrainingJobStatusCounter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Completed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompleted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Completed")(js.undefined)
        ret
    }
    @scala.inline
    def withInProgress(value: TrainingJobStatusCounter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InProgress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InProgress")(js.undefined)
        ret
    }
    @scala.inline
    def withNonRetryableError(value: TrainingJobStatusCounter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NonRetryableError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNonRetryableError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NonRetryableError")(js.undefined)
        ret
    }
    @scala.inline
    def withRetryableError(value: TrainingJobStatusCounter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RetryableError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetryableError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RetryableError")(js.undefined)
        ret
    }
    @scala.inline
    def withStopped(value: TrainingJobStatusCounter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Stopped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStopped: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Stopped")(js.undefined)
        ret
    }
  }
  
}

