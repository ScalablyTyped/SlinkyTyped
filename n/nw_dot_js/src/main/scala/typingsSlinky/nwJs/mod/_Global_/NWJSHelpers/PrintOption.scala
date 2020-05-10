package typingsSlinky.nwJs.mod._Global_.NWJSHelpers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for nw.Window.get().print().
  */
@js.native
trait PrintOption extends js.Object {
  /**
    * Whether to enable header and footer
    */
  var headerFooterEnabled: Boolean = js.native
  /**
    * Whether to use landscape or portrait
    */
  var landscape: Boolean = js.native
  /**
    * The paper size spec
    * example: 'mediaSize':{'name': 'CUSTOM', 'width_microns': 279400, 'height_microns': 215900, 'custom_display_name':'Letter', 'is_default': true}
    */
  var mediaSize: js.Any = js.native
  /**
    * The path of the output PDF when printing to PDF
    */
  var pdf_path: String = js.native
  /**
    * The device name of the printer
    */
  var printer: String = js.native
  /**
    * Whether to print CSS backgrounds
    */
  var shouldPrintBackgrounds: Boolean = js.native
}

object PrintOption {
  @scala.inline
  def apply(
    headerFooterEnabled: Boolean,
    landscape: Boolean,
    mediaSize: js.Any,
    pdf_path: String,
    printer: String,
    shouldPrintBackgrounds: Boolean
  ): PrintOption = {
    val __obj = js.Dynamic.literal(headerFooterEnabled = headerFooterEnabled.asInstanceOf[js.Any], landscape = landscape.asInstanceOf[js.Any], mediaSize = mediaSize.asInstanceOf[js.Any], pdf_path = pdf_path.asInstanceOf[js.Any], printer = printer.asInstanceOf[js.Any], shouldPrintBackgrounds = shouldPrintBackgrounds.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintOption]
  }
  @scala.inline
  implicit class PrintOptionOps[Self <: PrintOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeaderFooterEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerFooterEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLandscape(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("landscape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMediaSize(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPdf_path(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pdf_path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrinter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShouldPrintBackgrounds(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldPrintBackgrounds")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

