package typingsSlinky.eventsource

import typingsSlinky.eventsource.mod.EventSourceInitDict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventsourcePolyfillMod {
  
  @JSImport("eventsource/lib/eventsource-polyfill", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends typingsSlinky.eventsource.mod.^ {
    def this(url: String) = this()
    def this(url: String, eventSourceInitDict: EventSourceInitDict) = this()
  }
  
  /* static member */
  @JSImport("eventsource/lib/eventsource-polyfill", "CLOSED")
  @js.native
  val CLOSED: Double = js.native
  
  /* static member */
  @JSImport("eventsource/lib/eventsource-polyfill", "CONNECTING")
  @js.native
  val CONNECTING: Double = js.native
  
  /* static member */
  @JSImport("eventsource/lib/eventsource-polyfill", "OPEN")
  @js.native
  val OPEN: Double = js.native
  
  @JSImport("eventsource/lib/eventsource-polyfill", "ReadyState")
  @js.native
  object ReadyState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.eventsource.mod.ReadyState with Double] = js.native
    
    /* 2 */ val CLOSED: typingsSlinky.eventsource.mod.ReadyState.CLOSED with Double = js.native
    
    /* 0 */ val CONNECTING: typingsSlinky.eventsource.mod.ReadyState.CONNECTING with Double = js.native
    
    /* 1 */ val OPEN: typingsSlinky.eventsource.mod.ReadyState.OPEN with Double = js.native
  }
}
