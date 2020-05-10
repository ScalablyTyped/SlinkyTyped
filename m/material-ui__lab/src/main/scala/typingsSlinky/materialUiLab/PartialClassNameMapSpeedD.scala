package typingsSlinky.materialUiLab

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/lab.@material-ui/lab/SpeedDialAction/SpeedDialAction.SpeedDialActionClassKey>> */
@js.native
trait PartialClassNameMapSpeedD extends js.Object {
  var fab: js.UndefOr[String] = js.native
  var fabClosed: js.UndefOr[String] = js.native
  var staticTooltip: js.UndefOr[String] = js.native
  var staticTooltipClosed: js.UndefOr[String] = js.native
  var staticTooltipLabel: js.UndefOr[String] = js.native
  var tooltipPlacementLeft: js.UndefOr[String] = js.native
}

object PartialClassNameMapSpeedD {
  @scala.inline
  def apply(): PartialClassNameMapSpeedD = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapSpeedD]
  }
  @scala.inline
  implicit class PartialClassNameMapSpeedDOps[Self <: PartialClassNameMapSpeedD] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFab(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fab")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFab: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fab")(js.undefined)
        ret
    }
    @scala.inline
    def withFabClosed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fabClosed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFabClosed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fabClosed")(js.undefined)
        ret
    }
    @scala.inline
    def withStaticTooltip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staticTooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStaticTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staticTooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withStaticTooltipClosed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staticTooltipClosed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStaticTooltipClosed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staticTooltipClosed")(js.undefined)
        ret
    }
    @scala.inline
    def withStaticTooltipLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staticTooltipLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStaticTooltipLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staticTooltipLabel")(js.undefined)
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
  }
  
}

