package typingsSlinky.chrome.anon

import typingsSlinky.chrome.chrome.printerProvider.CapabilityRequestedEvent
import typingsSlinky.chrome.chrome.printerProvider.PrintRequestedEvent
import typingsSlinky.chrome.chrome.printerProvider.PrinterInfoRequestedEvent
import typingsSlinky.chrome.chrome.printerProvider.PrinterRequestedEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofprinterProvider extends StObject {
  
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
  implicit class TypeofprinterProviderMutableBuilder[Self <: TypeofprinterProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnGetCapabilityRequested(value: CapabilityRequestedEvent): Self = StObject.set(x, "onGetCapabilityRequested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnGetPrintersRequested(value: PrinterRequestedEvent): Self = StObject.set(x, "onGetPrintersRequested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnGetUsbPrinterInfoRequested(value: PrinterInfoRequestedEvent): Self = StObject.set(x, "onGetUsbPrinterInfoRequested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPrintRequested(value: PrintRequestedEvent): Self = StObject.set(x, "onPrintRequested", value.asInstanceOf[js.Any])
  }
}
