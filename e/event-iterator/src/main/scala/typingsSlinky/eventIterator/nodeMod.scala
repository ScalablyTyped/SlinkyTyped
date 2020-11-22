package typingsSlinky.eventIterator

import typingsSlinky.eventIterator.anon.PartialEventIteratorOptio
import typingsSlinky.eventIterator.eventIteratorMod.EventIteratorOptions
import typingsSlinky.eventIterator.eventIteratorMod.ListenHandler
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("event-iterator/lib/node", JSImport.Namespace)
@js.native
object nodeMod extends js.Object {
  
  def stream(): typingsSlinky.eventIterator.eventIteratorMod.EventIterator[Buffer] = js.native
  def stream(evOptions: EventIteratorOptions): typingsSlinky.eventIterator.eventIteratorMod.EventIterator[Buffer] = js.native
  
  @js.native
  class EventIterator[T] protected ()
    extends typingsSlinky.eventIterator.eventIteratorMod.EventIterator[T] {
    def this(listen: ListenHandler[T]) = this()
    def this(listen: ListenHandler[T], hasHighWaterMarkLowWaterMark: PartialEventIteratorOptio) = this()
  }
  
  @js.native
  class default[T] protected ()
    extends typingsSlinky.eventIterator.eventIteratorMod.EventIterator[T] {
    def this(listen: ListenHandler[T]) = this()
    def this(listen: ListenHandler[T], hasHighWaterMarkLowWaterMark: PartialEventIteratorOptio) = this()
  }
}
