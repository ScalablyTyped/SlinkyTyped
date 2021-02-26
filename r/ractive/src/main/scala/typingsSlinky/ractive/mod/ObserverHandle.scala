package typingsSlinky.ractive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObserverHandle extends StObject {
  
  /**
  	 * Removes the listener or observer.j
  	 */
  def cancel(): Unit = js.native
  
  /**
  	 * @returns true if the callback is not going to be called
  	 */
  def isSilenced(): Boolean = js.native
  
  /**
  	 * Resume calling the callback with changes or events.
  	 */
  def resume(): Unit = js.native
  
  /**
  	 * Stops further firings of the callback. Any related observers will still stay up-to-date, so the old value will be updated as the data changes.
  	 */
  def silence(): Unit = js.native
}
object ObserverHandle {
  
  @scala.inline
  def apply(cancel: () => Unit, isSilenced: () => Boolean, resume: () => Unit, silence: () => Unit): ObserverHandle = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), isSilenced = js.Any.fromFunction0(isSilenced), resume = js.Any.fromFunction0(resume), silence = js.Any.fromFunction0(silence))
    __obj.asInstanceOf[ObserverHandle]
  }
  
  @scala.inline
  implicit class ObserverHandleMutableBuilder[Self <: ObserverHandle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsSilenced(value: () => Boolean): Self = StObject.set(x, "isSilenced", js.Any.fromFunction0(value))
    
    @scala.inline
    def setResume(value: () => Unit): Self = StObject.set(x, "resume", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSilence(value: () => Unit): Self = StObject.set(x, "silence", js.Any.fromFunction0(value))
  }
}
