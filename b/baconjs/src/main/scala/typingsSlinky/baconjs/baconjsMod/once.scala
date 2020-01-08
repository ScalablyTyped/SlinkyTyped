package typingsSlinky.baconjs.baconjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs", "once")
@js.native
object once extends js.Object {
  def apply[V](value: V): typingsSlinky.baconjs.typesObservableMod.EventStream[V] = js.native
  def apply[V](value: typingsSlinky.baconjs.typesEventMod.Event[V]): typingsSlinky.baconjs.typesObservableMod.EventStream[V] = js.native
}

