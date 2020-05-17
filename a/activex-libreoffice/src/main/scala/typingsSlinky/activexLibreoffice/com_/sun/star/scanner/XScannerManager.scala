package typingsSlinky.activexLibreoffice.com_.sun.star.scanner

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.XBitmap
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XScannerManager extends XInterface {
  /** returns all available scanner devices */
  val AvailableScanners: SafeArray[ScannerContext] = js.native
  /** produce some kind of User Interface to let the user have a preview, configure the scan area, etc., it returns FALSE if user cancelled this process */
  def configureScanner(scannerContext: js.Array[ScannerContext]): Boolean = js.native
  /** returns all available scanner devices */
  def getAvailableScanners(): SafeArray[ScannerContext] = js.native
  /** get the image after completion of scan */
  def getBitmap(scannerContext: ScannerContext): XBitmap = js.native
  /** get the state of scanning after completion of scan */
  def getError(scannerContext: ScannerContext): ScanError = js.native
  /**
    * start the scanning process listener will be called when scan is complete the EventObject of the disposing call will contain the {@link ScannerManager}
    * if the scan was successful, an empty interface otherwise
    */
  def startScan(scannerContext: ScannerContext, listener: XEventListener): Unit = js.native
}

object XScannerManager {
  @scala.inline
  def apply(
    AvailableScanners: SafeArray[ScannerContext],
    acquire: () => Unit,
    configureScanner: js.Array[ScannerContext] => Boolean,
    getAvailableScanners: () => SafeArray[ScannerContext],
    getBitmap: ScannerContext => XBitmap,
    getError: ScannerContext => ScanError,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    startScan: (ScannerContext, XEventListener) => Unit
  ): XScannerManager = {
    val __obj = js.Dynamic.literal(AvailableScanners = AvailableScanners.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), configureScanner = js.Any.fromFunction1(configureScanner), getAvailableScanners = js.Any.fromFunction0(getAvailableScanners), getBitmap = js.Any.fromFunction1(getBitmap), getError = js.Any.fromFunction1(getError), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), startScan = js.Any.fromFunction2(startScan))
    __obj.asInstanceOf[XScannerManager]
  }
  @scala.inline
  implicit class XScannerManagerOps[Self <: XScannerManager] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvailableScanners(value: SafeArray[ScannerContext]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailableScanners")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfigureScanner(value: js.Array[ScannerContext] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configureScanner")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetAvailableScanners(value: () => SafeArray[ScannerContext]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAvailableScanners")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetBitmap(value: ScannerContext => XBitmap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBitmap")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetError(value: ScannerContext => ScanError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStartScan(value: (ScannerContext, XEventListener) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startScan")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

