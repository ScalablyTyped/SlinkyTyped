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
    
    def dispatchEvent(event: String): Boolean = js.native
    def dispatchEvent(event: typingsSlinky.ol.eventMod.default): Boolean = js.native
    
    def getListeners(`type`: String): js.Array[Listener] = js.native
    
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
