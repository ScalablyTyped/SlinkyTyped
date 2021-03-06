package typingsSlinky.activexLibreoffice.com_.sun.star.awt

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to the system dependent implementation of the window.
  * @see com.sun.star.lang.SystemDependent
  * @see WindowAttribute
  * @see WindowAttribute.SYSTEMDEPENDENT
  */
@js.native
trait XSystemDependentWindowPeer extends XInterface {
  
  /**
    * returns a system-specific window handle.
    * @param ProcessId the process identifier. Use the sal_getGlobalProcessId function of the RTL library.
    * @param SystemType one constant out of the constant group {@link com.sun.star.lang.SystemDependent} .
    * @returns a system-specific handle to a window or 0 if the window is not in the same process.  You must check the machine ID and the process ID. ;  WIN32:
    */
  def getWindowHandle(ProcessId: SeqEquiv[Double], SystemType: Double): js.Any = js.native
}
object XSystemDependentWindowPeer {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    getWindowHandle: (SeqEquiv[Double], Double) => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XSystemDependentWindowPeer = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getWindowHandle = js.Any.fromFunction2(getWindowHandle), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XSystemDependentWindowPeer]
  }
  
  @scala.inline
  implicit class XSystemDependentWindowPeerMutableBuilder[Self <: XSystemDependentWindowPeer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetWindowHandle(value: (SeqEquiv[Double], Double) => js.Any): Self = StObject.set(x, "getWindowHandle", js.Any.fromFunction2(value))
  }
}
