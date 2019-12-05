package typingsSlinky.baconjs

import typingsSlinky.baconjs.typesObservableMod.EventStream
import typingsSlinky.baconjs.typesObservableMod.EventStreamOptions
import typingsSlinky.baconjs.typesObservableMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/groupsimultaneous", JSImport.Namespace)
@js.native
object typesGroupsimultaneousMod extends js.Object {
  def default[V](
    streams: (typingsSlinky.baconjs.typesObservableMod.default[V] | js.Array[typingsSlinky.baconjs.typesObservableMod.default[V]])*
  ): EventStream[js.Array[js.Array[V]]] = js.native
  def groupSimultaneous_[V](streams: js.Array[default[V]]): EventStream[js.Array[js.Array[V]]] = js.native
  def groupSimultaneous_[V](streams: js.Array[default[V]], options: EventStreamOptions): EventStream[js.Array[js.Array[V]]] = js.native
}

