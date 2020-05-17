package typingsSlinky.activexLibreoffice.com_.sun.star.awt

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** manages several printers on one machine. */
@js.native
trait XPrinterServer extends XInterface {
  /** returns a list of all available printer names. */
  val PrinterNames: SafeArray[String] = js.native
  /**
    * creates a new information printer.
    *
    * You can get all information from this printer, but the printer cannot really print.
    */
  def createInfoPrinter(printerName: String): XInfoPrinter = js.native
  /**
    * creates a new virtual printer.
    *
    * You must call {@link com.sun.star.awt.XPrinter.start()} to put the job into the printer spooler.
    */
  def createPrinter(printerName: String): XPrinter = js.native
  /** returns a list of all available printer names. */
  def getPrinterNames(): SafeArray[String] = js.native
}

object XPrinterServer {
  @scala.inline
  def apply(
    PrinterNames: SafeArray[String],
    acquire: () => Unit,
    createInfoPrinter: String => XInfoPrinter,
    createPrinter: String => XPrinter,
    getPrinterNames: () => SafeArray[String],
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XPrinterServer = {
    val __obj = js.Dynamic.literal(PrinterNames = PrinterNames.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), createInfoPrinter = js.Any.fromFunction1(createInfoPrinter), createPrinter = js.Any.fromFunction1(createPrinter), getPrinterNames = js.Any.fromFunction0(getPrinterNames), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XPrinterServer]
  }
  @scala.inline
  implicit class XPrinterServerOps[Self <: XPrinterServer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPrinterNames(value: SafeArray[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrinterNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateInfoPrinter(value: String => XInfoPrinter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createInfoPrinter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreatePrinter(value: String => XPrinter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createPrinter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetPrinterNames(value: () => SafeArray[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPrinterNames")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

