package typingsSlinky.exceljs.mod

import typingsSlinky.exceljs.exceljsStrings.NA
import typingsSlinky.exceljs.exceljsStrings.None
import typingsSlinky.exceljs.exceljsStrings.asDisplayed
import typingsSlinky.exceljs.exceljsStrings.atEnd
import typingsSlinky.exceljs.exceljsStrings.blank
import typingsSlinky.exceljs.exceljsStrings.dash
import typingsSlinky.exceljs.exceljsStrings.displayed
import typingsSlinky.exceljs.exceljsStrings.downThenOver
import typingsSlinky.exceljs.exceljsStrings.landscape
import typingsSlinky.exceljs.exceljsStrings.overThenDown
import typingsSlinky.exceljs.exceljsStrings.portrait
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageSetup extends js.Object {
  /**
  	 * Print without colour
  	 *
  	 * false by default
  	 */
  var blackAndWhite: Boolean = js.native
  /**
  	 * Where to place comments
  	 *
  	 * Default is `None`
  	 */
  var cellComments: atEnd | asDisplayed | None = js.native
  /**
  	 * Print with less quality (and ink)
  	 *
  	 * false by default
  	 */
  var draft: Boolean = js.native
  /**
  	 * Where to show errors
  	 *
  	 * Default is `displayed`
  	 */
  var errors: dash | blank | NA | displayed = js.native
  /**
  	 * Which number to use for the first page
  	 */
  var firstPageNumber: Double = js.native
  /**
  	 * How many pages high the sheet should print on to. Active when fitToPage is true
  	 *
  	 * Default is 1
  	 */
  var fitToHeight: Double = js.native
  /**
  	 * Whether to use fitToWidth and fitToHeight or scale settings.
  	 *
  	 * Default is based on presence of these settings in the pageSetup object - if both are present,
  	 * scale wins (i.e. default will be false)
  	 */
  var fitToPage: Boolean = js.native
  /**
  	 * How many pages wide the sheet should print on to. Active when fitToPage is true
  	 *
  	 * Default is 1
  	 */
  var fitToWidth: Double = js.native
  /**
  	 * 	Whether to center the sheet data horizontally, `false` by default
  	 */
  var horizontalCentered: Boolean = js.native
  /**
  	 * Horizontal Dots per Inch. Default value is 4294967295
  	 */
  var horizontalDpi: Double = js.native
  /**
  	 * Whitespace on the borders of the page. Units are inches.
  	 */
  var margins: Margins = js.native
  /**
  	 * Orientation of the page - i.e. taller (`'portrait'`) or wider (`'landscape'`).
  	 *
  	 * `'portrait'` by default
  	 */
  var orientation: portrait | landscape = js.native
  /**
  	 * Which order to print the pages.
  	 *
  	 * Default is `downThenOver`
  	 */
  var pageOrder: downThenOver | overThenDown = js.native
  /**
  	 * 	What paper size to use (see below)
  	 *
  	 * | Name                          | Value       |
  	 * | ----------------------------- | ---------   |
  	 * | Letter                        | `undefined` |
  	 * | Legal                         |  `5`        |
  	 * | Executive                     |  `7`        |
  	 * | A4                            |  `9`        |
  	 * | A5                            |  `11`       |
  	 * | B5 (JIS)                      |  `13`       |
  	 * | Envelope #10                  |  `20`       |
  	 * | Envelope DL                   |  `27`       |
  	 * | Envelope C5                   |  `28`       |
  	 * | Envelope B5                   |  `34`       |
  	 * | Envelope Monarch              |  `37`       |
  	 * | Double Japan Postcard Rotated |  `82`       |
  	 * | 16K 197x273 mm                |  `119`      |
  	 */
  var paperSize: PaperSize = js.native
  /**
  	 * Set Print Area for a sheet, e.g. `'A1:G20'`
  	 */
  var printArea: String = js.native
  /**
  	 * Repeat specific columns on every printed page, e.g. `'A:C'`
  	 */
  var printTitlesColumn: String = js.native
  /**
  	 * Repeat specific rows on every printed page, e.g. `'1:3'`
  	 */
  var printTitlesRow: String = js.native
  /**
  	 * Percentage value to increase or reduce the size of the print. Active when fitToPage is false
  	 *
  	 * Default is 100
  	 */
  var scale: Double = js.native
  /**
  	 * Whether to show grid lines, `false` by default
  	 */
  var showGridLines: Boolean = js.native
  /**
  	 * Whether to show the row numbers and column letters, `false` by default
  	 */
  var showRowColHeaders: Boolean = js.native
  /**
  	 * 	Whether to center the sheet data vertically, `false` by default
  	 */
  var verticalCentered: Boolean = js.native
  /**
  	 * Vertical Dots per Inch. Default value is 4294967295
  	 */
  var verticalDpi: Double = js.native
}

object PageSetup {
  @scala.inline
  def apply(
    blackAndWhite: Boolean,
    cellComments: atEnd | asDisplayed | None,
    draft: Boolean,
    errors: dash | blank | NA | displayed,
    firstPageNumber: Double,
    fitToHeight: Double,
    fitToPage: Boolean,
    fitToWidth: Double,
    horizontalCentered: Boolean,
    horizontalDpi: Double,
    margins: Margins,
    orientation: portrait | landscape,
    pageOrder: downThenOver | overThenDown,
    paperSize: PaperSize,
    printArea: String,
    printTitlesColumn: String,
    printTitlesRow: String,
    scale: Double,
    showGridLines: Boolean,
    showRowColHeaders: Boolean,
    verticalCentered: Boolean,
    verticalDpi: Double
  ): PageSetup = {
    val __obj = js.Dynamic.literal(blackAndWhite = blackAndWhite.asInstanceOf[js.Any], cellComments = cellComments.asInstanceOf[js.Any], draft = draft.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], firstPageNumber = firstPageNumber.asInstanceOf[js.Any], fitToHeight = fitToHeight.asInstanceOf[js.Any], fitToPage = fitToPage.asInstanceOf[js.Any], fitToWidth = fitToWidth.asInstanceOf[js.Any], horizontalCentered = horizontalCentered.asInstanceOf[js.Any], horizontalDpi = horizontalDpi.asInstanceOf[js.Any], margins = margins.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], pageOrder = pageOrder.asInstanceOf[js.Any], paperSize = paperSize.asInstanceOf[js.Any], printArea = printArea.asInstanceOf[js.Any], printTitlesColumn = printTitlesColumn.asInstanceOf[js.Any], printTitlesRow = printTitlesRow.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], showGridLines = showGridLines.asInstanceOf[js.Any], showRowColHeaders = showRowColHeaders.asInstanceOf[js.Any], verticalCentered = verticalCentered.asInstanceOf[js.Any], verticalDpi = verticalDpi.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageSetup]
  }
  @scala.inline
  implicit class PageSetupOps[Self <: PageSetup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlackAndWhite(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blackAndWhite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCellComments(value: atEnd | asDisplayed | None): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellComments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDraft(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrors(value: dash | blank | NA | displayed): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirstPageNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstPageNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFitToHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fitToHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFitToPage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fitToPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFitToWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fitToWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHorizontalCentered(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalCentered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHorizontalDpi(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalDpi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMargins(value: Margins): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrientation(value: portrait | landscape): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageOrder(value: downThenOver | overThenDown): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaperSize(value: PaperSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paperSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrintArea(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printArea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrintTitlesColumn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printTitlesColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrintTitlesRow(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printTitlesRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowGridLines(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showGridLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowRowColHeaders(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRowColHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerticalCentered(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalCentered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerticalDpi(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalDpi")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

