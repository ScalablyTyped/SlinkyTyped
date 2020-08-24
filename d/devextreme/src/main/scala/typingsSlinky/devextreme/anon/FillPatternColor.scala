package typingsSlinky.devextreme.anon

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
import typingsSlinky.devextreme.mod.DevExpress.excelExporter.ExcelDataGridCell
import typingsSlinky.devextreme.mod.DevExpress.exporter.ExcelFont
import typingsSlinky.devextreme.mod.DevExpress.ui.dxDataGrid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FillPatternColor extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.native
  var component: js.UndefOr[dxDataGrid] = js.native
  var fillPatternColor: js.UndefOr[String] = js.native
  var fillPatternType: js.UndefOr[
    darkDown | darkGray | darkGrid | darkHorizontal | darkTrellis | darkUp | darkVertical | gray0625 | gray125 | lightDown | lightGray | lightGrid | lightHorizontal | lightTrellis | lightUp | lightVertical | mediumGray | none | solid
  ] = js.native
  var font: js.UndefOr[ExcelFont] = js.native
  var gridCell: js.UndefOr[ExcelDataGridCell] = js.native
  var horizontalAlignment: js.UndefOr[
    center | centerContinuous | distributed | fill | general | justify | left | right
  ] = js.native
  var numberFormat: js.UndefOr[String] = js.native
  var value: js.UndefOr[String | Double | js.Date] = js.native
  var verticalAlignment: js.UndefOr[bottom | center | distributed | justify | top] = js.native
  var wrapTextEnabled: js.UndefOr[Boolean] = js.native
}

object FillPatternColor {
  @scala.inline
  def apply(): FillPatternColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FillPatternColor]
  }
  @scala.inline
  implicit class FillPatternColorOps[Self <: FillPatternColor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    @scala.inline
    def setComponent(value: dxDataGrid): Self = this.set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    @scala.inline
    def setFillPatternColor(value: String): Self = this.set("fillPatternColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFillPatternColor: Self = this.set("fillPatternColor", js.undefined)
    @scala.inline
    def setFillPatternType(
      value: darkDown | darkGray | darkGrid | darkHorizontal | darkTrellis | darkUp | darkVertical | gray0625 | gray125 | lightDown | lightGray | lightGrid | lightHorizontal | lightTrellis | lightUp | lightVertical | mediumGray | none | solid
    ): Self = this.set("fillPatternType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFillPatternType: Self = this.set("fillPatternType", js.undefined)
    @scala.inline
    def setFont(value: ExcelFont): Self = this.set("font", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    @scala.inline
    def setGridCell(value: ExcelDataGridCell): Self = this.set("gridCell", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridCell: Self = this.set("gridCell", js.undefined)
    @scala.inline
    def setHorizontalAlignment(value: center | centerContinuous | distributed | fill | general | justify | left | right): Self = this.set("horizontalAlignment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHorizontalAlignment: Self = this.set("horizontalAlignment", js.undefined)
    @scala.inline
    def setNumberFormat(value: String): Self = this.set("numberFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberFormat: Self = this.set("numberFormat", js.undefined)
    @scala.inline
    def setValueDate(value: js.Date): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String | Double | js.Date): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setVerticalAlignment(value: bottom | center | distributed | justify | top): Self = this.set("verticalAlignment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalAlignment: Self = this.set("verticalAlignment", js.undefined)
    @scala.inline
    def setWrapTextEnabled(value: Boolean): Self = this.set("wrapTextEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrapTextEnabled: Self = this.set("wrapTextEnabled", js.undefined)
  }
  
}

