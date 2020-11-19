package typingsSlinky.microeventTs

import typingsSlinky.microeventTs.eventInterfaceMod.EventInterface
import typingsSlinky.microeventTs.eventInterfaceMod.EventInterface.HandlerInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("microevent/lib/Event", JSImport.Namespace)
@js.native
object eventMod extends js.Object {
  
  @js.native
  trait Event[EventPayload] extends EventInterface[EventPayload] {
    
    var _contexts: js.Any = js.native
    
    var _createDispatcher: js.Any = js.native
    
    var _getHandlerIndex: js.Any = js.native
    
    var _handlers: js.Any = js.native
    
    var _updateHasHandlers: js.Any = js.native
    
    def dispatch(payload: EventPayload): Unit = js.native
    
    var hasHandlers: Boolean = js.native
    
    def isHandlerAttached[T](handler: HandlerInterface[EventPayload, T]): Boolean = js.native
    def isHandlerAttached[T](handler: HandlerInterface[EventPayload, T], context: T): Boolean = js.native
  }
  
  @js.native
  class default[EventPayload] () extends Event[EventPayload]
}
