package typingsSlinky.baconjs.baconjsMod

import typingsSlinky.baconjs.typesFrombinderMod.Binder
import typingsSlinky.baconjs.typesFrombinderMod.EventTransformer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs", "fromBinder")
@js.native
object fromBinder extends js.Object {
  def apply[V](binder: Binder[V]): typingsSlinky.baconjs.typesObservableMod.EventStream[V] = js.native
  def apply[V](binder: Binder[V], eventTransformer: EventTransformer[V]): typingsSlinky.baconjs.typesObservableMod.EventStream[V] = js.native
}

