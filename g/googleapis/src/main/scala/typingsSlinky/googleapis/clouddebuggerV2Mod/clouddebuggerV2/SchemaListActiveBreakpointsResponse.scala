package typingsSlinky.googleapis.clouddebuggerV2Mod.clouddebuggerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for listing active breakpoints.
  */
@js.native
trait SchemaListActiveBreakpointsResponse extends js.Object {
  /**
    * List of all active breakpoints. The fields `id` and `location` are
    * guaranteed to be set on each breakpoint.
    */
  var breakpoints: js.UndefOr[js.Array[SchemaBreakpoint]] = js.native
  /**
    * A token that can be used in the next method call to block until the list
    * of breakpoints changes.
    */
  var nextWaitToken: js.UndefOr[String] = js.native
  /**
    * If set to `true`, indicates that there is no change to the list of active
    * breakpoints and the server-selected timeout has expired. The
    * `breakpoints` field would be empty and should be ignored.
    */
  var waitExpired: js.UndefOr[Boolean] = js.native
}

object SchemaListActiveBreakpointsResponse {
  @scala.inline
  def apply(): SchemaListActiveBreakpointsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListActiveBreakpointsResponse]
  }
  @scala.inline
  implicit class SchemaListActiveBreakpointsResponseOps[Self <: SchemaListActiveBreakpointsResponse] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withWaitExpired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitExpired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaitExpired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitExpired")(js.undefined)
        ret
    }
  }
  
}

