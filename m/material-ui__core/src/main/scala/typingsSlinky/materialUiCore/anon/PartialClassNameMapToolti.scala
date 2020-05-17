package typingsSlinky.materialUiCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/Tooltip/Tooltip.TooltipClassKey>> */
@js.native
trait PartialClassNameMapToolti extends js.Object {
  var popper: js.UndefOr[String] = js.native
  var popperInteractive: js.UndefOr[String] = js.native
  var tooltip: js.UndefOr[String] = js.native
  var tooltipPlacementBottom: js.UndefOr[String] = js.native
  var tooltipPlacementLeft: js.UndefOr[String] = js.native
  var tooltipPlacementRight: js.UndefOr[String] = js.native
  var tooltipPlacementTop: js.UndefOr[String] = js.native
  var touch: js.UndefOr[String] = js.native
}

object PartialClassNameMapToolti {
  @scala.inline
  def apply(): PartialClassNameMapToolti = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapToolti]
  }
  @scala.inline
  implicit class PartialClassNameMapTooltiOps[Self <: PartialClassNameMapToolti] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPopper(value: String): Self = {
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
    def withPopperInteractive(value: String): Self = {
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
    def withTooltip(value: String): Self = {
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
    def withTooltipPlacementBottom(value: String): Self = {
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
    def withTooltipPlacementLeft(value: String): Self = {
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
    def withTooltipPlacementRight(value: String): Self = {
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
    def withTooltipPlacementTop(value: String): Self = {
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
    def withTouch(value: String): Self = {
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

