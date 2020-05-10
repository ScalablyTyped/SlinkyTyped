package typingsSlinky.officeJs.Excel.Interfaces

import typingsSlinky.officeJs.Excel.SheetVisibility
import typingsSlinky.officeJs.officeJsStrings.Hidden
import typingsSlinky.officeJs.officeJsStrings.VeryHidden
import typingsSlinky.officeJs.officeJsStrings.Visible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the Worksheet object, for use in `worksheet.set({ ... })`. */
@js.native
trait WorksheetUpdateData extends js.Object {
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
    * The display name of the worksheet.
    *
    * [Api set: ExcelApi 1.1]
    */
  var name: js.UndefOr[String] = js.native
  /**
    *
    * Gets the PageLayout object of the worksheet.
    *
    * [Api set: ExcelApi 1.9]
    */
  var pageLayout: js.UndefOr[PageLayoutUpdateData] = js.native
  /**
    *
    * The zero-based position of the worksheet within the workbook.
    *
    * [Api set: ExcelApi 1.1]
    */
  var position: js.UndefOr[Double] = js.native
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
    * The Visibility of the worksheet.
    *
    * [Api set: ExcelApi 1.1 for reading visibility; 1.2 for setting it.]
    */
  var visibility: js.UndefOr[SheetVisibility | Visible | Hidden | VeryHidden] = js.native
}

object WorksheetUpdateData {
  @scala.inline
  def apply(): WorksheetUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorksheetUpdateData]
  }
  @scala.inline
  implicit class WorksheetUpdateDataOps[Self <: WorksheetUpdateData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withPageLayout(value: PageLayoutUpdateData): Self = {
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

