package typingsSlinky.officeJsPreview.Excel

import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Checker
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.CrissCross
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Down
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Gray16
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Gray25
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Gray50
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Gray75
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Gray8
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Grid
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Horizontal
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.LightDown
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.LightHorizontal
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.LightUp
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.LightVertical
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.LinearGradient
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.None
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.RectangularGradient
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.SemiGray75
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Solid
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Up
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the `format.fill` properties of `getCellProperties`, `getRowProperties`, and `getColumnProperties` or the `format.fill` input parameter of `setCellProperties`, `setRowProperties`, and `setColumnProperties`.
  *
  * [Api set: ExcelApi 1.9]
  */
trait CellPropertiesFill extends js.Object {
  /**
    *
    * Represents the `format.fill.color` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var color: js.UndefOr[String] = js.undefined
  /**
    *
    * Represents the `format.fill.pattern` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var pattern: js.UndefOr[
    FillPattern | None | Solid | Gray50 | Gray75 | Gray25 | Horizontal | Vertical | Down | Up | Checker | SemiGray75 | LightHorizontal | LightVertical | LightDown | LightUp | Grid | CrissCross | Gray16 | Gray8 | LinearGradient | RectangularGradient
  ] = js.undefined
  /**
    *
    * Represents the `format.fill.patternColor` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var patternColor: js.UndefOr[String] = js.undefined
  /**
    *
    * Represents the `format.fill.patternTintAndShade` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var patternTintAndShade: js.UndefOr[Double] = js.undefined
  /**
    *
    * Represents the `format.fill.tintAndShade` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var tintAndShade: js.UndefOr[Double] = js.undefined
}

object CellPropertiesFill {
  @scala.inline
  def apply(
    color: String = null,
    pattern: FillPattern | None | Solid | Gray50 | Gray75 | Gray25 | Horizontal | Vertical | Down | Up | Checker | SemiGray75 | LightHorizontal | LightVertical | LightDown | LightUp | Grid | CrissCross | Gray16 | Gray8 | LinearGradient | RectangularGradient = null,
    patternColor: String = null,
    patternTintAndShade: js.UndefOr[Double] = js.undefined,
    tintAndShade: js.UndefOr[Double] = js.undefined
  ): CellPropertiesFill = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    if (patternColor != null) __obj.updateDynamic("patternColor")(patternColor.asInstanceOf[js.Any])
    if (!js.isUndefined(patternTintAndShade)) __obj.updateDynamic("patternTintAndShade")(patternTintAndShade.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tintAndShade)) __obj.updateDynamic("tintAndShade")(tintAndShade.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellPropertiesFill]
  }
}

