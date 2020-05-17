package typingsSlinky.rbx.tooltipMod

import typingsSlinky.rbx.anon.KinVariablesbreakpointsco
import typingsSlinky.rbx.rbxStrings.black
import typingsSlinky.rbx.rbxStrings.bottom
import typingsSlinky.rbx.rbxStrings.danger
import typingsSlinky.rbx.rbxStrings.dark
import typingsSlinky.rbx.rbxStrings.info
import typingsSlinky.rbx.rbxStrings.left
import typingsSlinky.rbx.rbxStrings.light
import typingsSlinky.rbx.rbxStrings.link
import typingsSlinky.rbx.rbxStrings.primary
import typingsSlinky.rbx.rbxStrings.right
import typingsSlinky.rbx.rbxStrings.success
import typingsSlinky.rbx.rbxStrings.top
import typingsSlinky.rbx.rbxStrings.warning
import typingsSlinky.rbx.rbxStrings.white
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TooltipHelpersProps extends js.Object {
  var tooltip: js.UndefOr[Double | String] = js.native
  var tooltipActive: js.UndefOr[Boolean] = js.native
  var tooltipColor: js.UndefOr[
    primary | success | info | warning | danger | light | dark | white | black | link
  ] = js.native
  var tooltipMultiline: js.UndefOr[Boolean] = js.native
  var tooltipPosition: js.UndefOr[top | right | bottom | left] = js.native
  var tooltipResponsive: js.UndefOr[KinVariablesbreakpointsco] = js.native
}

object TooltipHelpersProps {
  @scala.inline
  def apply(): TooltipHelpersProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TooltipHelpersProps]
  }
  @scala.inline
  implicit class TooltipHelpersPropsOps[Self <: TooltipHelpersProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTooltip(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltipActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipActive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltipActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipActive")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltipColor(value: primary | success | info | warning | danger | light | dark | white | black | link): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltipColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipColor")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltipMultiline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipMultiline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltipMultiline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipMultiline")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltipPosition(value: top | right | bottom | left): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltipPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltipResponsive(value: KinVariablesbreakpointsco): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipResponsive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltipResponsive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipResponsive")(js.undefined)
        ret
    }
  }
  
}

