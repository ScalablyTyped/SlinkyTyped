package typingsSlinky.baconjs.baconjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs", "sequentially")
@js.native
object sequentially extends js.Object {
  def apply[V](delay: Double, values: js.Array[V | typingsSlinky.baconjs.typesEventMod.Event[V]]): typingsSlinky.baconjs.typesObservableMod.EventStream[V] = js.native
}

