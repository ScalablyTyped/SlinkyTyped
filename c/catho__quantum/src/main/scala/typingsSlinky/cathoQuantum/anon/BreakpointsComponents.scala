package typingsSlinky.cathoQuantum.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BreakpointsComponents extends js.Object {
  var breakpoints: js.UndefOr[js.Object] = js.native
  var components: js.UndefOr[js.Object] = js.native
}

object BreakpointsComponents {
  @scala.inline
  def apply(): BreakpointsComponents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BreakpointsComponents]
  }
  @scala.inline
  implicit class BreakpointsComponentsOps[Self <: BreakpointsComponents] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBreakpoints(value: js.Object): Self = {
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
    def withComponents(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("components")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("components")(js.undefined)
        ret
    }
  }
  
}

