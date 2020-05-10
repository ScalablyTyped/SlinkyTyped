package typingsSlinky.ejWebAll.ej.datavisualization.RangeNavigator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TooltipSettings extends js.Object {
  /** Specifies the background color of tooltip.
    * @Default {#303030}
    */
  var backgroundColor: js.UndefOr[String] = js.native
  /** Options for customizing the font in tooltip.
    */
  var font: js.UndefOr[TooltipSettingsFont] = js.native
  /** Specifies the format of text to be displayed in tooltip.
    * @Default {MM/dd/yyyy}
    */
  var labelFormat: js.UndefOr[String] = js.native
  /** Specifies the mode of displaying the tooltip. Neither to display the tooltip always nor on demand.
    * @Default {null}
    */
  var tooltipDisplayMode: js.UndefOr[String] = js.native
  /** Toggles the visibility of tooltip.
    * @Default {true}
    */
  var visible: js.UndefOr[Boolean] = js.native
}

object TooltipSettings {
  @scala.inline
  def apply(): TooltipSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TooltipSettings]
  }
  @scala.inline
  implicit class TooltipSettingsOps[Self <: TooltipSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withFont(value: TooltipSettingsFont): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFont: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltipDisplayMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipDisplayMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltipDisplayMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipDisplayMode")(js.undefined)
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
  }
  
}

