package typingsSlinky.rbx.anon

import typingsSlinky.rbx.responsiveMod.LimitedResponsiveBreakpointProps
import typingsSlinky.rbx.responsiveMod.ResponsiveBreakpointProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ B in rbx.rbx/base/helpers/variables.Variables['breakpointsLimited'] ]:? rbx.rbx/base/helpers/responsive.LimitedResponsiveBreakpointProps} & {[ B in std.Exclude<rbx.rbx/base/helpers/variables.Variables['breakpoints'], rbx.rbx/base/helpers/variables.Variables['breakpointsLimited']> ]:? rbx.rbx/base/helpers/responsive.ResponsiveBreakpointProps} */
@js.native
trait BinVariablesbreakpointsLi extends js.Object {
  var desktop: js.UndefOr[ResponsiveBreakpointProps] = js.native
  var fullhd: js.UndefOr[LimitedResponsiveBreakpointProps] = js.native
  var mobile: js.UndefOr[LimitedResponsiveBreakpointProps] = js.native
  var tablet: js.UndefOr[ResponsiveBreakpointProps] = js.native
  var touch: js.UndefOr[LimitedResponsiveBreakpointProps] = js.native
  var widescreen: js.UndefOr[ResponsiveBreakpointProps] = js.native
}

object BinVariablesbreakpointsLi {
  @scala.inline
  def apply(): BinVariablesbreakpointsLi = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BinVariablesbreakpointsLi]
  }
  @scala.inline
  implicit class BinVariablesbreakpointsLiOps[Self <: BinVariablesbreakpointsLi] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDesktop(value: ResponsiveBreakpointProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desktop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDesktop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desktop")(js.undefined)
        ret
    }
    @scala.inline
    def withFullhd(value: LimitedResponsiveBreakpointProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullhd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullhd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullhd")(js.undefined)
        ret
    }
    @scala.inline
    def withMobile(value: LimitedResponsiveBreakpointProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMobile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobile")(js.undefined)
        ret
    }
    @scala.inline
    def withTablet(value: ResponsiveBreakpointProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tablet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTablet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tablet")(js.undefined)
        ret
    }
    @scala.inline
    def withTouch(value: LimitedResponsiveBreakpointProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTouch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touch")(js.undefined)
        ret
    }
    @scala.inline
    def withWidescreen(value: ResponsiveBreakpointProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widescreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidescreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widescreen")(js.undefined)
        ret
    }
  }
  
}

