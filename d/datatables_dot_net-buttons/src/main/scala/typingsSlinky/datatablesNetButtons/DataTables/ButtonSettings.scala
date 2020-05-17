package typingsSlinky.datatablesNetButtons.DataTables

import org.scalajs.dom.raw.Window
import typingsSlinky.datatablesNet.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion "Button Defaults"
//#region "Add-Ons"
/**
  * Buttons extension options
  */
@js.native
trait ButtonSettings extends ButtomSettingsCommon {
  /**
    * PRINT: Show print dialoge on click
    */
  var autoPrint: js.UndefOr[Boolean] = js.native
  /**
    * CSV: UTF-8 boom
    */
  var bom: js.UndefOr[Boolean] = js.native
  /**
    * CSV: charset
    */
  var charset: js.UndefOr[String | Boolean] = js.native
  /**
    * COLVIS:
    */
  var columnText: js.UndefOr[FunctionButtonColvisColumnText] = js.native
  //#endregion Export and Print
  //#region ColVis
  /**
    * COLVIS: Column selector
    */
  var columns: js.UndefOr[js.Any] = js.native
  /**
    * COPY / CSV / EXCEL / PDF / PRINT: show header
    */
  var customize: js.UndefOr[FunctionButtonCustomize] = js.native
  /**
    * EXCEL
    */
  var customizeData: js.UndefOr[FunctionButtonCustomizeData] = js.native
  /**
    * CSV: escape char
    */
  var escapeChar: js.UndefOr[String] = js.native
  //#endregion (HTML-)File-Export
  //#region Export and Print
  /**
    * COPY / CSV / EXCEL / PDF / PRINT: show header
    */
  var exportOptions: js.UndefOr[ButtonExportOptions | js.Object] = js.native
  /**
    * CSV / EXCEL / PDF: file extension
    */
  var extension: js.UndefOr[String] = js.native
  /**
    * COPY / CSV: field boundary
    */
  var fieldBoundary: js.UndefOr[String] = js.native
  /**
    * COPY / CSV: field separator
    */
  var fieldSeparator: js.UndefOr[String] = js.native
  //#region (HTML-)File-Export
  /**
    * CSV / EXCEL: Define what the exported filename should be
    */
  var filename: js.UndefOr[String] = js.native
  /**
    * COPY / CSV / EXCEL / PDF / PRINT: show footer
    */
  var footer: js.UndefOr[Boolean] = js.native
  /**
    * COPY / CSV / EXCEL / PDF / PRINT: show header
    */
  var header: js.UndefOr[Boolean] = js.native
  /**
    * PDF / PRINT: Extra message
    */
  var message: js.UndefOr[String | Api | JQuery | js.Object] = js.native
  /**
    * COPY / EXCEL / PDF / PRINT: field separator
    */
  var messageBottom: js.UndefOr[String] = js.native
  /**
    * COPY / EXCEL / PDF / PRINT: field separator
    */
  var messageTop: js.UndefOr[String] = js.native
  /**
    * COPY / CSV: field separator
    */
  var newLine: js.UndefOr[String] = js.native
  /**
    * PDF: portrait / landscape
    */
  var orientation: js.UndefOr[String] = js.native
  /**
    * PDF: A3 / A4 / A5 / LEGAL / LETTER / TABLOID
    */
  var pageSize: js.UndefOr[String] = js.native
  /**
    * COPY / PRINT: title
    */
  var title: js.UndefOr[String] = js.native
}

object ButtonSettings {
  @scala.inline
  def apply(): ButtonSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonSettings]
  }
  @scala.inline
  implicit class ButtonSettingsOps[Self <: ButtonSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoPrint(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoPrint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoPrint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoPrint")(js.undefined)
        ret
    }
    @scala.inline
    def withBom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bom")(js.undefined)
        ret
    }
    @scala.inline
    def withCharset(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCharset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charset")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnText(value: (/* dt */ Api, /* i */ Double, /* title */ String) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnText")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutColumnText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnText")(js.undefined)
        ret
    }
    @scala.inline
    def withColumns(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomize(value: /* win */ Window | String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCustomize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customize")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomizeData(value: /* content */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customizeData")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCustomizeData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customizeData")(js.undefined)
        ret
    }
    @scala.inline
    def withEscapeChar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escapeChar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEscapeChar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escapeChar")(js.undefined)
        ret
    }
    @scala.inline
    def withExportOptions(value: ButtonExportOptions | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExportOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withExtension(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtension: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extension")(js.undefined)
        ret
    }
    @scala.inline
    def withFieldBoundary(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldBoundary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFieldBoundary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldBoundary")(js.undefined)
        ret
    }
    @scala.inline
    def withFieldSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFieldSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldSeparator")(js.undefined)
        ret
    }
    @scala.inline
    def withFilename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilename: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(js.undefined)
        ret
    }
    @scala.inline
    def withFooter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFooter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footer")(js.undefined)
        ret
    }
    @scala.inline
    def withHeader(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: String | Api | JQuery | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageBottom(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageBottom")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageTop(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageTop")(js.undefined)
        ret
    }
    @scala.inline
    def withNewLine(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newLine")(js.undefined)
        ret
    }
    @scala.inline
    def withOrientation(value: String): Self = {
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
    def withPageSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSize")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

