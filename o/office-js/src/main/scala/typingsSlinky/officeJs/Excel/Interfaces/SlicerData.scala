package typingsSlinky.officeJs.Excel.Interfaces

import typingsSlinky.officeJs.Excel.SlicerSortType
import typingsSlinky.officeJs.officeJsStrings.Ascending
import typingsSlinky.officeJs.officeJsStrings.DataSourceOrder
import typingsSlinky.officeJs.officeJsStrings.Descending
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `slicer.toJSON()`. */
@js.native
trait SlicerData extends js.Object {
  /**
    *
    * Represents the caption of slicer.
    *
    * [Api set: ExcelApi 1.10]
    */
  var caption: js.UndefOr[String] = js.native
  /**
    *
    * Represents the height, in points, of the slicer.
    Throws an "The argument is invalid or missing or has an incorrect format." exception when set with negative value or zero as input.
    *
    * [Api set: ExcelApi 1.10]
    */
  var height: js.UndefOr[Double] = js.native
  /**
    *
    * Represents the unique id of slicer. Read-only.
    *
    * [Api set: ExcelApi 1.10]
    */
  var id: js.UndefOr[String] = js.native
  /**
    *
    * True if all filters currently applied on the slicer are cleared.
    *
    * [Api set: ExcelApi 1.10]
    */
  var isFilterCleared: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the distance, in points, from the left side of the slicer to the left of the worksheet.
    Throws an "The argument is invalid or missing or has an incorrect format." exception when set with negative value as input.
    *
    * [Api set: ExcelApi 1.10]
    */
  var left: js.UndefOr[Double] = js.native
  /**
    *
    * Represents the name of slicer.
    *
    * [Api set: ExcelApi 1.10]
    */
  var name: js.UndefOr[String] = js.native
  /**
    *
    * Represents the collection of SlicerItems that are part of the slicer. Read-only.
    *
    * [Api set: ExcelApi 1.10]
    */
  var slicerItems: js.UndefOr[js.Array[SlicerItemData]] = js.native
  /**
    *
    * Represents the sort order of the items in the slicer. Possible values are: "DataSourceOrder", "Ascending", "Descending".
    *
    * [Api set: ExcelApi 1.10]
    */
  var sortBy: js.UndefOr[SlicerSortType | DataSourceOrder | Ascending | Descending] = js.native
  /**
    *
    * Constant value that represents the Slicer style. Possible values are: "SlicerStyleLight1" through "SlicerStyleLight6", "TableStyleOther1" through "TableStyleOther2", "SlicerStyleDark1" through "SlicerStyleDark6". A custom user-defined style present in the workbook can also be specified.
    *
    * [Api set: ExcelApi 1.10]
    */
  var style: js.UndefOr[String] = js.native
  /**
    *
    * Represents the distance, in points, from the top edge of the slicer to the top of the worksheet.
    Throws an "The argument is invalid or missing or has an incorrect format." exception when set with negative value as input.
    *
    * [Api set: ExcelApi 1.10]
    */
  var top: js.UndefOr[Double] = js.native
  /**
    *
    * Represents the width, in points, of the slicer.
    Throws an "The argument is invalid or missing or has an incorrect format." exception when set with negative value or zero as input.
    *
    * [Api set: ExcelApi 1.10]
    */
  var width: js.UndefOr[Double] = js.native
  /**
    *
    * Represents the worksheet containing the slicer. Read-only.
    *
    * [Api set: ExcelApi 1.10]
    */
  var worksheet: js.UndefOr[WorksheetData] = js.native
}

object SlicerData {
  @scala.inline
  def apply(): SlicerData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlicerData]
  }
  @scala.inline
  implicit class SlicerDataOps[Self <: SlicerData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCaption(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caption")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withIsFilterCleared(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFilterCleared")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsFilterCleared: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFilterCleared")(js.undefined)
        ret
    }
    @scala.inline
    def withLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withSlicerItems(value: js.Array[SlicerItemData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slicerItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlicerItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slicerItems")(js.undefined)
        ret
    }
    @scala.inline
    def withSortBy(value: SlicerSortType | DataSourceOrder | Ascending | Descending): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortBy")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
    @scala.inline
    def withWorksheet(value: WorksheetData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("worksheet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorksheet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("worksheet")(js.undefined)
        ret
    }
  }
  
}

