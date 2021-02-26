package typingsSlinky.activexLibreoffice.com_.sun.star.view

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** offers printing functionality. */
@js.native
trait XPrintable extends XInterface {
  
  /**
    * @returns a descriptor of the current printer.  The attributes of the current printer are used for formatting.
    * @see PrinterDescriptor
    */
  var Printer: SafeArray[PropertyValue] = js.native
  
  /**
    * @returns a descriptor of the current printer.  The attributes of the current printer are used for formatting.
    * @see PrinterDescriptor
    */
  def getPrinter(): SafeArray[PropertyValue] = js.native
  
  /**
    * prints the object.
    * @param xOptions specifies the number of copies and some other values which do not affect formatting.
    * @see PrintOptions
    */
  def print(xOptions: SeqEquiv[PropertyValue]): Unit = js.native
  
  /**
    * assigns a new printer to the object.
    *
    * Setting a new printer will cause reformatting.
    * @see PrinterDescriptor
    */
  def setPrinter(aPrinter: SeqEquiv[PropertyValue]): Unit = js.native
}
object XPrintable {
  
  @scala.inline
  def apply(
    Printer: SafeArray[PropertyValue],
    acquire: () => Unit,
    getPrinter: () => SafeArray[PropertyValue],
    print: SeqEquiv[PropertyValue] => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setPrinter: SeqEquiv[PropertyValue] => Unit
  ): XPrintable = {
    val __obj = js.Dynamic.literal(Printer = Printer.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getPrinter = js.Any.fromFunction0(getPrinter), print = js.Any.fromFunction1(print), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setPrinter = js.Any.fromFunction1(setPrinter))
    __obj.asInstanceOf[XPrintable]
  }
  
  @scala.inline
  implicit class XPrintableMutableBuilder[Self <: XPrintable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetPrinter(value: () => SafeArray[PropertyValue]): Self = StObject.set(x, "getPrinter", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPrint(value: SeqEquiv[PropertyValue] => Unit): Self = StObject.set(x, "print", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPrinter(value: SafeArray[PropertyValue]): Self = StObject.set(x, "Printer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetPrinter(value: SeqEquiv[PropertyValue] => Unit): Self = StObject.set(x, "setPrinter", js.Any.fromFunction1(value))
  }
}
