package typingsSlinky.baconjs.typesFlatmapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("baconjs/types/flatmap_", "flatMap_")
@js.native
object flatMap extends js.Object {
  
  def apply[In, Out](spawner: EventSpawner[In, Out], src: typingsSlinky.baconjs.observableMod.default[In]): typingsSlinky.baconjs.observableMod.default[Out] = js.native
  def apply[In, Out](
    spawner: EventSpawner[In, Out],
    src: typingsSlinky.baconjs.observableMod.default[In],
    params: FlatMapParams
  ): typingsSlinky.baconjs.observableMod.default[Out] = js.native
}
