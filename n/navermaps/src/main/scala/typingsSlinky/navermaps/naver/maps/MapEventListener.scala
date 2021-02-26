package typingsSlinky.navermaps.naver.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interfaces
  */
@js.native
trait MapEventListener extends StObject {
  
  var eventName: String = js.native
  
  def listener(event: js.Any): js.Any = js.native
  
  var listenerId: String = js.native
  
  var target: js.Any = js.native
}
object MapEventListener {
  
  @scala.inline
  def apply(eventName: String, listener: js.Any => js.Any, listenerId: String, target: js.Any): MapEventListener = {
    val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any], listener = js.Any.fromFunction1(listener), listenerId = listenerId.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapEventListener]
  }
  
  @scala.inline
  implicit class MapEventListenerMutableBuilder[Self <: MapEventListener] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventName(value: String): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListener(value: js.Any => js.Any): Self = StObject.set(x, "listener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setListenerId(value: String): Self = StObject.set(x, "listenerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
