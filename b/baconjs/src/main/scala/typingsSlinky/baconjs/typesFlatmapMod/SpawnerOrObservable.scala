package typingsSlinky.baconjs.typesFlatmapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.baconjs.typesFlatmapMod.ValueSpawner[V, V2]
  - typingsSlinky.baconjs.observableMod.default[V2]
*/
trait SpawnerOrObservable[V, V2] extends js.Object

object SpawnerOrObservable {
  @scala.inline
  implicit def apply[V, V2](value: ValueSpawner[V, V2]): SpawnerOrObservable[V, V2] = value.asInstanceOf[SpawnerOrObservable[V, V2]]
  @scala.inline
  implicit def apply[V, V2](value: typingsSlinky.baconjs.observableMod.default[V2]): SpawnerOrObservable[V, V2] = value.asInstanceOf[SpawnerOrObservable[V, V2]]
}

