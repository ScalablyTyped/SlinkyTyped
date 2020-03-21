package typingsSlinky.baconjs.mod

import typingsSlinky.baconjs.frombinderMod.EventTransformer
import typingsSlinky.baconjs.fromeventMod.EventSourceFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs", "fromEvent")
@js.native
object fromEvent extends js.Object {
  def apply[V](target: js.Any, eventSource: String): typingsSlinky.baconjs.observableMod.EventStream[V] = js.native
  def apply[V](target: js.Any, eventSource: String, eventTransformer: EventTransformer[V]): typingsSlinky.baconjs.observableMod.EventStream[V] = js.native
  def apply[V](target: js.Any, eventSource: EventSourceFn): typingsSlinky.baconjs.observableMod.EventStream[V] = js.native
  def apply[V](target: js.Any, eventSource: EventSourceFn, eventTransformer: EventTransformer[V]): typingsSlinky.baconjs.observableMod.EventStream[V] = js.native
}

