package typingsSlinky.activexLibreoffice.com_.sun.star.datatransfer

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface to be implemented by objects used to provide data for a data transfer operation.
  * @see com.sun.star.datatransfer.DataFlavor
  */
@js.native
trait XTransferable extends XInterface {
  
  /**
    * Returns a sequence of supported {@link DataFlavor} .
    * @returns The sequence of supported {@link DataFlavor} .
    * @see com.sun.star.datatransfer.DataFlavor
    */
  val TransferDataFlavors: SafeArray[DataFlavor] = js.native
  
  /**
    * Called by a data consumer to obtain data from the source in a specified format.
    * @param aFlavor Describes the requested data format
    * @returns The data in the specified {@link DataFlavor} .
    * @throws com::sun::star::io::IOException if the data is no longer available in the requested flavor.
    * @throws com::sun::star::datatransfer::UnsupportedFlavorException if the requested {@link DataFlavor} is not supported.
    */
  def getTransferData(aFlavor: DataFlavor): js.Any = js.native
  
  /**
    * Returns a sequence of supported {@link DataFlavor} .
    * @returns The sequence of supported {@link DataFlavor} .
    * @see com.sun.star.datatransfer.DataFlavor
    */
  def getTransferDataFlavors(): SafeArray[DataFlavor] = js.native
  
  /**
    * Checks if the data object supports the specified data flavor.
    * @param aFlavor Describes the format that should be checked
    * @returns A value of `TRUE` if the {@link DataFlavor} is supported by the transfer source. A value of `FALSE` if the {@link DataFlavor} is unsupported by t
    */
  def isDataFlavorSupported(aFlavor: DataFlavor): Boolean = js.native
}
object XTransferable {
  
  @scala.inline
  def apply(
    TransferDataFlavors: SafeArray[DataFlavor],
    acquire: () => Unit,
    getTransferData: DataFlavor => js.Any,
    getTransferDataFlavors: () => SafeArray[DataFlavor],
    isDataFlavorSupported: DataFlavor => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XTransferable = {
    val __obj = js.Dynamic.literal(TransferDataFlavors = TransferDataFlavors.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getTransferData = js.Any.fromFunction1(getTransferData), getTransferDataFlavors = js.Any.fromFunction0(getTransferDataFlavors), isDataFlavorSupported = js.Any.fromFunction1(isDataFlavorSupported), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XTransferable]
  }
  
  @scala.inline
  implicit class XTransferableOps[Self <: XTransferable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTransferDataFlavors(value: SafeArray[DataFlavor]): Self = this.set("TransferDataFlavors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetTransferData(value: DataFlavor => js.Any): Self = this.set("getTransferData", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetTransferDataFlavors(value: () => SafeArray[DataFlavor]): Self = this.set("getTransferDataFlavors", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsDataFlavorSupported(value: DataFlavor => Boolean): Self = this.set("isDataFlavorSupported", js.Any.fromFunction1(value))
  }
}
