package typingsSlinky.execa.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecaError[StdoutErrorType] extends ExecaSyncError[StdoutErrorType] {
  /**
  		The output of the process with `stdout` and `stderr` interleaved.
  		*/
  var all: StdoutErrorType = js.native
  /**
  		Whether the process was canceled.
  		*/
  var isCanceled: Boolean = js.native
}

object ExecaError {
  @scala.inline
  def apply[StdoutErrorType](
    all: StdoutErrorType,
    command: String,
    exitCode: Double,
    exitCodeName: String,
    failed: Boolean,
    isCanceled: Boolean,
    killed: Boolean,
    message: String,
    name: String,
    stderr: StdoutErrorType,
    stdout: StdoutErrorType,
    timedOut: Boolean
  ): ExecaError[StdoutErrorType] = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], exitCode = exitCode.asInstanceOf[js.Any], exitCodeName = exitCodeName.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], isCanceled = isCanceled.asInstanceOf[js.Any], killed = killed.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any], timedOut = timedOut.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecaError[StdoutErrorType]]
  }
  @scala.inline
  implicit class ExecaErrorOps[Self[stdouterrortype] <: ExecaError[stdouterrortype], StdoutErrorType] (val x: Self[StdoutErrorType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[StdoutErrorType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[StdoutErrorType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[StdoutErrorType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[StdoutErrorType] with Other]
    @scala.inline
    def withAll(value: StdoutErrorType): Self[StdoutErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("all")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsCanceled(value: Boolean): Self[StdoutErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCanceled")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

