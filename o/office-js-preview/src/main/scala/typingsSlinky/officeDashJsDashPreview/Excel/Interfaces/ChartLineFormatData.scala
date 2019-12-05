package typingsSlinky.officeDashJsDashPreview.Excel.Interfaces

import typingsSlinky.officeDashJsDashPreview.Excel.ChartLineStyle
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Automatic
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Continuous
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Dash
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.DashDot
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.DashDotDot
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Dot
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Grey25
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Grey50
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Grey75
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.None
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.RoundDot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `chartLineFormat.toJSON()`. */
trait ChartLineFormatData extends js.Object {
  /**
    *
    * HTML color code representing the color of lines in the chart.
    *
    * [Api set: ExcelApi 1.1]
    */
  var color: js.UndefOr[String] = js.undefined
  /**
    *
    * Represents the line style. See Excel.ChartLineStyle for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var lineStyle: js.UndefOr[
    ChartLineStyle | None | Continuous | Dash | DashDot | DashDotDot | Dot | Grey25 | Grey50 | Grey75 | Automatic | RoundDot
  ] = js.undefined
  /**
    *
    * Represents weight of the line, in points.
    *
    * [Api set: ExcelApi 1.7]
    */
  var weight: js.UndefOr[Double] = js.undefined
}

object ChartLineFormatData {
  @scala.inline
  def apply(
    color: String = null,
    lineStyle: ChartLineStyle | None | Continuous | Dash | DashDot | DashDotDot | Dot | Grey25 | Grey50 | Grey75 | Automatic | RoundDot = null,
    weight: Int | Double = null
  ): ChartLineFormatData = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (lineStyle != null) __obj.updateDynamic("lineStyle")(lineStyle.asInstanceOf[js.Any])
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartLineFormatData]
  }
}

