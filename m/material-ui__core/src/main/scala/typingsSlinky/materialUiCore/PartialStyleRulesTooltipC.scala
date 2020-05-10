package typingsSlinky.materialUiCore

import typingsSlinky.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/Tooltip.TooltipClassKey>> */
@js.native
trait PartialStyleRulesTooltipC extends js.Object {
  var popper: js.UndefOr[CSSProperties] = js.native
  var popperInteractive: js.UndefOr[CSSProperties] = js.native
  var tooltip: js.UndefOr[CSSProperties] = js.native
  var tooltipPlacementBottom: js.UndefOr[CSSProperties] = js.native
  var tooltipPlacementLeft: js.UndefOr[CSSProperties] = js.native
  var tooltipPlacementRight: js.UndefOr[CSSProperties] = js.native
  var tooltipPlacementTop: js.UndefOr[CSSProperties] = js.native
  var touch: js.UndefOr[CSSProperties] = js.native
}

object PartialStyleRulesTooltipC {
  @scala.inline
  def apply(): PartialStyleRulesTooltipC = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesTooltipC]
  }
  @scala.inline
  implicit class PartialStyleRulesTooltipCOps[Self <: PartialStyleRulesTooltipC] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPopper(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popper")(js.undefined)
        ret
    }
    @scala.inline
    def withPopperInteractive(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popperInteractive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopperInteractive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popperInteractive")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltip(value: CSSProperties): Self = {
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
    def withTooltipPlacementBottom(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipPlacementBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltipPlacementBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipPlacementBottom")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltipPlacementLeft(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipPlacementLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltipPlacementLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipPlacementLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltipPlacementRight(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipPlacementRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltipPlacementRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipPlacementRight")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltipPlacementTop(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipPlacementTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltipPlacementTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipPlacementTop")(js.undefined)
        ret
    }
    @scala.inline
    def withTouch(value: CSSProperties): Self = {
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
  }
  
}

