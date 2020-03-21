package typingsSlinky.devextreme

import typingsSlinky.devextreme.devextremeStrings.bottom
import typingsSlinky.devextreme.devextremeStrings.center
import typingsSlinky.devextreme.devextremeStrings.centerContinuous
import typingsSlinky.devextreme.devextremeStrings.darkDown
import typingsSlinky.devextreme.devextremeStrings.darkGray
import typingsSlinky.devextreme.devextremeStrings.darkGrid
import typingsSlinky.devextreme.devextremeStrings.darkHorizontal
import typingsSlinky.devextreme.devextremeStrings.darkTrellis
import typingsSlinky.devextreme.devextremeStrings.darkUp
import typingsSlinky.devextreme.devextremeStrings.darkVertical
import typingsSlinky.devextreme.devextremeStrings.distributed
import typingsSlinky.devextreme.devextremeStrings.fill
import typingsSlinky.devextreme.devextremeStrings.general
import typingsSlinky.devextreme.devextremeStrings.gray0625
import typingsSlinky.devextreme.devextremeStrings.gray125
import typingsSlinky.devextreme.devextremeStrings.justify
import typingsSlinky.devextreme.devextremeStrings.left
import typingsSlinky.devextreme.devextremeStrings.lightDown
import typingsSlinky.devextreme.devextremeStrings.lightGray
import typingsSlinky.devextreme.devextremeStrings.lightGrid
import typingsSlinky.devextreme.devextremeStrings.lightHorizontal
import typingsSlinky.devextreme.devextremeStrings.lightTrellis
import typingsSlinky.devextreme.devextremeStrings.lightUp
import typingsSlinky.devextreme.devextremeStrings.lightVertical
import typingsSlinky.devextreme.devextremeStrings.mediumGray
import typingsSlinky.devextreme.devextremeStrings.none
import typingsSlinky.devextreme.devextremeStrings.right
import typingsSlinky.devextreme.devextremeStrings.solid
import typingsSlinky.devextreme.devextremeStrings.top
import typingsSlinky.devextreme.mod.DevExpress.exporter.ExcelDataGridCell
import typingsSlinky.devextreme.mod.DevExpress.exporter.ExcelFont
import typingsSlinky.devextreme.mod.DevExpress.ui.dxDataGrid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFillPatternColor extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.undefined
  var component: js.UndefOr[dxDataGrid] = js.undefined
  var fillPatternColor: js.UndefOr[String] = js.undefined
  var fillPatternType: js.UndefOr[
    darkDown | darkGray | darkGrid | darkHorizontal | darkTrellis | darkUp | darkVertical | gray0625 | gray125 | lightDown | lightGray | lightGrid | lightHorizontal | lightTrellis | lightUp | lightVertical | mediumGray | none | solid
  ] = js.undefined
  var font: js.UndefOr[ExcelFont] = js.undefined
  var gridCell: js.UndefOr[ExcelDataGridCell] = js.undefined
  var horizontalAlignment: js.UndefOr[
    center | centerContinuous | distributed | fill | general | justify | left | right
  ] = js.undefined
  var numberFormat: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String | Double | js.Date] = js.undefined
  var verticalAlignment: js.UndefOr[bottom | center | distributed | justify | top] = js.undefined
  var wrapTextEnabled: js.UndefOr[Boolean] = js.undefined
}

object AnonFillPatternColor {
  @scala.inline
  def apply(
    backgroundColor: String = null,
    component: dxDataGrid = null,
    fillPatternColor: String = null,
    fillPatternType: darkDown | darkGray | darkGrid | darkHorizontal | darkTrellis | darkUp | darkVertical | gray0625 | gray125 | lightDown | lightGray | lightGrid | lightHorizontal | lightTrellis | lightUp | lightVertical | mediumGray | none | solid = null,
    font: ExcelFont = null,
    gridCell: ExcelDataGridCell = null,
    horizontalAlignment: center | centerContinuous | distributed | fill | general | justify | left | right = null,
    numberFormat: String = null,
    value: String | Double | js.Date = null,
    verticalAlignment: bottom | center | distributed | justify | top = null,
    wrapTextEnabled: js.UndefOr[Boolean] = js.undefined
  ): AnonFillPatternColor = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (fillPatternColor != null) __obj.updateDynamic("fillPatternColor")(fillPatternColor.asInstanceOf[js.Any])
    if (fillPatternType != null) __obj.updateDynamic("fillPatternType")(fillPatternType.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (gridCell != null) __obj.updateDynamic("gridCell")(gridCell.asInstanceOf[js.Any])
    if (horizontalAlignment != null) __obj.updateDynamic("horizontalAlignment")(horizontalAlignment.asInstanceOf[js.Any])
    if (numberFormat != null) __obj.updateDynamic("numberFormat")(numberFormat.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (verticalAlignment != null) __obj.updateDynamic("verticalAlignment")(verticalAlignment.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapTextEnabled)) __obj.updateDynamic("wrapTextEnabled")(wrapTextEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFillPatternColor]
  }
}

