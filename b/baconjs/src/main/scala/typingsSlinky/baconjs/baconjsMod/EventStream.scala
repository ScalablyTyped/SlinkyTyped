package typingsSlinky.baconjs.baconjsMod

import typingsSlinky.baconjs.typesObservableMod.EventStreamOptions
import typingsSlinky.baconjs.typesTypesMod.EventSink
import typingsSlinky.baconjs.typesTypesMod.Subscribe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs", "EventStream")
@js.native
class EventStream[V] protected ()
  extends typingsSlinky.baconjs.typesObservableMod.EventStream[V] {
  def this(desc: typingsSlinky.baconjs.typesDescribeMod.Desc, subscribe: Subscribe[V]) = this()
  def this(desc: typingsSlinky.baconjs.typesDescribeMod.Desc, subscribe: Subscribe[V], handler: EventSink[V]) = this()
  def this(
    desc: typingsSlinky.baconjs.typesDescribeMod.Desc,
    subscribe: Subscribe[V],
    handler: EventSink[V],
    options: EventStreamOptions
  ) = this()
}

