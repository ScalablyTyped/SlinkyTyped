package typingsSlinky.navermaps.naver.maps

import org.scalajs.dom.raw.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DOMEventListener extends StObject {
  
  var eventName: String = js.native
  
  def listener(): js.Any = js.native
  
  var target: HTMLElement = js.native
}
object DOMEventListener {
  
  @scala.inline
  def apply(eventName: String, listener: () => js.Any, target: HTMLElement): DOMEventListener = {
    val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any], listener = js.Any.fromFunction0(listener), target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOMEventListener]
  }
  
  @scala.inline
  implicit class DOMEventListenerMutableBuilder[Self <: DOMEventListener] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventName(value: String): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListener(value: () => js.Any): Self = StObject.set(x, "listener", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTarget(value: HTMLElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
