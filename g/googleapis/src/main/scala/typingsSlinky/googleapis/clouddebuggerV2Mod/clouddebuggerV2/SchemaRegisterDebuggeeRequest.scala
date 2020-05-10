package typingsSlinky.googleapis.clouddebuggerV2Mod.clouddebuggerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to register a debuggee.
  */
@js.native
trait SchemaRegisterDebuggeeRequest extends js.Object {
  /**
    * Debuggee information to register. The fields `project`, `uniquifier`,
    * `description` and `agent_version` of the debuggee must be set.
    */
  var debuggee: js.UndefOr[SchemaDebuggee] = js.native
}

object SchemaRegisterDebuggeeRequest {
  @scala.inline
  def apply(): SchemaRegisterDebuggeeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRegisterDebuggeeRequest]
  }
  @scala.inline
  implicit class SchemaRegisterDebuggeeRequestOps[Self <: SchemaRegisterDebuggeeRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDebuggee(value: SchemaDebuggee): Self = {
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

