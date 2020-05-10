package typingsSlinky.gapiClientClouddebugger.gapi.client.clouddebugger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBreakpointResponse extends js.Object {
  /**
    * Complete breakpoint state.
    * The fields `id` and `location` are guaranteed to be set.
    */
  var breakpoint: js.UndefOr[Breakpoint] = js.native
}

object GetBreakpointResponse {
  @scala.inline
  def apply(): GetBreakpointResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBreakpointResponse]
  }
  @scala.inline
  implicit class GetBreakpointResponseOps[Self <: GetBreakpointResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBreakpoint(value: Breakpoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breakpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBreakpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breakpoint")(js.undefined)
        ret
    }
  }
  
}

