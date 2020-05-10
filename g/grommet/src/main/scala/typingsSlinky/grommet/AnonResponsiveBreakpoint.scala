package typingsSlinky.grommet

import typingsSlinky.grommet.baseMod.ExtendType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonResponsiveBreakpoint extends js.Object {
  var extend: js.UndefOr[ExtendType] = js.native
  var responsiveBreakpoint: js.UndefOr[String] = js.native
}

object AnonResponsiveBreakpoint {
  @scala.inline
  def apply(): AnonResponsiveBreakpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonResponsiveBreakpoint]
  }
  @scala.inline
  implicit class AnonResponsiveBreakpointOps[Self <: AnonResponsiveBreakpoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExtendFunction1(value: /* args */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extend")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withExtend(value: ExtendType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extend")(js.undefined)
        ret
    }
    @scala.inline
    def withResponsiveBreakpoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsiveBreakpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponsiveBreakpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsiveBreakpoint")(js.undefined)
        ret
    }
  }
  
}

