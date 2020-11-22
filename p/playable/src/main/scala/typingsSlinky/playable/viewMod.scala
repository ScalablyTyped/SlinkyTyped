package typingsSlinky.playable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("playable/dist/src/modules/ui/core/view", JSImport.Namespace)
@js.native
object viewMod extends js.Object {
  
  @js.native
  trait View[TStyles]
    extends typingsSlinky.playable.stylableMod.default[TStyles]
  
  @js.native
  class default[TStyles] ()
    extends typingsSlinky.playable.stylableMod.default[TStyles]
}
