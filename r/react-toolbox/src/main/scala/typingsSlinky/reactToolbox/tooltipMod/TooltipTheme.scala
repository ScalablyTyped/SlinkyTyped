package typingsSlinky.reactToolbox.tooltipMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TooltipTheme extends js.Object {
  /**
    * Added to the tooltip element.
    */
  var tooltip: js.UndefOr[String] = js.native
  /**
    * Added to the root when the tooltip is active.
    */
  var tooltipActive: js.UndefOr[String] = js.native
  /**
    * Wrapper for the root element used to position the tooltip.
    */
  var tooltipWrapper: js.UndefOr[String] = js.native
}

object TooltipTheme {
  @scala.inline
  def apply(): TooltipTheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TooltipTheme]
  }
  @scala.inline
  implicit class TooltipThemeOps[Self <: TooltipTheme] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withTooltipActive(value: String): Self = {
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
    def withTooltipWrapper(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipWrapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltipWrapper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipWrapper")(js.undefined)
        ret
    }
  }
  
}

