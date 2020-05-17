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
import typingsSlinky.devextreme.mod.DevExpress.exporter.ExcelDataGridCell
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
    def withBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withComponent(value: dxDataGrid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(js.undefined)
        ret
    }
    @scala.inline
    def withFillPatternColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillPatternColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFillPatternColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillPatternColor")(js.undefined)
        ret
    }
    @scala.inline
    def withFillPatternType(
      value: darkDown | darkGray | darkGrid | darkHorizontal | darkTrellis | darkUp | darkVertical | gray0625 | gray125 | lightDown | lightGray | lightGrid | lightHorizontal | lightTrellis | lightUp | lightVertical | mediumGray | none | solid
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillPatternType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFillPatternType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillPatternType")(js.undefined)
        ret
    }
    @scala.inline
    def withFont(value: ExcelFont): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFont: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(js.undefined)
        ret
    }
    @scala.inline
    def withGridCell(value: ExcelDataGridCell): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridCell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridCell: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridCell")(js.undefined)
        ret
    }
    @scala.inline
    def withHorizontalAlignment(value: center | centerContinuous | distributed | fill | general | justify | left | right): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalAlignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontalAlignment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalAlignment")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withValueDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String | Double | js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticalAlignment(value: bottom | center | distributed | justify | top): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalAlignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalAlignment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalAlignment")(js.undefined)
        ret
    }
    @scala.inline
    def withWrapTextEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapTextEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrapTextEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapTextEnabled")(js.undefined)
        ret
    }
  }
  
}

