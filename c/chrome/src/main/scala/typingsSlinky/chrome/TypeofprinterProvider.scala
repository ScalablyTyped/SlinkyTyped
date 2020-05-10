package typingsSlinky.chrome

import typingsSlinky.chrome.chrome.printerProvider.CapabilityRequestedEvent
import typingsSlinky.chrome.chrome.printerProvider.PrintRequestedEvent
import typingsSlinky.chrome.chrome.printerProvider.PrinterInfoRequestedEvent
import typingsSlinky.chrome.chrome.printerProvider.PrinterRequestedEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofprinterProvider extends js.Object {
  var onGetCapabilityRequested: CapabilityRequestedEvent = js.native
  var onGetPrintersRequested: PrinterRequestedEvent = js.native
  var onGetUsbPrinterInfoRequested: PrinterInfoRequestedEvent = js.native
  var onPrintRequested: PrintRequestedEvent = js.native
}

object TypeofprinterProvider {
  @scala.inline
  def apply(
    onGetCapabilityRequested: CapabilityRequestedEvent,
    onGetPrintersRequested: PrinterRequestedEvent,
    onGetUsbPrinterInfoRequested: PrinterInfoRequestedEvent,
    onPrintRequested: PrintRequestedEvent
  ): TypeofprinterProvider = {
    val __obj = js.Dynamic.literal(onGetCapabilityRequested = onGetCapabilityRequested.asInstanceOf[js.Any], onGetPrintersRequested = onGetPrintersRequested.asInstanceOf[js.Any], onGetUsbPrinterInfoRequested = onGetUsbPrinterInfoRequested.asInstanceOf[js.Any], onPrintRequested = onPrintRequested.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofprinterProvider]
  }
  @scala.inline
  implicit class TypeofprinterProviderOps[Self <: TypeofprinterProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnGetCapabilityRequested(value: CapabilityRequestedEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onGetCapabilityRequested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnGetPrintersRequested(value: PrinterRequestedEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onGetPrintersRequested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnGetUsbPrinterInfoRequested(value: PrinterInfoRequestedEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onGetUsbPrinterInfoRequested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnPrintRequested(value: PrintRequestedEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPrintRequested")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

