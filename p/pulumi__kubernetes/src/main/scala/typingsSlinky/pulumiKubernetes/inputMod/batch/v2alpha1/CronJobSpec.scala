package typingsSlinky.pulumiKubernetes.inputMod.batch.v2alpha1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CronJobSpec describes how the job execution will look like and when it will actually run.
  */
@js.native
trait CronJobSpec extends js.Object {
  /**
    * Specifies how to treat concurrent executions of a Job. Valid values are: - "Allow"
    * (default): allows CronJobs to run concurrently; - "Forbid": forbids concurrent runs,
    * skipping next run if previous run hasn't finished yet; - "Replace": cancels currently
    * running job and replaces it with a new one
    */
  var concurrencyPolicy: js.UndefOr[Input[String]] = js.native
  /**
    * The number of failed finished jobs to retain. This is a pointer to distinguish between
    * explicit zero and not specified.
    */
  var failedJobsHistoryLimit: js.UndefOr[Input[Double]] = js.native
  /**
    * Specifies the job that will be created when executing a CronJob.
    */
  var jobTemplate: Input[JobTemplateSpec] = js.native
  /**
    * The schedule in Cron format, see https://en.wikipedia.org/wiki/Cron.
    */
  var schedule: Input[String] = js.native
  /**
    * Optional deadline in seconds for starting the job if it misses scheduled time for any
    * reason.  Missed jobs executions will be counted as failed ones.
    */
  var startingDeadlineSeconds: js.UndefOr[Input[Double]] = js.native
  /**
    * The number of successful finished jobs to retain. This is a pointer to distinguish between
    * explicit zero and not specified.
    */
  var successfulJobsHistoryLimit: js.UndefOr[Input[Double]] = js.native
  /**
    * This flag tells the controller to suspend subsequent executions, it does not apply to
    * already started executions.  Defaults to false.
    */
  var suspend: js.UndefOr[Input[Boolean]] = js.native
}

object CronJobSpec {
  @scala.inline
  def apply(jobTemplate: Input[JobTemplateSpec], schedule: Input[String]): CronJobSpec = {
    val __obj = js.Dynamic.literal(jobTemplate = jobTemplate.asInstanceOf[js.Any], schedule = schedule.asInstanceOf[js.Any])
    __obj.asInstanceOf[CronJobSpec]
  }
  @scala.inline
  implicit class CronJobSpecOps[Self <: CronJobSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJobTemplate(value: Input[JobTemplateSpec]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSchedule(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schedule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConcurrencyPolicy(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("concurrencyPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConcurrencyPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("concurrencyPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withFailedJobsHistoryLimit(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failedJobsHistoryLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailedJobsHistoryLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failedJobsHistoryLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withStartingDeadlineSeconds(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startingDeadlineSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartingDeadlineSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startingDeadlineSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccessfulJobsHistoryLimit(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successfulJobsHistoryLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuccessfulJobsHistoryLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successfulJobsHistoryLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withSuspend(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suspend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuspend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suspend")(js.undefined)
        ret
    }
  }
  
}

