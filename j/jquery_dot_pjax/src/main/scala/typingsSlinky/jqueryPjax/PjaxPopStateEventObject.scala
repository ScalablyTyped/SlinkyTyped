package typingsSlinky.jqueryPjax

import typingsSlinky.jquery.JQuery.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for pjax:popstate event.
  */
@js.native
trait PjaxPopStateEventObject extends Event {
  
  /**
    * Navigation direction. Could be "back" or "forward".
    */
  var direction: String = js.native
}
object PjaxPopStateEventObject {
  
  @scala.inline
  def apply(
    direction: String,
    isDefaultPrevented: () => Boolean,
    isImmediatePropagationStopped: () => Boolean,
    isPropagationStopped: () => Boolean,
    preventDefault: () => Unit,
    stopImmediatePropagation: () => Unit,
    stopPropagation: () => Unit,
    timeStamp: Double,
    `type`: String
  ): PjaxPopStateEventObject = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isImmediatePropagationStopped = js.Any.fromFunction0(isImmediatePropagationStopped), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), preventDefault = js.Any.fromFunction0(preventDefault), stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PjaxPopStateEventObject]
  }
  
  @scala.inline
  implicit class PjaxPopStateEventObjectMutableBuilder[Self <: PjaxPopStateEventObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
  }
}
