package typingsSlinky.activexLibreoffice.com_.sun.star.view

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes the options for print jobs.
  *
  * These options are only valid for a single print job. They do not change layout or formatting of the document.
  */
@js.native
trait PrintOptions extends js.Object {
  /** advises the printer to collate the pages of the copies. */
  var Collate: Boolean = js.native
  /** specifies the number of copies to print. */
  var CopyCount: Double = js.native
  /**
    * determines the duplex mode for the print job.
    * @see DuplexMode for more information about supported values
    */
  var DuplexMode: Double = js.native
  /** if set, specifies the name of a file to print to. */
  var FileName: String = js.native
  /**
    * specifies which pages to print.
    *
    * This range is given as at the user interface. For example: "1-4;10" to print the pages 1 to 4 and 10.
    */
  var Pages: String = js.native
  /** if set, specifies name of the printer to use. */
  var PrinterName: String = js.native
  /**
    * advises the printer to sort the pages of the copies.
    * @deprecated DeprecatedUse Collate instead.
    */
  var Sort: Boolean = js.native
  /** if set to TRUE, the corresponding {@link XPrintable.print()} request will be executed synchronous. <p>Default is the asynchronous print mode.</p> */
  var Wait: Boolean = js.native
}

object PrintOptions {
  @scala.inline
  def apply(
    Collate: Boolean,
    CopyCount: Double,
    DuplexMode: Double,
    FileName: String,
    Pages: String,
    PrinterName: String,
    Sort: Boolean,
    Wait: Boolean
  ): PrintOptions = {
    val __obj = js.Dynamic.literal(Collate = Collate.asInstanceOf[js.Any], CopyCount = CopyCount.asInstanceOf[js.Any], DuplexMode = DuplexMode.asInstanceOf[js.Any], FileName = FileName.asInstanceOf[js.Any], Pages = Pages.asInstanceOf[js.Any], PrinterName = PrinterName.asInstanceOf[js.Any], Sort = Sort.asInstanceOf[js.Any], Wait = Wait.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintOptions]
  }
  @scala.inline
  implicit class PrintOptionsOps[Self <: PrintOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Collate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCopyCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CopyCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDuplexMode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DuplexMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPages(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Pages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrinterName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrinterName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSort(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Sort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWait(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Wait")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

