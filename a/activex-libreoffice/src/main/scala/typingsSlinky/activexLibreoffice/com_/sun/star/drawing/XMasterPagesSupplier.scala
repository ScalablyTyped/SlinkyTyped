package typingsSlinky.activexLibreoffice.com_.sun.star.drawing

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** must be supported to provide access to the {@link MasterPages} of a multi-page drawing-layer. */
@js.native
trait XMasterPagesSupplier extends XInterface {
  
  /** @returns an indexed container with the service {@link MasterPages} . */
  val MasterPages: XDrawPages = js.native
  
  /** @returns an indexed container with the service {@link MasterPages} . */
  def getMasterPages(): XDrawPages = js.native
}
object XMasterPagesSupplier {
  
  @scala.inline
  def apply(
    MasterPages: XDrawPages,
    acquire: () => Unit,
    getMasterPages: () => XDrawPages,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XMasterPagesSupplier = {
    val __obj = js.Dynamic.literal(MasterPages = MasterPages.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getMasterPages = js.Any.fromFunction0(getMasterPages), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XMasterPagesSupplier]
  }
  
  @scala.inline
  implicit class XMasterPagesSupplierMutableBuilder[Self <: XMasterPagesSupplier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetMasterPages(value: () => XDrawPages): Self = StObject.set(x, "getMasterPages", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMasterPages(value: XDrawPages): Self = StObject.set(x, "MasterPages", value.asInstanceOf[js.Any])
  }
}
