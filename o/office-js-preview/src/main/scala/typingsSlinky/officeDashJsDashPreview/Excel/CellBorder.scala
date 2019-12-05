package typingsSlinky.officeDashJsDashPreview.Excel

import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Continuous
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Dash
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.DashDot
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.DashDotDot
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Dot
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Double
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Hairline
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Medium
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.None
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.SlantDashDot
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Thick
import typingsSlinky.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Thin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the properties of a single border returned by `getCellProperties`, `getRowProperties`, and `getColumnProperties` or the border property input parameter of `setCellProperties`, `setRowProperties`, and `setColumnProperties`.
  *
  * [Api set: ExcelApi 1.9]
  */
trait CellBorder extends js.Object {
  /**
    *
    * Represents the `color` property of a single border.
    *
    * [Api set: ExcelApi 1.9]
    */
  var color: js.UndefOr[String] = js.undefined
  /**
    *
    * Represents the `style` property of a single border.
    *
    * [Api set: ExcelApi 1.9]
    */
  var style: js.UndefOr[
    BorderLineStyle | None | Continuous | Dash | DashDot | DashDotDot | Dot | Double | SlantDashDot
  ] = js.undefined
  /**
    *
    * Represents the `tintAndShade` property of a single border.
    *
    * [Api set: ExcelApi 1.9]
    */
  var tintAndShade: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Represents the `weight` property of a single border.
    *
    * [Api set: ExcelApi 1.9]
    */
  var weight: js.UndefOr[BorderWeight | Hairline | Thin | Medium | Thick] = js.undefined
}

object CellBorder {
  @scala.inline
  def apply(
    color: String = null,
    style: BorderLineStyle | None | Continuous | Dash | DashDot | DashDotDot | Dot | Double | SlantDashDot = null,
    tintAndShade: Int | scala.Double = null,
    weight: BorderWeight | Hairline | Thin | Medium | Thick = null
  ): CellBorder = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tintAndShade != null) __obj.updateDynamic("tintAndShade")(tintAndShade.asInstanceOf[js.Any])
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellBorder]
  }
}

