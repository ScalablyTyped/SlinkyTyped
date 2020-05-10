package typingsSlinky.officeUiFabricReact.tooltipTypesMod

import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITooltipStyleProps extends js.Object {
  /**
    * The width of the Callout's beak
    * @defaultvalue 16
    */
  var beakWidth: js.UndefOr[Double] = js.native
  var className: js.UndefOr[String] = js.native
  /**
    * Delay before tooltip appears.
    * @deprecated Delay logic moved to TooltipHost vs relying on animation delay.
    */
  var delay: js.UndefOr[TooltipDelay] = js.native
  /**
    * The gap between the Callout and the target
    * @defaultvalue 0
    */
  var gapSpace: js.UndefOr[Double] = js.native
  /**
    * Maximum width of tooltip.
    */
  var maxWidth: js.UndefOr[String] = js.native
  var theme: ITheme = js.native
}

object ITooltipStyleProps {
  @scala.inline
  def apply(theme: ITheme): ITooltipStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITooltipStyleProps]
  }
  @scala.inline
  implicit class ITooltipStylePropsOps[Self <: ITooltipStyleProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTheme(value: ITheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeakWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beakWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeakWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beakWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withDelay(value: TooltipDelay): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(js.undefined)
        ret
    }
    @scala.inline
    def withGapSpace(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gapSpace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGapSpace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gapSpace")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxWidth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(js.undefined)
        ret
    }
  }
  
}

