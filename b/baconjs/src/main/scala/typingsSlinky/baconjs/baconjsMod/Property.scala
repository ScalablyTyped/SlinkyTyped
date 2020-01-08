package typingsSlinky.baconjs.baconjsMod

import typingsSlinky.baconjs.typesTypesMod.EventSink
import typingsSlinky.baconjs.typesTypesMod.Subscribe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs", "Property")
@js.native
class Property[V] protected ()
  extends typingsSlinky.baconjs.typesObservableMod.Property[V] {
  def this(desc: typingsSlinky.baconjs.typesDescribeMod.Desc, subscribe: Subscribe[V]) = this()
  def this(desc: typingsSlinky.baconjs.typesDescribeMod.Desc, subscribe: Subscribe[V], handler: EventSink[V]) = this()
}

