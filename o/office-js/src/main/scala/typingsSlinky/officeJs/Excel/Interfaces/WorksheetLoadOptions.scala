package typingsSlinky.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * An Excel worksheet is a grid of cells. It can contain data, tables, charts, etc.
  To learn more about the worksheet object model, read {@link https://docs.microsoft.com/office/dev/add-ins/excel/excel-add-ins-worksheets | Work with worksheets using the Excel JavaScript API}.
  *
  * [Api set: ExcelApi 1.1]
  */
@js.native
trait WorksheetLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the AutoFilter object of the worksheet.
    *
    * [Api set: ExcelApi 1.9]
    */
  var autoFilter: js.UndefOr[AutoFilterLoadOptions] = js.native
  /**
    *
    * Returns a collection of charts that are part of the worksheet.
    *
    * [Api set: ExcelApi 1.1]
    */
  var charts: js.UndefOr[ChartCollectionLoadOptions] = js.native
  /**
    *
    * Gets or sets the enableCalculation property of the worksheet.
    True if Excel recalculates the worksheet when necessary. False if Excel doesn't recalculate the sheet.
    *
    * [Api set: ExcelApi 1.9]
    */
  var enableCalculation: js.UndefOr[Boolean] = js.native
  /**
    *
    * Returns a value that uniquely identifies the worksheet in a given workbook. The value of the identifier remains the same even when the worksheet is renamed or moved. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var id: js.UndefOr[Boolean] = js.native
  /**
    *
    * The display name of the worksheet.
    *
    * [Api set: ExcelApi 1.1]
    */
  var name: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets the PageLayout object of the worksheet.
    *
    * [Api set: ExcelApi 1.9]
    */
  var pageLayout: js.UndefOr[PageLayoutLoadOptions] = js.native
  /**
    *
    * The zero-based position of the worksheet within the workbook.
    *
    * [Api set: ExcelApi 1.1]
    */
  var position: js.UndefOr[Boolean] = js.native
  /**
    *
    * Returns sheet protection object for a worksheet.
    *
    * [Api set: ExcelApi 1.2]
    */
  var protection: js.UndefOr[WorksheetProtectionLoadOptions] = js.native
  /**
    *
    * Gets or sets the worksheet's gridlines flag.
    This flag determines whether gridlines are visible to the user.
    *
    * [Api set: ExcelApi 1.8]
    */
  var showGridlines: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets or sets the worksheet's headings flag.
    This flag determines whether headings are visible to the user.
    *
    * [Api set: ExcelApi 1.8]
    */
  var showHeadings: js.UndefOr[Boolean] = js.native
  /**
    *
    * Returns the standard (default) height of all the rows in the worksheet, in points. Read-only.
    *
    * [Api set: ExcelApi 1.7]
    */
  var standardHeight: js.UndefOr[Boolean] = js.native
  /**
    *
    * Returns or sets the standard (default) width of all the columns in the worksheet.
    One unit of column width is equal to the width of one character in the Normal style. For proportional fonts, the width of the character 0 (zero) is used.
    *
    * [Api set: ExcelApi 1.7]
    */
  var standardWidth: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets or sets the worksheet tab color.
    When retrieving the tab color, if the worksheet is invisible, the value will be null. If the worksheet is visible but the tab color is set to auto, an empty string will be returned. Otherwise, the property will be set to a color, in the form "#123456"
    When setting the color, use an empty-string to set an "auto" color, or a real color otherwise.
    *
    * [Api set: ExcelApi 1.7]
    */
  var tabColor: js.UndefOr[Boolean] = js.native
  /**
    *
    * Collection of tables that are part of the worksheet.
    *
    * [Api set: ExcelApi 1.1]
    */
  var tables: js.UndefOr[TableCollectionLoadOptions] = js.native
  /**
    *
    * The Visibility of the worksheet.
    *
    * [Api set: ExcelApi 1.1 for reading visibility; 1.2 for setting it.]
    */
  var visibility: js.UndefOr[Boolean] = js.native
}

object WorksheetLoadOptions {
  @scala.inline
  def apply(): WorksheetLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorksheetLoadOptions]
  }
  @scala.inline
  implicit class WorksheetLoadOptionsOps[Self <: WorksheetLoadOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$all(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$all")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$all: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$all")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoFilter(value: AutoFilterLoadOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withCharts(value: ChartCollectionLoadOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCharts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charts")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableCalculation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCalculation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableCalculation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCalculation")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: Boolean): Self = {
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
    def withName(value: Boolean): Self = {
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
    def withPageLayout(value: PageLayoutLoadOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageLayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withProtection(value: WorksheetProtectionLoadOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protection")(js.undefined)
        ret
    }
    @scala.inline
    def withShowGridlines(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showGridlines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowGridlines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showGridlines")(js.undefined)
        ret
    }
    @scala.inline
    def withShowHeadings(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHeadings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowHeadings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHeadings")(js.undefined)
        ret
    }
    @scala.inline
    def withStandardHeight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standardHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStandardHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standardHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withStandardWidth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standardWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStandardWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standardWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withTabColor(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabColor")(js.undefined)
        ret
    }
    @scala.inline
    def withTables(value: TableCollectionLoadOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTables: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tables")(js.undefined)
        ret
    }
    @scala.inline
    def withVisibility(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibility")(js.undefined)
        ret
    }
  }
  
}

