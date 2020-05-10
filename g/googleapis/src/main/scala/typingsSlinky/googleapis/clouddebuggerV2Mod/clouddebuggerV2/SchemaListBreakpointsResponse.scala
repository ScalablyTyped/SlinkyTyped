package typingsSlinky.googleapis.clouddebuggerV2Mod.clouddebuggerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for listing breakpoints.
  */
@js.native
trait SchemaListBreakpointsResponse extends js.Object {
  /**
    * List of breakpoints matching the request. The fields `id` and `location`
    * are guaranteed to be set on each breakpoint. The fields: `stack_frames`,
    * `evaluated_expressions` and `variable_table` are cleared on each
    * breakpoint regardless of its status.
    */
  var breakpoints: js.UndefOr[js.Array[SchemaBreakpoint]] = js.native
  /**
    * A wait token that can be used in the next call to `list` (REST) or
    * `ListBreakpoints` (RPC) to block until the list of breakpoints has
    * changes.
    */
  var nextWaitToken: js.UndefOr[String] = js.native
}

object SchemaListBreakpointsResponse {
  @scala.inline
  def apply(): SchemaListBreakpointsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListBreakpointsResponse]
  }
  @scala.inline
  implicit class SchemaListBreakpointsResponseOps[Self <: SchemaListBreakpointsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBreakpoints(value: js.Array[SchemaBreakpoint]): Self = {
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

