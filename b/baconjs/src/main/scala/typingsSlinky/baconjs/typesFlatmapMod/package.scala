package typingsSlinky.baconjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesFlatmapMod {
  type EventOrValue[V] = typingsSlinky.baconjs.eventMod.Event[V] | V
  type EventSpawner[V, V2] = js.Function1[
    /* e */ typingsSlinky.baconjs.eventMod.Event[V], 
    typingsSlinky.baconjs.observableMod.default[V2] | typingsSlinky.baconjs.typesFlatmapMod.EventOrValue[V2]
  ]
  type SpawnerOrObservable[V, V2] = (typingsSlinky.baconjs.typesFlatmapMod.ValueSpawner[V, V2]) | typingsSlinky.baconjs.observableMod.default[V2]
  type ValueSpawner[V, V2] = js.Function1[
    /* value */ V, 
    typingsSlinky.baconjs.observableMod.default[V2] | typingsSlinky.baconjs.typesFlatmapMod.EventOrValue[V2]
  ]
}
