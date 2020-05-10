package typingsSlinky.execa.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecaReturnBase[StdoutStderrType] extends js.Object {
  /**
  		The file and arguments that were run.
  		*/
  var command: String = js.native
  /**
  		The numeric exit code of the process that was run.
  		*/
  var exitCode: Double = js.native
  /**
  		The textual exit code of the process that was run.
  		*/
  var exitCodeName: String = js.native
  /**
  		Whether the process failed to run.
  		*/
  var failed: Boolean = js.native
  /**
  		Whether the process was killed.
  		*/
  var killed: Boolean = js.native
  /**
  		The signal that was used to terminate the process.
  		*/
  var signal: js.UndefOr[String] = js.native
  /**
  		The output of the process on stderr.
  		*/
  var stderr: StdoutStderrType = js.native
  /**
  		The output of the process on stdout.
  		*/
  var stdout: StdoutStderrType = js.native
  /**
  		Whether the process timed out.
  		*/
  var timedOut: Boolean = js.native
}

object ExecaReturnBase {
  @scala.inline
  def apply[StdoutStderrType](
    command: String,
    exitCode: Double,
    exitCodeName: String,
    failed: Boolean,
    killed: Boolean,
    stderr: StdoutStderrType,
    stdout: StdoutStderrType,
    timedOut: Boolean
  ): ExecaReturnBase[StdoutStderrType] = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], exitCode = exitCode.asInstanceOf[js.Any], exitCodeName = exitCodeName.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], killed = killed.asInstanceOf[js.Any], stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any], timedOut = timedOut.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecaReturnBase[StdoutStderrType]]
  }
  @scala.inline
  implicit class ExecaReturnBaseOps[Self[stdoutstderrtype] <: ExecaReturnBase[stdoutstderrtype], StdoutStderrType] (val x: Self[StdoutStderrType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[StdoutStderrType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[StdoutStderrType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[StdoutStderrType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[StdoutStderrType] with Other]
    @scala.inline
    def withCommand(value: String): Self[StdoutStderrType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("command")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExitCode(value: Double): Self[StdoutStderrType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exitCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExitCodeName(value: String): Self[StdoutStderrType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exitCodeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFailed(value: Boolean): Self[StdoutStderrType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKilled(value: Boolean): Self[StdoutStderrType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("killed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStderr(value: StdoutStderrType): Self[StdoutStderrType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stderr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStdout(value: StdoutStderrType): Self[StdoutStderrType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stdout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimedOut(value: Boolean): Self[StdoutStderrType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timedOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSignal(value: String): Self[StdoutStderrType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignal: Self[StdoutStderrType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signal")(js.undefined)
        ret
    }
  }
  
}

