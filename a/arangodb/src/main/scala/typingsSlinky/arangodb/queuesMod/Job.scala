package typingsSlinky.arangodb.queuesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Job extends js.Object {
  var created: Double = js.native
  var data: js.Any = js.native
  var delayUntil: Double = js.native
  var failure: js.UndefOr[String] = js.native
  var failures: js.Array[js.Object] = js.native
  var maxFailures: Double = js.native
  var modified: Double = js.native
  var queue: String = js.native
  var repeatDelay: Double = js.native
  var repeatTimes: Double = js.native
  var repeatUntil: Double = js.native
  var runFailures: Double = js.native
  var runs: Double = js.native
  var status: String = js.native
  var success: js.UndefOr[String] = js.native
  var `type`: Script = js.native
  def abort(): Unit = js.native
}

object Job {
  @scala.inline
  def apply(
    abort: () => Unit,
    created: Double,
    data: js.Any,
    delayUntil: Double,
    failures: js.Array[js.Object],
    maxFailures: Double,
    modified: Double,
    queue: String,
    repeatDelay: Double,
    repeatTimes: Double,
    repeatUntil: Double,
    runFailures: Double,
    runs: Double,
    status: String,
    `type`: Script
  ): Job = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), created = created.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], delayUntil = delayUntil.asInstanceOf[js.Any], failures = failures.asInstanceOf[js.Any], maxFailures = maxFailures.asInstanceOf[js.Any], modified = modified.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any], repeatDelay = repeatDelay.asInstanceOf[js.Any], repeatTimes = repeatTimes.asInstanceOf[js.Any], repeatUntil = repeatUntil.asInstanceOf[js.Any], runFailures = runFailures.asInstanceOf[js.Any], runs = runs.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Job]
  }
  @scala.inline
  implicit class JobOps[Self <: Job] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbort(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abort")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCreated(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelayUntil(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayUntil")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFailures(value: js.Array[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxFailures(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFailures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModified(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepeatDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repeatDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepeatTimes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repeatTimes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepeatUntil(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repeatUntil")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRunFailures(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runFailures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRuns(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: Script): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFailure(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failure")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccess(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.undefined)
        ret
    }
  }
  
}

