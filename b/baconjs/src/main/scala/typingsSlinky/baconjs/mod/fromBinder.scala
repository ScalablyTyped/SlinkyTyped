package typingsSlinky.baconjs.mod

import typingsSlinky.baconjs.frombinderMod.Binder
import typingsSlinky.baconjs.frombinderMod.EventTransformer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs", "fromBinder")
@js.native
object fromBinder extends js.Object {
  def apply[V](binder: Binder[V]): typingsSlinky.baconjs.observableMod.EventStream[V] = js.native
  def apply[V](binder: Binder[V], eventTransformer: EventTransformer[V]): typingsSlinky.baconjs.observableMod.EventStream[V] = js.native
}

