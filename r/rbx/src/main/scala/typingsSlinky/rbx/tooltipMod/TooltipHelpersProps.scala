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

trait TooltipHelpersProps extends js.Object {
  var tooltip: js.UndefOr[Double | String] = js.undefined
  var tooltipActive: js.UndefOr[Boolean] = js.undefined
  var tooltipColor: js.UndefOr[
    primary | success | info | warning | danger | light | dark | white | black | link
  ] = js.undefined
  var tooltipMultiline: js.UndefOr[Boolean] = js.undefined
  var tooltipPosition: js.UndefOr[top | right | bottom | left] = js.undefined
  var tooltipResponsive: js.UndefOr[KinVariablesbreakpointsco] = js.undefined
}

object TooltipHelpersProps {
  @scala.inline
  def apply(
    tooltip: Double | String = null,
    tooltipActive: js.UndefOr[Boolean] = js.undefined,
    tooltipColor: primary | success | info | warning | danger | light | dark | white | black | link = null,
    tooltipMultiline: js.UndefOr[Boolean] = js.undefined,
    tooltipPosition: top | right | bottom | left = null,
    tooltipResponsive: KinVariablesbreakpointsco = null
  ): TooltipHelpersProps = {
    val __obj = js.Dynamic.literal()
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (!js.isUndefined(tooltipActive)) __obj.updateDynamic("tooltipActive")(tooltipActive.get.asInstanceOf[js.Any])
    if (tooltipColor != null) __obj.updateDynamic("tooltipColor")(tooltipColor.asInstanceOf[js.Any])
    if (!js.isUndefined(tooltipMultiline)) __obj.updateDynamic("tooltipMultiline")(tooltipMultiline.get.asInstanceOf[js.Any])
    if (tooltipPosition != null) __obj.updateDynamic("tooltipPosition")(tooltipPosition.asInstanceOf[js.Any])
    if (tooltipResponsive != null) __obj.updateDynamic("tooltipResponsive")(tooltipResponsive.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipHelpersProps]
  }
}

