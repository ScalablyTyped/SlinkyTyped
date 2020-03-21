package typingsSlinky.nivoChord.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.nivoChord.mod.ArcData
import typingsSlinky.nivoChord.mod.ChordProps
import typingsSlinky.nivoChord.mod.LabelAccessor
import typingsSlinky.nivoChord.mod.RibbonData
import typingsSlinky.nivoChord.mod.ValueFormatter
import typingsSlinky.nivoColors.mod.InheritedColorProp
import typingsSlinky.nivoColors.mod.OrdinalColorsInstruction
import typingsSlinky.nivoCore.mod.Box
import typingsSlinky.nivoCore.mod.Theme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ResponsiveChord
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.nivoChord.mod.ResponsiveChord] {
  @JSImport("@nivo/chord", "ResponsiveChord")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    keys: js.Array[String],
    layers: js.Array[_],
    matrix: js.Array[js.Array[Double]],
    BorderColor: InheritedColorProp[_] = null,
    animate: js.UndefOr[Boolean] = js.undefined,
    arcBorderColor: InheritedColorProp[_] = null,
    arcBorderWidth: Int | Double = null,
    arcHoverOpacity: Int | Double = null,
    arcHoverOthersOpacity: Int | Double = null,
    arcOpacity: Int | Double = null,
    arcTooltip: js.Any = null,
    colors: OrdinalColorsInstruction[_] = null,
    enableLabel: js.UndefOr[Boolean] = js.undefined,
    innerRadiusOffset: Int | Double = null,
    innerRadiusRatio: Int | Double = null,
    isInteractive: js.UndefOr[Boolean] = js.undefined,
    label: String | LabelAccessor = null,
    labelOffset: Int | Double = null,
    labelRotation: Int | Double = null,
    labelTextColor: InheritedColorProp[_] = null,
    margin: Box = null,
    motionDamping: Int | Double = null,
    motionStiffness: Int | Double = null,
    onArcClick: (/* arc */ ArcData, /* event */ SyntheticMouseEvent[js.Any]) => Unit = null,
    onArcMouseEnter: (/* arc */ ArcData, /* event */ SyntheticMouseEvent[js.Any]) => Unit = null,
    onArcMouseLeave: (/* arc */ ArcData, /* event */ SyntheticMouseEvent[js.Any]) => Unit = null,
    onArcMouseMove: (/* arc */ ArcData, /* event */ SyntheticMouseEvent[js.Any]) => Unit = null,
    onRibbonClick: (/* ribbon */ RibbonData, /* event */ SyntheticMouseEvent[js.Any]) => Unit = null,
    onRibbonMouseEnter: (/* ribbon */ RibbonData, /* event */ SyntheticMouseEvent[js.Any]) => Unit = null,
    onRibbonMouseLeave: (/* ribbon */ RibbonData, /* event */ SyntheticMouseEvent[js.Any]) => Unit = null,
    onRibbonMouseMove: (/* ribbon */ RibbonData, /* event */ SyntheticMouseEvent[js.Any]) => Unit = null,
    padAngle: Int | Double = null,
    ribbonBorderWidth: Int | Double = null,
    ribbonHoverOpacity: Int | Double = null,
    ribbonHoverOthersOpacity: Int | Double = null,
    ribbonOpacity: Int | Double = null,
    ribbonTooltip: js.Any = null,
    theme: Theme = null,
    valueFormat: String | ValueFormatter = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.nivoChord.mod.ResponsiveChord] = {
    val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any], layers = layers.asInstanceOf[js.Any], matrix = matrix.asInstanceOf[js.Any])
    if (BorderColor != null) __obj.updateDynamic("BorderColor")(BorderColor.asInstanceOf[js.Any])
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (arcBorderColor != null) __obj.updateDynamic("arcBorderColor")(arcBorderColor.asInstanceOf[js.Any])
    if (arcBorderWidth != null) __obj.updateDynamic("arcBorderWidth")(arcBorderWidth.asInstanceOf[js.Any])
    if (arcHoverOpacity != null) __obj.updateDynamic("arcHoverOpacity")(arcHoverOpacity.asInstanceOf[js.Any])
    if (arcHoverOthersOpacity != null) __obj.updateDynamic("arcHoverOthersOpacity")(arcHoverOthersOpacity.asInstanceOf[js.Any])
    if (arcOpacity != null) __obj.updateDynamic("arcOpacity")(arcOpacity.asInstanceOf[js.Any])
    if (arcTooltip != null) __obj.updateDynamic("arcTooltip")(arcTooltip.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (!js.isUndefined(enableLabel)) __obj.updateDynamic("enableLabel")(enableLabel.asInstanceOf[js.Any])
    if (innerRadiusOffset != null) __obj.updateDynamic("innerRadiusOffset")(innerRadiusOffset.asInstanceOf[js.Any])
    if (innerRadiusRatio != null) __obj.updateDynamic("innerRadiusRatio")(innerRadiusRatio.asInstanceOf[js.Any])
    if (!js.isUndefined(isInteractive)) __obj.updateDynamic("isInteractive")(isInteractive.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelOffset != null) __obj.updateDynamic("labelOffset")(labelOffset.asInstanceOf[js.Any])
    if (labelRotation != null) __obj.updateDynamic("labelRotation")(labelRotation.asInstanceOf[js.Any])
    if (labelTextColor != null) __obj.updateDynamic("labelTextColor")(labelTextColor.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (motionDamping != null) __obj.updateDynamic("motionDamping")(motionDamping.asInstanceOf[js.Any])
    if (motionStiffness != null) __obj.updateDynamic("motionStiffness")(motionStiffness.asInstanceOf[js.Any])
    if (onArcClick != null) __obj.updateDynamic("onArcClick")(js.Any.fromFunction2(onArcClick))
    if (onArcMouseEnter != null) __obj.updateDynamic("onArcMouseEnter")(js.Any.fromFunction2(onArcMouseEnter))
    if (onArcMouseLeave != null) __obj.updateDynamic("onArcMouseLeave")(js.Any.fromFunction2(onArcMouseLeave))
    if (onArcMouseMove != null) __obj.updateDynamic("onArcMouseMove")(js.Any.fromFunction2(onArcMouseMove))
    if (onRibbonClick != null) __obj.updateDynamic("onRibbonClick")(js.Any.fromFunction2(onRibbonClick))
    if (onRibbonMouseEnter != null) __obj.updateDynamic("onRibbonMouseEnter")(js.Any.fromFunction2(onRibbonMouseEnter))
    if (onRibbonMouseLeave != null) __obj.updateDynamic("onRibbonMouseLeave")(js.Any.fromFunction2(onRibbonMouseLeave))
    if (onRibbonMouseMove != null) __obj.updateDynamic("onRibbonMouseMove")(js.Any.fromFunction2(onRibbonMouseMove))
    if (padAngle != null) __obj.updateDynamic("padAngle")(padAngle.asInstanceOf[js.Any])
    if (ribbonBorderWidth != null) __obj.updateDynamic("ribbonBorderWidth")(ribbonBorderWidth.asInstanceOf[js.Any])
    if (ribbonHoverOpacity != null) __obj.updateDynamic("ribbonHoverOpacity")(ribbonHoverOpacity.asInstanceOf[js.Any])
    if (ribbonHoverOthersOpacity != null) __obj.updateDynamic("ribbonHoverOthersOpacity")(ribbonHoverOthersOpacity.asInstanceOf[js.Any])
    if (ribbonOpacity != null) __obj.updateDynamic("ribbonOpacity")(ribbonOpacity.asInstanceOf[js.Any])
    if (ribbonTooltip != null) __obj.updateDynamic("ribbonTooltip")(ribbonTooltip.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (valueFormat != null) __obj.updateDynamic("valueFormat")(valueFormat.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ChordProps
}

