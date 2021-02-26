package typingsSlinky.activexLibreoffice.com_.sun.star.embed

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.datatransfer.XTransferable
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provide access to a {@link com.sun.star.datatransfer.XTransferable} implementation from the object. */
@js.native
trait XTransferableSupplier extends XInterface {
  
  /**
    * allows to get access to {@link com.sun.star.datatransfer.XTransferable} implementation.
    * @returns {@link com.sun.star.datatransfer.XTransferable} implementation
    */
  val Transferable: XTransferable = js.native
  
  /**
    * allows to get access to {@link com.sun.star.datatransfer.XTransferable} implementation.
    * @returns {@link com.sun.star.datatransfer.XTransferable} implementation
    */
  def getTransferable(): XTransferable = js.native
}
object XTransferableSupplier {
  
  @scala.inline
  def apply(
    Transferable: XTransferable,
    acquire: () => Unit,
    getTransferable: () => XTransferable,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XTransferableSupplier = {
    val __obj = js.Dynamic.literal(Transferable = Transferable.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getTransferable = js.Any.fromFunction0(getTransferable), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XTransferableSupplier]
  }
  
  @scala.inline
  implicit class XTransferableSupplierMutableBuilder[Self <: XTransferableSupplier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetTransferable(value: () => XTransferable): Self = StObject.set(x, "getTransferable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTransferable(value: XTransferable): Self = StObject.set(x, "Transferable", value.asInstanceOf[js.Any])
  }
}
