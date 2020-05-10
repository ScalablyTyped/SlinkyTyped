package typingsSlinky.reactFoundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBreakpoint extends js.Object {
  var breakpoint: Double = js.native
}

object AnonBreakpoint {
  @scala.inline
  def apply(breakpoint: Double): AnonBreakpoint = {
    val __obj = js.Dynamic.literal(breakpoint = breakpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBreakpoint]
  }
  @scala.inline
  implicit class AnonBreakpointOps[Self <: AnonBreakpoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBreakpoint(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breakpoint")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

