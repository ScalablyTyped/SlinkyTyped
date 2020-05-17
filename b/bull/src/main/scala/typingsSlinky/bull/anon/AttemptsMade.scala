package typingsSlinky.bull.anon

import typingsSlinky.bull.mod.JobOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttemptsMade[T] extends js.Object {
  var attemptsMade: Double = js.native
  var data: T = js.native
  var delay: Double = js.native
  var failedReason: js.Any = js.native
  var finishedOn: Double | Null = js.native
  var id: typingsSlinky.bull.mod.JobId = js.native
  var name: String = js.native
  var opts: JobOptions = js.native
  var processedOn: Double | Null = js.native
  var progress: Double = js.native
  var returnvalue: js.Any = js.native
  var stacktrace: js.Array[String] | Null = js.native
  var timestamp: Double = js.native
}

object AttemptsMade {
  @scala.inline
  def apply[T](
    attemptsMade: Double,
    data: T,
    delay: Double,
    failedReason: js.Any,
    id: typingsSlinky.bull.mod.JobId,
    name: String,
    opts: JobOptions,
    progress: Double,
    returnvalue: js.Any,
    timestamp: Double
  ): AttemptsMade[T] = {
    val __obj = js.Dynamic.literal(attemptsMade = attemptsMade.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], failedReason = failedReason.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], opts = opts.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], returnvalue = returnvalue.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttemptsMade[T]]
  }
  @scala.inline
  implicit class AttemptsMadeOps[Self[t] <: AttemptsMade[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withAttemptsMade(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attemptsMade")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelay(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFailedReason(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failedReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: typingsSlinky.bull.mod.JobId): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpts(value: JobOptions): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProgress(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReturnvalue(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnvalue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimestamp(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFinishedOn(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finishedOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFinishedOnNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finishedOn")(null)
        ret
    }
    @scala.inline
    def withProcessedOn(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processedOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProcessedOnNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processedOn")(null)
        ret
    }
    @scala.inline
    def withStacktrace(value: js.Array[String]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stacktrace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStacktraceNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stacktrace")(null)
        ret
    }
  }
  
}

