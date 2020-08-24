package typingsSlinky.baconjs.mod

import typingsSlinky.baconjs.frombinderMod.EventTransformer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs", "fromPromise")
@js.native
object fromPromise extends js.Object {
  def apply[V](promise: js.Promise[V]): typingsSlinky.baconjs.observableMod.EventStream[V] = js.native
  def apply[V](promise: js.Promise[V], abort: js.UndefOr[scala.Nothing], eventTransformer: EventTransformer[V]): typingsSlinky.baconjs.observableMod.EventStream[V] = js.native
  def apply[V](promise: js.Promise[V], abort: Boolean): typingsSlinky.baconjs.observableMod.EventStream[V] = js.native
  def apply[V](promise: js.Promise[V], abort: Boolean, eventTransformer: EventTransformer[V]): typingsSlinky.baconjs.observableMod.EventStream[V] = js.native
}

