package typingsSlinky.nivoChord.mod

import slinky.web.SyntheticMouseEvent
import typingsSlinky.nivoChord.OmitArcDataformattedValue
import typingsSlinky.nivoChord.OmitArcDatalabel
import typingsSlinky.nivoColors.mod.InheritedColorProp
import typingsSlinky.nivoColors.mod.OrdinalColorsInstruction
import typingsSlinky.nivoCore.mod.Box
import typingsSlinky.nivoCore.mod.Theme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommonChordProps extends js.Object {
  var BorderColor: js.UndefOr[InheritedColorProp[_]] = js.native
  var arcBorderColor: js.UndefOr[InheritedColorProp[_]] = js.native
  var arcBorderWidth: js.UndefOr[Double] = js.native
  var arcHoverOpacity: js.UndefOr[Double] = js.native
  var arcHoverOthersOpacity: js.UndefOr[Double] = js.native
  var arcOpacity: js.UndefOr[Double] = js.native
  var arcTooltip: js.UndefOr[js.Any] = js.native
  var colors: js.UndefOr[OrdinalColorsInstruction[_]] = js.native
  var enableLabel: js.UndefOr[Boolean] = js.native
  var innerRadiusOffset: js.UndefOr[Double] = js.native
  var innerRadiusRatio: js.UndefOr[Double] = js.native
  var isInteractive: js.UndefOr[Boolean] = js.native
  var keys: js.Array[String] = js.native
  var label: js.UndefOr[String | LabelAccessor] = js.native
  var labelOffset: js.UndefOr[Double] = js.native
  var labelRotation: js.UndefOr[Double] = js.native
  var labelTextColor: js.UndefOr[InheritedColorProp[_]] = js.native
  var layers: js.Array[_] = js.native
  var margin: js.UndefOr[Box] = js.native
  var matrix: js.Array[js.Array[Double]] = js.native
  var onArcClick: js.UndefOr[ChordArcMouseHandler] = js.native
  var onArcMouseEnter: js.UndefOr[ChordArcMouseHandler] = js.native
  var onArcMouseLeave: js.UndefOr[ChordArcMouseHandler] = js.native
  var onArcMouseMove: js.UndefOr[ChordArcMouseHandler] = js.native
  var padAngle: js.UndefOr[Double] = js.native
  var ribbonBorderWidth: js.UndefOr[Double] = js.native
  var ribbonHoverOpacity: js.UndefOr[Double] = js.native
  var ribbonHoverOthersOpacity: js.UndefOr[Double] = js.native
  var ribbonOpacity: js.UndefOr[Double] = js.native
  var theme: js.UndefOr[Theme] = js.native
  var valueFormat: js.UndefOr[String | ValueFormatter] = js.native
}

object CommonChordProps {
  @scala.inline
  def apply(keys: js.Array[String], layers: js.Array[_], matrix: js.Array[js.Array[Double]]): CommonChordProps = {
    val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any], layers = layers.asInstanceOf[js.Any], matrix = matrix.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonChordProps]
  }
  @scala.inline
  implicit class CommonChordPropsOps[Self <: CommonChordProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKeys(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLayers(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatrix(value: js.Array[js.Array[Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matrix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBorderColorFunction1(value: _ => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BorderColor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBorderColor(value: InheritedColorProp[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BorderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BorderColor")(js.undefined)
        ret
    }
    @scala.inline
    def withArcBorderColorFunction1(value: _ => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arcBorderColor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withArcBorderColor(value: InheritedColorProp[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arcBorderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArcBorderColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arcBorderColor")(js.undefined)
        ret
    }
    @scala.inline
    def withArcBorderWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arcBorderWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArcBorderWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arcBorderWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withArcHoverOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arcHoverOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArcHoverOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arcHoverOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withArcHoverOthersOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arcHoverOthersOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArcHoverOthersOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arcHoverOthersOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withArcOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arcOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArcOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arcOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withArcTooltip(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arcTooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArcTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arcTooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withColorsFunction1(value: _ => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withColors(value: OrdinalColorsInstruction[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableLabel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withInnerRadiusOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerRadiusOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInnerRadiusOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerRadiusOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withInnerRadiusRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerRadiusRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInnerRadiusRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerRadiusRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withIsInteractive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInteractive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsInteractive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInteractive")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelFunction1(value: /* datum */ OmitArcDatalabel => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLabel(value: String | LabelAccessor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelRotation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelRotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelRotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelRotation")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelTextColorFunction1(value: _ => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelTextColor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLabelTextColor(value: InheritedColorProp[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelTextColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelTextColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelTextColor")(js.undefined)
        ret
    }
    @scala.inline
    def withMargin(value: Box): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(js.undefined)
        ret
    }
    @scala.inline
    def withOnArcClick(value: (/* arc */ ArcData, /* event */ SyntheticMouseEvent[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onArcClick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnArcClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onArcClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnArcMouseEnter(value: (/* arc */ ArcData, /* event */ SyntheticMouseEvent[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onArcMouseEnter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnArcMouseEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onArcMouseEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnArcMouseLeave(value: (/* arc */ ArcData, /* event */ SyntheticMouseEvent[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onArcMouseLeave")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnArcMouseLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onArcMouseLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withOnArcMouseMove(value: (/* arc */ ArcData, /* event */ SyntheticMouseEvent[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onArcMouseMove")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnArcMouseMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onArcMouseMove")(js.undefined)
        ret
    }
    @scala.inline
    def withPadAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPadAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padAngle")(js.undefined)
        ret
    }
    @scala.inline
    def withRibbonBorderWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ribbonBorderWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRibbonBorderWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ribbonBorderWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withRibbonHoverOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ribbonHoverOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRibbonHoverOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ribbonHoverOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withRibbonHoverOthersOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ribbonHoverOthersOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRibbonHoverOthersOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ribbonHoverOthersOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withRibbonOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ribbonOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRibbonOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ribbonOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: Theme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
    @scala.inline
    def withValueFormatFunction1(value: /* datum */ OmitArcDataformattedValue => String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueFormat")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withValueFormat(value: String | ValueFormatter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueFormat")(js.undefined)
        ret
    }
  }
  
}

