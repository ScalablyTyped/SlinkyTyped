package typingsSlinky.baconjs.baconjsMod

import typingsSlinky.baconjs.typesObservableMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs", "groupSimultaneous")
@js.native
object groupSimultaneous extends js.Object {
  def apply[V](streams: (default[V] | js.Array[default[V]])*): typingsSlinky.baconjs.typesObservableMod.EventStream[js.Array[js.Array[V]]] = js.native
}

