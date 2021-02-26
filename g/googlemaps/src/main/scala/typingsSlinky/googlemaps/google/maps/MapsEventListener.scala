package typingsSlinky.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapsEventListener extends StObject {
  
  /**
    * Removes the listener.  Equivalent to calling
    * google.maps.event.removeListener(listener).
    */
  def remove(): Unit = js.native
}
object MapsEventListener {
  
  @scala.inline
  def apply(remove: () => Unit): MapsEventListener = {
    val __obj = js.Dynamic.literal(remove = js.Any.fromFunction0(remove))
    __obj.asInstanceOf[MapsEventListener]
  }
  
  @scala.inline
  implicit class MapsEventListenerMutableBuilder[Self <: MapsEventListener] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
  }
}
