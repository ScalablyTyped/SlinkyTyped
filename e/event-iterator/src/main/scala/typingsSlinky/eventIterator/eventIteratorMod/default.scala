package typingsSlinky.eventIterator.eventIteratorMod

import typingsSlinky.eventIterator.anon.PartialEventIteratorOptio
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("event-iterator/lib/event-iterator", JSImport.Default)
@js.native
class default[T] protected () extends EventIterator[T] {
  def this(listen: ListenHandler[T]) = this()
  def this(listen: ListenHandler[T], hasHighWaterMarkLowWaterMark: PartialEventIteratorOptio) = this()
}
