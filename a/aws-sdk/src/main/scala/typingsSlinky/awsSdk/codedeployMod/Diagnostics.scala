package typingsSlinky.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Diagnostics extends js.Object {
  /**
    * The associated error code:   Success: The specified script ran.   ScriptMissing: The specified script was not found in the specified location.   ScriptNotExecutable: The specified script is not a recognized executable file type.   ScriptTimedOut: The specified script did not finish running in the specified time period.   ScriptFailed: The specified script failed to run as expected.   UnknownError: The specified script did not run for an unknown reason.  
    */
  var errorCode: js.UndefOr[LifecycleErrorCode] = js.native
  /**
    * The last portion of the diagnostic log. If available, AWS CodeDeploy returns up to the last 4 KB of the diagnostic log.
    */
  var logTail: js.UndefOr[LogTail] = js.native
  /**
    * The message associated with the error.
    */
  var message: js.UndefOr[LifecycleMessage] = js.native
  /**
    * The name of the script.
    */
  var scriptName: js.UndefOr[ScriptName] = js.native
}

object Diagnostics {
  @scala.inline
  def apply(): Diagnostics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Diagnostics]
  }
  @scala.inline
  implicit class DiagnosticsOps[Self <: Diagnostics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorCode(value: LifecycleErrorCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorCode")(js.undefined)
        ret
    }
    @scala.inline
    def withLogTail(value: LogTail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logTail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogTail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logTail")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: LifecycleMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
        ret
    }
    @scala.inline
    def withScriptName(value: ScriptName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scriptName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScriptName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scriptName")(js.undefined)
        ret
    }
  }
  
}

