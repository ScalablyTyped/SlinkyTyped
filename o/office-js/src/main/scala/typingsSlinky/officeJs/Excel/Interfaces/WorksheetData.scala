package typingsSlinky.officeJs.Excel.Interfaces

import typingsSlinky.officeJs.Excel.SheetVisibility
import typingsSlinky.officeJs.officeJsStrings.Hidden
import typingsSlinky.officeJs.officeJsStrings.VeryHidden
import typingsSlinky.officeJs.officeJsStrings.Visible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `worksheet.toJSON()`. */
@js.native
trait WorksheetData extends js.Object {
  /**
    *
    * Represents the AutoFilter object of the worksheet. Read-Only.
    *
    * [Api set: ExcelApi 1.9]
    */
  var autoFilter: js.UndefOr[AutoFilterData] = js.native
  /**
    *
    * Returns a collection of charts that are part of the worksheet. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var charts: js.UndefOr[js.Array[ChartData]] = js.native
  /**
    *
    * Returns a collection of all the Comments objects on the worksheet. Read-only.
    *
    * [Api set: ExcelApi 1.10]
    */
  var comments: js.UndefOr[js.Array[CommentData]] = js.native
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
    * Gets the horizontal page break collection for the worksheet. This collection only contains manual page breaks.
    *
    * [Api set: ExcelApi 1.9]
    */
  var horizontalPageBreaks: js.UndefOr[js.Array[PageBreakData]] = js.native
  /**
    *
    * Returns a value that uniquely identifies the worksheet in a given workbook. The value of the identifier remains the same even when the worksheet is renamed or moved. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var id: js.UndefOr[String] = js.native
  /**
    *
    * The display name of the worksheet.
    *
    * [Api set: ExcelApi 1.1]
    */
  var name: js.UndefOr[String] = js.native
  /**
    *
    * Collection of names scoped to the current worksheet. Read-only.
    *
    * [Api set: ExcelApi 1.4]
    */
  var names: js.UndefOr[js.Array[NamedItemData]] = js.native
  /**
    *
    * Gets the PageLayout object of the worksheet.
    *
    * [Api set: ExcelApi 1.9]
    */
  var pageLayout: js.UndefOr[PageLayoutData] = js.native
  /**
    *
    * Collection of PivotTables that are part of the worksheet. Read-only.
    *
    * [Api set: ExcelApi 1.3]
    */
  var pivotTables: js.UndefOr[js.Array[PivotTableData]] = js.native
  /**
    *
    * The zero-based position of the worksheet within the workbook.
    *
    * [Api set: ExcelApi 1.1]
    */
  var position: js.UndefOr[Double] = js.native
  /**
    *
    * Returns sheet protection object for a worksheet. Read-only.
    *
    * [Api set: ExcelApi 1.2]
    */
  var protection: js.UndefOr[WorksheetProtectionData] = js.native
  /**
    *
    * Returns the collection of all the Shape objects on the worksheet. Read-only.
    *
    * [Api set: ExcelApi 1.9]
    */
  var shapes: js.UndefOr[js.Array[ShapeData]] = js.native
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
    * Returns a collection of slicers that are part of the worksheet. Read-only.
    *
    * [Api set: ExcelApi 1.10]
    */
  var slicers: js.UndefOr[js.Array[SlicerData]] = js.native
  /**
    *
    * Returns the standard (default) height of all the rows in the worksheet, in points. Read-only.
    *
    * [Api set: ExcelApi 1.7]
    */
  var standardHeight: js.UndefOr[Double] = js.native
  /**
    *
    * Returns or sets the standard (default) width of all the columns in the worksheet.
    One unit of column width is equal to the width of one character in the Normal style. For proportional fonts, the width of the character 0 (zero) is used.
    *
    * [Api set: ExcelApi 1.7]
    */
  var standardWidth: js.UndefOr[Double] = js.native
  /**
    *
    * Gets or sets the worksheet tab color.
    When retrieving the tab color, if the worksheet is invisible, the value will be null. If the worksheet is visible but the tab color is set to auto, an empty string will be returned. Otherwise, the property will be set to a color, in the form "#123456"
    When setting the color, use an empty-string to set an "auto" color, or a real color otherwise.
    *
    * [Api set: ExcelApi 1.7]
    */
  var tabColor: js.UndefOr[String] = js.native
  /**
    *
    * Collection of tables that are part of the worksheet. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var tables: js.UndefOr[js.Array[TableData]] = js.native
  /**
    *
    * Gets the vertical page break collection for the worksheet. This collection only contains manual page breaks.
    *
    * [Api set: ExcelApi 1.9]
    */
  var verticalPageBreaks: js.UndefOr[js.Array[PageBreakData]] = js.native
  /**
    *
    * The Visibility of the worksheet.
    *
    * [Api set: ExcelApi 1.1 for reading visibility; 1.2 for setting it.]
    */
  var visibility: js.UndefOr[SheetVisibility | Visible | Hidden | VeryHidden] = js.native
}

object WorksheetData {
  @scala.inline
  def apply(): WorksheetData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorksheetData]
  }
  @scala.inline
  implicit class WorksheetDataOps[Self <: WorksheetData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoFilter(value: AutoFilterData): Self = {
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
    def withCharts(value: js.Array[ChartData]): Self = {
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
    def withComments(value: js.Array[CommentData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments")(js.undefined)
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
    def withHorizontalPageBreaks(value: js.Array[PageBreakData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalPageBreaks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontalPageBreaks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalPageBreaks")(js.undefined)
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
    def withNames(value: js.Array[NamedItemData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("names")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("names")(js.undefined)
        ret
    }
    @scala.inline
    def withPageLayout(value: PageLayoutData): Self = {
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
    def withPivotTables(value: js.Array[PivotTableData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pivotTables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPivotTables: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pivotTables")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: Double): Self = {
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
    def withProtection(value: WorksheetProtectionData): Self = {
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
    def withShapes(value: js.Array[ShapeData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShapes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapes")(js.undefined)
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
    def withSlicers(value: js.Array[SlicerData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slicers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlicers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slicers")(js.undefined)
        ret
    }
    @scala.inline
    def withStandardHeight(value: Double): Self = {
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
    def withStandardWidth(value: Double): Self = {
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
    def withTabColor(value: String): Self = {
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
    def withTables(value: js.Array[TableData]): Self = {
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
    def withVerticalPageBreaks(value: js.Array[PageBreakData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalPageBreaks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalPageBreaks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalPageBreaks")(js.undefined)
        ret
    }
    @scala.inline
    def withVisibility(value: SheetVisibility | Visible | Hidden | VeryHidden): Self = {
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

