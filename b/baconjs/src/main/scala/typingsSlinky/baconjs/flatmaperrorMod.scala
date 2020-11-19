package typingsSlinky.baconjs

import typingsSlinky.baconjs.typesFlatmapMod.EventOrValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("baconjs/types/flatmaperror", JSImport.Namespace)
@js.native
object flatmaperrorMod extends js.Object {
  
  def default[V, V2](
    src: typingsSlinky.baconjs.observableMod.default[V],
    f: js.Function1[
      /* error */ js.Any, 
      typingsSlinky.baconjs.observableMod.default[V2] | EventOrValue[V2]
    ]
  ): typingsSlinky.baconjs.observableMod.default[V | V2] = js.native
}
