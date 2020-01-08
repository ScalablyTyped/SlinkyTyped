package typingsSlinky.baconjs.baconjsMod

import typingsSlinky.baconjs.typesFrombinderMod.EventTransformer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs", "fromPromise")
@js.native
object fromPromise extends js.Object {
  def apply[V](promise: js.Promise[V]): typingsSlinky.baconjs.typesObservableMod.EventStream[V] = js.native
  def apply[V](promise: js.Promise[V], abort: Boolean): typingsSlinky.baconjs.typesObservableMod.EventStream[V] = js.native
  def apply[V](promise: js.Promise[V], abort: Boolean, eventTransformer: EventTransformer[V]): typingsSlinky.baconjs.typesObservableMod.EventStream[V] = js.native
}

