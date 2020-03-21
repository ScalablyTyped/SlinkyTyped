package typingsSlinky.devextreme.mod.DevExpress.viz

import typingsSlinky.devextreme.AnonIndent
import typingsSlinky.devextreme.devextremeStrings.Bright
import typingsSlinky.devextreme.devextremeStrings.Carmine
import typingsSlinky.devextreme.devextremeStrings.Default
import typingsSlinky.devextreme.devextremeStrings.Material
import typingsSlinky.devextreme.devextremeStrings.Ocean
import typingsSlinky.devextreme.devextremeStrings.Office
import typingsSlinky.devextreme.devextremeStrings.Pastel
import typingsSlinky.devextreme.devextremeStrings.Soft
import typingsSlinky.devextreme.devextremeStrings.Vintage
import typingsSlinky.devextreme.devextremeStrings.Violet
import typingsSlinky.devextreme.devextremeStrings.`Dark Moon`
import typingsSlinky.devextreme.devextremeStrings.`Dark Violet`
import typingsSlinky.devextreme.devextremeStrings.`Green Mist`
import typingsSlinky.devextreme.devextremeStrings.`Harmony Light`
import typingsSlinky.devextreme.devextremeStrings.`Soft Blue`
import typingsSlinky.devextreme.devextremeStrings.`Soft Pastel`
import typingsSlinky.devextreme.devextremeStrings.bottom
import typingsSlinky.devextreme.devextremeStrings.circle
import typingsSlinky.devextreme.devextremeStrings.left
import typingsSlinky.devextreme.devextremeStrings.rangeBar
import typingsSlinky.devextreme.devextremeStrings.rectangle
import typingsSlinky.devextreme.devextremeStrings.rectangleNeedle
import typingsSlinky.devextreme.devextremeStrings.rhombus
import typingsSlinky.devextreme.devextremeStrings.right
import typingsSlinky.devextreme.devextremeStrings.textCloud
import typingsSlinky.devextreme.devextremeStrings.top
import typingsSlinky.devextreme.devextremeStrings.triangleMarker
import typingsSlinky.devextreme.devextremeStrings.triangleNeedle
import typingsSlinky.devextreme.devextremeStrings.twoColorNeedle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GaugeIndicator extends CommonIndicator {
  /** Specifies the type of gauge indicators. */
  var `type`: js.UndefOr[
    circle | rangeBar | rectangle | rectangleNeedle | rhombus | textCloud | triangleMarker | triangleNeedle | twoColorNeedle
  ] = js.undefined
}

object GaugeIndicator {
  @scala.inline
  def apply(
    arrowLength: Int | Double = null,
    backgroundColor: String = null,
    baseValue: Int | Double = null,
    beginAdaptingAtRadius: Int | Double = null,
    color: String = null,
    horizontalOrientation: left | right = null,
    indentFromCenter: Int | Double = null,
    length: Int | Double = null,
    offset: Int | Double = null,
    palette: js.Array[String] | Bright | Default | (`Harmony Light`) | Ocean | Pastel | Soft | (`Soft Pastel`) | Vintage | Violet | Carmine | (`Dark Moon`) | (`Dark Violet`) | (`Green Mist`) | (`Soft Blue`) | Material | Office = null,
    secondColor: String = null,
    secondFraction: Int | Double = null,
    size: Int | Double = null,
    spindleGapSize: Int | Double = null,
    spindleSize: Int | Double = null,
    text: AnonIndent = null,
    `type`: circle | rangeBar | rectangle | rectangleNeedle | rhombus | textCloud | triangleMarker | triangleNeedle | twoColorNeedle = null,
    verticalOrientation: bottom | top = null,
    width: Int | Double = null
  ): GaugeIndicator = {
    val __obj = js.Dynamic.literal()
    if (arrowLength != null) __obj.updateDynamic("arrowLength")(arrowLength.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (baseValue != null) __obj.updateDynamic("baseValue")(baseValue.asInstanceOf[js.Any])
    if (beginAdaptingAtRadius != null) __obj.updateDynamic("beginAdaptingAtRadius")(beginAdaptingAtRadius.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (horizontalOrientation != null) __obj.updateDynamic("horizontalOrientation")(horizontalOrientation.asInstanceOf[js.Any])
    if (indentFromCenter != null) __obj.updateDynamic("indentFromCenter")(indentFromCenter.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (palette != null) __obj.updateDynamic("palette")(palette.asInstanceOf[js.Any])
    if (secondColor != null) __obj.updateDynamic("secondColor")(secondColor.asInstanceOf[js.Any])
    if (secondFraction != null) __obj.updateDynamic("secondFraction")(secondFraction.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (spindleGapSize != null) __obj.updateDynamic("spindleGapSize")(spindleGapSize.asInstanceOf[js.Any])
    if (spindleSize != null) __obj.updateDynamic("spindleSize")(spindleSize.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (verticalOrientation != null) __obj.updateDynamic("verticalOrientation")(verticalOrientation.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[GaugeIndicator]
  }
}

