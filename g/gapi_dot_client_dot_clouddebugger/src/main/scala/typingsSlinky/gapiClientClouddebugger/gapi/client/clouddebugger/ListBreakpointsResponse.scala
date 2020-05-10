package typingsSlinky.gapiClientClouddebugger.gapi.client.clouddebugger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListBreakpointsResponse extends js.Object {
  /**
    * List of breakpoints matching the request.
    * The fields `id` and `location` are guaranteed to be set on each breakpoint.
    * The fields: `stack_frames`, `evaluated_expressions` and `variable_table`
    * are cleared on each breakpoint regardless of its status.
    */
  var breakpoints: js.UndefOr[js.Array[Breakpoint]] = js.native
  /**
    * A wait token that can be used in the next call to `list` (REST) or
    * `ListBreakpoints` (RPC) to block until the list of breakpoints has changes.
    */
  var nextWaitToken: js.UndefOr[String] = js.native
}

object ListBreakpointsResponse {
  @scala.inline
  def apply(): ListBreakpointsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBreakpointsResponse]
  }
  @scala.inline
  implicit class ListBreakpointsResponseOps[Self <: ListBreakpointsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBreakpoints(value: js.Array[Breakpoint]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breakpoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBreakpoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breakpoints")(js.undefined)
        ret
    }
    @scala.inline
    def withNextWaitToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextWaitToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextWaitToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextWaitToken")(js.undefined)
        ret
    }
  }
  
}

