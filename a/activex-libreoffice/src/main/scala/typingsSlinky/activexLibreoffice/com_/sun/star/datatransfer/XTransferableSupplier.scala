package typingsSlinky.activexLibreoffice.com_.sun.star.datatransfer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XTransferableSupplier extends StObject {
  
  /**
    * To get access to a transferable representation of a selected part of an object.
    * @returns The transferable object representing the selection inside the supplying object
    * @see com.sun.star.datatransfer.XTransferable
    */
  val Transferable: XTransferable = js.native
  
  /**
    * To get access to a transferable representation of a selected part of an object.
    * @returns The transferable object representing the selection inside the supplying object
    * @see com.sun.star.datatransfer.XTransferable
    */
  def getTransferable(): XTransferable = js.native
  
  /**
    * Hands over a transferable object that shall be inserted.
    * @param xTrans The transferable object to be inserted A NULL value is not allowed.
    * @see com.sun.star.datatransfer.XTransferable
    * @throws com::sun::star::datatransfer::UnsupportedFlavorException if the given {@link com.sun.star.datatransfer.XTransferable} has no {@link com.sun.star.
    */
  def insertTransferable(xTrans: XTransferable): Unit = js.native
}
object XTransferableSupplier {
  
  @scala.inline
  def apply(
    Transferable: XTransferable,
    getTransferable: () => XTransferable,
    insertTransferable: XTransferable => Unit
  ): XTransferableSupplier = {
    val __obj = js.Dynamic.literal(Transferable = Transferable.asInstanceOf[js.Any], getTransferable = js.Any.fromFunction0(getTransferable), insertTransferable = js.Any.fromFunction1(insertTransferable))
    __obj.asInstanceOf[XTransferableSupplier]
  }
  
  @scala.inline
  implicit class XTransferableSupplierMutableBuilder[Self <: XTransferableSupplier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetTransferable(value: () => XTransferable): Self = StObject.set(x, "getTransferable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInsertTransferable(value: XTransferable => Unit): Self = StObject.set(x, "insertTransferable", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTransferable(value: XTransferable): Self = StObject.set(x, "Transferable", value.asInstanceOf[js.Any])
  }
}
