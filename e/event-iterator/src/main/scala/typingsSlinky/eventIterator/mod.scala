package typingsSlinky.eventIterator

import org.scalajs.dom.raw.Event
import typingsSlinky.eventIterator.anon.PartialEventIteratorOptio
import typingsSlinky.eventIterator.eventIteratorMod.EventIteratorOptions
import typingsSlinky.eventIterator.eventIteratorMod.ListenHandler
import typingsSlinky.std.AddEventListenerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("event-iterator/lib/dom", JSImport.Default)
  @js.native
  class default[T] protected ()
    extends typingsSlinky.eventIterator.eventIteratorMod.EventIterator[T] {
    def this(listen: ListenHandler[T]) = this()
    def this(listen: ListenHandler[T], hasHighWaterMarkLowWaterMark: PartialEventIteratorOptio) = this()
  }
  
  @JSImport("event-iterator/lib/dom", "EventIterator")
  @js.native
  class EventIterator[T] protected ()
    extends typingsSlinky.eventIterator.eventIteratorMod.EventIterator[T] {
    def this(listen: ListenHandler[T]) = this()
    def this(listen: ListenHandler[T], hasHighWaterMarkLowWaterMark: PartialEventIteratorOptio) = this()
  }
  
  @JSImport("event-iterator/lib/dom", "subscribe")
  @js.native
  def subscribe(event: String): typingsSlinky.eventIterator.eventIteratorMod.EventIterator[Event] = js.native
  @JSImport("event-iterator/lib/dom", "subscribe")
  @js.native
  def subscribe(event: String, options: js.UndefOr[scala.Nothing], evOptions: EventIteratorOptions): typingsSlinky.eventIterator.eventIteratorMod.EventIterator[Event] = js.native
  @JSImport("event-iterator/lib/dom", "subscribe")
  @js.native
  def subscribe(event: String, options: AddEventListenerOptions): typingsSlinky.eventIterator.eventIteratorMod.EventIterator[Event] = js.native
  @JSImport("event-iterator/lib/dom", "subscribe")
  @js.native
  def subscribe(event: String, options: AddEventListenerOptions, evOptions: EventIteratorOptions): typingsSlinky.eventIterator.eventIteratorMod.EventIterator[Event] = js.native
}
