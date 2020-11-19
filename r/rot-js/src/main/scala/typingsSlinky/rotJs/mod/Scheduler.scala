package typingsSlinky.rotJs.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.rotJs.actionMod.default
import typingsSlinky.rotJs.speedMod.SpeedActor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rot-js", "Scheduler")
@js.native
object Scheduler extends js.Object {
  
  @js.native
  class Action[T] () extends default[T]
  @js.native
  object Action
    extends TopLevel[Instantiable0[default[js.Object]]]
  
  @js.native
  class Simple[T] ()
    extends typingsSlinky.rotJs.simpleMod.default[T]
  @js.native
  object Simple
    extends TopLevel[Instantiable0[typingsSlinky.rotJs.simpleMod.default[js.Object]]]
  
  @js.native
  class Speed[T /* <: SpeedActor */] ()
    extends typingsSlinky.rotJs.speedMod.default[T]
  @js.native
  object Speed
    extends TopLevel[Instantiable0[typingsSlinky.rotJs.speedMod.default[SpeedActor]]]
}
