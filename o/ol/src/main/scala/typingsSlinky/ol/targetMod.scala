package typingsSlinky.ol

import org.scalajs.dom.raw.EventTarget
import typingsSlinky.ol.eventsMod.Listener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/events/Target", JSImport.Namespace)
@js.native
object targetMod extends js.Object {
  
  @js.native
  trait Target
    extends typingsSlinky.ol.disposableMod.default {
    
    def addEventListener(`type`: String, listener: Listener): Unit = js.native
    
    def dispatchEvent(event: String): js.UndefOr[Boolean] = js.native
    /**
      * Dispatches an event and calls all listeners listening for events
      * of this type. The event parameter can either be a string or an
      * Object with a type property.
      */
    def dispatchEvent(event: typingsSlinky.ol.eventMod.default): js.UndefOr[Boolean] = js.native
    
    /**
      * Get the listeners for a specified event type. Listeners are returned in the
      * order that they will be called in.
      */
    def getListeners(`type`: String): js.UndefOr[js.Array[Listener]] = js.native
    
    def hasListener(): Boolean = js.native
    def hasListener(opt_type: String): Boolean = js.native
    
    def removeEventListener(`type`: String, listener: Listener): Unit = js.native
  }
  
  @js.native
  class default () extends Target {
    def this(opt_target: js.Any) = this()
  }
  
  type EventTargetLike = EventTarget | Target
}
