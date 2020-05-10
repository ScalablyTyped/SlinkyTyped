package typingsSlinky.materialUiCore.createBreakpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ key in @material-ui/core.@material-ui/core/styles/createBreakpoints.Breakpoint ]: number} */
@js.native
trait BreakpointValues extends js.Object {
  var lg: Double = js.native
  var md: Double = js.native
  var sm: Double = js.native
  var xl: Double = js.native
  var xs: Double = js.native
}

object BreakpointValues {
  @scala.inline
  def apply(lg: Double, md: Double, sm: Double, xl: Double, xs: Double): BreakpointValues = {
    val __obj = js.Dynamic.literal(lg = lg.asInstanceOf[js.Any], md = md.asInstanceOf[js.Any], sm = sm.asInstanceOf[js.Any], xl = xl.asInstanceOf[js.Any], xs = xs.asInstanceOf[js.Any])
    __obj.asInstanceOf[BreakpointValues]
  }
  @scala.inline
  implicit class BreakpointValuesOps[Self <: BreakpointValues] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLg(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("md")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSm(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXl(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xs")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

