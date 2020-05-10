package typingsSlinky.nivoBar.mod

import org.scalajs.dom.raw.HTMLCanvasElement
import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.web.SyntheticMouseEvent
import typingsSlinky.nivoBar.AnonId
import typingsSlinky.nivoCore.mod.Theme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BarItemProps extends js.Object {
  var borderColor: String = js.native
  var borderRadius: Double = js.native
  var borderWidth: Double = js.native
  var color: String = js.native
  var data: AnonId = js.native
  var height: Double = js.native
  var label: String = js.native
  var labelColor: String = js.native
  var onClick: BarClickHandler = js.native
  var shouldRenderLabel: Boolean = js.native
  var theme: Theme = js.native
  var tooltip: ReactComponentClass[BarExtendedDatum] = js.native
  var tooltipFormat: String | ValueFormatter = js.native
  var width: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
  def hideTooltip(): Unit = js.native
  def showTooltip(tooltip: TagMod[Any], event: SyntheticMouseEvent[HTMLCanvasElement]): Unit = js.native
}

object BarItemProps {
  @scala.inline
  def apply(
    borderColor: String,
    borderRadius: Double,
    borderWidth: Double,
    color: String,
    data: AnonId,
    height: Double,
    hideTooltip: () => Unit,
    label: String,
    labelColor: String,
    onClick: (/* datum */ BarExtendedDatum, /* event */ SyntheticMouseEvent[HTMLCanvasElement]) => Unit,
    shouldRenderLabel: Boolean,
    showTooltip: (TagMod[Any], SyntheticMouseEvent[HTMLCanvasElement]) => Unit,
    theme: Theme,
    tooltip: ReactComponentClass[BarExtendedDatum],
    tooltipFormat: String | ValueFormatter,
    width: Double,
    x: Double,
    y: Double
  ): BarItemProps = {
    val __obj = js.Dynamic.literal(borderColor = borderColor.asInstanceOf[js.Any], borderRadius = borderRadius.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], hideTooltip = js.Any.fromFunction0(hideTooltip), label = label.asInstanceOf[js.Any], labelColor = labelColor.asInstanceOf[js.Any], onClick = js.Any.fromFunction2(onClick), shouldRenderLabel = shouldRenderLabel.asInstanceOf[js.Any], showTooltip = js.Any.fromFunction2(showTooltip), theme = theme.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], tooltipFormat = tooltipFormat.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarItemProps]
  }
  @scala.inline
  implicit class BarItemPropsOps[Self <: BarItemProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBorderColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBorderRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBorderWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: AnonId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHideTooltip(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideTooltip")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabelColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnClick(value: (/* datum */ BarExtendedDatum, /* event */ SyntheticMouseEvent[HTMLCanvasElement]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withShouldRenderLabel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldRenderLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowTooltip(value: (TagMod[Any], SyntheticMouseEvent[HTMLCanvasElement]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTooltip")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withTheme(value: Theme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTooltip(value: ReactComponentClass[BarExtendedDatum]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTooltipFormatFunction1(value: /* value */ Double => String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipFormat")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTooltipFormat(value: String | ValueFormatter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

