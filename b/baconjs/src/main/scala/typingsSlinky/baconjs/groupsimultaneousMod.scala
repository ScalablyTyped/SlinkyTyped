package typingsSlinky.baconjs

import typingsSlinky.baconjs.observableMod.EventStream
import typingsSlinky.baconjs.observableMod.EventStreamOptions
import typingsSlinky.baconjs.observableMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object groupsimultaneousMod {
  
  @JSImport("baconjs/types/groupsimultaneous", JSImport.Default)
  @js.native
  def default[V](
    streams: (typingsSlinky.baconjs.observableMod.default[V] | js.Array[typingsSlinky.baconjs.observableMod.default[V]])*
  ): EventStream[js.Array[js.Array[V]]] = js.native
  
  @JSImport("baconjs/types/groupsimultaneous", "groupSimultaneous_")
  @js.native
  def groupSimultaneous[V](streams: js.Array[default[V]]): EventStream[js.Array[js.Array[V]]] = js.native
  @JSImport("baconjs/types/groupsimultaneous", "groupSimultaneous_")
  @js.native
  def groupSimultaneous[V](streams: js.Array[default[V]], options: EventStreamOptions): EventStream[js.Array[js.Array[V]]] = js.native
}
