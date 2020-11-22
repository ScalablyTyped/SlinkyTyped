package typingsSlinky.eventIterator.eventIteratorMod

import typingsSlinky.eventIterator.anon.PartialEventIteratorOptio
import typingsSlinky.std.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("event-iterator/lib/event-iterator", "EventIterator")
@js.native
class EventIterator[T] protected () extends AsyncIterable[T] {
  def this(listen: ListenHandler[T]) = this()
  def this(listen: ListenHandler[T], hasHighWaterMarkLowWaterMark: PartialEventIteratorOptio) = this()
}
