package typingsSlinky.baconjs

import typingsSlinky.baconjs.typesFlatmapUnderscoreMod.EventOrValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/flatmaperror", JSImport.Namespace)
@js.native
object typesFlatmaperrorMod extends js.Object {
  def default[V, V2](
    src: typingsSlinky.baconjs.typesObservableMod.default[V],
    f: js.Function1[
      /* error */ js.Any, 
      typingsSlinky.baconjs.typesObservableMod.default[V2] | EventOrValue[V2]
    ]
  ): typingsSlinky.baconjs.typesObservableMod.default[V | V2] = js.native
}

