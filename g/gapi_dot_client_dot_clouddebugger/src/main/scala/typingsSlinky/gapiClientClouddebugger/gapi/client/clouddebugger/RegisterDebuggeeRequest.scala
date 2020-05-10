package typingsSlinky.gapiClientClouddebugger.gapi.client.clouddebugger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterDebuggeeRequest extends js.Object {
  /**
    * Debuggee information to register.
    * The fields `project`, `uniquifier`, `description` and `agent_version`
    * of the debuggee must be set.
    */
  var debuggee: js.UndefOr[Debuggee] = js.native
}

object RegisterDebuggeeRequest {
  @scala.inline
  def apply(): RegisterDebuggeeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterDebuggeeRequest]
  }
  @scala.inline
  implicit class RegisterDebuggeeRequestOps[Self <: RegisterDebuggeeRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDebuggee(value: Debuggee): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debuggee")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebuggee: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debuggee")(js.undefined)
        ret
    }
  }
  
}

