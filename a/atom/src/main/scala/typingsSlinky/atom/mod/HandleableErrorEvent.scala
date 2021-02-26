package typingsSlinky.atom.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HandleableErrorEvent extends StObject {
  
  /** The error object. */
  var error: js.Error = js.native
  
  /**
    *  Call this function to indicate you have handled the error.
    *  The error will not be thrown if this function is called.
    */
  def handle(): Unit = js.native
}
object HandleableErrorEvent {
  
  @scala.inline
  def apply(error: js.Error, handle: () => Unit): HandleableErrorEvent = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], handle = js.Any.fromFunction0(handle))
    __obj.asInstanceOf[HandleableErrorEvent]
  }
  
  @scala.inline
  implicit class HandleableErrorEventMutableBuilder[Self <: HandleableErrorEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandle(value: () => Unit): Self = StObject.set(x, "handle", js.Any.fromFunction0(value))
  }
}
