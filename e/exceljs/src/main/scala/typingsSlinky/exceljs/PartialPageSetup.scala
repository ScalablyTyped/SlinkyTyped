package typingsSlinky.exceljs

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
import typingsSlinky.exceljs.mod.Margins
import typingsSlinky.exceljs.mod.PaperSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<exceljs.exceljs.PageSetup> */
@js.native
trait PartialPageSetup extends js.Object {
  var blackAndWhite: js.UndefOr[Boolean] = js.native
  var cellComments: js.UndefOr[atEnd | asDisplayed | None] = js.native
  var draft: js.UndefOr[Boolean] = js.native
  var errors: js.UndefOr[dash | blank | NA | displayed] = js.native
  var firstPageNumber: js.UndefOr[Double] = js.native
  var fitToHeight: js.UndefOr[Double] = js.native
  var fitToPage: js.UndefOr[Boolean] = js.native
  var fitToWidth: js.UndefOr[Double] = js.native
  var horizontalCentered: js.UndefOr[Boolean] = js.native
  var horizontalDpi: js.UndefOr[Double] = js.native
  var margins: js.UndefOr[Margins] = js.native
  var orientation: js.UndefOr[portrait | landscape] = js.native
  var pageOrder: js.UndefOr[downThenOver | overThenDown] = js.native
  var paperSize: js.UndefOr[PaperSize] = js.native
  var printArea: js.UndefOr[String] = js.native
  var printTitlesColumn: js.UndefOr[String] = js.native
  var printTitlesRow: js.UndefOr[String] = js.native
  var scale: js.UndefOr[Double] = js.native
  var showGridLines: js.UndefOr[Boolean] = js.native
  var showRowColHeaders: js.UndefOr[Boolean] = js.native
  var verticalCentered: js.UndefOr[Boolean] = js.native
  var verticalDpi: js.UndefOr[Double] = js.native
}

object PartialPageSetup {
  @scala.inline
  def apply(): PartialPageSetup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPageSetup]
  }
  @scala.inline
  implicit class PartialPageSetupOps[Self <: PartialPageSetup] (val x: Self) extends AnyVal {
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
    def withoutBlackAndWhite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blackAndWhite")(js.undefined)
        ret
    }
    @scala.inline
    def withCellComments(value: atEnd | asDisplayed | None): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellComments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellComments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellComments")(js.undefined)
        ret
    }
    @scala.inline
    def withDraft(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDraft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draft")(js.undefined)
        ret
    }
    @scala.inline
    def withErrors(value: dash | blank | NA | displayed): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstPageNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstPageNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstPageNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstPageNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withFitToHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fitToHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFitToHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fitToHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withFitToPage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fitToPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFitToPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fitToPage")(js.undefined)
        ret
    }
    @scala.inline
    def withFitToWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fitToWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFitToWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fitToWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withHorizontalCentered(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalCentered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontalCentered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalCentered")(js.undefined)
        ret
    }
    @scala.inline
    def withHorizontalDpi(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalDpi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontalDpi: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalDpi")(js.undefined)
        ret
    }
    @scala.inline
    def withMargins(value: Margins): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMargins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margins")(js.undefined)
        ret
    }
    @scala.inline
    def withOrientation(value: portrait | landscape): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(js.undefined)
        ret
    }
    @scala.inline
    def withPageOrder(value: downThenOver | overThenDown): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageOrder")(js.undefined)
        ret
    }
    @scala.inline
    def withPaperSize(value: PaperSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paperSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaperSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paperSize")(js.undefined)
        ret
    }
    @scala.inline
    def withPrintArea(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printArea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrintArea: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printArea")(js.undefined)
        ret
    }
    @scala.inline
    def withPrintTitlesColumn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printTitlesColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrintTitlesColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printTitlesColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withPrintTitlesRow(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printTitlesRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrintTitlesRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printTitlesRow")(js.undefined)
        ret
    }
    @scala.inline
    def withScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(js.undefined)
        ret
    }
    @scala.inline
    def withShowGridLines(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showGridLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowGridLines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showGridLines")(js.undefined)
        ret
    }
    @scala.inline
    def withShowRowColHeaders(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRowColHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowRowColHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRowColHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticalCentered(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalCentered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalCentered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalCentered")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticalDpi(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalDpi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalDpi: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalDpi")(js.undefined)
        ret
    }
  }
  
}

