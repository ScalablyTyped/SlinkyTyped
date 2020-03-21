package typingsSlinky.baconjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs", "once")
@js.native
object once extends js.Object {
  def apply[V](value: V): typingsSlinky.baconjs.observableMod.EventStream[V] = js.native
  def apply[V](value: typingsSlinky.baconjs.eventMod.Event[V]): typingsSlinky.baconjs.observableMod.EventStream[V] = js.native
}

