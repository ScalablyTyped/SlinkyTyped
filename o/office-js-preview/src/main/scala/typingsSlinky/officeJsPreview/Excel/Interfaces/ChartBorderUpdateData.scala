package typingsSlinky.officeJsPreview.Excel.Interfaces

import typingsSlinky.officeJsPreview.Excel.ChartLineStyle
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Automatic
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Continuous
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Dash
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.DashDot
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.DashDotDot
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Dot
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Grey25
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Grey50
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Grey75
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.None
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.RoundDot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the ChartBorder object, for use in `chartBorder.set({ ... })`. */
trait ChartBorderUpdateData extends js.Object {
  /**
    *
    * HTML color code representing the color of borders in the chart.
    *
    * [Api set: ExcelApi 1.7]
    */
  var color: js.UndefOr[String] = js.undefined
  /**
    *
    * Represents the line style of the border. See Excel.ChartLineStyle for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var lineStyle: js.UndefOr[
    ChartLineStyle | None | Continuous | Dash | DashDot | DashDotDot | Dot | Grey25 | Grey50 | Grey75 | Automatic | RoundDot
  ] = js.undefined
  /**
    *
    * Represents weight of the border, in points.
    *
    * [Api set: ExcelApi 1.7]
    */
  var weight: js.UndefOr[Double] = js.undefined
}

object ChartBorderUpdateData {
  @scala.inline
  def apply(
    color: String = null,
    lineStyle: ChartLineStyle | None | Continuous | Dash | DashDot | DashDotDot | Dot | Grey25 | Grey50 | Grey75 | Automatic | RoundDot = null,
    weight: Int | Double = null
  ): ChartBorderUpdateData = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (lineStyle != null) __obj.updateDynamic("lineStyle")(lineStyle.asInstanceOf[js.Any])
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartBorderUpdateData]
  }
}

