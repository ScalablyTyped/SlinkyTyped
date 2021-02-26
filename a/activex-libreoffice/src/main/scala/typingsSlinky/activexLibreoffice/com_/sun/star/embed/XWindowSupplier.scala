package typingsSlinky.activexLibreoffice.com_.sun.star.embed

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.XWindow
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides access to a VCL window implementation. */
@js.native
trait XWindowSupplier extends XInterface {
  
  /**
    * allows to get access to a VCL window implementation.
    * @returns VCL window implementation
    */
  val Window: XWindow = js.native
  
  /**
    * allows to get access to a VCL window implementation.
    * @returns VCL window implementation
    */
  def getWindow(): XWindow = js.native
}
object XWindowSupplier {
  
  @scala.inline
  def apply(
    Window: XWindow,
    acquire: () => Unit,
    getWindow: () => XWindow,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XWindowSupplier = {
    val __obj = js.Dynamic.literal(Window = Window.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getWindow = js.Any.fromFunction0(getWindow), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XWindowSupplier]
  }
  
  @scala.inline
  implicit class XWindowSupplierMutableBuilder[Self <: XWindowSupplier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetWindow(value: () => XWindow): Self = StObject.set(x, "getWindow", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWindow(value: XWindow): Self = StObject.set(x, "Window", value.asInstanceOf[js.Any])
  }
}
