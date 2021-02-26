package typingsSlinky.activexLibreoffice.com_.sun.star.form

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** allows locking the input on components. */
@js.native
trait XBoundControl extends XInterface {
  
  /**
    * determines whether the input is currently locked or not.
    * @returns `TRUE` when it is currently locked, otherwise `FALSE` .
    */
  var Lock: Boolean = js.native
  
  /**
    * determines whether the input is currently locked or not.
    * @returns `TRUE` when it is currently locked, otherwise `FALSE` .
    */
  def getLock(): Boolean = js.native
  
  /**
    * is used for altering the current lock state of the component.
    * @param bLock the new lock state.
    */
  def setLock(bLock: Boolean): Unit = js.native
}
object XBoundControl {
  
  @scala.inline
  def apply(
    Lock: Boolean,
    acquire: () => Unit,
    getLock: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setLock: Boolean => Unit
  ): XBoundControl = {
    val __obj = js.Dynamic.literal(Lock = Lock.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getLock = js.Any.fromFunction0(getLock), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setLock = js.Any.fromFunction1(setLock))
    __obj.asInstanceOf[XBoundControl]
  }
  
  @scala.inline
  implicit class XBoundControlMutableBuilder[Self <: XBoundControl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetLock(value: () => Boolean): Self = StObject.set(x, "getLock", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLock(value: Boolean): Self = StObject.set(x, "Lock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetLock(value: Boolean => Unit): Self = StObject.set(x, "setLock", js.Any.fromFunction1(value))
  }
}
