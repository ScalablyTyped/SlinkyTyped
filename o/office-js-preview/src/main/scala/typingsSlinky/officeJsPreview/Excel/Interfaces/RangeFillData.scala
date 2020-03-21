package typingsSlinky.officeJsPreview.Excel.Interfaces

import typingsSlinky.officeJsPreview.Excel.FillPattern
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

/** An interface describing the data returned by calling `rangeFill.toJSON()`. */
trait RangeFillData extends js.Object {
  /**
    *
    * HTML color code representing the color of the background, of the form #RRGGBB (e.g. "FFA500") or as a named HTML color (e.g. "orange")
    *
    * [Api set: ExcelApi 1.1]
    */
  var color: js.UndefOr[String] = js.undefined
  /**
    *
    * Gets or sets the pattern of a Range. See Excel.FillPattern for details. LinearGradient and RectangularGradient are not supported.
    A null value indicates that the entire range doesn't have uniform pattern setting.
    *
    * [Api set: ExcelApi 1.9]
    */
  var pattern: js.UndefOr[
    FillPattern | None | Solid | Gray50 | Gray75 | Gray25 | Horizontal | Vertical | Down | Up | Checker | SemiGray75 | LightHorizontal | LightVertical | LightDown | LightUp | Grid | CrissCross | Gray16 | Gray8 | LinearGradient | RectangularGradient
  ] = js.undefined
  /**
    *
    * Sets HTML color code representing the color of the Range pattern, of the form #RRGGBB (e.g. "FFA500") or as a named HTML color (e.g. "orange").
    Gets HTML color code representing the color of the Range pattern, of the form #RRGGBB (e.g. "FFA500").
    *
    * [Api set: ExcelApi 1.9]
    */
  var patternColor: js.UndefOr[String] = js.undefined
  /**
    *
    * Returns or sets a double that lightens or darkens a pattern color for Range Fill, the value is between -1 (darkest) and 1 (brightest), with 0 for the original color.
    If the pattern tintAndShades are not uniform, null will be returned.
    *
    * [Api set: ExcelApi 1.9]
    */
  var patternTintAndShade: js.UndefOr[Double] = js.undefined
  /**
    *
    * Returns or sets a double that lightens or darkens a color for Range Fill, the value is between -1 (darkest) and 1 (brightest), with 0 for the original color.
    If the tintAndShades are not uniform, null will be returned.
    *
    * [Api set: ExcelApi 1.9]
    */
  var tintAndShade: js.UndefOr[Double] = js.undefined
}

object RangeFillData {
  @scala.inline
  def apply(
    color: String = null,
    pattern: FillPattern | None | Solid | Gray50 | Gray75 | Gray25 | Horizontal | Vertical | Down | Up | Checker | SemiGray75 | LightHorizontal | LightVertical | LightDown | LightUp | Grid | CrissCross | Gray16 | Gray8 | LinearGradient | RectangularGradient = null,
    patternColor: String = null,
    patternTintAndShade: Int | Double = null,
    tintAndShade: Int | Double = null
  ): RangeFillData = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    if (patternColor != null) __obj.updateDynamic("patternColor")(patternColor.asInstanceOf[js.Any])
    if (patternTintAndShade != null) __obj.updateDynamic("patternTintAndShade")(patternTintAndShade.asInstanceOf[js.Any])
    if (tintAndShade != null) __obj.updateDynamic("tintAndShade")(tintAndShade.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeFillData]
  }
}

