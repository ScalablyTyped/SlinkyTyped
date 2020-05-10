package typingsSlinky.gapiClientClouddebugger.gapi.client.clouddebugger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateActiveBreakpointRequest extends js.Object {
  /**
    * Updated breakpoint information.
    * The field `id` must be set.
    * The agent must echo all Breakpoint specification fields in the update.
    */
  var breakpoint: js.UndefOr[Breakpoint] = js.native
}

object UpdateActiveBreakpointRequest {
  @scala.inline
  def apply(): UpdateActiveBreakpointRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateActiveBreakpointRequest]
  }
  @scala.inline
  implicit class UpdateActiveBreakpointRequestOps[Self <: UpdateActiveBreakpointRequest] (val x: Self) extends AnyVal {
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

