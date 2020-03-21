package typingsSlinky.baconjs.mod

import typingsSlinky.baconjs.typesMod.EventSink
import typingsSlinky.baconjs.typesMod.Subscribe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs", "Property")
@js.native
class Property[V] protected ()
  extends typingsSlinky.baconjs.observableMod.Property[V] {
  def this(desc: typingsSlinky.baconjs.describeMod.Desc, subscribe: Subscribe[V]) = this()
  def this(desc: typingsSlinky.baconjs.describeMod.Desc, subscribe: Subscribe[V], handler: EventSink[V]) = this()
}

