package typingsSlinky.pulumiKubernetes.outputMod.batch.v2alpha1

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
  val concurrencyPolicy: String = js.native
  /**
    * The number of failed finished jobs to retain. This is a pointer to distinguish between
    * explicit zero and not specified.
    */
  val failedJobsHistoryLimit: Double = js.native
  /**
    * Specifies the job that will be created when executing a CronJob.
    */
  val jobTemplate: JobTemplateSpec = js.native
  /**
    * The schedule in Cron format, see https://en.wikipedia.org/wiki/Cron.
    */
  val schedule: String = js.native
  /**
    * Optional deadline in seconds for starting the job if it misses scheduled time for any
    * reason.  Missed jobs executions will be counted as failed ones.
    */
  val startingDeadlineSeconds: Double = js.native
  /**
    * The number of successful finished jobs to retain. This is a pointer to distinguish between
    * explicit zero and not specified.
    */
  val successfulJobsHistoryLimit: Double = js.native
  /**
    * This flag tells the controller to suspend subsequent executions, it does not apply to
    * already started executions.  Defaults to false.
    */
  val suspend: Boolean = js.native
}

object CronJobSpec {
  @scala.inline
  def apply(
    concurrencyPolicy: String,
    failedJobsHistoryLimit: Double,
    jobTemplate: JobTemplateSpec,
    schedule: String,
    startingDeadlineSeconds: Double,
    successfulJobsHistoryLimit: Double,
    suspend: Boolean
  ): CronJobSpec = {
    val __obj = js.Dynamic.literal(concurrencyPolicy = concurrencyPolicy.asInstanceOf[js.Any], failedJobsHistoryLimit = failedJobsHistoryLimit.asInstanceOf[js.Any], jobTemplate = jobTemplate.asInstanceOf[js.Any], schedule = schedule.asInstanceOf[js.Any], startingDeadlineSeconds = startingDeadlineSeconds.asInstanceOf[js.Any], successfulJobsHistoryLimit = successfulJobsHistoryLimit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any])
    __obj.asInstanceOf[CronJobSpec]
  }
  @scala.inline
  implicit class CronJobSpecOps[Self <: CronJobSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConcurrencyPolicy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("concurrencyPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFailedJobsHistoryLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failedJobsHistoryLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJobTemplate(value: JobTemplateSpec): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSchedule(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schedule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartingDeadlineSeconds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startingDeadlineSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuccessfulJobsHistoryLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successfulJobsHistoryLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuspend(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suspend")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

