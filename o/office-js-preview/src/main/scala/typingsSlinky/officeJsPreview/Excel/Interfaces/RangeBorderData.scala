package typingsSlinky.officeJsPreview.Excel.Interfaces

import typingsSlinky.officeJsPreview.Excel.BorderIndex
import typingsSlinky.officeJsPreview.Excel.BorderLineStyle
import typingsSlinky.officeJsPreview.Excel.BorderWeight
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Continuous
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Dash
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.DashDot
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.DashDotDot
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.DiagonalDown
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.DiagonalUp
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Dot
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Double
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.EdgeBottom
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.EdgeLeft
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.EdgeRight
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.EdgeTop
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Hairline
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.InsideHorizontal
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.InsideVertical
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Medium
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.None
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.SlantDashDot
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Thick
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Thin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `rangeBorder.toJSON()`. */
trait RangeBorderData extends js.Object {
  /**
    *
    * HTML color code representing the color of the border line, of the form #RRGGBB (e.g. "FFA500") or as a named HTML color (e.g. "orange").
    *
    * [Api set: ExcelApi 1.1]
    */
  var color: js.UndefOr[String] = js.undefined
  /**
    *
    * Constant value that indicates the specific side of the border. See Excel.BorderIndex for details. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var sideIndex: js.UndefOr[
    BorderIndex | EdgeTop | EdgeBottom | EdgeLeft | EdgeRight | InsideVertical | InsideHorizontal | DiagonalDown | DiagonalUp
  ] = js.undefined
  /**
    *
    * One of the constants of line style specifying the line style for the border. See Excel.BorderLineStyle for details.
    *
    * [Api set: ExcelApi 1.1]
    */
  var style: js.UndefOr[
    BorderLineStyle | None | Continuous | Dash | DashDot | DashDotDot | Dot | Double | SlantDashDot
  ] = js.undefined
  /**
    *
    * Returns or sets a double that lightens or darkens a color for Range Border, the value is between -1 (darkest) and 1 (brightest), with 0 for the original color.
    A null value indicates that the border doesn't have uniform tintAndShade setting.
    *
    * [Api set: ExcelApi 1.9]
    */
  var tintAndShade: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Specifies the weight of the border around a range. See Excel.BorderWeight for details.
    *
    * [Api set: ExcelApi 1.1]
    */
  var weight: js.UndefOr[BorderWeight | Hairline | Thin | Medium | Thick] = js.undefined
}

object RangeBorderData {
  @scala.inline
  def apply(
    color: String = null,
    sideIndex: BorderIndex | EdgeTop | EdgeBottom | EdgeLeft | EdgeRight | InsideVertical | InsideHorizontal | DiagonalDown | DiagonalUp = null,
    style: BorderLineStyle | None | Continuous | Dash | DashDot | DashDotDot | Dot | Double | SlantDashDot = null,
    tintAndShade: Int | scala.Double = null,
    weight: BorderWeight | Hairline | Thin | Medium | Thick = null
  ): RangeBorderData = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (sideIndex != null) __obj.updateDynamic("sideIndex")(sideIndex.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tintAndShade != null) __obj.updateDynamic("tintAndShade")(tintAndShade.asInstanceOf[js.Any])
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeBorderData]
  }
}

