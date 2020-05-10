package typingsSlinky.gapiClientClouddebugger.gapi.client.clouddebugger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterDebuggeeResponse extends js.Object {
  /**
    * Debuggee resource.
    * The field `id` is guranteed to be set (in addition to the echoed fields).
    * If the field `is_disabled` is set to `true`, the agent should disable
    * itself by removing all breakpoints and detaching from the application.
    * It should however continue to poll `RegisterDebuggee` until reenabled.
    */
  var debuggee: js.UndefOr[Debuggee] = js.native
}

object RegisterDebuggeeResponse {
  @scala.inline
  def apply(): RegisterDebuggeeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterDebuggeeResponse]
  }
  @scala.inline
  implicit class RegisterDebuggeeResponseOps[Self <: RegisterDebuggeeResponse] (val x: Self) extends AnyVal {
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

