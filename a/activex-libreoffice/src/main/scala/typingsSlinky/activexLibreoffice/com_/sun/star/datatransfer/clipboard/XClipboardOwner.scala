package typingsSlinky.activexLibreoffice.com_.sun.star.datatransfer.clipboard

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.datatransfer.XTransferable
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The owner of a transferable object may pass this interface to the clipboard instance.
  * @see com.sun.star.datatransfer.clipboard.XClipboard
  */
@js.native
trait XClipboardOwner extends XInterface {
  
  /**
    * Notifies the transferable object source that it is no longer the owner of the clipboard.
    * @param xClipboard The clipboard for which the ownership was lost.
    * @param xTrans The transferable object that has been the contents of the clipboard.
    * @see com.sun.star.datatransfer.clipboard.XClipboard
    * @see com.sun.star.datatransfer.XTransferable
    */
  def lostOwnership(xClipboard: XClipboard, xTrans: XTransferable): Unit = js.native
}
object XClipboardOwner {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    lostOwnership: (XClipboard, XTransferable) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XClipboardOwner = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), lostOwnership = js.Any.fromFunction2(lostOwnership), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XClipboardOwner]
  }
  
  @scala.inline
  implicit class XClipboardOwnerOps[Self <: XClipboardOwner] (val x: Self) extends AnyVal {
    
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
    def setLostOwnership(value: (XClipboard, XTransferable) => Unit): Self = this.set("lostOwnership", js.Any.fromFunction2(value))
  }
}
