package typingsSlinky.baconjs.typesFlatmapMod

import typingsSlinky.baconjs.eventMod.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/flatmap_", "makeObservable")
@js.native
object makeObservable extends js.Object {
  def apply[V](x: V): typingsSlinky.baconjs.observableMod.default[V] = js.native
  def apply[V](x: Event[V]): typingsSlinky.baconjs.observableMod.default[V] = js.native
  def apply[V](x: typingsSlinky.baconjs.observableMod.default[V]): typingsSlinky.baconjs.observableMod.default[V] = js.native
}

