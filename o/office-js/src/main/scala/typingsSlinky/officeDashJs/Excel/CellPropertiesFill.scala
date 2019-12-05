package typingsSlinky.officeDashJs.Excel

import typingsSlinky.officeDashJs.officeDashJsStrings.Checker
import typingsSlinky.officeDashJs.officeDashJsStrings.CrissCross
import typingsSlinky.officeDashJs.officeDashJsStrings.Down
import typingsSlinky.officeDashJs.officeDashJsStrings.Gray16
import typingsSlinky.officeDashJs.officeDashJsStrings.Gray25
import typingsSlinky.officeDashJs.officeDashJsStrings.Gray50
import typingsSlinky.officeDashJs.officeDashJsStrings.Gray75
import typingsSlinky.officeDashJs.officeDashJsStrings.Gray8
import typingsSlinky.officeDashJs.officeDashJsStrings.Grid
import typingsSlinky.officeDashJs.officeDashJsStrings.Horizontal
import typingsSlinky.officeDashJs.officeDashJsStrings.LightDown
import typingsSlinky.officeDashJs.officeDashJsStrings.LightHorizontal
import typingsSlinky.officeDashJs.officeDashJsStrings.LightUp
import typingsSlinky.officeDashJs.officeDashJsStrings.LightVertical
import typingsSlinky.officeDashJs.officeDashJsStrings.LinearGradient
import typingsSlinky.officeDashJs.officeDashJsStrings.None
import typingsSlinky.officeDashJs.officeDashJsStrings.RectangularGradient
import typingsSlinky.officeDashJs.officeDashJsStrings.SemiGray75
import typingsSlinky.officeDashJs.officeDashJsStrings.Solid
import typingsSlinky.officeDashJs.officeDashJsStrings.Up
import typingsSlinky.officeDashJs.officeDashJsStrings.Vertical
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
    patternTintAndShade: Int | Double = null,
    tintAndShade: Int | Double = null
  ): CellPropertiesFill = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    if (patternColor != null) __obj.updateDynamic("patternColor")(patternColor.asInstanceOf[js.Any])
    if (patternTintAndShade != null) __obj.updateDynamic("patternTintAndShade")(patternTintAndShade.asInstanceOf[js.Any])
    if (tintAndShade != null) __obj.updateDynamic("tintAndShade")(tintAndShade.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellPropertiesFill]
  }
}

