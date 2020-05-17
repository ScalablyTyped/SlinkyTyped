package typingsSlinky.reactFoundation.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Breakpoint extends js.Object {
  var breakpoint: Double = js.native
}

object Breakpoint {
  @scala.inline
  def apply(breakpoint: Double): Breakpoint = {
    val __obj = js.Dynamic.literal(breakpoint = breakpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[Breakpoint]
  }
  @scala.inline
  implicit class BreakpointOps[Self <: Breakpoint] (val x: Self) extends AnyVal {
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

