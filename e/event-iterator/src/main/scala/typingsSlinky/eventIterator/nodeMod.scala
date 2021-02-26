package typingsSlinky.eventIterator

import typingsSlinky.eventIterator.anon.PartialEventIteratorOptio
import typingsSlinky.eventIterator.eventIteratorMod.EventIteratorOptions
import typingsSlinky.eventIterator.eventIteratorMod.ListenHandler
import typingsSlinky.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeMod {
  
  @JSImport("event-iterator/lib/node", JSImport.Default)
  @js.native
  class default[T] protected ()
    extends typingsSlinky.eventIterator.eventIteratorMod.EventIterator[T] {
    def this(listen: ListenHandler[T]) = this()
    def this(listen: ListenHandler[T], hasHighWaterMarkLowWaterMark: PartialEventIteratorOptio) = this()
  }
  
  @JSImport("event-iterator/lib/node", "EventIterator")
  @js.native
  class EventIterator[T] protected ()
    extends typingsSlinky.eventIterator.eventIteratorMod.EventIterator[T] {
    def this(listen: ListenHandler[T]) = this()
    def this(listen: ListenHandler[T], hasHighWaterMarkLowWaterMark: PartialEventIteratorOptio) = this()
  }
  
  @JSImport("event-iterator/lib/node", "stream")
  @js.native
  def stream(): typingsSlinky.eventIterator.eventIteratorMod.EventIterator[Buffer] = js.native
  @JSImport("event-iterator/lib/node", "stream")
  @js.native
  def stream(evOptions: EventIteratorOptions): typingsSlinky.eventIterator.eventIteratorMod.EventIterator[Buffer] = js.native
}
