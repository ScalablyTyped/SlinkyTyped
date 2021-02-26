package typingsSlinky.activexLibreoffice.com_.sun.star.datatransfer

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface to be implemented by objects used to provide data for a transfer operation.
  * @see com.sun.star.datatransfer.DataFlavor
  * @see com.sun.star.datatransfer.XTransferable
  */
@js.native
trait XTransferableEx extends XInterface {
  
  /**
    * @param requestedFlavors Sequence of {@link DataFlavor} of interest. Specify an empty sequence for interest in all data flavors with top-level MIME conte
    * @returns The list of the matching supported {@link DataFlavor} that were requested. For each requested top-level MIME content-type, all supported subtypes
    */
  def queryTransferDataFlavors(requestedFlavors: SeqEquiv[DataFlavor]): SafeArray[DataFlavor] = js.native
}
object XTransferableEx {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    queryTransferDataFlavors: SeqEquiv[DataFlavor] => SafeArray[DataFlavor],
    release: () => Unit
  ): XTransferableEx = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), queryTransferDataFlavors = js.Any.fromFunction1(queryTransferDataFlavors), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XTransferableEx]
  }
  
  @scala.inline
  implicit class XTransferableExMutableBuilder[Self <: XTransferableEx] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQueryTransferDataFlavors(value: SeqEquiv[DataFlavor] => SafeArray[DataFlavor]): Self = StObject.set(x, "queryTransferDataFlavors", js.Any.fromFunction1(value))
  }
}
