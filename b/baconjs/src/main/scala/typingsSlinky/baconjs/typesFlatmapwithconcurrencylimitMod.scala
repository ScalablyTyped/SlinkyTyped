package typingsSlinky.baconjs

import typingsSlinky.baconjs.typesFlatmapUnderscoreMod.SpawnerOrObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/flatmapwithconcurrencylimit", JSImport.Namespace)
@js.native
object typesFlatmapwithconcurrencylimitMod extends js.Object {
  def default[V, V2](
    src: typingsSlinky.baconjs.typesObservableMod.default[V],
    limit: Double,
    f: SpawnerOrObservable[V, V2]
  ): typingsSlinky.baconjs.typesObservableMod.default[V2] = js.native
}

