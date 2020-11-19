package typingsSlinky.baconjs

import typingsSlinky.baconjs.observableMod.EventStream
import typingsSlinky.baconjs.observableMod.EventStreamOptions
import typingsSlinky.baconjs.observableMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("baconjs/types/groupsimultaneous", JSImport.Namespace)
@js.native
object groupsimultaneousMod extends js.Object {
  
  def default[V](
    streams: (typingsSlinky.baconjs.observableMod.default[V] | js.Array[typingsSlinky.baconjs.observableMod.default[V]])*
  ): EventStream[js.Array[js.Array[V]]] = js.native
  
  @JSName("groupSimultaneous_")
  def groupSimultaneous[V](streams: js.Array[default[V]]): EventStream[js.Array[js.Array[V]]] = js.native
  @JSName("groupSimultaneous_")
  def groupSimultaneous[V](streams: js.Array[default[V]], options: EventStreamOptions): EventStream[js.Array[js.Array[V]]] = js.native
}
