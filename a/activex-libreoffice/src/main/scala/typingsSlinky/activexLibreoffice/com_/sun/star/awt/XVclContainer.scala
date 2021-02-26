package typingsSlinky.activexLibreoffice.com_.sun.star.awt

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * represents a VCL container window.
  * @deprecated Deprecated
  */
@js.native
trait XVclContainer extends XInterface {
  
  /** returns all windows. */
  val Windows: SafeArray[XWindow] = js.native
  
  /** adds the specified container listener to receive container events from this container. */
  def addVclContainerListener(l: XVclContainerListener): Unit = js.native
  
  /** returns all windows. */
  def getWindows(): SafeArray[XWindow] = js.native
  
  /** removes the specified container listener so that it no longer receives container events from this container. */
  def removeVclContainerListener(l: XVclContainerListener): Unit = js.native
}
object XVclContainer {
  
  @scala.inline
  def apply(
    Windows: SafeArray[XWindow],
    acquire: () => Unit,
    addVclContainerListener: XVclContainerListener => Unit,
    getWindows: () => SafeArray[XWindow],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeVclContainerListener: XVclContainerListener => Unit
  ): XVclContainer = {
    val __obj = js.Dynamic.literal(Windows = Windows.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addVclContainerListener = js.Any.fromFunction1(addVclContainerListener), getWindows = js.Any.fromFunction0(getWindows), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeVclContainerListener = js.Any.fromFunction1(removeVclContainerListener))
    __obj.asInstanceOf[XVclContainer]
  }
  
  @scala.inline
  implicit class XVclContainerMutableBuilder[Self <: XVclContainer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddVclContainerListener(value: XVclContainerListener => Unit): Self = StObject.set(x, "addVclContainerListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetWindows(value: () => SafeArray[XWindow]): Self = StObject.set(x, "getWindows", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveVclContainerListener(value: XVclContainerListener => Unit): Self = StObject.set(x, "removeVclContainerListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWindows(value: SafeArray[XWindow]): Self = StObject.set(x, "Windows", value.asInstanceOf[js.Any])
  }
}
