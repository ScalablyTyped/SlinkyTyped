package typingsSlinky.activexLibreoffice.com_.sun.star.accessibility

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XComponent
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The interface must be implemented for a server that can support MSAA com objects and send win32 accessible events */
@js.native
trait XMSAAService extends XComponent {
  
  /**
    * Return com object pointer.
    * @returns A reference to the object that contains the actual accessibility information.
    * @see AccessibleContext
    */
  def getAccObjectPtr(hWnd: Double, lParam: Double, wParam: Double): Double = js.native
  
  def handleWindowOpened(i: Double): Unit = js.native
}
object XMSAAService {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    dispose: () => Unit,
    getAccObjectPtr: (Double, Double, Double) => Double,
    handleWindowOpened: Double => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit
  ): XMSAAService = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), dispose = js.Any.fromFunction0(dispose), getAccObjectPtr = js.Any.fromFunction3(getAccObjectPtr), handleWindowOpened = js.Any.fromFunction1(handleWindowOpened), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener))
    __obj.asInstanceOf[XMSAAService]
  }
  
  @scala.inline
  implicit class XMSAAServiceMutableBuilder[Self <: XMSAAService] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetAccObjectPtr(value: (Double, Double, Double) => Double): Self = StObject.set(x, "getAccObjectPtr", js.Any.fromFunction3(value))
    
    @scala.inline
    def setHandleWindowOpened(value: Double => Unit): Self = StObject.set(x, "handleWindowOpened", js.Any.fromFunction1(value))
  }
}
