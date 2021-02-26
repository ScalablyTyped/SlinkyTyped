package typingsSlinky.dymoLabelFramework.dymo.label.framework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrinterInfo extends StObject {
  
  /** Indicates whether the Auto-Cut feature is supported by the printer or not. Note: The property is only defined if printerType is "TapePrinter". */
  var isAutoCutSupported: Boolean = js.native
  
  /** Indicates whether the printer is connected to a computer or not. Note: Currently only returns properly for local USB-connected printers on Windows. */
  var isConnected: Boolean = js.native
  
  /** Indicates whether the printer is a local USB-connected printer or a shared network printer. Note: Currently only returns properly on Windows. */
  var isLocal: Boolean = js.native
  
  /** Indicates whether the printer is a "LabelWriter Twin Turbo" (has two rolls) or not. Note: The property is only defined if printerType is "LabelWriterPrinter". */
  var isTwinTurbo: Boolean = js.native
  
  /** Returns the printer model/driver name. */
  var modelName: String = js.native
  
  /** Returns the printer name (print queue name on Mac). */
  var name: String = js.native
  
  /** Returns the printer type; "LabelWriterPrinter" or "TapePrinter". */
  var printerType: String = js.native
}
object PrinterInfo {
  
  @scala.inline
  def apply(
    isAutoCutSupported: Boolean,
    isConnected: Boolean,
    isLocal: Boolean,
    isTwinTurbo: Boolean,
    modelName: String,
    name: String,
    printerType: String
  ): PrinterInfo = {
    val __obj = js.Dynamic.literal(isAutoCutSupported = isAutoCutSupported.asInstanceOf[js.Any], isConnected = isConnected.asInstanceOf[js.Any], isLocal = isLocal.asInstanceOf[js.Any], isTwinTurbo = isTwinTurbo.asInstanceOf[js.Any], modelName = modelName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], printerType = printerType.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrinterInfo]
  }
  
  @scala.inline
  implicit class PrinterInfoMutableBuilder[Self <: PrinterInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsAutoCutSupported(value: Boolean): Self = StObject.set(x, "isAutoCutSupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsConnected(value: Boolean): Self = StObject.set(x, "isConnected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLocal(value: Boolean): Self = StObject.set(x, "isLocal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsTwinTurbo(value: Boolean): Self = StObject.set(x, "isTwinTurbo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelName(value: String): Self = StObject.set(x, "modelName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrinterType(value: String): Self = StObject.set(x, "printerType", value.asInstanceOf[js.Any])
  }
}
