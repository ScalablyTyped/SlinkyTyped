package typingsSlinky.baconjs.baconjsMod

import typingsSlinky.baconjs.typesFrombinderMod.EventTransformer
import typingsSlinky.baconjs.typesFromeventMod.EventSourceFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs", "fromEvent")
@js.native
object fromEvent extends js.Object {
  def apply[V](target: js.Any, eventSource: String): typingsSlinky.baconjs.typesObservableMod.EventStream[V] = js.native
  def apply[V](target: js.Any, eventSource: String, eventTransformer: EventTransformer[V]): typingsSlinky.baconjs.typesObservableMod.EventStream[V] = js.native
  def apply[V](target: js.Any, eventSource: EventSourceFn): typingsSlinky.baconjs.typesObservableMod.EventStream[V] = js.native
  def apply[V](target: js.Any, eventSource: EventSourceFn, eventTransformer: EventTransformer[V]): typingsSlinky.baconjs.typesObservableMod.EventStream[V] = js.native
}

