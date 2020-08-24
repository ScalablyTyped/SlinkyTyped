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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTooltip(value: Double | String): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    @scala.inline
    def setTooltipActive(value: Boolean): Self = this.set("tooltipActive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltipActive: Self = this.set("tooltipActive", js.undefined)
    @scala.inline
    def setTooltipColor(value: primary | success | info | warning | danger | light | dark | white | black | link): Self = this.set("tooltipColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltipColor: Self = this.set("tooltipColor", js.undefined)
    @scala.inline
    def setTooltipMultiline(value: Boolean): Self = this.set("tooltipMultiline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltipMultiline: Self = this.set("tooltipMultiline", js.undefined)
    @scala.inline
    def setTooltipPosition(value: top | right | bottom | left): Self = this.set("tooltipPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltipPosition: Self = this.set("tooltipPosition", js.undefined)
    @scala.inline
    def setTooltipResponsive(value: KinVariablesbreakpointsco): Self = this.set("tooltipResponsive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltipResponsive: Self = this.set("tooltipResponsive", js.undefined)
  }
  
}

