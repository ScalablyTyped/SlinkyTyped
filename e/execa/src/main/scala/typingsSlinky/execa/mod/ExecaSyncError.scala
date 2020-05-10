package typingsSlinky.execa.mod

import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecaSyncError[StdoutErrorType]
  extends Error
     with ExecaReturnBase[StdoutErrorType] {
  /**
  		Original error message. This is `undefined` unless the child process exited due to an `error` event or a timeout.
  		The `message` property contains both the `originalMessage` and some additional information added by Execa.
  		*/
  var originalMessage: js.UndefOr[String] = js.native
}

object ExecaSyncError {
  @scala.inline
  def apply[StdoutErrorType](
    command: String,
    exitCode: Double,
    exitCodeName: String,
    failed: Boolean,
    killed: Boolean,
    message: String,
    name: String,
    stderr: StdoutErrorType,
    stdout: StdoutErrorType,
    timedOut: Boolean
  ): ExecaSyncError[StdoutErrorType] = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], exitCode = exitCode.asInstanceOf[js.Any], exitCodeName = exitCodeName.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], killed = killed.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any], timedOut = timedOut.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecaSyncError[StdoutErrorType]]
  }
  @scala.inline
  implicit class ExecaSyncErrorOps[Self[stdouterrortype] <: ExecaSyncError[stdouterrortype], StdoutErrorType] (val x: Self[StdoutErrorType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[StdoutErrorType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[StdoutErrorType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[StdoutErrorType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[StdoutErrorType] with Other]
    @scala.inline
    def withOriginalMessage(value: String): Self[StdoutErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginalMessage: Self[StdoutErrorType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalMessage")(js.undefined)
        ret
    }
  }
  
}

