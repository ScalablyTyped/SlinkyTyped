package typingsSlinky.rotDashJs.rotDashJsMod

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.rotDashJs.libSchedulerActionMod.default
import typingsSlinky.rotDashJs.libSchedulerSpeedMod.SpeedActor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rot-js", "Scheduler")
@js.native
object Scheduler extends js.Object {
  @js.native
  class Action[T] () extends default[T]
  
  @js.native
  class Simple[T] ()
    extends typingsSlinky.rotDashJs.libSchedulerSimpleMod.default[T]
  
  @js.native
  class Speed[T /* <: SpeedActor */] ()
    extends typingsSlinky.rotDashJs.libSchedulerSpeedMod.default[T]
  
  var Action: Instantiable0[default[js.Object]] = js.native
  var Simple: Instantiable0[typingsSlinky.rotDashJs.libSchedulerSimpleMod.default[js.Object]] = js.native
  var Speed: Instantiable0[typingsSlinky.rotDashJs.libSchedulerSpeedMod.default[SpeedActor]] = js.native
}

