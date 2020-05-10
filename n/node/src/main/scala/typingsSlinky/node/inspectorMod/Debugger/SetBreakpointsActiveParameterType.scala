package typingsSlinky.node.inspectorMod.Debugger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetBreakpointsActiveParameterType extends js.Object {
  /**
    * New value for breakpoints active state.
    */
  var active: Boolean = js.native
}

object SetBreakpointsActiveParameterType {
  @scala.inline
  def apply(active: Boolean): SetBreakpointsActiveParameterType = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetBreakpointsActiveParameterType]
  }
  @scala.inline
  implicit class SetBreakpointsActiveParameterTypeOps[Self <: SetBreakpointsActiveParameterType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

