package typingsSlinky.bull.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobOptions extends js.Object {
  /**
    * The total number of attempts to try the job until it completes
    */
  var attempts: js.UndefOr[Double] = js.native
  /**
    * Backoff setting for automatic retries if the job fails
    */
  var backoff: js.UndefOr[Double | BackoffOptions] = js.native
  /**
    * An amount of miliseconds to wait until this job can be processed.
    * Note that for accurate delays, both server and clients should have their clocks synchronized. [optional]
    */
  var delay: js.UndefOr[Double] = js.native
  /**
    * Override the job ID - by default, the job ID is a unique
    * integer, but you can use this setting to override it.
    * If you use this option, it is up to you to ensure the
    * jobId is unique. If you attempt to add a job with an id that
    * already exists, it will not be added.
    */
  var jobId: js.UndefOr[JobId] = js.native
  /**
    * A boolean which, if true, adds the job to the right
    * of the queue instead of the left (default false)
    */
  var lifo: js.UndefOr[Boolean] = js.native
  /**
    * Optional priority value. ranges from 1 (highest priority) to MAX_INT  (lowest priority).
    * Note that using priorities has a slight impact on performance, so do not use it if not required
    */
  var priority: js.UndefOr[Double] = js.native
  /**
    * A boolean which, if true, removes the job when it successfully completes.
    * When a number, it specifies the amount of jobs to keep.
    * Default behavior is to keep the job in the failed set.
    */
  var removeOnComplete: js.UndefOr[Boolean | Double] = js.native
  /**
    * A boolean which, if true, removes the job when it fails after all attempts.
    * When a number, it specifies the amount of jobs to keep.
    * Default behavior is to keep the job in the completed set.
    */
  var removeOnFail: js.UndefOr[Boolean | Double] = js.native
  /**
    * Repeat job according to a cron specification
    */
  var repeat: js.UndefOr[CronRepeatOptions | EveryRepeatOptions] = js.native
  /**
    * Limits the amount of stack trace lines that will be recorded in the stacktrace.
    */
  var stackTraceLimit: js.UndefOr[Double] = js.native
  /**
    *  The number of milliseconds after which the job should be fail with a timeout error
    */
  var timeout: js.UndefOr[Double] = js.native
}

object JobOptions {
  @scala.inline
  def apply(): JobOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobOptions]
  }
  @scala.inline
  implicit class JobOptionsOps[Self <: JobOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttempts(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attempts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttempts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attempts")(js.undefined)
        ret
    }
    @scala.inline
    def withBackoff(value: Double | BackoffOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backoff")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackoff: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backoff")(js.undefined)
        ret
    }
    @scala.inline
    def withDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(js.undefined)
        ret
    }
    @scala.inline
    def withJobId(value: JobId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobId")(js.undefined)
        ret
    }
    @scala.inline
    def withLifo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lifo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLifo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lifo")(js.undefined)
        ret
    }
    @scala.inline
    def withPriority(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPriority: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveOnComplete(value: Boolean | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeOnComplete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveOnComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeOnComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveOnFail(value: Boolean | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeOnFail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveOnFail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeOnFail")(js.undefined)
        ret
    }
    @scala.inline
    def withRepeat(value: CronRepeatOptions | EveryRepeatOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repeat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepeat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repeat")(js.undefined)
        ret
    }
    @scala.inline
    def withStackTraceLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackTraceLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackTraceLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackTraceLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
  }
  
}

