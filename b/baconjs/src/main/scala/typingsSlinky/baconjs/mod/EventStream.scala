package typingsSlinky.baconjs.mod

import typingsSlinky.baconjs.observableMod.EventStreamOptions
import typingsSlinky.baconjs.typesMod.EventSink
import typingsSlinky.baconjs.typesMod.Subscribe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("baconjs", "EventStream")
@js.native
class EventStream[V] protected ()
  extends typingsSlinky.baconjs.observableMod.EventStream[V] {
  def this(desc: typingsSlinky.baconjs.describeMod.Desc, subscribe: Subscribe[V]) = this()
  def this(desc: typingsSlinky.baconjs.describeMod.Desc, subscribe: Subscribe[V], handler: EventSink[V]) = this()
  def this(
    desc: typingsSlinky.baconjs.describeMod.Desc,
    subscribe: Subscribe[V],
    handler: js.UndefOr[scala.Nothing],
    options: EventStreamOptions
  ) = this()
  def this(
    desc: typingsSlinky.baconjs.describeMod.Desc,
    subscribe: Subscribe[V],
    handler: EventSink[V],
    options: EventStreamOptions
  ) = this()
}
