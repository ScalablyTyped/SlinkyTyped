package typingsSlinky.angularMaterial.mod.angularAugmentingMod.material

import typingsSlinky.angular.mod.IPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISidenavObject extends StObject {
  
  def close(): IPromise[Unit] = js.native
  
  def isLockedOpen(): Boolean = js.native
  
  def isOpen(): Boolean = js.native
  
  def onClose(onClose: js.Function0[Unit]): Unit = js.native
  
  def open(): IPromise[Unit] = js.native
  
  def toggle(): IPromise[Unit] = js.native
}
object ISidenavObject {
  
  @scala.inline
  def apply(
    close: () => IPromise[Unit],
    isLockedOpen: () => Boolean,
    isOpen: () => Boolean,
    onClose: js.Function0[Unit] => Unit,
    open: () => IPromise[Unit],
    toggle: () => IPromise[Unit]
  ): ISidenavObject = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), isLockedOpen = js.Any.fromFunction0(isLockedOpen), isOpen = js.Any.fromFunction0(isOpen), onClose = js.Any.fromFunction1(onClose), open = js.Any.fromFunction0(open), toggle = js.Any.fromFunction0(toggle))
    __obj.asInstanceOf[ISidenavObject]
  }
  
  @scala.inline
  implicit class ISidenavObjectMutableBuilder[Self <: ISidenavObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClose(value: () => IPromise[Unit]): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsLockedOpen(value: () => Boolean): Self = StObject.set(x, "isLockedOpen", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsOpen(value: () => Boolean): Self = StObject.set(x, "isOpen", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnClose(value: js.Function0[Unit] => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOpen(value: () => IPromise[Unit]): Self = StObject.set(x, "open", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToggle(value: () => IPromise[Unit]): Self = StObject.set(x, "toggle", js.Any.fromFunction0(value))
  }
}
